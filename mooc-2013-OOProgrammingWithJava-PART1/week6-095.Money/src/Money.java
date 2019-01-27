
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        Money M = new Money(this.euros() + added.euros(), this.cents() + added.cents());

        return M;
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)) {
            Money M = new Money(0,0);
            return M;
        } else {
            Money M;
            int newEuro = this.euros() - decremented.euros();
            int newCents = this.cents() - decremented.cents();
            if(newCents<0){
                newEuro--;
                newCents=100-   Math.abs(newCents);
            }
            M = new Money(newEuro, newCents);

            return M;
        }
    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {

            return true;
        } else if (this.euros() == compared.euros()) {
            if (this.cents() <compared.cents()){
                return true;
            }
            else{
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
