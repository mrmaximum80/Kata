package javaCore.module5.module5_1;

import java.io.File;
import java.io.IOException;

public class FilePaths {

    public static void main(String[] args) throws IOException {

        String s1 = ".\\a\\b\\..\\b\\c\\.\\file.txt";
        String s2 = "a\\b\\c\\file.txt";
        String s3 = "a\\b\\..\\file.txt";
        String s4 = "a\\..\\b\\c\\file.txt";
        String s5 = "a\\.\\b\\..\\c\\.\\file.txt";


        System.out.println(new File(s1).getCanonicalPath());
        System.out.println(new File(s2).getCanonicalPath());
        System.out.println(new File(s3).getCanonicalPath());
        System.out.println(new File(s4).getCanonicalPath());
        System.out.println(new File(s5).getCanonicalPath());


    }

}
