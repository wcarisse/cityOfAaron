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
public class ListMenuView extends MenuView {
    
    Scanner keyboard = new Scanner(System.in);
    private Game theGame = CityOfAaron.getTheGame();
    private String theMenu;
    private int max;
    
    
    public ListMenuView()
    {
        super("\n"+
         "**********************************\n" +
         "* CITY OF AARON: LIST MENU *\n" +
         "**********************************\n" +
         " 1 - View the Animals in the Storehouse\n" +
         " 2 - View the Tools in the Workshed\n" +
         " 3 - View the Provisions in the Storehouse\n" +
         " 4 - View the Authors of the game\n" +
         " 5 - Return to the Game Menu\n",
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
    
    @Override public void doAction(int option)
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
                backToGameMenu();
               }
        }
 
    public void listAnimals()
    {
     GameControl gameControl = new GameControl();
       GameControl.displayAnimals();
    }
 
    public void listTools()
    {  
       GameControl gameControl = new GameControl();
       GameControl.displayTools();
    }
 
    public void listProvisions()
    {
       
       GameControl gameControl = new GameControl();
       gameControl.displayProvisions();
    }
 
    public void listTeam()
    {
     System.out.println("Kyli Barnes, Carissa Cunningham and Kate Lewis");
    }
    
    public void backToGameMenu() {
        
    }
}
