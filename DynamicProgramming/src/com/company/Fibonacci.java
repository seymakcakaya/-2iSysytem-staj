package com.company;

public class Fibonacci {

    final int MAX = 100;
    final int NIL = -1;

    int lookup[] = new int[MAX];

        void _initialize()
        {
            for (int i = 0; i < MAX; i++)
                lookup[i] = NIL;
        }


        int fibMemoization(int n)
        {
            if (lookup[n] == NIL)
            {
                if (n <= 1)
                    lookup[n] = n;
                else
                    lookup[n] = fibMemoization(n-1) + fibMemoization(n-2);
            }
            return lookup[n];
        }


    int fibTabulation(int n)
    {
        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];
        return f[n];
    }
     int fibRecursion(int n)
    {
        if (n <= 1)
            return n;
        return fibRecursion(n-1) + fibRecursion(n-2);
    }

}
