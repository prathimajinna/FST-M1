package activities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:\\Users\\PrathimaJinna\\Desktop\\TestSheet1.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

       
            System.out.println("Data in file: " + FileUtils.readFileToString(file, "UTF8"));

           
            //Create directory
            File destDir = new File("C:\\Users\\PrathimaJinna\\Downloads\\TestSheet2.txt");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

           
            //Read data from file
            String newFileData = FileUtils.readFileToString(destDir, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
            
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}