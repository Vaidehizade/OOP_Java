package mypackage1;

import java.util.*;
import java.util.Scanner;
public class Gfg_1_basic_input 
{
   public int age = 35;
   private int salary = 40000;
   protected String name = "Vaidehi";
   String address ;
   public void getdata()
   {
	   System.out.println(age +" "+ salary +" " + name +" "+ address);
   }
	public static void main(String[] args) {
		
		Gfg_1_basic_input g = new Gfg_1_basic_input();
		
		g.getdata();
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       System.out.println("int "+ a);
       
       float b = sc.nextFloat();
       System.out.println("float "+b);
       
       double d = sc.nextDouble();
       System.out.println("double "+d);
       
       byte c = sc.nextByte();
       System.out.println("byte "+c);
       
       long e = sc.nextLong();
       System.out.println("long "+e);
       
       String s = sc.next();
       char ch = s.charAt(0);
       System.out.println("char "+ch); 
       
       
	}
}

//sizeof()
//public class SizeOf
//{
//	public static void main(String args[]) {
//
//        System.out.println(" size of byte in Java is (in bytes) :  "
//    + sizeof(byte.class));
//        System.out.println(" size of short in Java is (in bytes) :" 
//    + sizeof(short.class));
//        System.out.println(" size of char in Java is (in bytes) :" 
//    + sizeof(char.class));
//        System.out.println(" size of int in Java is (in bytes) :" 
//    + sizeof(int.class));
//        System.out.println(" size of long in Java is (in bytes) :" 
//    + sizeof(long.class));
//        System.out.println(" size of float in Java is (in bytes) :" 
//    + sizeof(float.class));
//        System.out.println(" size of double in Java is (in bytes) :" 
//    + sizeof(double.class));
//
//    }
//	
//}




