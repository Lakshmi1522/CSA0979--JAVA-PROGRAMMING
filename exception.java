import java.io.*;
import java.util.*;
class exception
{
public static void main(String args[])
{
int a=10,b=0;
try
{
int c=a/b;
System.out.println(c);
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic exception is arrived");
}
int d[]={1,2};

try
{

System.out.println(d[5]);
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array index out of range exception is arrived");
}

String s= null;

try
{
System.out.println(s.length());
}
catch(NullPointerException e)
{
System.out.println("Null pointer exception is arrived");
}
}
}

