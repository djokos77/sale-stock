import java.io.*;
import java.util.*;
public class blacklist extends file{
	
    blacklist(String n){ 
		
		super(n);
    }
	
	public static blacklist initialize(String n){
		
		blacklist bl = new blacklist(n);
		bl.read();
		Arrays.sort(bl.content);
		return bl;
	}
	
	public boolean check_blacklist(String name,int phone){
		
		int a =  Arrays.binarySearch(content, name+" "+phone);
		if(a >= 0)
			return true;
		else
			return false;
		
	}
    
}