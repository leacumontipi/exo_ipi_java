package dao_exo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Bdd {

	public static void main(String[] args) throws IOException {
		//exo diapo 107
		/*ExempleSerial es1 = new ExempleSerial("Pierre", "Jean");
		ExempleSerial es2 = new ExempleSerial("Claire", "Marie");
		
		//SERIALISATION
		try {
			FileOutputStream export = new FileOutputStream("Personnes.xml");
			ObjectOutputStream out = new ObjectOutputStream(export);
			out.writeObject(es1);
			out.writeObject(es2);
			out.close();
			export.close();
			
			System.out.println("Objets sérialisés");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		ExempleSerial es3 = null;
		//DESERIALISATION
        try
        {  
            // Reading the object from a file
            FileInputStream file = new FileInputStream("Personnes.xml");
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            es3 = (ExempleSerial)in.readObject();
            
            in.close();
            file.close();
             
            System.out.println("Objets désérialisés");
            System.out.println(es3.getNom() + " ; " + es3.getPrenom());
        }
         
        catch(IOException e)
        {
        	e.printStackTrace();
        }
         
        catch(ClassNotFoundException e)
        {
        	e.printStackTrace();
        }*/
		
		
		

	}

}
