package br.unesp.rc.lista04ex03.utils;

public class SenhaUtils {

    private SenhaUtils() {

    }

    private static String s1(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int txt = (int) c;
            txt += 1;
            c = (char) txt;
            str += String.valueOf(c);
        }
        return str;
    }

    private static String s2(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int txt = (int) c;
            txt += 2;
            c = (char) txt;
            str += String.valueOf(c);
        }
        return str;
    }

    private static String s3(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int txt = (int) c;
            txt += 3;
            c = (char) txt;
            str += String.valueOf(c);
        }
        return str;
    }

    private static String s4(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int txt = (int) c;
            txt -= 1;
            c = (char) txt;
            str += String.valueOf(c);
        }
        return str;
    }

    private static String s5(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int txt = (int) c;
            txt -= 2;
            c = (char) txt;
            str += String.valueOf(c);
        }
        return str;
    }

    private static String s6(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int txt = (int) c;
            txt -= 3;
            c = (char) txt;
            str += String.valueOf(c);
        }
        return str;
    }

    public static String codec(int codec, String senha) {
        String s;
        String token = "asdfghjkqwertymmnvdhfhjkabfk";

        if (codec == 1) {
            senha += token;
            s = s1(senha);
            s = s2(s);
            s = s3(s);
        } else {
            s = s6(senha);
            s = s5(s);
            s = s4(s);

            s = s.substring(0, (s.length() - token.length()));
        }
        return s;
    }

}
