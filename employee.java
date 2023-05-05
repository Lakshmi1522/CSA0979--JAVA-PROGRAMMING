import java.util.*;
class employee{
public static void main(String[] args)
{
double bonus,bonus1,paid;
Scanner sc=new Scanner(System.in);
System.out.println("enter the salary:");
double sal=sc.nextDouble();
System.out.println("enter the grade:");
char gra=sc.next().charAt(0);
if(gra=='A' && sal>10000)
{
bonus=(sal*5)/100+sal;
paid=sal+bonus;
System.out.println("tha bonus of grade A:"+bonus);
System.out.println("the paid amount of grade A is:"+paid);
}
else if(gra=='B' &&  sal>10000)
{
bonus=sal*(0.1)+sal;
paid=sal+bonus;
System.out.println("the bonus of grade B is:"+bonus);
System.out.println("the paid amount of grade B is:"+paid);
}
else if(gra=='A' && sal<=10000)
{
bonus=sal*(0.05)+sal;
paid=sal+bonus;
System.out.println("the bonus of garde A is:"+bonus);
System.out.println("the paid amount with garde A extra 2% is:"+paid);
}
else if(gra=='b' && sal<=10000)
{
bonus=sal*(0.1);
bonus1=sal*(0.2);
paid=sal+bonus+bonus1;
System.out.println("the bonus of grade B is:"+bonus);
System.out.println("tje paid amount with grade B extra 2% is:"+paid);
}
else
{
System.out.println("there is no bonus");
System.out.println("the salary is"+sal);
}
}
}
  