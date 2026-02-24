public class BPI_Atm {

    public static void main(String[] args) {

        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int amount = 2970; // Try 2970, 1250, 370, etc.

        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 10.");
            return;
        }

        System.out.println("Requesting to dispense: ₱" + amount);
        atmDispenser.dispense(new Currency(amount));
    }
}