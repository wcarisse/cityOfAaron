/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team Members: Carissa Cunningham, Kate Lewis, Kyli Barnes
 */
package cityofaaron;

import model.CropData;
import model.ListItem;
import model.Player;
import model.TeamMember;
import model.Location;
import view.*;
import model.Game;
/**
 *
 * @authors Carissa Cunningham, Kyli Barnes, Kate Lewis
 */
public class CityOfAaron {
      // variable for keeping a reference to the Game object
        private static final Game theGame = null;

    /**
     * @param args the command line arguments
     */
    
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
      
        
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();

        // TODO code application logic here
        //Player Class Test
        Player thePlayer = new Player();
        
        thePlayer.setName("Joe");
        String thePlayerName = thePlayer.getName();
        
        System.out.println("Name = " + thePlayerName);
        
          TeamMember.OldMan.getName();
          TeamMember.OldMan.getTitle();
          
        //CropData Class Test 
        CropData testData = new CropData();
        
        testData.setYear(1900);
        int testDataYear = testData.getYear();
        
        System.out.println("Year = " + testDataYear);
        
        //ListItem Class Test
        ListItem itemOne;
        itemOne = new ListItem ();
        
        itemOne.setName("tool");
        String itemOneName;
        itemOneName = itemOne.getName();
        
        System.out.println("Name = " + itemOneName);
        
        Location theLocation = new Location();
        
        theLocation.setDescription("description");
        String theLocationDescription = theLocation.getDescription();
        
        System.out.println("Description = " + theLocationDescription);
        
        theLocation.setSymbol("symbol");
        String theLocationSymbol= theLocation.getSymbol();
        
        System.out.println("Symbol = " + theLocationSymbol);
        
        
    }

    public static void setTheGame(Game theGame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
