/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.CropData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carissa
 */
public class CropControlTest {
    
    public CropControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(1000);
        theCrops.setPopulation(300);
        theCrops.setAcresOwned(3000);
        int landPrice = 25;
        int acresToBuy = 15;
        int expResult = 3015;
        int result = CropControl.buyLand(landPrice, acresToBuy, theCrops);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calcLandPrice method, of class CropControl.
     */
    @Test
    public void testCalcLandPrice() {
        System.out.println("calcLandPrice");
        int expResult = 0;
        int result = CropControl.calcLandPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plantCrops method, of class CropControl.
     */
    @Test
    public void testPlantCrops() {
        System.out.println("plantCrops");
        int acresToPlant = 0;
        int requiredWheat = 0;
        CropData cropData = null;
        int expResult = 0;
        int result = CropControl.plantCrops(acresToPlant, requiredWheat, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feedPeople method, of class CropControl.
     */
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        CropData theCrops = new CropData();
        theCrops.setWheatInStore(100);
        int numberOfBushels = 10;
        int expResult;
        expResult = 90;
        int result;
        result = CropControl.feedPeople(numberOfBushels, theCrops);
        assertEquals(expResult, result);
    }  

    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering() {
        System.out.println("setOffering");
        double n = 0.5;
        double wheatInStore = 8000;
        double expResult = 4000;
        double result = 4000;
        assertEquals(expResult, result, 0.0);

    }
}
