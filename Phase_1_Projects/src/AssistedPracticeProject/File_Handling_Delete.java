package assistedPracticeProject;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class File_Handling_Delete {
    public static void main(String[] args) 
    { 
        try
        { 
            Files.deleteIfExists(Paths.get("E://Simplilearn_github//Phase_1_Projects//src//assistedPracticeProject//fileHandlingCreatefile2.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deleted successful."); 
    } 


}

