
package Chapter7;

public class InitArray {
    public static void main(String[] args) {
       // int [] array;
        //array=new int[10];
       int [] array={32,27,64,18,95,14,90,70,60,37} ;
        
        System.out.printf("%s%8s\n","Index","Value");
        ///array.length   <<<<<===============
        for(int counter=0;counter<array.length;counter++)
        {
            System.out.printf("%5d%8d\n",counter,array[counter]);
        }
        
       final int sz =10;
       
       int [] arr;
       arr= new int[sz];
       
       for(int i=0;i<sz;i++)
           arr[i]=i*2;
       
        for(int i=0;i<sz;i++)
            System.out.println(" "+arr[i]);
        
    }
 
}
