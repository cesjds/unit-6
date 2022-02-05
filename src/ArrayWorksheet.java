//Created by: Yoav Amit
//January 31, 2022
//Period 1

import javax.swing.JOptionPane;

public class ArrayWorksheet {
    public static void main (String [] args)
    {
        // Ask user for length of the array 1
        int arrayLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the length for the array: "));
        // Creating the array with the length the user wanted
        int[] nums = new int[arrayLength];

        // Creating array 2
        String[] names = new String[6];

        //This part of main will initialize all other methods in this class
        fillArray(nums);
        arrayForward(nums);
        arrayBackward(nums);
        findAverage(nums);
        fillArray(names);
        printVowel(names);
    }

    public static void fillArray(int[] nums)
    {
        //Creating the paramaters for the random num generator. (This is easier for me)
        int min = 10;
        int max = 99;
        int range = (max - min) + 1;
        for(int i = 0; i < nums.length; i++)
        {
            int randNum = (int)(Math.random() * range) + min;
            nums[i] = randNum;
        }
    }

    public static void arrayForward(int[] nums)
    {
        System.out.println("This will print the array forward: ");
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }

    public static void arrayBackward(int[] nums)
    {
        System.out.println("This will print the array backwards: ");
        for(int i = nums.length; i > 0; i--)
        {
            System.out.print(nums[i-1] + " ");
        }
        System.out.println("\n");
    }

    public static void findAverage(int[] nums)
    {
        double arrayLengthDouble = nums.length;
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        System.out.println("The average of the array is: " + sum/arrayLengthDouble + "\n");
    }

    public static void fillArray(String[] names)
    {
        for(int i = 0; i < 6; i++)
        {
            String name = JOptionPane.showInputDialog("Enter a name to be filled in the array: ");
            names[i] = name;
        }
    }

    public static void printVowel(String[] names)
    {
        System.out.println("Out of the names that you've entered, only these start with vowels: ");
        for(int i = 0; i < 6; i++)
        {
            if((names[i].charAt(0) == 'a') || (names[i].charAt(0) == 'e') || (names[i].charAt(0) == 'i') || (names[i].charAt(0) == 'o') || (names[i].charAt(0) == 'u'))
                System.out.print(names[i] + ", ");
            else
                System.out.print("");
        }
    }
}
