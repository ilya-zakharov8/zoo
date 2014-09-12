import java.util.Random;

/**
 * Created by Ilya on 12.09.2014.
 */
public class Program {
    public static void main(String[] args) {
       // Animal animal = new Pig();
        //animal.doSound();
        Animal animal[] = new Animal[10];
        Random random = new Random();

        for( int i = 0; i < 10; i++){
            int temp = random.nextInt();
            if(temp % 2 == 0)
                animal[i] = new Bear();
            else animal[i] = new Pig();
        }
        int q = 0;

    }
}
