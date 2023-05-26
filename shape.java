import java.util.*;
import java.io.*;
class shape
{
double area(double r)
{
return (3.14*r*r);
}
double area(double r,double h)
{
return (3.14*r*r*h);
}
double area(double l,double b,double h)
{
return (l*b*h);
}
public  static void  main(String[] args)
{
shape s=new shape();
System.out.println("Area is circle "+s.area(7));
System.out.println("Area of cylinder "+s.area(3,7));
System.out.println("Area of triangle "+s.area(3,4,5));
}
}
