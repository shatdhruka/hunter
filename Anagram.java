import java.util.*;
import java.lang.*;
import java.io.*;
public class Anagram
{
	public static void main (String[] args) 
	{
	    Anagram x=new Anagram();
		Scanner sc=new Scanner(System.in);
		String y=sc.next();
		String z="dhoni";
	    x.AnagramString(y,z);
	}
	public static void AnagramString(String y,String z)
		{
		    char ch[]=y.toCharArray();
		    char ch1[]=z.toCharArray();
		    int n=y.length();
		    int m=5,count=0;
		    if(n==m)
		    {
			    for(int i=0;i<m;i++)
			    {
				    for(int j=0;j<n;j++)
				    {
					    if(ch1[i]==ch[j])
					    {
					    	count++;
						    j=n;
					    }
				    }
			    }
			    if(count==n)
			    {
				    System.out.println("yes");
			    }
			    else
			    {
				    System.out.println("no");
			    }
		    }
		    else
		    {
			    System.out.println("no");
		    }
	    }
}
