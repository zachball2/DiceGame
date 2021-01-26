/*
Zach Collins
CSC 110
Fall semester
Dice Game program
This is a dice game where you bet and gamble with your money
 */
package dicegame;


import javax.swing.JOptionPane;

public class DiceGame {

    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Hello I'm Zach Collins\n"
                + "In this Program you will be gambling using dice\n");

        int funds;
        funds = 100;

        DicePackage dice;          // A variable that will refer to the dice.

        dice = new DicePackage();  // Create the PairOfDice object.
        String c = "Y"; //if you want to keep playing or not
        String cont;   // for your hi,lo,seven guess

        while (funds > 0 && c.equalsIgnoreCase("Y")) {      //if your wallets less than zero

            
            int bet = Integer.parseInt(JOptionPane.showInputDialog("Whats you bet( You only have " + funds + "$)"));//asking how much you want to bet
            while(bet > funds) //If you try to bet money you dont have
            {
                JOptionPane.showMessageDialog(null,"Sorry it doesnt match your money.");    //saying you dont have the money
                System.exit(0); //exits the program
            }

            int getTotal;   //The total of your dice
            cont = JOptionPane.showInputDialog("“Hi” (a result of 8 thru 12)\n"
                    + "“Lo” (a result of 2 thru 6)\n"
                    + "“Seven” (a result of seven)");

          
            if (cont.equalsIgnoreCase("Hi")) {
                dice.roll();    //rolling the dice
                dice.getTotal();    //getting the total
                JOptionPane.showMessageDialog(null, dice.getTotal());   //showing the total
                //int newBet = (int) (100 - bet);
                if (dice.getTotal() > 7) {  //if your bet is greater than 7
                    bet = bet * 2;  //times bet by 2
                    bet = bet + funds;  //new bet
                    JOptionPane.showMessageDialog(null, "You won: " + bet); //says how much you won

                } else {
                    funds = funds - bet;    //if you lose subtracts from funds
                    JOptionPane.showMessageDialog(null, "You lose");    //says you lose
                    JOptionPane.showMessageDialog(null, "Your funds are now: " + funds); //how much funds after you lose
                }

            }
            if (cont.equalsIgnoreCase("Seven")) {
                dice.roll();
                dice.getTotal();
                JOptionPane.showMessageDialog(null, dice.getTotal());

                if (dice.getTotal() == 7) {
                    bet = bet * 4;
                    funds = bet + funds;
                    JOptionPane.showMessageDialog(null, "You won: ");
                    JOptionPane.showMessageDialog(null, "Your funds are now: " + funds);

                } else {
                    JOptionPane.showMessageDialog(null, "You lose");

                    funds = bet - funds;

                    JOptionPane.showMessageDialog(null, "Your funds are now: " + funds);
                }
            }
            
            if (cont.equalsIgnoreCase("Lo")) {
                dice.roll();
                dice.getTotal();
                JOptionPane.showMessageDialog(null, dice.getTotal());
                
                if (dice.getTotal() >= 2 && dice.getTotal() <= 6) {
                    bet = bet * 2;
                    bet = bet + funds;
                    JOptionPane.showMessageDialog(null, "You won: " + bet);

                } else {
                    funds = funds - bet;
                    JOptionPane.showMessageDialog(null, "You lose");
                    JOptionPane.showMessageDialog(null, "Your funds are now: " + funds);
                }

            }
            String c1 = "y";    //creates string
            c1.equalsIgnoreCase("y"); //puts string to work
            c = JOptionPane.showInputDialog("Do you want to keep playing (y/n)");   //do you want to keep playing
        }
        JOptionPane.showMessageDialog(null, "Good game, but you've ended with: " + funds);  //says how much you ended wth
    }
}
