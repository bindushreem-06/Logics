package Strings;

public class StringNparts {
    public static void main(String[] args) {
                String str = "HELLOWORLD";
                int n = 3;
                int len = str.length();

                if (len % n != 0) {
                    System.out.println("Cannot divide string into equal parts.");
                } else {
                    int partSize = len / n;
                    System.out.println("The string divided into " + n + " parts:");

                    for (int i = 0; i < len; i += partSize) {
                        System.out.println(str.substring(i, i + partSize));
                    }
                }
            }
        }
