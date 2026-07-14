import java.util.*;

// Parent Class
class Order {

    protected String orderId;
    protected double totalAmount;
    protected String orderDate;
    protected String tiemName;


    // Parent Constructor
    public Order(String orderId, double totalAmount,String itemName) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.totalAmount = totalAmount;
        this.orderDate = new Date().toString();

        System.out.println("Order Created: " + orderId);
    }

    // Parent Method
    public double calculateDiscount() {
        return totalAmount * 0.05;   // 5% Discount
    }

    public void displayOrder() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Total Amount  : " + totalAmount);
        System.out.println("Order Date    : " + orderDate);
        System.out.println("Order itemname    : " + itemName);


    }
}

// Child Class
class PremiumOrder extends Order {

    private String membershipTier;
    private double cashback;

    // Child Constructor
    public PremiumOrder(String orderId, double totalAmount, String membershipTier) {

        // Calls Parent Constructor
        super(orderId, totalAmount,itemName);

        this.membershipTier = membershipTier;
        this.cashback = 100.0;
    }

    // Override Parent Method
    @Override
    public double calculateDiscount() {

        // Parent Discount + Extra Discount
        return super.calculateDiscount() + (totalAmount * 0.10);
    }

    // Child Method
    public void displayPremiumDetails() {

        // Call Parent Method
        super.displayOrder();

        System.out.println("Membership Tier : " + membershipTier);
        System.out.println("Cashback        : " + cashback);
        System.out.println("Total Discount  : " + calculateDiscount());
    }
}

// Main Class
public class Main1 {

    public static void main(String[] args) {

        // Create PremiumOrder Object
        PremiumOrder p1 = new PremiumOrder("ORD101", 5000, "Gold");

        System.out.println("\n----- Premium Order Details -----");

        // Display Details
        p1.displayPremiumDetails();
    }
}