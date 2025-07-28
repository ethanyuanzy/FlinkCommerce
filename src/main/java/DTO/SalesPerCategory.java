package DTO;


import java.util.Date;

public class SalesPerCategory {
    private Date transactionDate;
    private String category;
    private Double totalSales;

    // All-args constructor
    public SalesPerCategory(Date transactionDate, String category, Double totalSales) {
        this.transactionDate = transactionDate;
        this.category = category;
        this.totalSales = totalSales;
    }

    // Getters
    public Date getTransactionDate() {
        return transactionDate;
    }

    public String getCategory() {
        return category;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    // Setters
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    // toString method
    @Override
    public String toString() {
        return "SalesPerCategory{" +
                "transactionDate=" + transactionDate +
                ", category='" + category + '\'' +
                ", totalSales=" + totalSales +
                '}';
    }
}
