package com.company;
import java.util.*;
import java.io.*;


public class PairProgramming {
    public static void main(String args[]) throws IOException {
        String content = new String();
        int count = 1;
        File file = new File("/Users/katerinaklymets/Desktop/unsorteddict.txt");
        LinkedList<String> list = new LinkedList<String>();

        try {
            Scanner sc = new Scanner(new FileInputStream(file));
            while (sc.hasNextLine()) {
                content = sc.nextLine();
                list.add(content);
            }
	   sc.close();
        } catch (FileNotFoundException fnf) {
            fnf.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nProgram terminated Safely...");
        }
        Collections.sort(list);

        for (String s : list)
            System.out.println(s);


    }
}

