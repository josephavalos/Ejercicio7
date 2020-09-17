package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       int num1,num2;
       try{
           System.out.println("Ingrese el primer numero: ");
       num1 = teclado.nextInt();
       System.out.println("Ingrese el segundo numero: ");
       num2 = teclado.nextInt();
       
       while( num1 != num2)
           if (num1 > num2)
               num1 = num1 - num2;
           else num2 = num2 - num1;
       System.out.println("El MCD es: "+num1);
       }catch (Exception e){
            System.out.println("ERROR: Por favor introduce números enteros...");
        }
    }
    
}
