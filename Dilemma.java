

import java.util.*;


class  Dilemma 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    int count=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='1')
		        count++;
		    }
		    if(count%2==1)
		    System.out.println("WIN");
		    else
		    System.out.println("LOSE");
		}
	}
}
