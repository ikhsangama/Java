package sepeda;

public class Main {
    public static void main(String[] args) {
        Sepeda l = new Sepeda("yamaha", 1000);
        Sepeda m = new Sepeda("yamaha", 1000.0);
        System.out.println(l.sama(m));
    }
}
