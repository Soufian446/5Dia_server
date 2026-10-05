package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, IOException {
        Socket s= new Socket("10.22.10.14",3000);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.println("Inserisci il primo numero: ");
            double n1=scanner.nextDouble();

            System.out.println("Inserisci il secondo numero: ");
            double n2=scanner.nextDouble();

            System.out.println("Inserisci il segno(+,-,*,/): ");
            String segno=scanner.nextLine();

            out.println(segno);
            out.println(n1);
            out.println(n2);

            if(n1==0 && n2==0){
                break;
            }else{
                System.out.println(in.readLine());
            }
        }
    }
}