/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author 1622686
 */
public class GoldAccount extends BaseAccount
{
    private final int goldTAValue = 8 ;
    
    public GoldAccount()
    {
        super() ; // call the base classes ctor
    }
    
    public int rewardPoints(double amount)
    {
        rewardPoints = (int)Math.round(amount/goldTAValue);
        return rewardPoints;
    }
    
}
