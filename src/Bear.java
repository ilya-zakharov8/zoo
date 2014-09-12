/**
 * Created by Ilya on 12.09.2014.
 */
public class Bear implements Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public int getCountOfCorps() {
        return countOfCorps;
    }

    public void setCountOfCorps(int countOfCorps) {
        this.countOfCorps = countOfCorps;
    }

    private  int countOfCorps;
    private  int countOfMen;

    @Override
    public  void doSound(){
        System.out.println("AAAAAAAAAAAAAA!!!! RRRRRRRRRRRRRRRR!!!!");
    }
}
