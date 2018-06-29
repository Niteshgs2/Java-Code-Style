/**
 * Created by Nitesh on 2/12/2018.
 * Rotate Array to Left
 */
public class RotateArrayLeft {

    public static void main (String args[])
    {
        int x[] ={1,2,3,4,5,6,7};
        int r = 3;
        int s = x.length;//
        rotate(x,r);
    }
    static void rotate(int[] a,int r){
        int j ;
        int temp;
        for (int i = 0 ; i < r ; i++)
        {
            temp = a[0];
            for ( j = 0 ; j < a.length - 1 ; j++)
                a[j] = a[j+1];
            a[j] = temp;
        }
        for (int b = 0 ; b < a.length ; b++)
        {
            System.out.print(a[b] +" ");
        }
    }
}
