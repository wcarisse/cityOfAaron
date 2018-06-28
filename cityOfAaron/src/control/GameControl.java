/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import model.*;
public class GameControl
{
// size of the Locations array
private static final int MAX_ROW = 5;
private static final int MAX_COL = 5;
// reference to a Game object
private static Game theGame;

public static void createNewGame(String name)
{
// Created the game object. Save it in the main driver file
    theGame = new Game();
    CityOfAaron.setTheGame(theGame);
// create the player object. Save it in the game object
    Player thePlayer = new Player();
    thePlayer.setName(name);
    theGame.setThePlayer(thePlayer); 
// create the CropData object
}
   public static void createCropDataObject()
{
    CropData theCrops = new CropData();
    theCrops.setYear(0);
    theCrops.setPopulation(100);
    theCrops.setNewPeople(5);
    theCrops.setCropYield(3);
    theCrops.setNumberWhoDied(0);
    theCrops.setOffering(10);
    theCrops.setWheatInStore(2700);
    theCrops.setAcresOwned(1000);
    theCrops.setAcresPlanted(1000);
    theCrops.setHarvest(3000);
    theCrops.setOfferingBushels(300);
    theCrops.setAcresPlanted(1000);
// Save the cropData in the Game object
theGame.setCrop(theCrops);
}
   
// create the list of animals
// create the list of tools
//create the list of provisions
// create the Locations and the Map object
   
   
/**
* The createMap method
* Purpose: creates the location objects and the map
* Parameters: none
* Returns: none
*/
public static void createMap()
{
    // create the Map object,
// refer to the Map constructor
Map theMap = new Map(MAX_ROW, MAX_COL);
 
// create a string that will go in the Location objects that contain the river
String river = "You are on the River. The river is the source\n" +
"of life for our city. The river marks the eastern\n " +
"boundary of the city - it is wilderness to the East.\n";
// create a new Location object
Location loc = new Location();
// use setters in the Location class to set the description and symbol
loc.setDescription(river);
loc.setSymbol("~~~");
// set this location object in each cell of the array in column 4
for(int i = 0; i < MAX_ROW; i++)
    {
    theMap.setLocation(i, 4, loc);
    }

// define the string for a farm land location
String farmland = "You are on the fertile banks of the River.\n" +
"In the spring, this low farmland floods and is covered with rich\n" +
"new soil. Wheat is planted as far as you can see.";
// set a farmland location with a hint
loc = new Location();
loc.setDescription(farmland + "\n One bushel will plant two acres of wheat.");
loc.setSymbol("!!!");
theMap.setLocation(0, 2, loc); 

//NEW LOCATION

//NEW lOCATION

//NEW LOCATION

//NEW LOCATION

//NEW LOCATION

//NEW LOCATION


theGame.setMap(theMap);
}

public static void displayMap(){
   String[][] theMap = { {"zero", "one", "!!!", "~~~", "four"},
                          {"zero", "one", "two", "~~~", "four"},
                          {"zero", "one", "two", "~~~", "four"},
                          {"zero", "one", "two", "~~~", "four"},
                          {"zero", "one", "two", "~~~", "four"}
    }; 
    
    for (int i = 0; i < theMap.length; i++){
        
        for (int j = 0; j < theMap[i].length; j++){
            System.out.println(theMap[i][j]);
        }
        
    }   
}

 
}