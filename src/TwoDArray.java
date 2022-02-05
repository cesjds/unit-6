//Yoav Amit
//January 31, 2022
//Period 1

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;

public class TwoDArray {
    public static void main(String[] args) {
        //Initaties ChangeJOP
        changeJOP();
        //Asks the user for the number of rows and columns
        int numRows = Integer.parseInt(JOptionPane.showInputDialog("How many rows do you want in your 2D array? "));
        int numColumns = Integer.parseInt(JOptionPane.showInputDialog("How many columns do you want in your 2D array? "));
        //Creates the array using the parameters above
        char[][] chArray = new char[numRows][numColumns];

        //Initiates all the methods
        fillArray(chArray);
        printArray(chArray);
        concatenateRow(chArray);
        concatenateColumn(chArray);

    }

    public static char[][] fillArray(char[][] chArray)
    {
        int randNum;
        char randCh;
        for(int r = 0; r < chArray.length; r++)
        {
            for(int c = 0; c < chArray[0].length; c++)
            {
                randNum = (int)(Math.random() * 223) + 32;
                randCh = (char)(randNum);
                chArray[r][c] = randCh;
            }
        }
        return chArray;
    }

    public static void printArray(char[][] chArray)
    {
        for(int r = 0; r < chArray.length; r++)
        {
            for(int c = 0; c < chArray[0].length; c++)
                System.out.print(chArray[r][c] + " ");
            System.out.println();
        }
        System.out.println("");
    }

    public static void concatenateRow(char[][] chArray)
    {
        int row = Integer.parseInt(JOptionPane.showInputDialog("What row would you like to concatenate?"));
        String concRow = "";

        for(int i = 0; i < chArray[0].length; i++)
        {
            concRow += chArray[row-1][i];
        }
        System.out.println("The concatenation of row "+row+" is:\n"+concRow+"\n");
    }

    public static void concatenateColumn(char[][] chArray)
    {
        int column = Integer.parseInt(JOptionPane.showInputDialog("What column would you like to concatenate?"));
        String concColumn = "";

        for(int i = 0; i < chArray.length; i++)
        {
            concColumn += chArray[i][column-1];
        }
        System.out.println("The concatenation of column "+column+" is:\n"+concColumn+"\n");
    }

    public static void changeJOP()
    {
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
        UIManager.put("Button.background",new Color(255, 255, 255, 255));
        UIManager.put("Button.foreground", new Color(255, 255, 255));
        UIManager.put("Button.font", new FontUIResource	(new Font("Tempus Sans ITC", Font.BOLD, 14)));
    }
}
