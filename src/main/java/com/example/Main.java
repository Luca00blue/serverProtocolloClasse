package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ServerSocket mioserver = new ServerSocket(3000);
        Socket mioSocket = mioserver.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);
        out.println("versione 1.0");
        in.readLine();

        String input;
        while (true) {
            input = in.readLine();  
        
            if (input.equalsIgnoreCase("stop")) {
                break; 
            }
        int n1 = Integer.parseInt(in.readLine());
        int n2 = Integer.parseInt(in.readLine());

        int op = Integer.parseInt(in.readLine());

        double Invio = 0;
       
        switch (op) {
            case 1:
                Invio = n1 + n2;
                break;

            case 2:
                Invio = n1 - n2;
                break;

            case 3:
                Invio = n1 / n2;
                break;

            case 4:
                Invio = n1 * n2;
                break;

            default:
                break;
        }
     
          
        out.println(Invio);
        
        
        

        

        mioSocket.close();

    }

}
}


   
   