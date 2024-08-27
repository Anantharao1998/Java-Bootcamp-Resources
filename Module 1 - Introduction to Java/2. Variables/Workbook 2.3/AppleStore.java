public class AppleStore {
    static int numOfApples = 0;
    static int numOfCustomers = 0;
    static double profit = 0;
    static double test = 23;

    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (see the Udemy Video:
        // Workbook 2.3 to access the link).

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples = numOfApples + 500;

        System.out.println("Time for business! You're selling each apple for 40 cents");

        System.out.println("One customer walked in. He bought 4 apples!");
        customerPurchased(4);

        System.out.println("Another customer walked in. He bought 20 apples!");
        customerPurchased(20);

        System.out.println("Another customer walked in. She bought 200 apples!");
        customerPurchased(200);

        System.out.println("Wow! So far, you made: $"+profit);
        System.out.println(numOfCustomers+" customers love your apples.");
        System.out.println("You have "+numOfApples+" apples left.");
        System.out.println("This is test "+test);

        // Compare your result to what's on Learn the Part.

    }

    private static void customerPurchased(int applesBought) {
        if (applesBought > numOfApples) {
            System.out.println("There is not enough apples");
        } else {
            numOfCustomers++;
            numOfApples = numOfApples - applesBought;
            profit = profit+( applesBought * 40);
        }

    }

}
