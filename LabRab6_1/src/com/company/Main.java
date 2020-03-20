package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	Reader in = null;
	Writer out= null;
	try{
	    in = new FileReader("C:\\papka1\\MyFile1.txt");
	    out = new FileWriter("C:\\papka1\\MyFile2.txt", true);
	    int OneByte;
	    while ((OneByte = in.read()) != -1) {
            out.write((char) OneByte);
            out.append((char) OneByte);
        }
        }catch (IOException e){
	    System.out.println("Ошибка!");
        } finally {
	    in.close();
	    out.close();

    }
    }
}
