import java.util.*;
import java.lang.*;
import java.io.*;
public class Reverseword
{
    public static void Reverse(String x)
    {
        String[] y=x.split("\\s");
		for(String w:y)
		{
			char ch[]=w.toCharArray();
			int n=w.length();
			for(int i=n-1; i>=0; i--)
			{
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
    }
	public static void main (String[] args) 
	{
	    Reverseword z=new Reverseword();
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		z.Reverse(x);
	}
}
