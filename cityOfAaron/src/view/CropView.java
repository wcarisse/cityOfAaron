/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.CropException;
import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import static java.lang.Double.max;

/**
 *
 * @author kate lewis
 */
public class CropView {
    // Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    // Get references to the Game object and the CropData object
    private static Game theGame = CityOfAaron.getTheGame();
    private static CropData cropData = theGame.getCrop();
    
    /**
    * The buyLandView method
    * Purpose: interface with the user input for buying land
    * Parameters: none
    * Returns: none
    */
    public static void buyLandView()
    {
        // Get the cost of land for this round.
        int price = CropControl.calcLandPrice();
        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre.%n",price);
        // Get the user’s input and save it.
        int toBuy;
        boolean paramsNotOkay;
        do 
        {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to buy? ");   
            toBuy = keyboard.nextInt();
            try 
            {
                CropControl.buyLand(cropData, toBuy, price);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this."); 
                System.out.println(e.getMessage()); 
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);
        // Call the buyLand( ) method in the control layer to buy the land
        //CropControl.buyLand(toBuy, price, cropData);
    }

    /**
    * The payOfferingsView method
    * Purpose: interface with the user to pay tithes
    * Parameters: none
    * Returns: none
    * @author Carissa Cunningham
    */
    public static void payOfferingsView()
    {
        //Prompt User to enter percentage of offerings they wish to pay
        System.out.print("What percentage of your wheat would you like to offer to the Lord? ");
        //Get user's input and save it
        double toPay;
        toPay = keyboard.nextInt();
        //Call the payOffering() method from the control layer
        CropControl.payOffering(toPay);
    }
    
    
    /**
    * The runCropsView method()
    * Purpose: runs the CityOfAaron game
    * Parameters: none
    * Returns: none
    */
    public static void runCropsView()
    {
        // call the buyLandView( ) method
           buyLandView( );
        // add calls to the other crop view methods
        // as they are written
    }

    /*
    * The plantCropsView() Method
    * Purpose: interface with the user input for buying land
    * Parameters: none  
    * Returns: none
    * @author Carissa Cunningham
    */
    public static void plantCropsView()
    {
      //Get the number of wheat in storage and acred owned
        int wheatInStore = cropData.getWheatInStore();
        int acresOwned = cropData.getAcresOwned();
      // Prompt the user to enter the number of wheat to plant
        System.out.format("You have %d bushels of wheat in storage.%n",wheatInStore + "and %d acres of land.%n",acresOwned);
        int toPlant;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("How many acres of land do you wish to plant? ");
            //Get User's input and save it
            toPlant = keyboard.nextInt();
            try
            {
              // Call the plantCrops() method in the CropControl layer to buy the land
               CropControl.plantCrops ( toPlant, wheatInStore, cropData);  
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this."); 
                System.out.println(e.getMessage()); 
                paramsNotOkay = true;
            }
        } while(paramsNotOkay); 
    }
   
    
 public void displayCropsReportView()
 {
        int cropsReportOption = 0;
        int max = 0;
        do
        {
            // Display the menu
            System.out.println(cropsReportOption);
    
            // Prompt the user and get the user’s input
            cropsReportOption = getcropsReportOption();

            // Perform the desired action
            doAction(cropsReportOption);

            // Determine and display the next view
        } while (cropsReportOption != max);  
 }
 /**
 * The getMenuOption method
 * Purpose: gets the user's input
 * Parameters: none
 * Returns: integer - the option selected
 * @return 
 */
 // ===================================
 public int cropsReportOption()
 {
    // declare a variable to hold user’s input
     int userInput;
     int max = 0;
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
            case 1: // display wheat in store
            //Get the number of wheat in storage and acred owned
            int wheatInStore = cropData.getWheatInStore();
            System.out.println("You have this much wheat in the sotre" + wheatInStore);
            break;
            case 2: // display acres owned
            int acresOwned = cropData.getAcresOwned();
            System.out.println("You own this many acres" + acresOwned);
            break;
            case 3:
            System.out.println("Return to main menu");
        }
    }
public int getcropsReportOption() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void feedPeopleView() {
        // Get number of bushels from user
        System.out.print("How many bushels would you like? ");
        // Get number of wheat in storage
        int wheatInStore = cropData.getWheatInStore();
        // Get the user’s input and save it.
        int toFeed;
        boolean paramsNotOkay;
        do
        {
           paramsNotOkay = false;
           System.out.print("How many bushels of feed do you want? ");
           toFeed = keyboard.nextInt();
           try {
               // Call the feedPeople( ) method in the control layer to buy the land
                CropControl.feedPeople(toFeed,cropData);
           }
           catch(CropException e){
                System.out.println("Sorry, try again."); 
                System.out.println(e.getMessage()); 
                paramsNotOkay = true;
            }
        } while(paramsNotOkay);     
    }
        
}
        
         
     
