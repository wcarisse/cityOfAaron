// The MainMenuView class - part of the view layer
// Object of this class manages the main menu
// Author: Cunningham, Barnes, Lewis team
// Date last modified: June 6, 2018
//
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Player;
import model.Game;
import model.CropData;
/**
 *
 * @author Cunningham, Barnes, Lewis team
 */
public class MainMenuView {
    Scanner keyboard = new Scanner(System.in);
    
    private String theMenu;
    private int max;
    
    /**
* The MainMenuView constructor
* Purpose: Initialize the menu data
* Parameters: none
* Returns: none
*/
// ===================================
public MainMenuView()
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
 public void displayMenuView()
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
 startNewGame();
 break;
 case 2: // get and start a saved game
 startSavedGame();
 break;
 case 3: // get help menu
 displayHelpMenuView();
 break;
 case 4: // save game
 displaySaveGameView();
 break;
 case 5:
 System.out.println("Thanks for playing ... goodbye.");
 }
 } 
 /**
* The startNewGame method
 * Purpose: creates game object and starts the game
 * Parameters: none
 * Returns: none
*/
// ===================================
public void startNewGame()
{
 //Create a new Game object.
 Game theGame = new Game();
 // Save a reference to it in the GameProject class.
 CityOfAaron.setTheGame(theGame);
 // Display the Banner Page.
 System.out.println("Welcome to the city of Aaron."
         + "You are destined to be the new ruler of this city."
         + "High Priest Joe has given you this list of responsibilities: buy and sell land, figure out how much wheat to plant each year and how much to feed your people. Make sure you pay your annual wheat tithe or you will all die! "
         + "Be careful or you and your people will starve to death. Beware of the rats, they will eat your wheat.");
 // Create a new Player object
 Player thePlayer = new Player();
 // Prompt for and get the user’s name.
 String name;
 System.out.println("Please type in your first name: ");
 name = keyboard.next();
 // Save the user’s name in the Player object
 thePlayer.setName(name);
 // Save a reference to the player object in the Game object
 theGame.setThePlayer(thePlayer);
 // Display a welcome message
 System.out.println("Welcome “ + name + “ have fun.");
 // Display the Game menu
 // Create a CropData object,
 CropData cropData = new CropData();
// initialize it
cropData.setYear(0);
cropData.setPopulation(100);
cropData.setNewPeople(5);
cropData.setCropYield(3);
cropData.setNumberWhoDied(0);
cropData.setOffering(10);
cropData.setWheatInStore(2700);
cropData.setAcresOwned(1000);
cropData.setAcresPlanted(1000);
cropData.setHarvest(3000);
cropData.setOfferingBushels(300);
cropData.setAcresPlanted(1000);
// save a reference to it in the Game
theGame.setCrop(cropData);
}

public void startSavedGame()
{
    System.out.println("Saved Game Menu.");
}
 
public void displayHelpMenuView()
{
    System.out.println("Help Menu.");
}

public void displaySaveGameView()
{
    System.out.println("Display saved game view.");
}
 }
