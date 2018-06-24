/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carissa
 */
public class GameMenuViewTest {
    
    public GameMenuViewTest() {
    }

    /**
     * Test of doAction method, of class GameMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        int option = 0;
        GameMenuView instance = new GameMenuView();
        instance.doAction(option);
    }

    /**
     * Test of viewMap method, of class GameMenuView.
     */
    @Test
    public void testViewMap() {
        System.out.println("viewMap");
        GameMenuView instance = new GameMenuView();
        instance.viewMap();
 
    }

    /**
     * Test of displayListMenuView method, of class GameMenuView.
     */
    @Test
    public void testDisplayListMenuView() {
        System.out.println("displayListMenuView");
        GameMenuView instance = new GameMenuView();
        instance.displayListMenuView();
      
    }

    /**
     * Test of moveToNewLocation method, of class GameMenuView.
     */
    @Test
    public void testMoveToNewLocation() {
        System.out.println("moveToNewLocation");
        GameMenuView instance = new GameMenuView();
        instance.moveToNewLocation();
     
    }

    /**
     * Test of manageCrops method, of class GameMenuView.
     */
    @Test
    public void testManageCrops() {
        System.out.println("manageCrops");
        GameMenuView instance = new GameMenuView();
        instance.manageCrops();
        
    }

    /**
     * Test of displayMainMenuView method, of class GameMenuView.
     */
    @Test
    public void testDisplayMainMenuView() {
        System.out.println("displayMainMenuView");
        GameMenuView instance = new GameMenuView();
        instance.displayMainMenuView();
        
    }
    
}
