import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        double[] sales = {1, 1, 1, 1, 1, 0.1, 1, 1, 1, 0.1, 1, 1};

        double sum = service.sumOfAllSales(sales);
        System.out.println("1. Сумма продаж: " + sum);

        double averageSale = service.averageSale(sales);
        System.out.println("2. Средняя сумма продаж: " + averageSale);

        int maxSales = service.maxSales(sales);
        System.out.println("3. Максимальные продажи в " + maxSales + "-м месяце");

        int minSales = service.minSales(sales);
        System.out.println("4. Минимальные продажи в " + minSales + "-м месяце");

        int underAverageSales = service.underAverageSales(sales);
        System.out.println("5. " + underAverageSales + " месяца(-ев) продажи ниже среднего");

        int overAverageSales = service.overAverageSales(sales);
        System.out.println("6. " + overAverageSales + " месяца(-ев) продажи выше среднего");
    }
}
