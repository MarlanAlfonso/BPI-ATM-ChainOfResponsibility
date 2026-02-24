public class ATMDispenseChain implements DispenseChain {

    private DispenseChain nextChain;

    public ATMDispenseChain() {

        // Initialize dispensers
        DispenseChain d1000 = new Peso1000Dispenser();
        DispenseChain d500 = new Peso500Dispenser();
        DispenseChain d200 = new Peso200Dispenser();
        DispenseChain d100 = new Peso100Dispenser();
        DispenseChain d50 = new Peso50Dispenser();
        DispenseChain d20 = new Peso20Dispenser();

        // Set chain order (highest to lowest)
        d1000.setNextChain(d500);
        d500.setNextChain(d200);
        d200.setNextChain(d100);
        d100.setNextChain(d50);
        d50.setNextChain(d20);

        this.nextChain = d1000;
    }

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        nextChain.dispense(currency);
    }
}