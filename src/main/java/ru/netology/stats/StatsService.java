package ru.netology.stats;

public class StatsService {

    public int calculateSumm(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int colculateAverageSales(int[] sales) {
        return calculateSumm(sales) / sales.length;
    }

    public int numberMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int numberMonthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int minAverage(int[] sales) {
        int average = colculateAverageSales(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
            ;
        }
        return month;
    }

    public int maxAverage(int[] sales) {
        int average = colculateAverageSales(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}
