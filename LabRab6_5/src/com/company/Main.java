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
            String s;
            while ((s = br.readLine()) != null) {
                lineCount ++;
                out.println(lineCount + ":" + s);
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
