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

    }
	Scanner file1 = new Scanner(new File("/Users/saraponton/IdeaProjects/SoftDev/src/unsorteddict.txt"));
    	StringBuilder sb = new Stringbuilder();
    	while(file.hasNext()) {
        sb.append(file1.nextLine());
   	 }

    	String[] yourArray = sb.toString().split("  ");

   	 int count =100000;
   	 String temp;

    for (int i = 0; i < count; i++)
      {
        for (int j = i + 1; j < count; j++) {
                if (yourArray[i].compareTo(yourArray[j])>0)
               {
                    temp = yourArray[i];
                    yourArray[i] = yourArray[j];
                 yourArray[j] = yourArray;
            }
        }
    }

}

