import java.util.ArrayList;

public class QuadraticEquation {
    private double factorA;
    private double factorB;
    private double factorC;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double factorB, double factorC) {
        this.factorB = factorB;
        this.factorC = factorC;
    }

    public QuadraticEquation(double factorA, double factorB, double factorC) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.factorC = factorC;
    }

    public double getDiscriminant(double factorA, double factorB, double factorC) {
        double delta = factorB * factorB - 4 * factorA * factorC;
        return delta;
    }

    public double getRoot1(double factorA, double factorB, double factorC){
        double delta = getDiscriminant(factorA, factorB, factorC);
        double root = (-factorB + Math.pow(delta, 0.5)) / 2 * factorA;
        return root;
    }

    public double getRoot2(double factorA, double factorB, double factorC){
        double delta = getDiscriminant(factorA, factorB, factorC);
        double root = (-factorB - Math.pow(delta, 0.5)) / 2 * factorA;
        return root;
    }

    public ArrayList root(double factorA, double factorB, double factorC){
        ArrayList root = new ArrayList();
        LinearEquation linearEquation = new LinearEquation(factorB, factorC);
        if (factorA == 0){
            linearEquation.getRoot(factorB, factorC);
        } else {
            if (getDiscriminant(factorA, factorB, factorC) > 0) {
                root.add(getRoot1(factorA, factorB, factorC));
                root.add(getRoot2(factorA, factorB, factorC));
            } else if (getDiscriminant(factorA, factorB, factorC) == 0) {
                root.add(getRoot2(factorA, factorB, factorC));
            } else {
                root = null;
            }
        }
        return root;
    }

    public double getFactorA() {
        return factorA;
    }

    public void setFactorA(double factorA) {
        this.factorA = factorA;
    }

    public double getFactorB() {
        return factorB;
    }

    public void setFactorB(double factorB) {
        this.factorB = factorB;
    }

    public double getFactorC() {
        return factorC;
    }

    public void setFactorC(double factorC) {
        this.factorC = factorC;
    }
}
