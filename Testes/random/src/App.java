import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        

        System.out.println(rand.nextInt(55));
        System.out.println(rand.nextDouble(55));
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextExponential());
        System.out.println(rand.nextGaussian());
        
        
    }
}
