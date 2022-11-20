package javaCore.module5.module5_3;

import java.io.*;

public class CharConverter {

    public static void main(String[] args) throws IOException {

        Writer writer = new CharArrayWriter();
        writer.write("Ы");
        System.out.println((int) 'Ы');

    }
}
