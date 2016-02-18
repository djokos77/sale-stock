import java.io.*;
import java.util.*;

public class number3 {
    public static void main(String [] args) {

        System.out.println("3. Start");
		
		blacklist bl = blacklist.initialize("sample3.txt");
		
        System.out.println("Checking Joko 1234567 : "+bl.check_blacklist("Joko",1234567));
		
        System.out.println("3. End");
		
    }
}
