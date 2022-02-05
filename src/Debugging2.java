import java.sql.Array;
import java.util.ArrayList;

public class Debugging2
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("goodbye");
        list.add(2, "hi");
        System.out.println(list);
    }

}
