/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Carissa, Kyli, and Kate
 */
public class Game implements Serializable {
    private ArrayList<ListItem> provisions;
    private Player thePlayer;
    private ArrayList<ListItem> tools;
    private ArrayList<ListItem> animals;
    
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
    public CropData getCrop() {
        return cropData;
    }
    /**
    * the setCrops() method
    * Purpose: store a reference to a crop object
    * Parameters: a reference to a crop object
    * Returns: none
    */
    public void setCrop(CropData cropRef) {
        cropData = cropRef;
    }

    private Map theMap;
    public Map getMap() {
        return theMap;
    }
   
    public void setMap(Map theMap) {
        this.theMap = theMap;
    }
    // Animals getter & setter by Kate Lewis
    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }
    
    public ArrayList<ListItem> getAnimals(){
        return animals;
    }
    
    //Provisions getter and setter
    //By Carissa Cunningham
    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }
    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }
    
    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }
    public ArrayList<ListItem> getTools() {
        return tools;
    }
}
