import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Demo {
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Provide a value : \t");
        String s = br.readLine();
       /* for(int i=0;i<s.length();i++)
        {
            if(!Character.isDigit(s.charAt(i)))
            {
                System.out.println("Please provide a correct value");
                return;
            }
        }*/
        int a=0;
        boolean flag=true;
        try{
            a = Integer.parseInt(s);
        }
        catch(Exception e)
        {
            System.out.println("Please Provide correct value");
            flag=false;

        }
        if(flag)
        {
            System.out.println("Just for fun" + " value of a = "+ a);
        }

    }
}
