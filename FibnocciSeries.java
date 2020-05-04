/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibnocci.series;

/**
 *
 * @author lenovo
 */
public class FibnocciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int f1= 0,f2=1, f3,i , count=10;
        System.out.print(f1+" "+ f2);
        
        for (i=2;i<count;i++)
        {
            f3 = f1 + f2;
            System.out.print(" "+f3);
            f1 = f2;
            f2 = f3;
        }
    }
    
}
