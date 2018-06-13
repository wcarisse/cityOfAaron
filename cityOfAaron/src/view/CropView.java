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
 * @author kate
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
        System.out.print("How many acres of land do you wish to buy? ");
        // Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();
        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(toBuy, price, cropData);
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
        System.out.print("How many acres of land do you wish to plant? ");
      //Get User's input and save it
        int toPlant;
        toPlant = keyboard.nextInt();
        // Call the plantCrops() method in the CropControl layer to buy the land
        CropControl.plantCrops (toPlant, wheatInStore, acresOwned, cropData);
    }
    
    public static void displayCropReportView()
    {
        int option = 0;
        switch (option)
        {
        case 1: // display wehat in store
        wheatInStore();
        break;
        case 2: // display population
        population();
        break;
        case 3: // display acres owned
        acresOwned();
        case 5:
        System.out.println("Return to Game Menu");
    }
    }

    private static void wheatInStore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void population() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void acresOwned() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
