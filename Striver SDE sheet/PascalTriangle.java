import java.util.*;
public class PascalTriangle {
    public static void main(String[] args)
    {
        // if row and column given find the element at that point
        System.out.println("the element at the given row(3) and column(2) would be : ");
        System.out.println(element(3,2));
    //print rth row of any pascal's traingle
        System.out.println("the rth(4) row of the pascal's traingle is :");
        System.out.println(rRow(4));

    }
    static int  element(int r, int c)
    { int res=1;
        for(int i=0;i<=r;i++)
        {
            res=res*(r-i);
            res=res/(i+1);
            return res;
        }
      return 0;
    }
    public static boolean rRow(int r){
        for(int i=0;i<r;i++)
        {
            int ans=1;
            ans=ans*(r-i);
            ans=ans/i;
            System.out.println(ans+" ");
        }
        return true;
    }

}
