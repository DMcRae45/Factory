/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_01_factory;

import factory.*;
import accounts.*;


/**
 *
 * @author 1622686
 */
public class Patterns_01_factory
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Test_Account();
        
        //Test_SilverAccount();        
        //Test_GoldAccount();
        //Test_PlatinumAccount();
        
        Test_AccountI();
    }
    
/*    public static int Test_Account()
    {
        System.out.println("--Test Accounts--");
    
        Account ac01 = new Account ("silver");
        ac01.rewardPoints(123.00);
        System.out.print("Silver Acc: ");
        System.out.println(ac01.getRewardPoints());

    
        Account ac02 = new Account ("gold");
        ac02.rewardPoints(123.00);
        System.out.print("Gold Acc: ");
        System.out.println(ac02.getRewardPoints());

    
        Account ac03 = new Account ("platinum");
        ac03.rewardPoints(123.00);
        System.out.print("Platinum Acc: ");
        System.out.println(ac03.getRewardPoints());
        
        return 0;
    }
*/
    
    public static int Test_SilverAccount()
    {
        System.out.println("--Test Silver Account--");
    
        Account ac01 = new Account ("silver");
        ac01.rewardPoints(123.00);
        System.out.print("Silver Acc: ");
        System.out.println(ac01.getRewardPoints());
        
        return 0;
    }
    
    public static int Test_GoldAccount()
    {
        System.out.println("--Test Gold Account--");

        Account ac02 = new Account ("gold");
        ac02.rewardPoints(123.00);
        System.out.print("Gold Acc: ");
        System.out.println(ac02.getRewardPoints());
        return 0;
    }
    
    public static int Test_PlatinumAccount()
    {
        System.out.println("--Test Platinum Account--");
 
        Account ac03 = new Account ("platinum");
        ac03.rewardPoints(123.00);
        System.out.print("Platinum Acc: ");
        System.out.println(ac03.getRewardPoints());
        
        return 0;
    }
    
    public static void Test_AccountI()
    {
    try
    {
    
    AccountI silver = AccountFactory.createAccount("silver");
    System.out.println(silver.addRewardPoints(123.00));
    
    AccountI theGolden = AccountFactory.createAccount("GOLD");
    System.out.println(theGolden.addRewardPoints(123.00));
    
    AccountI anotherPlatinum = AccountFactory.createAccount("pLATINUM");
    System.out.println(anotherPlatinum.addRewardPoints(123.00));
    
    //makes the program crash if the exception is not handled
    //AccountI bogusAccount = AccountFactory.createAccount("i throw");
    
    System.out.println("\n----- add more reward points ----- \n");
    
    silver.addRewardPoints(234.56);
    System.out.println("Silver: Reward points added");
    
    theGolden.addRewardPoints(234.56);
    System.out.println("theGolden: Reward points added");
    
    anotherPlatinum.addRewardPoints(234.56);
    System.out.println("anotherPlatinum: Reward points added");
    
    System.out.println("\n----- use the getter method (see AccountBase)-----\n");
    
    System.out.println("[use getter method] silver (rewardPoints) : " + silver.getRewardPoints());
    System.out.println("[use getter method] theGolden (rewardPoints) : " + theGolden.getRewardPoints());
    System.out.println("[use getter method] anotherPlatinum (rewardPoints) : " + anotherPlatinum.getRewardPoints());
    
    }
    catch (IllegalArgumentException e)
    {
        System.out.println("IndexOutOfBoundsException: " + e.getMessage());
    }
    
        System.out.println("\n----- end of program -----\n");
    
    }
}
