/**
 * @author Hamza Ouni
 */
public class Main {


    public static void main(String[] args) {

        Individu Ind1 = new Archer();
        Ind1.display();

    
        Ind1.setArme(new ComportementEpee());

        System.out.println("aprés changement de comportement maintenant :");

        Ind1.ComptArm.utiliseArme();


    }
}
