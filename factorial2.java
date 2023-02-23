
/**
 * Write a description of class factorial2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class factorial2
{
    public double factorial2(int n)
    {
        double result;
        if (n==0||n==1){
         result=1;
        }else{
            result=n*factorial2(n-1);
        }
        return result;
    }
}
