
/*Q)Given an array of integers and a positive integer , determine the number of (i+j) pairs where (i<j) and  ar[i]+ar[j] is divisible by K.
and let the user deside size of array (int n: the length of array ) and take input (int ar[n]: an array of integers) and take input for the integer divisor (int k: the integer divisor) ar=[1,2,3,4,5,6]k=5
Three pairs meet the criteria: [1,4],[2,3], and [4,6].
Sample Input:
Enter size of array : 6
Enter element in arrayar[1]: 1
Enter element in array ar[2]:3
Enter element in array ar[3]:2
Enter element in array ar[4]:6
Enter element in array ar[5]: 1
Enter element in array ar[6]: 2
Enter an integer divisor : 3
Sample Output
The total pairs are: 5*/
import java.util.Scanner;

class DivisiblePairs {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of an array");
    int size = sc.nextInt();
    int a[] = new int[size];
    System.out.println("enter array elements");
    for (int i = 0; i < size; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("enter an integer divisor");
    int div = sc.nextInt();
    int count = 0;
    for (int i = 0; i < size; i++) {
      int sum = 0;
      for (int j = i + 1; j < size; j++) {
        if (i < j) 
        {
          if ((a[i] + a[j]) % div == 0)
          {
            count++;
          }
        }
      }
    }
    System.out.println("total number of pairs are " + count);
  }
}