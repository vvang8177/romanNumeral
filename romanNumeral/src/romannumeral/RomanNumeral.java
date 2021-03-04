/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeral;

import java.util.Scanner;

/**
 *
 * @author Vues
 */
public class RomanNumeral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Input number: ");
        int input = s.nextInt();
                
        int[] intArray = {1000, 500, 100, 50, 10, 5, 1};
        String[] romanArr = {"M","D","C","L","X","V","I"};
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i<intArray.length; i++){
            while(input>=intArray[i]){
                input -=intArray[i];
                result.append(romanArr[i]);
            }
        }
        
        System.out.println(result);
                
    }
}
