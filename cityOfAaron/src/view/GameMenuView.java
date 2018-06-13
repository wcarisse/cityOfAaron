/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Date Last Modified: 06/12/2018
 * @author Carissa Cunningham
 */

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Player;
import model.Game;
import model.CropData;

public class GameMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String gameMenu;
    private int max;
    private Game theGame = CityOfAaron.getTheGame();
    
    /**
    * The GameMenuView constructor
    * Purpose: Initialize the menu data
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public GameMenuView()
    {
        gameMenu = "\n" +
        "**********************************\n" +
        "* CITY OF AARON: GAME MENU *\n" +
        "**********************************\n" +
        " 1 - View the Map\n" +
        " 2 - View or Print a list\n" +
        " 3 - Move to a new land\n" +
        " 4 - Manage the Crops\n" +
        " 5 - Return to the Main Menu\n";

        max = 5;
}

    /**
    * The displayGameMenuView method
    * Purpose: displays the menu, gets the user's input, and does the
    * selected action
    * Parameters: none
    * Returns: none
    */
    // =========================================================
 public void displayGameMenuView()
 {
    int menuOption;
    do
    {
        // Display the menu
        System.out.println(gameMenu);
    
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
            case 1: // view the map
            viewMap();
            break;
            case 2: // provides user with list of options
            displayListMenuView();
            break;
            case 3: // move to a new location
            moveToNewLocation();
            break;
            case 4: // manage the crops
            manageCrops();
            break;
            case 5: //goes back to main menu
            displayMainMenuView();
        }
    } 
    
    public void viewMap()
    {
        System.out.println("Here is the Map");
    }

    public void displayListMenuView()
    {
        System.out.println("here is the list menu");
    }
    
    public void moveToNewLocation()
    {
        System.out.println("CHoose coordinates for your new adventure!");
    }
    
    public void manageCrops()
    {
        System.out.println("Lots of stuff goes here");
    }
    
    public void displayMainMenuView()
    {
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
    }
    
}
