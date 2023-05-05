import java.util.*;
class atmmachine{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st denomination:");
int a=sc.nextInt();
System.out.println("enter the total no  of notes:");
int b=sc.nextInt();
int c=a*b;
System.out.println("enter the 2nd denomination");
int d=sc.nextInt();
System.out.println("enter the total number of notes");
int e=sc.nextInt();
int f=d*e;
System.out.println("enter the 3rd denomination");
int g=sc.nextInt();
System.out.println("enter the total number of notes");
int h=sc.nextInt();
int i=g*h;
System.out.println("enter the 4th denomination");
int j=sc.nextInt();
System.out.println("enter the total number of notes");
int k=sc.nextInt();
int l=j*k;
int m=c+f+i+l;
System.out.println("Total available balance in ATM:"+m);
}
}