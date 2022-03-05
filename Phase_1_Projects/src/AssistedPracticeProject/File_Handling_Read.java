package assistedPracticeProject;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class File_Handling_Read {
	  public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    {
	    	lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	    		  
	    catch (IOException e) 
	    { 
	     e.printStackTrace(); 
	    } 
	    return lines; 
	    } 


	public static void main(String[] args) {
	    List<String> l = readFileInList("E://Simplilearn_github//Phase_1_Projects//src//assistedPracticeProject//fileHandlingCreateFile3.txt"); 
	    
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 


	}

}
