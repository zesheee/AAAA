package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw= null;
        try{
            br = new BufferedReader( new InputStreamReader (new FileInputStream("C:\\papka1\\MyFile1.txt"),"cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\papka1\\MyFile2.txt"),"cp1251"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount ++;
                System.out.println(lineCount + ":" + s);
                bw.write(s);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Ошибка!");
        } finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
