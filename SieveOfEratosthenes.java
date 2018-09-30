static boolean prime[];
    static void sieveOfEratosthenes()
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
    static boolean prime(int number)
    {
        return prime[number];
    }
    static int[] primeRange(int start, int end)
    {
        int primes[]=new int[start+(end-start)+1];
        int a=0;
        for(int i=start;i<=end;i++)
        {
            if(prime[i]==true)
            {
                primes[a]=i;
                a++;
            }
        }
        return primes;
    }
