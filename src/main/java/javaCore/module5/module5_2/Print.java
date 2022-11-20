package javaCore.module5.module5_2;

import java.io.*;
import java.util.Arrays;

public class Print {

    public static void main(String[] args) throws IOException {

        byte[] data = {64, 2, 3, 74, 6};

        InputStream inputStream = new ByteArrayInputStream(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
        byte[] out = outputStream.toByteArray();
        System.out.println(Arrays.toString(out));
    }



    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int x;
        while ((x = inputStream.read()) != -1) {
                if ((byte) x % 2 == 0) {
                    outputStream.write((byte) x);
                    outputStream.flush();
                }
            }
        return;
        }
    }

