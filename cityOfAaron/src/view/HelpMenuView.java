/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Date last modified: 6/13/18
 * @author Kyli Barnes
 */

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Game;

public class HelpMenuView{
    
    Scanner keyboard = new Scanner(System.in);
    private String helpMenu;
    private int max;
    private Game theGame = CityOfAaron.getTheGame();
    
    /**
    * The HelpMenuView constructor
    * Purpose: Initialize the menu data
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public HelpMenuView() {

        helpMenu = "\n" +
        "**********************************\n" +
        "* CITY OF AARON: HELP MENU *\n" +
        "**********************************\n" +
        " 1 - What are the goals of the game?\n" +
        " 2 - Where is the city of Aaron?\n" +
        " 3 - How do I view the map?\n" +
        " 4 - How do I move to another location?\n" +
        " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
        " 6 - Back to the Main Menu.\n";

        max = 6;
}
/**
    * The displayGameMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    // =========================================================
    public void displayHelpMenuView()
 {
    int menuOption;
    do
 {
// Display the menu
        System.out.println(helpMenu);
    
        // Prompt the user and get the user’s input
        menuOption = getMenuOption();

        // Perform the desired action
        doAction(menuOption);

        // Determine and display the next view
    } while (menuOption != max);
}
/**
    * The getMenuOption method
    * Purpose: gets the user's input
    * Parameters: none
    * Returns: integer - the option selected
     * @return 
    */
    // ===================================
    public int getMenuOption()
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
            case 1: // what are the goals of the game?
            viewGoals();
            break;
            case 2: // where is the city of aaron?
            Location();
            break;
            case 3: // how do I view the map?
            viewMap();
            break;
            case 4: // how do I move to another location?
            moveToNewLocation();
            break;
            case 5: // how do I display a list of animals, provisions and tools in the city storehouse?
            displayListMenuView();
            break;
            case 7: //goes back to main menu
            displayMainMenuView();
        }
    } 

    private void viewGoals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private void Location() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     public void viewMap()
    {
        System.out.println("Here is the Map!");
    }
    
      public void moveToNewLocation()
    {
        System.out.println("Where would you like to go next?");
    }
      
      public void displayListMenuView()
    {
        System.out.println("Take a look at your list!");
    }
      
      public void displayMainMenuView() 
    {
        System.out.println("You're headed back to the main menu.");
    }
}
