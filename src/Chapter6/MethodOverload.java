/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author Tanver Likhon
 */
public class MethodOverload {
    public void testOverloadedMethods()
    {
        System.out.printf("Square of integer 7 is %d\n",square(7));
                System.out.printf("Square of double 7 is %f\n",square(7.5));
    }
    public int square(int intValue)
    {
        System.out.printf("\nCalled square with int argument : %d\n",intValue);
        return intValue*intValue;
        
    }
    
    public double square(double doubleValue)
    {
        System.out.printf("\nCalled square with int argument : %f\n",doubleValue);
        return doubleValue*doubleValue;
    }
    public static void main(String[] args) {
        MethodOverload obj=new MethodOverload();
        obj.testOverloadedMethods();
    }
}
