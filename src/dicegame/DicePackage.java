/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegame;

import java.util.Random;

/**
 *
 * @author Zachcollins
 */
public class DicePackage {

    private int die1;   // Number showing on the first die.
    private int die2;// Number showing on the second die.
    //String cont;

    public DicePackage() {
        // Constructor.  Rolls the dice, so that they initially
        // show some random values.
        roll();  // Call the roll() method to roll the dice.
    }

    public void roll() {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    public int getDie1() {
        // Return the number showing on the first die.
        return die1;
    }

    public int getDie2() {
        // Return the number showing on the second die.
        return die2;
    }

    public int getTotal() {
        // Return the total showing on the two dice.
        return die1 + die2;
    }

    /*if(die1 == die2){
        total =  1+1;
    JOp.showMessageDialog("   you matched   " + total
    
    }else{
     return false;
    }


*/
    
}  // end class PairOfDice

