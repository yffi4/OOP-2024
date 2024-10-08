package Task4;

public class Prallel extends Circuit {
    private Circuit circuit1, circuit2;

    public Prallel(Circuit c1, Circuit c2) {
        this.circuit1 = c1;
        this.circuit2 = c2;
    }

    @Override
    public double getResistance() {
        double r1 = circuit1.getResistance();
        double r2 = circuit2.getResistance();
        return 1 / (1 / r1 + 1 / r2);
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        circuit1.applyPotentialDiff(V);
        circuit2.applyPotentialDiff(V);
    }

    @Override
    public String toString() {
        return "Prallel{" +
                "circuit1=" + circuit1 +
                ", circuit2=" + circuit2 +
                "} " + super.toString();
    }
}
