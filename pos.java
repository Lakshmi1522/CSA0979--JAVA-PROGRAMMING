import java.io.*;
import java.util.*;
class pos
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int a[]=new int[10];
float nc=0,np=0,nsum=0,psum=0;
int i=0;
a[i]=sc.nextInt();
while(a[i]!=-1)
{
++i;
a[i]=sc.nextInt();
}
for(int j=0;j<a.length;j++)
{
if(a[j]<0)
{
nc++;
nsum+=a[j];
}
if(a[j]>0)
{
np++;
psum+=a[j];
}
}
float na=nsum/nc;
float pa=psum/np;
System.out.println(na);
System.out.println(pa);
}
}