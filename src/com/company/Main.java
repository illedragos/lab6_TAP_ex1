package com.company;

/*Citiți de la stdin o linie de text și afișați-o la stdout folosind BufferedReader-ul
definit în schelet. Nu uitați să afișați un mesaj sugestiv în cazul apariției unei excepții
și să închideți resursa după terminarea folosirii acesteia. Folosiți construcția trywith-resources sau try-catch-finally.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //BufferReader is faster then Scanner
        //BufferReader what data? from where? how (which format)?
        //Scanner: buffer size is 1kb
        //BufferReader : buffer size is 8kb

        System.out.println("Laborator 6 Exercitiul 1 Tehnici Avansate de programare");

        //if we want to use buffer reader we need to create object of inputstreamreader
        //System.in takes data from keyboard and convert it to a string

        InputStreamReader is = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(is);

        try {
            System.out.println("Enter a number");
            int n = Integer.parseInt(br.readLine());
            System.out.println("your lucky number is "+n);
        }

        catch (IOException e) {
            e.printStackTrace();
           // System.out.println(e);
            System.err.println("You had one job");
            System.out.println("to enter a correct number");
        }

        finally {
            System.out.println("Bye");
            br.close();
        }

//      in this case we don't need to close the resource, try will close the resources even if there is an error
        try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))){
            String str="";
            str = br2.readLine();
            System.out.println(str);
        }

        System.out.println("The End of the program");

    }
}
