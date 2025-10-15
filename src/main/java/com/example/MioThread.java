package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MioThread {

    Socket mioSocket;

    public MioThread(Socket socket){

        this.mioSocket = socket;

    }
    public void start() throws IOException{
       
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
        int operazione = Integer.parseInt(in.readLine());

        double ris = 0;
       
        switch (operazione) {
            case 1:
                ris = n1 + n2;
                break;

            case 2:
                ris = n1 - n2;
                break;

            case 3:
                ris = n1 / n2;
                break;

            case 4:
                ris = n1 * n2;
                break;

            default:
                break;
        }
     
          
        out.println(ris);
        
        
        

        

        mioSocket.close(); 
    }
}
}
