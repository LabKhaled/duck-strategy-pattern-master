/**
 * @author Hamza Ouni
 */
public abstract class Individu {

    public ComportementArme ComptArm;
   

    public Individu (){

    }

    public void display() {}


    public void setArme(ComportementArme ca) {
        this.ComptArm = ca;
    }

}
