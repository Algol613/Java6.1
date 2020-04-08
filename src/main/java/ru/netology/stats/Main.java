package ru.netology.stats;


public class Main {
    public static void main(String[] args){

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();

        int salesSum = statsService.calculateSum(sales);
      System.out.println(salesSum);

        int salesAverage = statsService.calculateAverage(sales);
      System.out.println(salesAverage);

        int lastsalesMax = statsService.lastsalesMax(sales);
      System.out.println(lastsalesMax);

        int salesMin = statsService.salesMin(sales);
      System.out.println(salesMin);

        int BelowAveragesales = statsService.BelowAveragesales(sales);
      System.out.println(BelowAveragesales);

        int AboveAveragesales = statsService.AboveAveragesales(sales);
        System.out.println(AboveAveragesales);
    }

}

