package javaCore.module5.module5_2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SumOfStream {

    public static void main(String[] args) throws IOException {

        byte[] data = {1, 2, 3, 0, 5};
        InputStream inputStream = new ByteArrayInputStream(data);
        System.out.println(new SumOfStream().sumOfStream(inputStream));
    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int x;
        while ((x = inputStream.read()) != -1) {
            sum += (byte) x;
        }
        return sum;
    }
}

