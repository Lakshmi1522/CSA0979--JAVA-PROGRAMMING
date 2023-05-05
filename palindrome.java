import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String r="";
for(int i=s.length()-1;i>=0;i--)
{
r=r+s.charAt(i);
}
if(r.equals(s))
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}