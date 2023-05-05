import java.util.*;
class maxmin{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("enter the values in the array:");
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.println("enter the Mth maximum number:");
int m=sc.nextInt();
System.out.println("enter the Nth minimum number:");
int n=sc.nextInt();
int max=0,min=0;
if(m==0)
{
System.out.println("enter the valid input");
}
else
{
max=arr[arr.length-m];
min=arr[n-1];
System.out.println("the max is:"+max);
System.out.println("the min is:"+min);
System.out.println("the sum is:"+(max+min));
System.out.println("the difference is:"+(max-min));
}
}
}

