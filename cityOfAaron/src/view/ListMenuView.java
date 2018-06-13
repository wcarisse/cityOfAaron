/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author kate lewis
 */
public class ListMenuView {
    
    Scanner keyboard = new Scanner(System.in);
    
    private String theMenu;
    private int max;
    
    
    public ListMenuView()
    {
        theMenu = "\n" +
         "**********************************\n" +
         "* CITY OF AARON: LIST MENU *\n" +
         "**********************************\n" +
         " 1 - Animals\n" +
         " 2 - Tools\n" +
         " 3 - Provisions\n" +
         " 4 - Teams\n" +
         " 5 - Main Menu\n";

         max = 5;
    }
    
    /**
    * The displayMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    // =========================================================
     public void displayListMenuView()
    {
        int listMenuOption;
        do
            {
                // Display the menu
                 System.out.println(theMenu);
    
                // Prompt the user and get the user’s input
                listMenuOption = getListMenuOption();

                // Perform the desired action
                doAction(listMenuOption);

                // Determine and display the next view
            } while (listMenuOption != max);  
     }
     
    /**
    * The getMenuOption method
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: integer - the option selected
    * @return 
    */
    // ===================================
    public int getListMenuOption()
    {
        // declare a variable to hold user’s input
        int userInput;
     
        // begin loop
        do{
            // get user input from the keyboard
            userInput = keyboard.nextInt();

            // if it is not a valid value, output an error message
            if (userInput < 1 || userInput > max)
                {
                    System.out.println("Option must be between 1 and " + max);
                }
            // loop back to the top if input was not valid
        } while(userInput < 1 || userInput > max);
    
        // return the value input by the user
        return userInput;
    }
 
    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: none
    * Returns: none
    * @param option
    */
    // ===================================
     public void doAction(int option)
        {
            switch (option)
               {
                case 1: // create and start a new game
                listAnimals();
                break;
                case 2: // get and start a saved game
                listTools();
                break;
                case 3: // get help menu
                listProvisions();
                break;
                case 4: // save game
                listTeam();
                break;
                case 5:
                System.out.println("Return to Main Menu");
               }
        }
 
    public void listAnimals()
    {
     System.out.println("list animals");
    }
 
    public void listTools()
    {  
     System.out.println("list tools");
    }
 
    public void listProvisions()
    {
     System.out.println("list provisions");
    }
 
    public void listTeam()
    {
     System.out.println("list team");
    }
}
