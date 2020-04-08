package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] salesl) {
        int suml = 0;
        for (int sales : salesl) {

            suml += sales;
            }
        return suml;
    }

    public int calculateAverage(int[] salesl) {
        StatsService statsService = new StatsService();
        int averagel = statsService.calculateSum(salesl);
        return averagel/12;
    }

    public int lastsalesMax(int [] salesl){
        int lastsalesmax = 0;
        int indexlastsalesMax = 0;

        for (int i = 0; i < salesl.length; i ++) {

            if (lastsalesmax <= salesl[i]) {
                lastsalesmax = salesl[i];
                indexlastsalesMax = i;
            }
        }
        return indexlastsalesMax+1;
    }
    public int salesMin(int [] salesl) {
        int salesmin = salesl[0];
        int indexsalesmin = 0;

        for (int i = 0; i < salesl.length; i ++) {
            if (salesmin > salesl[i]) {
                salesmin = salesl[i];
                indexsalesmin = i;
            }
        }
        return indexsalesmin+1;
    }

    public int BelowAveragesales(int [] salesl) {
        StatsService statsService = new StatsService();
        int belowaveragesales =  statsService.calculateAverage(salesl);
        int indexbelowaveragesales = 0;

        for (int i = 0; i < salesl.length; i++) {
            if (salesl[i] <  belowaveragesales) {
                indexbelowaveragesales++;
                }
        }
        return indexbelowaveragesales;
    }

    public int AboveAveragesales(int [] salesl) {
        StatsService statsService = new StatsService();
        int aboveaveragesales = statsService.calculateAverage(salesl);
        int indexaboveaveragesales = 0;

        for (int i = 0; i < salesl.length; i++) {
            if (aboveaveragesales > salesl[i] ) {
                indexaboveaveragesales++;
            }
        }
        return indexaboveaveragesales;
    }


}
