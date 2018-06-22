/**  
 * The MenuView class – base abstract class for all menu views  
 * Author: Carissa, Kate and Kyli  
 * Date last modified: June 2018  
 */ 
package view; 
 
import java.util.Scanner; 
 
public abstract class MenuView implements ViewInterface {     
    // the data members common to all menu views     
    protected final static Scanner keyboard = new Scanner(System.in);              
    protected String menu;  // this string holds the menu string     
    protected int max; // this int holds the max input value 
 
     /**      
      * MenuView Constructor      
      * Purpose: Initialize the view object with the menu string      
      * Parameters: the menu string and the max value      
      * Returns: none     
      */     
    public MenuView(String _menu, int _max)     {         
        this.menu = _menu;         
        this.max = _max;     
    } 
    
    /**    
     * The displayMenu method     
     * Purpose: displays the menu, gets the user's input, and does the      
     *  selected action     
     * Parameters: none     
     * Returns: none    
     */ 
    @Override public void displayMenu()
    {
        int menuOption = 0;
        do
        {
        // Display the menu
        System.out.println(menu);
    
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
    @Override public int getMenuOption()
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
    
} 