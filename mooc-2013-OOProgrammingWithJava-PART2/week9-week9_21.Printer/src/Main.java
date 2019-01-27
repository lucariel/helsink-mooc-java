
public class Main {

    public static void main(String[] args) throws Exception {
        // write some test code here
        // for testing purposes, project has files
        //    src/textfile.txt
        //    src/kalevala.txt
        Printer printer = new Printer("src/textfile.txt");

        printer.printLinesWhichContain("Siinä vanha Väinämöinen");
        System.out.println("ca");
        printer.printLinesWhichContain("katseleikse käänteleikse");
        printer.printLinesWhichContain("Niin tuli kevätkäkönen");

    }
}
