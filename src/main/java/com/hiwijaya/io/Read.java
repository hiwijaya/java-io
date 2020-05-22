package com.hiwijaya.io;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Happy Indra Wijaya
 */
public class Read {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = Read.class.getResourceAsStream("/read.txt");
        printFile(inputStream);

    }

    private static void printFile(InputStream inputStream){
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }

}
