package javaCore.module3.module3_5;

import java.util.Arrays;

public class Ascii {

    public static class AsciiCharSequence implements CharSequence {

        private byte[] text;

        public AsciiCharSequence(byte[] text) {
            this.text = text;
        }

        public int length() {
            return text.length;
        }

        public char charAt(int index) {
            return (char) text[index];
        }

        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(text, start, end));
        }

        public String toString() {
            return new String(text);
        }

    }
}
