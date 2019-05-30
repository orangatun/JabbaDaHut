
    import java.io.*;
    import  java.util.*;
    
    class PrimeCheckClass
    {
    
      public static void main(String[] args) {
    
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number to check if it is a prime: ");
        int num = Integer.parseInt(obj.readLine());
        if(isPrime(num) == 2) {
          System.out.println("It is a prime number");
        }
        else {
          System.out.println("It is NOT a prime number");
        }
      }
      
      /*
      This function returns 2 if the number is prime. And 1 if it is not prime.
      The code assumes that the input value is greater than 1 since 1 is neither prime nor composite.
      We only need to run the loop till the square root value of the number input.
      */
      
      public int isPrime(int input1) {
    
        if((input1==2)||(input1==3))
          return 2;
        if(input1%2==0)
          return 1;
        int inputSqRt=(int)Math.sqrt(input1)+1;
        for(int i=3;i<inputSqRt;i++) {
          if(input1%i==0)
            return 1; 
        }  
        return 2;
      }
    }
