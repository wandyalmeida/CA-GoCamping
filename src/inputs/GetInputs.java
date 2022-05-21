package inputs;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @lecturer Ken Healy
 * @module Programming: Object-Oriented Approach.
 * @author Wandwilson Almeida Da Silva
 * @Student Number: 2021230
 * @Assessment: Object-Oriented CA
 */
public class GetInputs {
    
     public String getUserText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
                    
        String userInput = "";
        
        //prompt user until input is valid
        do{
            
            System.out.println(prompt);
            System.out.println("You must enter letters only");
            
            userInput = myKB.nextLine();
            
            
        }while (!userInput.matches("[Y-y-N-n]+"));
        
        //userInput must be text now
        
        return (userInput);
    }
     
     /**
     * Ask the user to enter a number with a minimum value.
     * If invalid, keep asking
     * 
     * @param prompt the message or question to the user
     * @param minValue the lowest value allowed
     * @return a valid integer value
     */
     
       public int getUserInt(String prompt, int minValue){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false;
        int userInput=-1;
        
        do{
            
            System.out.println(prompt);
            
            System.out.println("You must enter a number bigger than " + minValue);
            
            try {
                userInput = Integer.parseInt(myKB.nextLine());
                
                //check the value is allowed by checking min value
                if ( (userInput < minValue)){
                    
                    System.out.println("Invalid value entered. Please enter a number within the range specified");
                    
                }
                else {
                    //must be OK
                    valid = true;
                }
                
            }catch(Exception e){
                
                System.out.println("That was not an integer valie! please try again!");
               
            }
            
            
        }while (!valid);
        
        //userInput must be text now
        
        return (userInput);
        
    }
    
}
