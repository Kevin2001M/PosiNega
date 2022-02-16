/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ?");
        Integer A = scanner.nextInt();
        
        System.out.println("Ingresa un numero: ?");
        Integer B = scanner.nextInt();
        
        if(A < 0) {
            System.out.println("El primer numero es negativo");
        }
        if (A > 0){
            System.out.println("El primer numero es positivo");
        }
        if (B < 0){
            System.out.println("El segundo numero es negativo");
        }
        if (B > 0){
            System.out.println("El segundo numero es positivo");
        }
    }
    
}
