import java.io.*;
import java.util.*;
public class file{
	
	public String filename;
	public String[] content;
	
    file(String n){ 
		
        filename = n;
    }
	
	public void read() {
	

        try {
			String line = null;
            FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			List<String> lines = new ArrayList<String>();
            while((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();  
			content = lines.toArray(new String[lines.size()]);			
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + filename + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + filename + "'");
        }
		
    }
	
	public void write(String[] c,String n) {
	
		try {
			FileWriter fileWriter =new FileWriter(n);
			BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
			for (String l : c) {
				bufferedWriter.write(l);
				bufferedWriter.newLine();
			}
            
			bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file '"+ n + "'");
        }
		
    }
    
}