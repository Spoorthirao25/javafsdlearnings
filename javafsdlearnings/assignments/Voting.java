import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new Exception("Not Eligible for Voting");1
            }

            System.out.println("Eligible for Voting");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
