package assistedPracticeProject;

public class Try_Catch {

	public static void main(String[] args) {
        int[] array = new int[5];
        try 
        {
            array[6] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"+e); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }

	}

}
