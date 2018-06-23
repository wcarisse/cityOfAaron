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

public class HelpMenuView extends MenuView{
    
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

        super("\n" +
        "**********************************\n" +
        "* CITY OF AARON: HELP MENU *\n" +
        "**********************************\n" +
        " 1 - What are the goals of the game?\n" +
        " 2 - Where is the city of Aaron?\n" +
        " 3 - How do I view the map?\n" +
        " 4 - How do I move to another location?\n" +
        " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
        " 6 - Back to the Main Menu.\n",
        6);
}

    /**
    *The doAction method
    * Purpose: performs the selected action
    * Parameters: none
    * Returns: none
     * @param option
    */
    // ===================================
    @Override
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
        System.out.println("Here are the goals: ");
    }
    
     private void Location() {
        System.out.println("Where is the city of Aaron?");
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
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
        System.out.println("Take a look at your list!");
    }
      
      public void displayMainMenuView() 
    {
       
    }
}
