/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import cityofaaron.CityOfAaron;
import model.*;
import model.ListItem;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class GameControl implements Serializable
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

// call the createMap method()
    GameControl gameControl = new GameControl();
    gameControl.createMap();
    
    //call the displayAnimals()
    GameControl animalList = new GameControl();
    animalList.createAnimalList();
    
    //call displayProvisions()
    GameControl provisionsList = new GameControl();
    provisionsList.createProvisionsList();
    
    //Call displayTools()
    GameControl toolsList = new GameControl();
    toolsList.createToolsList();
   
}
    // create the CropData object
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
   
//create the list of provisions
   //Created by Carissa Cunningham
   public static void createProvisionsList()
        {
            ArrayList<ListItem> provisions = new ArrayList<ListItem>();
            provisions.add(new ListItem("venison-jerky", 20));
            provisions.add(new ListItem("waterskins", 19));
            provisions.add(new ListItem("cloth", 10));
            provisions.add(new ListItem("rope", 4));
            provisions.add(new ListItem("tents", 21));
            provisions.add(new ListItem("flint/steel", 6));
            provisions.add(new ListItem("cooking-pot", 3));
            // Save the provisions in the game
            theGame.setProvisions(provisions);
        }
 //display the list of provisions
   //created by Carissa Cunningham
   public static void displayProvisions() {
       ArrayList<ListItem> provisions = theGame.getProvisions();
       //for each loop
       for (ListItem listItem : provisions) {
           System.out.println("\n\tListItem: " + listItem.getName() +
                              "\n\tQuantity: " + listItem.getNumber());
       }
   }   
   
  //create the list of animals
   //@author Kate Lewis 6/30/2018
public static void createAnimalList()
        {
            ArrayList<ListItem> animals = new ArrayList<>();
            animals.add(new ListItem("cows", 18));
            animals.add(new ListItem("horses", 5));
            animals.add(new ListItem("pigs", 7));
            animals.add(new ListItem("chickens", 14));
            // Save the animals in the game
            theGame.setAnimals(animals);
        }

public static void displayAnimals() {
       ArrayList<ListItem> animals = theGame.getAnimals();
       //for each loop
       for (ListItem listItem : animals) {
           System.out.println("\n\tListItem: " + listItem.getName() +
                              "\n\tQuantity: " + listItem.getNumber());
       }
   }

   //create the list of tools
   //@author Kyli Barnes 6/30/2018
   public static void createToolsList()
        {
            ArrayList<ListItem> tools = new ArrayList<ListItem>();
            tools.add(new ListItem("hammer", 10));
            tools.add(new ListItem("knife", 20));
            tools.add(new ListItem("club", 7));
            tools.add(new ListItem("saw", 2));
            tools.add(new ListItem("nails", 42));
        
            // Save the tools in the game
            theGame.setTools(tools);
        }
   
    //display Tools list
     public static void displayTools() {
       ArrayList<ListItem> tools = theGame.getTools();
    //for each loop
    tools.forEach((listItem) -> {
        System.out.println("\n\tListItem: " + listItem.getName() +
                           "\n\tQuantity: " + listItem.getNumber());
    });
     }

    // 7/14/18 print animals list
    // Kate Lewis
    public static void printAinmalsList(ArrayList<ListItem> animals, String outputLocation){
        try(PrintWriter out = new PrintWriter(outputLocation))
            {
                out.println("\n\n        Animals List         ");
                out.printf("%n%-20s%10s%10s", "Description", "Quantity");
                out.printf("%n%-20s%10s%10s", "-----------", "---------");
            
            for (ListItem listItem : animals) {
                out.printf("%n%-20s%7d%13.2f", listItem.getName()
                                             , listItem.getNumber());
            }
        } catch (Exception ex) {
            System.out.println("Error printing animals list.");
            }
    }

// create the Locations and the Map object     
/**
* The createMap method
* Purpose: creates the location objects and the map
* Parameters: none
* Returns: none
*/
public void createMap()
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
    theMap.setLocation(i, 3, loc);
    }

// define the string for a farm land location
String farmland1 = "You are on the fertile banks of the River.\n" +
"In the spring, this low farmland floods and is covered with rich\n" +
"new soil. Wheat is planted as far as you can see.";
// set a farmland location with a hint
loc = new Location();
loc.setDescription(farmland1 + "\n One bushel will plant two acres of wheat.");
loc.setSymbol("!!1");
theMap.setLocation(0, 2, loc); 

//NEW LOCATION: Farmland 2
String farmland2 = "You are just north of the Granary and Storehouse. \n" +
                   "Golden wheat surrounds you, and the sharp aroma of \n" +
                   "fertilizer fills your senses.";
loc = new Location();
loc.setDescription(farmland2 + "\n One bushel will plant two acres of wheat.");
loc.setSymbol("!!2");
theMap.setLocation(0, 1, loc);

//NEW lOCATION: Farmland3
String farmland3 = "You are just east of the sparkling palaces of the \n" +
                   "Ruler's Court on the fertile banks of the River. \n" +
                   "Glorious, golden wheat that assures your livlihood \n" +
                   "surround you, along with the cacophony of the \n" +
                   "rushing river.";
loc = new Location();
loc.setDescription(farmland3 + "\n One bushel will plant two acres of wheat.");
loc.setSymbol("!!3");
theMap.setLocation(2, 2, loc); 

//NEW LOCATION: Undeveloped Lands
String undevelopedLand = "Thick jungle and undergrowth surround you here in \n" +
                     "the Undeveloped Lands just east of the river. \n" +
                     "There is nothing here worth taking or using to \n" +
                     "help our City thrive.";
loc = new Location();
loc.setDescription(undevelopedLand + "\n Nothing of use here.");
loc.setSymbol(",,,");
for(int i = 0; i < MAX_ROW; i++)
    {
    theMap.setLocation(i, 4, loc);
    }

//NEW LOCATION: Forests
String forest = "Here you are surrounded by beautiful, majestic trees \n" +
                "and ferns. You can hear children giggling while playing \n" +
                "games and exploring. You feel at peace.";
loc = new Location();
loc.setDescription(forest);
loc.setSymbol("^^^");
for(int i = 0; i < MAX_ROW; i++)
    {
    theMap.setLocation(i, 0, loc);
    }

//NEW LOCATION: Lamanite Border
String lamaniteBorder = "Only danger awaits you here at the border to \n" +
                        "the savage Lamanite lands. Turn back immediately \n" +
                        "or face certain death!";
loc = new Location();
loc.setDescription(lamaniteBorder + "\n STAY AWAY! DANGER!");
loc.setSymbol("xxx");
for(int i = 0; i < MAX_ROW; i++)
    {
    theMap.setLocation(4, i, loc);
    }

//NEW LOCATION: Granary and Storehouse
String storehouse = "You are here visiting the City's Granary and \n" +
                    "storehouse just north of the Ruler's Court. All \n" +
                    "around you people are working to sift the wheat \n" +
                    "in preparation for storage and new planting.";
loc = new Location();
loc.setDescription(storehouse + "\n Beware of rats!" );
loc.setSymbol("$$$");
theMap.setLocation(1, 1, loc); 

//NEW LOCATION: Ruler's Court
String rulersCourt = "You are here at the majestic palaces in the Ruler's \n" +
                     "court. Here, all of the important decisions are made \n" +
                     "regarding the city and the distribution of wheat. \n" +
                     "Hopefully, good decisions are made to ensure our \n" +
                     "grand city's survival!";
loc = new Location();
loc.setDescription(rulersCourt + "\n Be Wise and Pay Tithes!");
loc.setSymbol("<^>");
theMap.setLocation(2, 1, loc); 

//NEW LOCATION: village
String village = "Here you arrive in the modest and clean little village \n" +
                 "where the hardworking citizes of the City of Aaron live. \n" +
                 "To the north and south are beautiful fields of wheat and \n" +
                 "you can hear the roaring of the river to the east. \n" +
                 "Thankfully, the granary and storehouse is located \n" +
                 "directly to the west; a convenient location for the workers!";
loc = new Location();
loc.setDescription(village + "\n Be sure to feed the citizens or they will \n" +
                                "be most unhappy with your Rule.");
loc.setSymbol("(*)");
theMap.setLocation(1, 2, loc); 

//NEW LOCATION: Desert
String desert = "Here barren delosolation is the only thing in view. No \n" +
                "food, water, or shelter. This is defintely not a good \n" +
                "place to build nor grow our precious wheat!";
loc = new Location();
loc.setDescription(desert);
loc.setSymbol("@@@");
theMap.setLocation(3, 1, loc);

//NEW LOCATION: Lake
String lake = "You arrive at the edge of the great Lake Bob. This lake \n" +
              "is, unfotunately, all salt water, and is of no use to \n" +
              "the City of Aaron except as a nice place to cool off during \n" +
              "the hot months of summer.";
loc = new Location();
loc.setDescription(lake);
loc.setSymbol("ooo");
theMap.setLocation(3, 2, loc); 

theGame.setMap(theMap);
}

public static void displayMap(){
    Map theMap = theGame.getMap();
    int rowCount = theMap.getRowCount();
    int colCount = theMap.getColCount();
      
    for (int i = 0; i < rowCount; i++){
        System.out.print("\n");
        for (int j = 0; j < colCount; j++){
            System.out.print(theMap.getLocation(i,j).getSymbol()+ " ");
        }
    }   
}

/** 
 * the saveGame method 
 * Purpose: save a game to disk
 * Parameters: the file path 
 * Returns: none 
 * Side Effect: the game reference in the driver is updated 
*/ 
    public static void saveGame(String Game) 
    {
        Game theGame = null;
        
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(Game)))
        { 
            output.writeObject(Game); 
        }
        catch (Exception e)
        {
            System.out.println("There was an error saving your game\n");
        }
        
    }


/** 
 * the getSavedGame method 
 * Purpose: load a saved game from disk 
 * Parameters: the file path 
 * Returns: none 
 * Side Effect: the game reference in the driver is updated 
*/ 
    public static void getSavedGame(String filePath) 
    { 
        Game theGame= null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) 
        { 
            ObjectInputStream input = new ObjectInputStream(fips); 
            theGame= (Game)  input.readObject(); 
            CityOfAaron.setTheGame(theGame); 
        } 
        catch(Exception e) 
        { 
            System.out.println("There was an error reading the saved game file\n"); 
        }
    }
    
 /**
  * the printProvisionsList method
  * Purpose: output a report to a disk
  * Parameters: 
  * Returns: the list of provisions
  * @author: Carissa Cunningham - individual assignment 7/14/18
  */
    public void printProvisionsList(ArrayList<ListItem> provisions, String outputLocation) {
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            out.println("\n\n        Provisions List         ");
            out.printf("%n%-20s%10s%10s", "Description", "Quantity");
            out.printf("%n%-20s%10s%10s", "-----------", "---------");
            
            for (ListItem listItem : provisions) {
                out.printf("%n%-20s%7d%13.2f", listItem.getName()
                                             , listItem.getNumber());
            }
        } catch (Exception ex) {
            System.out.println("I/O Error");
        }
    }
    
    
    7/13/2018 tools list individual assignment
    @author Kyli Barnes
    
    public void printToolsList(ArrayList<Tools>,InventoryItems, String theGame)
    {
        try (PrintWriter out = new PrintWriter(theGame))
        {
         get a reference to the ArrayList you want to output
    
         output a heading for the report
        out.println("\n\n        Tools List         ");
        out.printf("%n%-20s%10s%10s", "Description", "Quantity", "Price");
         use a for loop to get the data from the ArrayList
        for (Item item: toolsList) {
         and output it
        out.printf("%n%-20s%7d%13.2f", item.getDescription()
                                 , item.getQuantity()
                                 , item.getPrice());
        }
        } catch(Exception e) {
         output error message
        System.out.println("I/O Error: " + ex.getMessage());

        }
        finally
        {
         if(output != null) close the file
        if (output != null) {
        try {
            outFile.close();
        }    
        catch(Exception e) {
            System.out.println("Error closing file");
       }
        }
        }
   } 
    
    
    