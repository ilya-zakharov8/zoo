/**
 * Created by Ilya on 12.09.2014.
 */
public class Pig implements Animal{
    // поля
    public int mass;

    void  setMass(int m){
        if(m > 0)
            mass = m;
        else System.out.println("Incorrect mass");
    }
    int  getMass(){
        return mass;
    }
    public String name;
    @Override
    public  void doSound(){
        System.out.println("Hruuu hruuu");
    }
}
