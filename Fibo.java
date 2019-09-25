public class Fibo {


    public static int compute(int n) throws RuntimeException{
        int i = 0, j = 1;
        if (n < 0)
            throw new RuntimeException("Sequence numbers cannot be negative.");
        else if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return compute(n-1) +compute(n-2);
        }

}
