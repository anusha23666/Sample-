public class Prime
{
public static void main(String[] args) 
{
System.out.print("Prime numbers from 1 to 100 are:");
for (int num= 2; num <= 100;)
{
if (isPrime(num))
{
System.out.print(num+" ");
}
}
}
public static boolean isPrime(int num)
{ 
if (num <=1 )	
return false;
for (int i = 2; i <= Math.sqrt(n); i++) 
{
if (num % i == 0) 
return false; 
}          
return true;
}
}               
            