package com.hiwijaya.io;

import java.io.*;
import java.util.Scanner;

/**
 * @author Happy Indra Wijaya
 */
public class Write {

    public static void main(String[] args) throws IOException {

        String message = "# spring-io\n" +
                "This file is written programmatically.";

        InputStream inputStream = new ByteArrayInputStream(message.getBytes("UTF-8"));
        File file = writeFile("written.txt", inputStream);

    }

    public static File writeFile(String fileName, InputStream inputStream) throws IOException {

        File file = new File(fileName);
        OutputStream outputStream = new FileOutputStream(file);

        int read = 0;
        byte[] bytes = new byte[1024];
        while ((read = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, read);
        }
        outputStream.close();

        return file;
    }


}
