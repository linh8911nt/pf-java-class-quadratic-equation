import java.util.ArrayList;

public class LinearEquation extends QuadraticEquation{
    public LinearEquation() {
    }

    public LinearEquation(double factorB, double factorC) {
        super(factorB, factorC);
    }

    public double getRoot(double factorB, double factorC){
        double root = -factorC / factorB;
        return root;
    }

    public ArrayList root(double factorB, double factorC) {
        ArrayList root = new ArrayList();
        if (factorB != 0){
            root.add(getRoot(factorB, factorC));
        } else
            root = null;
        return root;
    }
}
