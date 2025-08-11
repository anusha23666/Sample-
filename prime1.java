public class Prime
{
public static void main(String[] args) 
{
System.out.print("Prime numbers from 1 to 10 are:");
for(int i=2;i<=100;i++)
{
if(isPrime(i))
{
System.out.print(i+" ");
}
}
}
public static boolean isprimet(int num)
{ 
if (num<2)	
return false;
for(int i=2;i<= Math.sqrt(num);+) 
{
if(num%i==0) 
return false; 
}          
return true;
}
}               
            