
package Chapter7;

import java.util.Random;

/**
 *
 * @author tanverlikhon
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random rand=new Random();
        
        int x=rand.nextInt(20);//generates 0 t0 19
        System.out.println("Random value is "+x);
        
        //alternatives methods
        
        int xx= (int) (Math.random()*10);//returns double ,range 0-10
        System.out.println("Random second method  "+xx);
        
        
        
    }
  
}
