package javaCore.module5.module5_3.m5_3_11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;


public class ReadAsString {

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset));
        String line = "";
        int ch;
        while ((ch = reader.read()) != -1) {
            line = line + (char) ch;
        }
        return line;
    }
}
