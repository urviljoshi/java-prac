package com.example.jp.j13;

public class TextBlocks {
    public static void main(String[] args) {
        String s = extracted();
        System.out.println(s.indent(4));
        System.out.println(s.stripIndent());
        String a = "asdasd\\n";
        System.out.println(a);
        System.out.println(a.translateEscapes());
        String p = "urvil is  a %s";
        System.out.println(p.formatted("dev"));

    }

    private static String extracted() {
      return """
               {
                    "name" : "Baeldung",
                    "website" : "https://www.%s.com/"
               }
               """;


    }
}
