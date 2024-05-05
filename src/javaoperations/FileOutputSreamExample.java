package javaoperations;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputSreamExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filename = "D:/Javaex.txt";
		try(FileOutputStream fos = new FileOutputStream(filename)){
			String data = "Hello Arwaa";
			fos.write(data.getBytes());
            System.out.println("Data has been written to " + filename);

		}
		
		FileOutputStream file = new FileOutputStream(filename);  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
        
        String str = "ABC"; 
        try { 
  
            FileWriter fw = new FileWriter("D:/Javaex.txt"); 
  
 
            for (int i = 0; i < str.length(); i++) 
                fw.write(str.charAt(i)); 
  
            System.out.println("Successfully written"); 
  
            fw.close(); 
        } 
        catch (Exception e) { 
            e.getStackTrace(); 
        } 
        
        //initializing FileWriter
        try
        {
            FileWriter file1 = new FileWriter("D:/Javaex.txt");
             
            // Initializing BufferedWriter
            BufferedWriter geekwrite = new BufferedWriter(file1);
            System.out.println("Buffered Writer start writing :)");
             
            // Printing E
            geekwrite.write(69); 
             
            // Printing 1
            geekwrite.write(49); 
 
            geekwrite.close();
            System.out.println("Written successfully");
        }
        catch (IOException except)
        {
            except.printStackTrace();
        }
	}

}
