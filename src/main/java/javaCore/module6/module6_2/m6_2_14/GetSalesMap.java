package javaCore.module6.module6_2.m6_2_14;

import java.io.CharArrayReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GetSalesMap {

    public static void main(String[] args) {

        String str = "Алексей 3000\n" +
                "Дмитрий 9000\n" +
                "Антон 3000\n" +
                "Алексей 7000\n" +
                "Антон 8000";
        Reader reader = new CharArrayReader(str.toCharArray());

        System.out.println(getSalesMap(reader));
    }


    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salesMap = new HashMap<>();
        String key = "";
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            salesMap.put(key = scanner.next(), (salesMap.containsKey(key))
                    ? (salesMap.get(key) + scanner.nextLong())
                    : scanner.nextLong());
        }
        return salesMap;
    }
}
