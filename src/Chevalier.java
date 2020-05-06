/**
 * @author Hamza Ouni
 */
public class Chevalier extends Individu {

    public Chevalier() {
        ComptArm = new ComportementArcFleche();
       
    }
    @Override
    public void display() {
        System.out.println("je suis un chevalier");
    }
}
