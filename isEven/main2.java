package InClass3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author hannaan
 */
import java.util.Scanner;
        

        
public class main2 {
    
        private static boolean isEven(int userInput) {
         return (userInput % 2 == 0);

       }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        
        System.out.print("Enter a number: ");
        
        userInput = in.nextInt();
        
        while(userInput>=0) {
            if(isEven(userInput)) {
                System.out.print("Even");
            }
                else {
                        System.out.print("Odd");
                        }
            
            System.out.print("Enter another number: ");
            
            userInput = in.nextInt();
            }
        }
     

}

