/**
 * @author Hamza Ouni
 */
public class ComportementArcFleche  implements ComportementArme {

  
    public String arme;

    public ComportementArcFleche() {this.arme="pas d'arme encors";}

    public void utiliseArme() {

        System.out.println("c'est l'arc Flech que j'utilise ");
    
    }
}
