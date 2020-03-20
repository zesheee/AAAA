package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out= null;
        try{
            br = new BufferedReader(new FileReader("C:\\papka1\\MyFile1.txt"));
            out = new BufferedWriter(new FileWriter("C:\\papka1\\MyFile2.txt", true));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount ++;
                System.out.println(lineCount + ":" + s);
                out.write(s);
                out.newLine();
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
