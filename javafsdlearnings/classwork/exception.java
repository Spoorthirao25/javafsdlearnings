class exception {
    public static void main(String[] args) {
        try {
            int quantity = Integer.parseInt("abc");
            double price = 100.0;
            double total = quantity*price;
             System.out.println("total:"+total);
        }
        catch(NumberFormatException e) {
            System.out.println("invalid quantity entered");
            System.out.println("useing default: 1");
            double total = 100.0;
            System.out.println("total : "+total);

        }
        System.out.println("checkout complete successfully");
    }
}