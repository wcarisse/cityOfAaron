/**
 *
 * @author Carissa Cunningham, Kate Lewis, Kyli Barnes
 */
package control;
import java.util.Random;
import model.CropData;

public class CropControl { 
    //contants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 11;
    //random number generator
    private static Random random = new Random();
    //calcLandPrice() method
    //purpose: calculate a random land cost between 17 and 27 bushels
    //returns: land price
    public static int calcLandPrice()
    {
        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }
    
/*
* The buyLand method
* Purpose: to buy land
* @param the price of land
* @param the number of acres to buy
* @param a reference to CropData class
* @ return the number of acres total after purchase
* Pre-conditions: acres to buy must be positive
* and price of land must be <= wheatInStore
*/
    
    public static int buyLand( int landPrice, int acresToBuy, CropData cropData) {
        landPrice =  calcLandPrice();
        //If acresToBuy is <0, return -1
        if (acresToBuy < 0)
            return -1;
        
        //If acresToBuy is > wheatInStore / landPrice, return -1
        int wheatInStore = cropData.getWheatInStore();
        if (acresToBuy > wheatInStore / landPrice)
            return -1;
        
        // wheatInStore –= (acresToBuy * landPrice)
        wheatInStore -= (acresToBuy * landPrice);
        cropData.setWheatInStore(wheatInStore);
        
        //population = acresToBuy / 10
        int population = cropData.getPopulation();
        if (population < acresToBuy / 10)
            return -1;
        
        // acresOwned += acresToBuy
        int acresOwned = cropData.getAcresOwned();
        acresOwned += acresToBuy;
      
        //return acresOwned
        return acresOwned;
        
}

}
