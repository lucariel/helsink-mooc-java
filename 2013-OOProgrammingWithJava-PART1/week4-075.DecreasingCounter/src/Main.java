public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(1000);

        counter.printValue();
        counter.decrease();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();
        
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrease();
        counter.printValue();
        counter.setInitial();
        counter.printValue();
    }
}
