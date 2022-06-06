package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumOfAllSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1, 0.1, 1, 1};

        double expectedSum = 10.2;
        double actualSum = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldBeZeroSumOfAllSales() {
        StatsService service = new StatsService();

        double[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        double expectedSum = 0;
        double actualSum = service.sumOfAllSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSale() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1, 0.1, 1, 1};

        double expectedAverageSale = 0.85;
        double actualAverageSale = service.averageSale(sales);

        Assertions.assertEquals(expectedAverageSale, actualAverageSale);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        long expectedMaxSales = 11;
        double actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldMaxSalesIfZero() {
        StatsService service = new StatsService();

        double[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        long expectedMaxSales = 12;
        double actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }


    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        long expectedMinSales = 10;
        double actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldMinSalesIfZero() {
        StatsService service = new StatsService();

        double[] sales = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        long expectedMinSalesIfZero = 12;
        double actualMinSalesIfZero = service.minSales(sales);

        Assertions.assertEquals(expectedMinSalesIfZero, actualMinSalesIfZero);
    }

    @Test
    public void shouldUnderAverageSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        long expectedUnderAverageSales = 2;
        double actualUnderAverageSales = service.underAverageSales(sales);

        Assertions.assertEquals(expectedUnderAverageSales, actualUnderAverageSales);
    }

    @Test
    public void shouldOverAverageSales() {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1.1, 0.1, 1.1, 1};

        long expectedOverAverageSales = 10;
        double actualOverAverageSales = service.overAverageSales(sales);

        Assertions.assertEquals(expectedOverAverageSales, actualOverAverageSales);
    }

}