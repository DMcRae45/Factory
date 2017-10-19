/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author 1622686
 */
public class AccountFactory
{
    // public AccountFactory() {
    //}
    public static AccountI createAccount(String actype)
    {
        if(actype.equalsIgnoreCase("Silver"))
        {
            return new SilverAccount();
        } 
        else if 
            (actype.equalsIgnoreCase("Gold"))
        {
           return new GoldAccount();
        }
        else if 
                (actype.equalsIgnoreCase("Platinum"))
        {
            return new PlatinumAccount();
        }
        
        //if the string type does not constain
        // a valid account type name:
        //nothing gets "returned" -> "missing return statement"
        // throw an exception back to the caller
        //see also: http://docs.oracle.com/javase/tutorial/essential
        
        throw new IllegalArgumentException("cannot create a ' " + actype + " ' account!");
    }
}
