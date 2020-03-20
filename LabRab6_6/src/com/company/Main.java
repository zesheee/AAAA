package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out= null;
        try{
            br = new BufferedReader( new InputStreamReader (new FileInputStream("C:\\papka1\\MyFile1.txt"),"cp1251"));
            out = new PrintWriter("C:\\papka1\\MyFile2.txt","cp1251");
            int lineCount = 0;
            int wordCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                wordCount = 0;
                lineCount ++;
                for (String str: s.split(" ")) {
                    boolean test = str.matches("^(?ui:[аеёиоуыэюя]).*");
                    if (test == true){
                        wordCount++;
                        System.out.println(lineCount + ": " + str);
                        out.println(lineCount + ": " + str);
                    }
                }
                out.println("Количество отобранных слов в " + lineCount + " строке: " + wordCount);
                System.out.println("Количество отобранных слов в " + lineCount + " строке: " + wordCount);
            }


        }catch (IOException e){
            System.out.println("Ошибка!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
