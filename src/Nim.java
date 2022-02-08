/********************************************************************
 Written by: Yoav Amit
 Checked by:


 ASSIGNMENT: Write a program that lets the user play Nim with
 another player.

 - The directions method should print the directions to play Nim.
 You can google the directions and copy and paste.

 - The getName method should ask for and return a players name.
 Why is there only 1 getName method when there are 2 players?
 _____________________________________

 - In your playGame method you should:
 Print the board showing the current number of sticks in each row.
 Use showOptionDialog to let the player input the row number and
 showInputDialog to input how many sticks he/she wants to remove.
 You should error check the number of sticks - it can't be less than
 one or greater than the number of sticks in the row.
 Why do you have to return the totalSticks?  _______________________
 Why don't you have to return the array?  __________________________

 - In your printWinner method you should print the board showing
 the one remaining stick, the winners name and a nice message.

 - You must use arrays in your program

 - You must use my main. I promise it is the last time - you get to
 write your own after this!

 - Please use the answer key to see what your windows should look like.


 ********************************************************************/
import java.awt.Color;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Nim
{

    public static void main(String[] args)
    {
        changeJOP();
        directions();
        int totalSticks = 16;
        int[] numSticks = {1,3,5,7};
        int player = 0;
        String name[] = new String[2];
        name[0]=getName();
        name[1]=getName();


        while(totalSticks > 1) {
            if (player==0)
                player=1;
            else player=0;
            totalSticks = playGame(numSticks, totalSticks, name[player]);
        }
        //printWinner(name[player], numSticks);

    }

    public static void changeJOP() {
        // The font of the message text
        UIManager.put("Label.font", new FontUIResource(new Font("Tempus Sans ITC", Font.BOLD, 58)));
        // The color of the message text
        UIManager.put("OptionPane.messageForeground",new Color(0, 0, 0));

        // color for text field (where you are inputting data)
        UIManager.put("TextField.background", Color.white);
        // font for message in text field
        UIManager.put("TextField.font", new FontUIResource(new Font("Dialog", Font.BOLD, 24)));
        // color for message in text field
        UIManager.put("TextField.foreground", Color.black);

        // The color of the panel
        UIManager.put("Panel.background",new Color(45, 130, 184));
        // The color around the outside of the panel
        UIManager.put("OptionPane.background",new Color(58, 130, 152));

        // Buttons at bottom
        UIManager.put("Button.background",new Color(211, 211, 211));
        UIManager.put("Button.foreground", new Color(204, 204, 204));
        UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));
    }

    public static void directions(){
        String answer = "";
        answer +=  "This game is called Nim! "+"\n";
        answer +=  "Here are the directions to play the game: "+"\n";
        answer +=  "To play Nim, one player sets up a number of piles of blocks, " + "\n" +
                "and the opponent chooses whether to go first or second. " + "\n" +
                "The players take turns removing blocks — each player may remove any number of blocks (at least one) from any one pile, " +
                "\n" + "and it is fine to take a whole pile — whichever player takes the last block wins."+"\n";
        JOptionPane.showMessageDialog(null, answer);
    }

    public static String getName()
    {

        String name = JOptionPane.showInputDialog("What is your name: ");
        return name;
    }

    public static int playGame(int[] numSticks, int totalSticks, String name)
    {
        int nulll = 0;
        String board = "";
        board += ("Row 1: "+ "| " + "\n");
        board += ("Row 2: "+ "| | | " + "\n");
        board += ("Row 3: "+ "| | | | | " + "\n");
        board += ("Row 4: "+ "| | | | | | | " + "\n");
        board += ("OK " + name + " what row do you want to use? ");

        JOptionPane.showMessageDialog(null, board);
        return nulll;
    }



}