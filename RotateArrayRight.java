/**
 * Created by Nitesh on 4/12/2018.
 */
public class RotateArrayRight {

    public static void main (String args[])
    {
        int x[] ={1,2,3,4,5,6,7};
        int r = 3;
        rotate(x,r);
    }
    static void rotate(int[] a,int r){
        for (int i = 0 ; i < r ; i++)
        {   int j ;
            int temp = a[a.length-1];
            for ( j = a.length - 1 ; j >0 ; j--)
                a[j] = a[j-1];
            a[j] = temp;
        }
        for (int b = 0 ; b < a.length ; b++)
        {
            System.out.print(a[b] +" ");
        }
    }
}
