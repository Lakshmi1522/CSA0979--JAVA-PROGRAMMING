import java.io.*;
import java.util.*;
class bin
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=0,bin=0,i=1;
while(n!=0)
{
r=n%2;
n=n/2;
bin+=r*i;
i*=10;
}
System.out.println(bin);
}
}