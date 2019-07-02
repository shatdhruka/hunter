import java.lang.*;
import java.util.*;
import java.io.*;
class DuplicateSort 
{
    public static void duplicate(int a[],int n)
    {
        int b[]=new int[a.length];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    b[i]=a[i];
                }
                if(b[i]>b[j])
                {
                    int x=b[i];
                    b[i]=b[j];
                    b[j]=x;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(b[i]!=0)
            {
                System.out.print(b[i]+" ");
            }
        }  
    }
	public static void main (String[] args) 
	{
	    DuplicateSort z=new DuplicateSort();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
		z.duplicate(a,n);
	}
}
