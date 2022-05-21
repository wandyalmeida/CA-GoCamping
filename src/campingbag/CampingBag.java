/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campingbag;

import Items.Item;
import Items.Product;
import inputs.GetInputs;
import java.util.ArrayList;

/**
 *
 * @lecturer Ken Healy
 * @module Programming: Object-Oriented Approach.
 * @author Wandwilson Almeida Da Silva
 * @Student Number: 2021230
 * @Assessment: Object-Oriented CA
 */
public class CampingBag {

    int capacity;
    private ArrayList<Item> bagContents = new ArrayList<Item>();

    /**
     * Create a camping bag with a given capacity
     *
     * @param capacity - the capacity as an int
     */
    public CampingBag(int capacity) {

        this.capacity = capacity;

    }

    /**
     * Check if the bag is full but it is depend of the capacity of the bag.
     *
     * @return true if bag is full, else false
     */
    public boolean isFull() {
        //Check if the bag is full each bag has a determinate capacity like 30 is the capacity
        if (0 > capacity) {
            //If the bag do not have more space should print the infomation!
            System.out.println("Sorry your bag do not have more space!!!");

            return true;
        } else {
            // If the bag has space should print this information and add the product into the bag.
            System.out.println("The item was added in your bag!");
        }
        return false;

    }

    /**
     * Add the item on the bag camping.
     *
     * @param thingToAdd - an object that is an Item or a sub-class of Item - to
     * be added to the bag contents
     * @return - true if the item added successfully and false if the item was
     * not add;
     */
    public boolean addItem(Item thingToAdd) {
        //if the capacity of the bag is great of 0 the item will add on the Bag
        if (capacity > 0) {
            bagContents.add(thingToAdd);
            return true;
        }
        return false;
    }

    /**
     * remove the item on the bag camping.
     *
     * @param thingsToRemove - an object that is an Item or a sub-class of Item
     * - to be removed to the bag contents
     * @return - true if the item removed successfully;
     */
    public boolean removeItem(Item thingsToRemove) {

        bagContents.remove(thingsToRemove);// get the item to remove.

        System.out.println(thingsToRemove + " : was removed"); //show the what is the item was removed

        return true;
    }

    /**
     *
     * Check the item on the bag and check if the item is the same of the user
     * would like to remove.
     *
     * @param option will get the option that the user would like to remove on
     * the bag.
     * @param item get the name of the product
     */
    public void checkBag(int option, String item, int size) {
        int count = 0; // start count the product.

        //start looping to check if the count is equall the option
        while (!(count == option)) {
            count++; // count +1
            //start get the name of the itens.

            for (int i = 0; i < bagContents.size(); i++) {
                Item it = bagContents.get(i); // it get the name of product

                //If the name of product is like of the item do it.
                if (it.getDescription().equals(item)) {
                    removeItem(it); //call the removeItem method to remove the item
                    capacity = capacity + size; // capacity get the space that was removed from the bag
                    break;
                }
            }

        }

    }

    /**
     * find item on the array list.
     *
     * @param it - is a name of the Item.
     */
    public void checkbag(String it) {

        int count = 0;

        //start check the arraylist
        for (Item item : bagContents) {
            //If the name of product is like of the item do it.
            if ((item.getDescription().equals(it))) {
                count++; //count +1
            }

        }
        //when finish the loop show the all itens and the amount
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Bag Itens: ");
        System.out.println(it + ": " + count);

    }

    /**
     * Show the menu with the option to user can add on the bag and remove.
     */
    public void menu() {
        GetInputs mykb = new GetInputs(); //call method input
        int option, quant, size; // start valiable //quant is the amount.

        String ans; // get the input that is string.

        //Start the do while looping 
        do {

            System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("     Let is start pepar your Bag !");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("What you want to add in your bag? \n");
            System.out.println("[1] Tent \n[2] Footprint \n[3] Sleeping bags \n[4] Camping pillow \n[5] Flashlights \n[6] Remove Item \n[0] Go camping");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            option = mykb.getUserInt("Type a number: ", 0);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            //Start get the user input
            switch (option) {
                case 1:
                    quant = mykb.getUserInt("\nhow many you would like to add? ", 1);
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    ans = mykb.getUserText("\nAre you sure you would like to add this product? Type [Y] to Yes or [N] to No.").toUpperCase(); // make a question to user and get the input
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    if ("Y".equals(ans) || "YES".equals(ans)) {
                        //Start a for looping to add the product that the user wanted.
                        for (int i = 0; i < quant; i++) {
                            Item it = new Product(5, "Tent");

                            addItem(it);
                            size = 5;
                            capacity = capacity - size;
                            //if capacity lower than 0 capacity will increase the capacity 
                            if (capacity < 0) {
                                capacity = capacity + size;
                            }

                        }
                        isFull();//check if the bag is full
                        System.out.println("You bag has " + capacity + " of space!!!"); //show the space remaning
                    }
                    break;
                case 2:
                    quant = mykb.getUserInt("\nhow many you would like to add? ", 1);
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    ans = mykb.getUserText("\nAre you sure you would like to add this product? Type [Y] to Yes or [N] to No.").toUpperCase();// make a question to user and get the input
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    if ("Y".equals(ans) || "YES".equals(ans)) {
                         //Start a for looping to add the product that the user wanted.
                        for (int i = 0; i < quant; i++) {
                            Item it = new Product(5, "Footprint");
                            addItem(it);
                            size = 5;
                            capacity = capacity - size;
                            //if capacity lower than 0 capacity will increase the capacity 
                            if (capacity < 0) {
                                capacity = capacity + size;
                            }

                        }
                        isFull();//check if the bag is full
                        System.out.println("You bag has " + capacity + " of space!!!");//show the space remaning
                    }
                    break;
                case 3:
                    quant = mykb.getUserInt("\nhow many you would like to add? ", 1);
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    ans = mykb.getUserText("\nAre you sure you would like to add this product? Type [Y] to Yes or [N] to No.").toUpperCase();// make a question to user and get the input
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    if ("Y".equals(ans) || "YES".equals(ans)) {
                        //Start a for looping to add the product that the user wanted.
                        for (int i = 0; i < quant; i++) {
                            Item it = new Product(6, "Sleeping bags");
                            addItem(it);
                            size = 6;
                            capacity = capacity - size;
                            //if capacity lower than 0 capacity will increase the capacity 
                            if (capacity < 0) {
                                capacity = capacity + size;
                            }

                        }
                        isFull();//check if the bag is full
                        System.out.println("You bag has " + capacity + " of space!!!");//show the space remaning
                    }

                    break;
                case 4:
                    quant = mykb.getUserInt("\nhow many you would like to add? ", 1);
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    ans = mykb.getUserText("\nAre you sure you would like to add this product? Type [Y] to Yes or [N] to No.").toUpperCase();// make a question to user and get the input
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    if ("Y".equals(ans) || "YES".equals(ans)) {
                        //Start a for looping to add the product that the user wanted.
                        for (int i = 0; i < quant; i++) {
                            Item it = new Product(2, "Camping pillow");
                            addItem(it);
                            size = 2;
                            capacity = capacity - size;
                            
                            //if capacity lower than 0 capacity will increase the capacity 
                            if (capacity < 0) {
                                capacity = capacity + size;
                            }

                        }
                        isFull();//check if the bag is full
                        System.out.println("You bag has " + capacity + " yet!!!");//show the space remaning
                    }
                    break;
                case 5:
                    quant = mykb.getUserInt("\nhow many you would like to add? ", 1);
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    ans = mykb.getUserText("\nAre you sure you would like to add this product? Type [Y] to Yes or [N] to No.").toUpperCase();// make a question to user and get the input
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    if ("Y".equals(ans) || "YES".equals(ans)) {
                        //Start a for looping to add the product that the user wanted.
                        for (int i = 0; i < quant; i++) {
                            Item it = new Product(1, "Flashlights");
                            addItem(it);
                            size = 1;
                            capacity = capacity - size;
                            
                            //if capacity lower than 0 capacity will increase the capacity 
                            if (capacity < 0) {
                                capacity = capacity + size;
                            }

                        }
                        isFull();
                        System.out.println("You bag has " + capacity + " yet!!!");//show the space remaning
                    }
                    break;
                case 6:
                    
                    //show the itens and the amout of the itens on the bag
                    checkbag("Tent");
                    checkbag("Footprint");
                    checkbag("Sleeping bags");
                    checkbag("Camping pillow");
                    checkbag("Flashlights");
                    
                    // ask what the user would like to remove and show the itens.
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("\nWhat would you like to remove: ");
                    System.out.println("[1] Tent \n[2] Footprint \n[3] Sleeping bags \n[4] Camping pillow \n[5] Flashlights");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    option = mykb.getUserInt("Type a number: type 6 to back to menu to add ", 1); //get the user input what is the item of the user would like to remove
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    switch (option) {
                        case 1:
                            quant = mykb.getUserInt("how many you would like to remove? ", 1); //get how many what user would like to remove
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                            checkBag(quant, "Tent", 5); //check the item of the bag and remove itens
                            break;
                        case 2:
                            quant = mykb.getUserInt("how many you would like to remove? ", 1);//get how many what user would like to remove
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                            checkBag(quant, "Footprint", 5);//check the item of the bag and remove itens
                            break;
                        case 3:
                            quant = mykb.getUserInt("how many you would like to remove? ", 1);//get how many what user would like to remove
                            checkBag(quant, "Sleeping bags", 6);//check the item of the bag and remove itens
                            break;

                        case 4:
                            quant = mykb.getUserInt("how many you would like to remove? ", 1);//get how many what user would like to remove
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                            checkBag(quant, "Camping pillow", 2);//check the item of the bag and remove itens
                            break;

                        case 5:
                            quant = mykb.getUserInt("how many you would like to remove? ", 1);//get how many what user would like to remove
                            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                            checkBag(quant, "Flashlights", 1);//check the item of the bag and remove itens
                            break;

                    }

            }
        } while ((option != 0)); //end the loop if the option is equal 0
       
        System.out.println("Have a good Camping...");

        //show the itens and the amoult.
        checkbag("Tent");
        checkbag("Footprint");
        checkbag("Sleeping bags");
        checkbag("Camping pillow");
        checkbag("Flashlights");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("You bag has " + capacity + " of space!!!");//show the space remaning

    }
}
