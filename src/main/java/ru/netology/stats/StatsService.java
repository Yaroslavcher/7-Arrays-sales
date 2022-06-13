package ru.netology.stats;

public class StatsService {

    public double sumOfAllSales(double[] sales) { // 1. Сумма всех продаж
        double sum = 0;
        for (double sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageSale(double[] sales) { // 2. Средняя сумма продаж
        double sum = sumOfAllSales(sales);
        return sum / sales.length;
    }

    public int maxSalesMonth(double[] sales) { // 3. Номер последнего месяца МАКСИМУМА продаж
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(double[] sales) { // 4. Номер последнего месяца минимума продаж
        int minMonth = 0;
        int month = 0; //переменная для индекса рассматриваемого месяца в массиве
        for (double sale : sales) {
            // sales[minMonth] - продажи в minMonth-месяце
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; //номер следующего рассматриваемого месяца на 1 больше предыдущего
        }
        return minMonth + 1;
    }

    public int underAverageSales(double[] sales) { // 5. Количество месяцев продаж ниже среднего
        int underAverageSales = 0;
        double avg = averageSale(sales);
        for (double sale : sales) {
            if (sale < avg) {
                underAverageSales++;
            }
        }
        return underAverageSales;
    }

    public int overAverageSales(double[] sales) { // 6. Количество месяцев продаж выше среднего
        int overAverageSales = 0;
        double avg = averageSale(sales);
        for (double sale : sales) {
            if (sale > avg) {
                overAverageSales++;
            }
        }
        return overAverageSales;
    }
}
