class TowerOfHanoi
{
    public static void main (String[] args) {
        toh(3, '1', '2', '3');
        System.out.println();
        toh(2, '1', '2', '3');
        
    }
    static void toh(int n, char b, char a, char e)
    {
        if(n>=1)
        {
            toh(n-1,b,e,a);
            System.out.println(b+" "+e);
            toh(n-1,a,b,e);
        }
    }
}
