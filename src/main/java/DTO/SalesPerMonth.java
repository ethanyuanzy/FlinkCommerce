package DTO;

public class SalesPerMonth {
    private int year;
    private int month;
    private double totalSales;

    // All-args constructor
    public SalesPerMonth(int year, int month, double totalSales) {
        this.year = year;
        this.month = month;
        this.totalSales = totalSales;
    }

    // Getters
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public double getTotalSales() {
        return totalSales;
    }

    // Setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // toString method
    @Override
    public String toString() {
        return "SalesPerMonth{" +
                "year=" + year +
                ", month=" + month +
                ", totalSales=" + totalSales +
                '}';
    }
}
