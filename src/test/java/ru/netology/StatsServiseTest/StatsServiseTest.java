package ru.netology.StatsServiseTest;

import org.junit.jupiter.api.Test;

import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServisTest {
    @Test

    void shouldTestCalculateSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldTestCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverage(sales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldTestCalculateLastsalesMax() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.lastsalesMax(sales);
        assertEquals(expected, actual);
    }


    @Test
    void shouldTestCalculatesalesMin() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.salesMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTestCalculateBelowAveragesales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.BelowAveragesales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldTestCalculateAboveAveragesales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.AboveAveragesales(sales);
        assertEquals(expected, actual);
    }
}

