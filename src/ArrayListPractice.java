/*
Written by: Yoav Amit
Period 1
February 3, 2022
 */

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        //Creating the ArrayList
        ArrayList<String> animals = new ArrayList<String>();

        //Initializing all the methods in this class
        fillArrayList(animals);
        System.out.println(animals.toString() + "\n");
        printAllElements(animals);
        printElements(animals);
        removeElements(animals);

        //Changes to the Array in main
        int dogNum = animals.indexOf("dog");
        animals.remove("dog");
        animals.add(dogNum, "puppy");
        System.out.println('\n' + animals.toString());
        animals.clear();
        System.out.println(animals.toString());

    }

    public static ArrayList<String> fillArrayList(ArrayList<String> animals)
    {
        animals.add("hamster");
        animals.add(0, "cat");
        animals.add(0, "bird");
        animals.add(2, "dog");
        animals.add("iguana");
        animals.add(3, "fish");
        animals.add(3, "ferret");
        animals.add("turtle");
        return animals;
    }

    public static void printAllElements(ArrayList<String> animals)
    {
        for (int i = 0; i < animals.size(); i++)
        {
            System.out.println(animals.get(i));
        }
        System.out.print("\n");
    }

    /**
     * This method will find some objects and their location in 'animals'
     */
    public static void printElements(ArrayList<String> animals)
    {
        System.out.println(animals.get(0));
        System.out.println(animals.get(animals.size()-1));
        System.out.println(animals.get(2));
        System.out.println(animals.indexOf("fish"));
    }

    /**
     * This method removes some elements from 'animals' and completely clears it
     */
    public static ArrayList<String> removeElements(ArrayList<String> animals)
    {
        animals.remove(0);
        animals.remove(animals.size()-1);
        animals.remove(5);
        return animals;
    }
}
