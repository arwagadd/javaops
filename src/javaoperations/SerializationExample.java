package javaoperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	public static void serializeObject(Professor p) throws FileNotFoundException, IOException {
		 try (FileOutputStream fos = new FileOutputStream("professor.ser");
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	            oos.writeObject(p);
	            System.out.println("Object has been serialized to professor.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
	}
	
	 private static Professor deserializeObject() {
	        try (FileInputStream fis = new FileInputStream("professor.ser");
	             ObjectInputStream ois = new ObjectInputStream(fis)) {
	            return (Professor) ois.readObject();
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Professor p1= new Professor();
		p1.setName("Soubra");
		p1.setAge(38);
		
		serializeObject(p1);
		Professor deserializedPro = deserializeObject();
		
	}
}
