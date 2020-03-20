package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
            InputStream f1 = new FileInputStream("C:\\papka1\\numIsh.txt");
            DataInputStream rd = new DataInputStream(f1);

            File f2 = new File("1.txt");
            if(!f2.exists()) f2.createNewFile();
        DataOutputStream wr=new DataOutputStream( new FileOutputStream(f2));
            String number1 = "";
        try {
                while(number1 != null) {
                    number1 = rd.readLine();
                    System.out.println("1 " + number1);
                    try {
                        int number = Integer.parseInt(number1);
                        System.out.println("2 " + number);

                    if (number % 2 == 0){
                        System.out.println("3 " + number);
                        wr.writeUTF(number1);
                    } } catch (NumberFormatException ue){
                        //not
                    }
                }
           } catch (EOFException ie){
                System.out.println("AAAAAAAAAAAAAAAAAAAAAA");
                wr.flush();
                wr.close();
                rd.close();

        } catch (IOException e){
            System.out.println("End of File");
        }
    }
}
