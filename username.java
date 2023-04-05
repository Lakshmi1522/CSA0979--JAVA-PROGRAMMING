import java.io.*;
import java.util.*;
class username
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(str1.equals(str2)==true)
        {
            System.out.println("Username is valid");
        }
        else
        System.out.println("Username is invalid");
    }
}