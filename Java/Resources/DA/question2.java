import java.util.*;
import java.lang.*;
import java.io.*;

public class question2 
{
	public static void main (String[] args) 
	{
	    Scanner s = new Scanner(System.in);
        System.out.print("enter p: ");
        int p = s.nextInt();
        System.out.print("enter q: ");
        int q = s.nextInt();
        s.close();
        if(checkPrime(p) || checkPrime(q))
        System.out.println("Co primes");
        System.out.println(isCoPrime(p,q));
        System.out.println(isCoprime(p,q));
        
        
	}
	
	public static int[] factors(int p){
	    int[] ans = new int[100];
	    int count=0;
	    for(int i=1;i<=Math.sqrt(p);i++)
	        if(p%i==0){
	            ans[count]=i;
	            count++;
	        }
	    return ans;
	}   
	
	public static boolean checkPrime(int p){
	    int[] ans = factors(p);
	    if(ans.length==1)
	        return true;
	    return false;
	}
	
	public static int hcf(int p, int q){
	    if (q != 0)
            return hcf(q, p % q);
        else
            return p;
            
	}
	public static boolean isCoPrime(int p, int q){
	    if(hcf(p,q)!=1)
	        return true;
	    return false;
	}
	public static boolean isCoprime(int p, int q){
	    int[] pf = factors(p);
	    int[] qf = factors(q);
	    for(int i=1;i<=qf.length;i++){
	        if(pf[i]==qf[i])
	            return true;
	    }
	    return false;
	    
	}
}
