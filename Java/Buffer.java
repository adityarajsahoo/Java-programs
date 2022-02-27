import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import jdk.internal.util.xml.impl.Input;

class Buffer
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader IR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IR);
        int a = Integer.parseInt(BR.readLine());
        String str = BR.readLine();
        System.out.println(a);
        System.out.println(str);
    }
}