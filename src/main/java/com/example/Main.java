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
        do{
            Socket mioSocket = mioserver.accept();
            MioThread t = new MioThread(mioSocket);
            t.start();
        }while(true);
        


    }

}



   
   