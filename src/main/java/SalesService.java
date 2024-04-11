public class SalesService {

    // сумма всех продаж;
    public int getSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    // средняя сумма продаж в месяц;
    public int getAverageSum(int[] sales) {
        int salesVolume = getSum(sales);
        return salesVolume / sales.length;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    public int getNumberMonthMaxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSales]) {
                maxSales = i;
            }
        }
        return maxSales + 1;
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    public int getNumberMonthMinSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        return minSales + 1;
    }

    // последний месяц, в которых продажи были ниже среднего
    public int getLastMonthMinAverageSales(int[] sales) {
        int lastMonth = 0;
        int averageAmount = getAverageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                lastMonth = i;
            }
        }
        return lastMonth + 1;
    }

    // последний месяц, в которых продажи были выше среднего (см. п.2);
    public int getLastMonthMaxAverageSales(int[] sales) {
        int lastMonth = 0;
        int averageAmount = getAverageSum(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                lastMonth = i;
            }
        }
        return lastMonth + 1;
    }
}
