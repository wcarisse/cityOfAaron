/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author Carissa, Kyli, and Kate
 */
public class Game implements Serializable {
    private Player thePlayer;

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    private CropData cropData = null;
    
    /**
    * the getCrops() method
    * Purpose: get a reference to the crop object
    * Parameters: none
    * Returns: a reference to a crop object
    */
    public CropData getCrop()
    {
        return cropData;
    }
    
    /**
    * the setCrops() method
    * Purpose: store a reference to a crop object
    * Parameters: a reference to a crop object
    * Returns: none
    */
    public void setCrop(CropData cropRef)
    {
        cropData = cropRef;
    }

    public void setMap(Map theMap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
