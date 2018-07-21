/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Date Last Modified: 07/18/2018
 * @author Carissa Cunningham
 */

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.GameControl;
import model.Game;

public class GameMenuView extends MenuView {
    Scanner keyboard = new Scanner(System.in);
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
        super("\n" +
        "**********************************\n" +
        "* CITY OF AARON: GAME MENU *\n" +
        "**********************************\n" +
        " 1 - View the Map\n" +
        " 2 - View or Print a list\n" +
        " 3 - Move to a new land\n" +
        " 4 - Manage the Crops\n" +
        " 5 - Return to the Main Menu\n",
        5);
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
            case 1: // view the map
            viewMap();
            break;
            case 2: // view a list
            viewList();
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
    
    /**
    *The viewList() method
    * Purpose: Creates a ViewList object and calls its
    * displayMenuView ( ) method
    * Parameters: none
    * Returns: none
    */
    public void viewList()
    {
        ListMenuView lv = new ListMenuView();
        lv.displayMenu();
    } 

    public void viewMap()
    {
       GameControl gameControl = new GameControl();
       gameControl.displayMap();
    }
    

    public void displayListMenuView()
    {
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    }
    
    public void moveToNewLocation()
    {
        System.out.println("Choose coordinates for your new adventure!");
    }
    
    public void manageCrops()
    {
        //System.out.println("Lots of stuff goes here");
        CropView cv = new CropView();
        cv.displayMenuView();
    }
    
    public void displayMainMenuView()
    {
       
    }
    
}
