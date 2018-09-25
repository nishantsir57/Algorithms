import java.util.*;
class SieveOfEratosthenes
{
    boolean prime[];
    SieveOfEratosthenes()
    {
        int n=(int)Math.pow(10,6);
        prime=new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*2;j<=n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
    }
    boolean prime(int number)
    {
        return prime[number];
    }
    boolean[] primeRange(int start, int end)
    {
        boolean primes[]=new boolean[start+(end-start)+1];
        for(int i=start;i<=end;i++)
        {
            primes[i]=prime[i];
        }
        return primes;
    }
}

