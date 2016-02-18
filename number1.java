import java.io.*;
import java.util.*;

public class number1 {
    public static void main(String [] args) {

        System.out.println("1. Start");
		
		file sample1 = new file("sample1.txt");
		
		sample1.read();
		String[] content=sample1.content;
		Arrays.sort(content);
		sample1.write(content,"sorted_age.txt");
		
        System.out.println("1. End");
		
    }
}
