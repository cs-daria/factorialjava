import java.util.*;
/**
 * Write a description of class fctorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class factorial
{
    public int factorial(int n)
    {
        if (n==0 || n==1){
            return 1;
        }else{
        return n*factorial(n-1);}
    }
}
