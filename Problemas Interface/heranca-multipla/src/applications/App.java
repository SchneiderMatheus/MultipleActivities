package applications;


import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class App {
    public static void main(String[] args) throws Exception {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: "+s.scan());
    }
}
