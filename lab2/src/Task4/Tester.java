package Task4;

public class Tester {
    public static void main(String[] args){
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);
        Circuit f = new Series(a, b);
        Circuit g = new Prallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Prallel(h, f);
        double R = circuit.getResistance();
        System.out.println(R);
        System.out.println(circuit);

    }
}
