import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
	{
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int pow2 = 1;
            int x = a;
            for(int j=0;j<n;j++)
	    {
		x=x+(pow2<<j)*b;
		System.out.printf("%d ",x);
	    }
	    System.out.println();
                
        }
        
    }
}