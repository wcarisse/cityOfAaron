/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import cityofaaron.CityOfAaron;
import java.util.ArrayList;
import java.util.Scanner;
import model.Game;

/**
 *
 * @author kate
 */
public class ListView {
    Scanner keyboard = new Scanner(System.in);
    private String listMenu;
    private int max;
    private Game theGame = CityOfAaron.getTheGame();
    
    /**
    * The ListMenuView constructor
    * Purpose: Initialize the menu data
    * Parameters: none
    * Returns: none
    */
    // ===================================
    public ListView()
    {
        listMenu = "\n" +
        "**********************************\n" +
        "* CITY OF AARON: LIST MENU *\n" +
        "**********************************\n" +
        " 1 - View the development team\n" +
        " 2 - View a list of animals\n" +
        " 3 - View a list of tools\n" +
        " 4 - View a list of provisions\n" +
        " 5 - Return to the game menu\n";
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
            case 1: // view teams
            
            break;
            case 2: // view animals
            viewAnimals();
            break;
            case 3: // view tools
            
            break;
            case 4: // view provisions
            
            break;
            case 5: //goes back to main menu
            displayMainMenuView();
        }
    }
    

    public void displayMainMenuView()
    {
       
    }
    
    public void viewAnimals()
    {
        System.out.println("Here are your animals.");
    }
}