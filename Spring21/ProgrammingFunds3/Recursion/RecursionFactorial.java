package Spring21.ProgrammingFunds3.Recursion;

public class RecursionFactorial {
    static int fact(int n)
    {
        if (n == 1)
 // base condition for recursive method
            return 1;
// else part of the function is the recursive call    
            else   
            return n*fact(n-1);    
// every time the recursive method is called, n is decremented by 1.
    }    public static void main(String[] args) {
    int result = fact(10);
     System.out.println("10! = " + result);
    }
}


/* we can conclude that ultimately the value of n will become 1 or less than 1
and at this point, the method will return value 1. This base condition will be
reached and the function will stop. Note that the value of n can be anything 
as long as it satisfies the base condition. */