import java.util.*;
import java.io.*;
class RailFence
{
    public static vod main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        int rails = sc.nextInt();
        String cipherText = encrypt(msg, rails);
        System.out.println("CipherText is: " + cipherText)
    }
    public static String encrypt(String msg, int rails)
    {
        char[][] arr = new char[rails][msg.length()];
        for(int i = 0; i<rails; i++)
        {
            for(int j = 0; j<msg.length();j++)
            {
                arr[i][j] = '\n';
            }
            arr[row][col++] = msg.charAt(i);
            if(flag)
            {
                row++;
            }
            else
            {
                row--;
            }
        }

        boolean flag = false;
        int row = 0;
        int col = 0;
        for(int i = 0; i<msg.length(); i++)
        {
            if(row == 0 || row == rails - 1)
            {
                flag = !flag;
            }
        }
    }
}
