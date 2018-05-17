/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 * Team Members: Carissa Cunningham, Kate Lewis, Kyli Barnes
 */
package cityofaaron;

import model.CropData;
import model.Player;
import model.TeamMember;

/**
 *
 * @authors Carissa Cunningham, Kyli Barnes, Kate Lewis
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
    }
      
}
