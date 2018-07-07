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
        private static Game theGame = null;

    /**
     * @param args the command line arguments
     */
    
    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
      
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenu();
 
    }

    public static void setTheGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }

    public static Game getTheGame() {
        return theGame;
    }
      
}
