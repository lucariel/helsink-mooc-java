
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= 2.5) {
            this.cashInRegister = this.cashInRegister + 2.5;
            this.economicalSold++;
            return cashGiven - 2.5;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4) {
            this.cashInRegister = this.cashInRegister + 4;
            this.gourmetSold++;
            return cashGiven - 4;
        } else {
            return cashGiven;
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

    }

    public boolean payEconomical(LyyraCard card) {
        if (card.pay(2.5)) {
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.pay(4)) {
            this.gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister = this.cashInRegister + sum;
        }

    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
