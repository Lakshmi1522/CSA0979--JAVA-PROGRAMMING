import java.util.*;
class equivalent{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the binary number");
String binary=sc.nextLine();
int decimal=Integer.parseInt(binary,2);
System.out.println("decimal equivalent:"+decimal);
String octal=Integer.toOctalString(decimal);
System.out.println("equivalent octal:"+octal);
}
} 