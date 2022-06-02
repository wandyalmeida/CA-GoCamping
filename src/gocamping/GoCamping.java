/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gocamping;



import campingbag.CampingBag;
import inputs.GetInputs;

/**
 *
 * @lecturer Ken Healy
 * @module Programming: Object-Oriented Approach.
 * @author Wandwilson Almeida Da Silva
 * @Student Number: 2021230
 * @Assessment: Object-Oriented CA
 */
public class GoCamping {

    /**
     * @param args the command line arguments
     * 
     * Strategy
     * 
     * 1) Create a Class.
     * 2) Create the privates variable and the arrayList.
     * 3) Get the capacity of the arrayList.
     * 4) Show the menu of the capacity of each bag.
     * 5) Show a small menu with the items that can put on bag.
     * 6) Ask how many the user would like to add.
     * 7) Check if the user would like to remove items.
     * 8) When the user close the bag show the items on the bag and the amount.
     *
     *  
     */
     
    public static void main(String[] args) {
        
        GetInputs mykb = new GetInputs(); //get user inputs
        
        int option; // get the option of the user input
        int sizeOfBag = 0; //initialsed 
        
        // include code here to get the size of the bag from the user
        
        CampingBag myCampingBag  = new CampingBag(sizeOfBag);
        
        //show the menu of the bag
        /**
         * 
         * [1] large got 90l -- 90 of capacity
         * [2] Medium got 65l -- 65 of capacity
         * [3] Small got 30l -- 30 of capacity
         * 
         */
        
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("       Welcome let is go camping!!");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("What is your size of Bag? ");
            System.out.println("[1] Large 90l \n[2] Medium 65l \n[3] Small 30l \n ");
            option = mykb.getUserInt("Type a number: ", 1);
            switch (option){
                case 1:
                    myCampingBag  = new CampingBag(90); // bag get the 90 of capacity
                    System.out.println("Your capacity is 90L");
                    break;
                case 2:
                    myCampingBag = new CampingBag(65);// bag get the 65 of capacity
                    System.out.println("Your capacity is 65L");
                    break;
                case 3:
                    myCampingBag = new CampingBag(30);// bag get the 30 of capacity
                    System.out.println("You capacity is 30L");
                    break;
            }
            
       
        myCampingBag.menu(); // show the menu with the itens to add.

       
        
    }
    
}
