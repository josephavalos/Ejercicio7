
package ejer2;

import java.util.Scanner;

public class Factor {
    
    public static void Factorizar(){
    Scanner miScanner = new Scanner (System.in);
    
    int num;
    int divisor = 2;
    
    System.out.print("Introduce El numero A dividir en factores: ");
    num= miScanner.nextInt();
    
    System.out.print("Los  Factores Del numero " + num + " son: ");
    
    while(num !=1){
        if(num % divisor ==0){
            System.out.print(divisor + " ");
            num = num / divisor;
        }else{
            divisor ++;
        }
    }
    }
}