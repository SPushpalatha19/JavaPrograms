/*Set Operations with User Input:
Write a program that allows a user to input a list of numbers.
Create a HashSet to store the unique numbers.
Ask the user if they want to add more numbers or perform operations like checking for containment or finding the size of the set.*/
import java.util.Scanner;
import java.util.HashSet;
class HashSetEx2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      HashSet<Integer> hs=new HashSet<Integer>();
      do{
        System.out.println(" 1.add number \n 2.finding the size \n 3.exit");
        System.out.println("enter the choice");
        int choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              System.out.println("enter the value to insert");
              int value=sc.nextInt();
              hs.add(value);
              System.out.println(value+" is added");
              break;
            case 2:
              System.out.println("size of set is "+hs.size());
              break;
            case 3:
              System.exit(0);
          }
      }while(true);
    }
  }