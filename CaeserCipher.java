import java.util.Scanner;
import java.io.*;
class CaeserCipher{
    public static void main(String[] args)
    {
        CaeserCipher obj = new CaeserCipher();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int len = s.length();
        if(len <= 3 && len >= 100)
        {
            System.out.println("Invalid String");
        }
        else{
            System.out.println("\n\nPlainText: " + s);
            System.out.println("\nCipherText: " + obj.cipher(s));
        }
    }
    String cipher(String s)
    {
        String str = "";
        char ch;
        int a;
        for(int i = 0; i<s.length() - 1; i++)
        {
            ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                a = ch+13;
                if((Character.isUpperCase(ch) && a > 90) || (Character.isLowerCase(ch) && a > 122))
                {
                    a = a - 26;
                }
                ch = (char) a;
            }
            str = str + ch;
        }
        return str;
    }
}
