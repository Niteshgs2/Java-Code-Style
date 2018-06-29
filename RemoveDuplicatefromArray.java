
import java.util.*;
class RmDpLeet
{
    // Function to remove duplicate elements
    // This function returns new size of modified
    // array.
    static int removeDuplicates(int ar[], int n)
    {
        if (n==0 || n==1)
            return n;
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1;i++)
            if (ar[i] != ar[i+1])
                temp[j++] = ar[i];
        temp[j++] = ar[n-1];
        for (int i=0; i<j; i++)
            ar[i] = temp[i];
        return j;
    }

    public static void main (String[] args)
    {
        int a[] = {1, 2, 3,2, 3,3,4, 4,8, 4, 5, 5};
        Arrays.sort(a);

        int n = a.length;

        n = removeDuplicates(a, n);
        for (int x = 0; x < n ; x++)
            System.out.print(a[x] +" ");
    }
}