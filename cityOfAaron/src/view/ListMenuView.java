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
 "* CITY OF AARON: MAIN GAME MENU *\n" +
 "**********************************\n" +
 " 1 - Start new game\n" +
 " 2 - Get and start a saved game\n" +
 " 3 - Get help on playing the game\n" +
 " 4 - Save game\n" +
 " 5 - Quit\n";

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
int menuOption;
do
{
 // Display the menu
    System.out.println(theMenu);
    
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
     
 }
 
 public void listTools()
 {
     
 }
 
 public void listProvisions()
 {
     
 }
 
 public void listTeam()
 {
     
 }
 
 
}
