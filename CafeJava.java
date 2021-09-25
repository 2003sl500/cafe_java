public class CafeJava{
        static String generalGreeting = "Welcome to Cafe Java, ";
        static String pendingMessage = ", your order will be ready shortly";
        static String readyMessage = ", your order is ready";
        static String displayTotalMessage = "Your total is $";
    public static void main(String[] args) {

        double mochaPrice = 3.5, dripCoffee = 2.5, latte = 3.0, cappuccino = 4.0;

        String customer1 = "Cindhuri", customer2 = "Sam", customer3 = "Jimmy", customer4 = "Noah";

        boolean isReadyOrder1 = false, isReadyOrder2 = true, isReadyOrder3 = false, isReadyOrder4 = true;
        


        System.out.println(generalGreeting + customer1 + pendingMessage);
        System.out.println(generalGreeting + customer4 + pendingMessage);
        System.out.println(generalGreeting + customer2 + ". " + displayTotalMessage + (latte * 2));
        System.out.println(customer3 + ", sorry for the mix-up. " + displayTotalMessage + (latte - dripCoffee));

        isReady(isReadyOrder1, customer1);
        isReady(isReadyOrder2, customer2);
        isReady(isReadyOrder3, customer3);
        isReady(isReadyOrder4, customer4);

    }

    public static void isReady(boolean isDone, String customer){
        if(isDone == true){
            System.out.println(customer + readyMessage);
        } else {
            System.out.println(customer + pendingMessage);
        }
    }
}