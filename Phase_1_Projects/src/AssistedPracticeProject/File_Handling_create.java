package assistedPracticeProject;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class File_Handling_create {

	public static void main(String[] args) throws IOException {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
	}
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("E://Simplilearn_github//Phase_1_Projects//src//assistedPracticeProject//fileHandlingCreatefile1.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data, File Crated succesfully");
          writer.close();
    }
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data, File Crated succesfully";
        FileOutputStream out = new FileOutputStream("E://Simplilearn_github//Phase_1_Projects//src//assistedPracticeProject//fileHandlingCreatefile2.txt");
        out.write(data.getBytes());
        out.close();
    }
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data, File Crated succesfully";
        Files.write(Paths.get("E://Simplilearn_github//Phase_1_Projects//src//assistedPracticeProject//fileHandlingCreateFile3.txt"), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
       Files.write(Paths.get("file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }


}



/*
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File_Handling_create {

	public static void main(String[] args) {


			File file  = new File("E://Simplilearn_github//Phase_1_Projects//src//assistedPracticeProject//fileHandlingCreatefile.txt");
			
			
					
			
			try {
				System.out.println("New file created "+file.createNewFile());
				
				FileWriter writer = new FileWriter(file, true);

				writer.write("Test Data,\nInside data");
					
					writer.flush();
				
				FileInputStream  reader = new FileInputStream(file);
				
				int num =0;
				
					while((num=reader.read()) != -1) {
						
						System.out.print((char)num);
						
					}
				
				//boolean isfileDeleted =	file.delete();
				
				//Files.deleteIfExists(Paths.get("E://Simplilearn_github//Phase_1_Projects//src//assistedPracticeProject//fileHandlingCreatefile1.txt"));
				
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}*/
