
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Week1_PP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scan 
        Scanner scan = new Scanner(System.in);
        
        // Get input 
        System.out.print("Enter kilometers: ");
        double kilometers = 0.0; 
        kilometers = scan.nextDouble();
        
        
        // Processing 
        double miles = convertToMiles(kilometers);        
        // Output 
        DecimalFormat fmt = new DecimalFormat("0.0");
       System.out.println( kilometers + " Kilometers is equil to: " + fmt.format(miles) + " miles. ");
        
        
        
    }
    
    public static double convertToMiles( double kilometers )
    {
        double miles = kilometers* 0.6214;
        return miles;
    }
    
    
}
