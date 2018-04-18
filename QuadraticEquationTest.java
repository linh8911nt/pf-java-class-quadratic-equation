import java.util.ArrayList;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        double factorA = 0;
        double factorB = 0;
        double factorC = 1;

        QuadraticEquation quadraticEquation = new QuadraticEquation();
        ArrayList root = quadraticEquation.root(factorA, factorB, factorC);

        if (root.size() == 0){
            System.out.println("The equation has no roots");
        } else {
            System.out.println("The equation has " + root.size() + " root");
            for (int i = 0; i < root.size(); i++) {
                System.out.println(root.get(i));
            }
        }
    }
}
