package assistedPracticeProject;

public class Finally_Keyword {


    public static void main(String[] args)
    {
        int a=35,b=0,rs=0;
        try
        {
            rs = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n Error : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + rs);
        }
    }
}
