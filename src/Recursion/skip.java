package Recursion;

public class skip {
    static void main(String[] args) {
        String str = "cicada";
        String empty = "";
        skipping(empty, str);
        String startwith="used at various place";
        System.out.println(skipStartwith(startwith));
    }

    static void skipping(String ans, String Og) {
        if (Og.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char OgFirstChar = Og.charAt(0);
        if (OgFirstChar == 'a') {
            skipping(ans, Og.substring(1));
        } else {
            skipping(ans + OgFirstChar, Og.substring(1));
        }
    }

    static String skipStartwith(String OG) {
        if (OG.isEmpty()) {
            return "";
        }

        if (OG.startsWith("at")) {
           return skipStartwith(OG.substring(2));
        }
        else{
            return OG.charAt(0)+skipStartwith(OG.substring(1));
        }

    }
}