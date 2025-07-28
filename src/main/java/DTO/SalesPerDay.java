package DTO;


import java.util.Date;

public class SalesPerDay {
    private Date transactionDate;
    private Double totalSales;

    // All-args constructor
    public SalesPerDay(Date transactionDate, Double totalSales) {
        this.transactionDate = transactionDate;
        this.totalSales = totalSales;
    }

    // Getters
    public Date getTransactionDate() {
        return transactionDate;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    // Setters
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    // toString method
    @Override
    public String toString() {
        return "SalesPerDay{" +
                "transactionDate=" + transactionDate +
                ", totalSales=" + totalSales +
                '}';
    }
}
