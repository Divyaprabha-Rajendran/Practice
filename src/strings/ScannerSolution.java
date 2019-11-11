package strings;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ScannerSolution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        HashSet keep_set = new HashSet();
        HashSet remove_set = new HashSet();
        
        int min_length = Math.min(a.length(), b.length());
        
        for (int i=0;i<min_length;i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                keep_set.add(a.charAt(i));
            }
            else
            {
            	remove_set.add(a.charAt(i));
            	remove_set.add(b.charAt(i));
            }
        }
        
        System.out.println(remove_set);
        
		return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}



