import java.io.*;
import java.util.*;
class array
{
int positive(int a[],int n)
{
int pc=0;
for(int i=0;i<n;i++)
{
if(a[i]>0)
{
pc+=1;
}
}
return pc;
}
int negative(int a[],int n)
{
int nc=0;
for(int i=0;i<n;i++)
{
if(a[i]<0)
{
nc+=1;
}
}
return nc;
}
int even(int a[],int n)
{
int ec=0;
for(int i=0;i<n;i++)
{
if(a[i]%2==0)
{
ec+=1;
}
}
return ec;
}
int odd(int a[],int n)
{
int oc=0;
for(int i=0;i<n;i++)
{
if(a[i]%2!=0)
{
oc+=1;
}
}
return oc;
}

public static void main(String[] args)
{
array s=new array();
Scanner e=new Scanner(System.in);
System.out.println("Enter n");
int n=e.nextInt();
int a[]=new int[n];
System.out.println("Enter the array elements");
for(int i=0;i<n;i++)
a[i]=e.nextInt();
System.out.println("No of Positive numbers "+s.positive(a,n));
System.out.println("No of Negative numbers "+s.negative(a,n));
System.out.println("No of Even numbers "+s.even(a,n));
System.out.println("No of Odd numbers "+s.odd(a,n));
}
}
