import java.util.*;
public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");

        List<Integer> ls = new ArrayList<Integer>();
        for(int i =0;i< 10;i++)
        {
            ls.add(Integer.valueOf(i));
        }
        for(Integer a:ls)
        {
            System.out.println(a);
        }

    }
}
