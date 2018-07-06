/**
 *
 * @author Carissa Cunningham, Kate Lewis, Kyli Barnes
 */
package control;
import java.util.Random;
import model.CropData;
import exceptions.CropException;

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

    //CropControl cropControl = new CropControl();
    //cropControl.buyLand();
    
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
    public static void buyLand( CropData cropData, int landPrice, int acresToBuy) throws CropException {
        landPrice =  calcLandPrice();
        //If acresToBuy is <0, return -1
        if (acresToBuy < 0)
            throw new CropException("A negative value was input");
        
        //If acresToBuy is > wheatInStore / landPrice, return -1
        int wheatInStore = cropData.getWheatInStore();
        if (acresToBuy > wheatInStore / landPrice)
            throw new CropException("There is insufficient wheat to buy this much land");
        
        // wheatInStore –= (acresToBuy * landPrice)
        wheatInStore -= (acresToBuy * landPrice);
        cropData.setWheatInStore(wheatInStore);
        
        //population = acresToBuy / 10
        int population = cropData.getPopulation();
        if (population < acresToBuy / 10)
            throw new CropException("No enough people are avaible to plant! Please try again");
        
        // acresOwned += acresToBuy
        int acresOwned = cropData.getAcresOwned();
        acresOwned += acresToBuy;
    }
    /*
    * The plantCrops Method
    * Purpose: to plant crops
    * @param acres to plant
    * @param required wheat
    * @param a reference to wheatInStore from the CropData object
    * @return the amount of wheat left in storage after planting
    * Pre-conditions: acres to plant must be >= 0
    * and wheat required must be <= wheatInStore
    * @author Carissa Cunningham
    */

    public static void plantCrops ( int acresToPlant, int requiredWheat, CropData cropData) throws CropException
    {
        //If acresToPlant is < 0, return -1
        if (acresToPlant < 0)
            throw new CropException("A negative value was input!\n Please try again!");
        //requiredWheat = acresToPlant divided by 2
        requiredWheat = acresToPlant / 2;
        //If requiredWheat is > wheatInStore, return -1
        int wheatInStore = cropData.getWheatInStore();
        if (requiredWheat > wheatInStore)
            throw new CropException("Not enough wheat to plant!");
        //wheatInStore –= requiredWheat
        wheatInStore -= requiredWheat;
        cropData.setWheatInStore(wheatInStore);
    }
    
        //author: Kyli Barnes
        //date modified: 6/1/18,7/6/18
        /*
        *The feedThePeople method
        *Purpose: to feed the people
        *@param number of bushels
        *@param a reference to wheatInStore (from CropData class)
        *@return how much wheat is left in storage 
        *Pre-conditions: bushels set aside to feed people must be positive 
        *and the amount of wheat in store must be >= the number of bushels that are to be set aside.
        */
        public static void feedPeople (int numberOfBushels, CropData cropData) throws CropException {
            //If numberOfBushels is <0, return -1
            if (numberOfBushels < 0)
                throw new CropException("There isn't enough wheat!\n Please try again.");
            //If numberofBushels is > wheatInStore, return -1
            int wheatInStore = cropData.getWheatInStore();
            if (numberOfBushels > wheatInStore)
                throw new CropException("There isn't enough wheat in storage to feed everyone!\n Please enter a new number.");
            //Wheat = wheatInStore – numberOfBushels
            wheatInStore -= numberOfBushels;
            cropData.setWheatInStore(wheatInStore);
            

}
        /*
	*The setOffering method
	*Purpose: to pay tithes and offerings
	*@param the percentage of wheat to pay
	*@return void
	*Pre-conditions: user input must be positive and <= 100
	*/
        //Author Kate Lewis

        public static double setOffering(double n, CropData cropData) throws CropException {
            //If n < 0 , return -1
            if (n < 0)
                throw new CropException("Cannot be less than 0!\n Please try again!");
            //If n > 100, return -1
            if (n > 100) 
                throw new CropException("Must be lower than 100!\n Please try again!");
            //setOffering = wheatInStore * n
            double wheatInStore = cropData.getWheatInStore();
            double setOffering = wheatInStore * n;
            //return setOffering
            return setOffering;

            
	}

    public static void plantCrops(int toPlant, int wheatInStore, int acresOwned, CropData cropData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //@author Carissa Cunningham
    //date modified: 6/12/18
    /*
    * The payOffering Method
    * Purpose: pay tithes and offerings
    * @param user input
    * @return user input
    * Pre-conditions: user input must be >= 0 
    * and user input must be <= 100
    */
    public static double payOffering (double userInput)
    {
       //If userInput  is < 0, return -1
        if (userInput < 0)
            return -1;
       //If userInput is > 100, return -1
        if (userInput > 100)
            return -1;
       //Return userInput
        return userInput;
    }


    
}
