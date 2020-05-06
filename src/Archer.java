/**
 * @author Hamza Ouni
 */
public class Archer extends Individu {

    public Archer() {
        ComptArm = new ComportementArcFleche();
        
    }

    @Override
    public void display() {
        System.out.println("je suis un archer ");
    }
}
