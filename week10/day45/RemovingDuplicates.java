/*Removing Duplicates:
Given an array of integers, write a Java program to convert it into a Set to remove duplicates.
Convert the Set back to an array and print the unique values.*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
class RemovingDuplicates
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      ArrayList<Integer> al=new ArrayList<Integer>();
      System.out.println("how many integers you want to store");
      int length=sc.nextInt();
      System.out.println("enter the elements");
      for(int i=0;i<length;i++)
        {
          int value=sc.nextInt();
          al.add(value);
        }
     // System.out.println(al);
      HashSet<Integer> hs=new HashSet<Integer>(al);
     // System.out.println(hs);
      ArrayList<Integer> al1=new ArrayList<Integer>(hs);
      System.out.println(al1);
    }
  }