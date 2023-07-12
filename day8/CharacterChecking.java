import java.util.Scanner;
class CharacterChecking
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
       if(((ch<='Z')&&(ch>='A'))||((ch<='z')&&(ch>='a')))
      {
        System.out.println("Given character is an alphabet");
      }
      else if((ch<='9')&&(ch>='0'))    
      {
        System.out.println("Given character is a digit");
      }
      else 
      {
        System.out.println("Given character is a special character");
      }
    }
  }