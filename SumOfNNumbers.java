import java.util.Scanner;
class SumOfNaturalNumbers {

   public static void main(String[] args) 
    {

       System.out.println("Enter n value: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       int naturalNumbersSum = 0;

       int index = 1;

       while (index <= n) 
        {
        naturalNumbersSum += index;
        index++;
        }
          System.out.println("Fom User Input using for loop: Sum of frist 100 numbers: " + naturalNumbersSum);
    }
}