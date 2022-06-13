package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumOfAllSales() {
        StatsService service = new StatsService();
        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1, 0.1, 1, 1};

        double expected = 1 + 1 + 1 + 1 + 1 + 0.1 + 1 + 1 + 1 + 0.1 + 1 + 1;
        double actual = service.sumOfAllSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldBeZeroSumOfAllSales() {
        StatsService service = new StatsService();

        double[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        double expectedSum = 0;
        double actualSum = service.sumOfAllSales(sales);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSale() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1, 0.1, 1, 1};

        double expectedAverageSale = 0.85;
        double actualAverageSale = service.averageSale(sales);

        assertEquals(expectedAverageSale, actualAverageSale);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        long expected = 11;
        double actual = service.maxSalesMonth(sales);

       assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSalesIfZero() {
        StatsService service = new StatsService();

        double[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        long expectedMaxSales = 12;
        double actualMaxSales = service.maxSalesMonth(sales);

       assertEquals(expectedMaxSales, actualMaxSales);
    }


    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        long expectedMinSales = 10;
        double actualMinSales = service.minSales(sales);

        assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldMinSalesIfZero() {
        StatsService service = new StatsService();

        double[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        long expectedMinSalesIfZero = 12;
        double actualMinSalesIfZero = service.minSales(sales);

        assertEquals(expectedMinSalesIfZero, actualMinSalesIfZero);
    }

    @Test
    public void shouldUnderAverageSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        double expectedUnderAverageSales = 2;
        double actualUnderAverageSales = service.underAverageSales(sales);

        assertEquals(expectedUnderAverageSales, actualUnderAverageSales);
    }

    @Test
    public void shouldOverAverageSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        long expectedOverAverageSales = 10;
        double actualOverAverageSales = service.overAverageSales(sales);

        assertEquals(expectedOverAverageSales, actualOverAverageSales);
    }

}