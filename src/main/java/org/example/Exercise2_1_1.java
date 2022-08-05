package org.example;

import org.jetbrains.annotations.NotNull;

public class Exercise2_1_1 {
    static void removeChar(String str3, char c)
    {
        int j, count = 0, n = str3.length();
        char []t = str3.toCharArray();
        for (int i = j = 0; i < n; i++)
        {
            if (t[i] != c)
                t[j++] = t[i];
            else
                count++;
        }

        while(count > 0)
        {
            t[j++] = '\0';
            count--;
        }

        System.out.println(t);
    }
    public static void main(String[] args)
    {

        String str3 = "PHP Exercises and Python Exercises" ;
        removeChar(str3, 'P');
    }
}
