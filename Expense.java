package expensetracker;

public class Expense {
    private String description;
    private double amount;
    private String date;

    public Expense(String description, double amount, String date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "description='" + (description != null ? description : "") + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}
