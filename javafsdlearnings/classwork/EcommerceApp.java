import java.util.*;
class Order{
    protected String orderId;
    protected double totalAmount;
    protected String orderDate;
   //parent constructor --parameterised constructors
   public Order (String orderId,double totalAmount){
    this.orderId=orderId;
    this.totalAmount =totalAmount;
    this.orderDate=new Date().toString();
    System.out.println("Order created :"+orderId);

   }
   //parent method
   public double calculateDiscount(){
    //base discount :5% for all orders
    return totalAmount=0.05;
   }

   public void displayOrder(){
    System.out.println("Order ID :"+orderId);
    System.out.println("Amount : ₹"+totalAmount);
    System.out.println("Date :"+orderDate);
   }

   }

class PremiumOrder extends Order{
  private String membershipTier;
  private double cashback;



  public PremiumOrder(String orderId, double totalAmount,String membershipTier){
    super(orderId,totalAmount);
    this.membershipTier=membershipTier;
    this.cashback = totalAmount * 0.10;//10% cashback

    System.out.println("Cashback "+ cashback +" ------");
    System.out.println("Premiunm order with  "+ membershipTier +" membership");
  
  }
  @Override
  public double calculateDiscount(){
    // Get parent's discount (5%) and add premium discount (10%)
    double baseDiscount =super.calculateDiscount();// calling parent method
    double premiumDiscount = totalAmount * 0.10;
    double finalDiscount =baseDiscount + premiumDiscount;
    System.out.println("Premium discount applied :" + finalDiscount);
    return finalDiscount;


  }
  @Override
  public void displayOrder(){
    super.displayOrder();
    System.out.println("Membership:"+ membershipTier);
    System.out.println("Cashback : ₹"+ cashback);

  }
}
public class EcommerceApp {
  public static void main(String [] args){
    PremiumOrder order = new PremiumOrder("ORD123" , 5000, "Gold");
    order.displayOrder();
    order.calculateDiscount();
  }
}