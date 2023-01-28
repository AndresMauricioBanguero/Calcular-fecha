package org.example;

public class Fecha {
    private static final int YEAR = 360;
    private static final int MES = 30;
    private static final int DIA = 1;
    private final int yearI;
    private final int mesI;
    private final int diaI;
    private final int yearF;
    private final int mesF;
    private final int diaF;

    public Fecha(int yearI, int mesI, int diaI, int yearF, int mesF, int diaF) {
        this.yearI = yearI;
        this.mesI = mesI;
        this.diaI = diaI;
        this.yearF = yearF;
        this.mesF = mesF;
        this.diaF = diaF;
    }
    public int diasTotales() {
        return ((yearF * YEAR) + (mesF* MES) + (diaF * DIA))-((yearI * YEAR) + (mesI* MES) + (diaI * DIA));
    }
    public int yearT() {
        return diasTotales()/YEAR;
    }

    public int mesT() {
        return ((diasTotales()-(yearT()*YEAR))/MES);
    }

    public int diaT() {
        return ((diasTotales()-(yearT()*YEAR))-mesT()*MES)/DIA;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Verificar tiempo transcurrido\n");
        builder.append("_________________________________________________\n");
        builder.append("El año inicial:").append(yearI).append("\n");
        builder.append("el mes inical:").append(mesI).append("\n");
        builder.append("el dia inical:").append(diaI).append("\n");
        builder.append("El año final:").append(yearF).append("\n");
        builder.append("el mes final:").append(mesF).append("\n");
        builder.append("el dia final:").append(diaF).append("\n");
        builder.append("Años Transcurridos:").append(yearT()).append("\n");
        builder.append("meses Transcurridos:").append(mesT()).append("\n");
        builder.append("dias Transcurridos:").append(diaT()).append("\n");
        builder.append("Tiempo total en dias:").append(diasTotales()).append("\n");
        builder.append("_________________________________________________\n");

        return builder.toString();
    }
}
