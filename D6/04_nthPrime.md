    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int NthPrime(int input1){
        // Read only region end
        // Write code here...
        if(input1==1)   
          return 2;
        if(input1==2)
          return 3;
        int num=3;
        for(int i=2;i<=input1;) { 
          //i is 2 because two prime numbers are already considered(2 and 3)
          if(isPrime(num))
            i++;
          num+=2;
        }
        return num-2;
      }

      boolean isPrime(int n) {
        int numSqRt=(int)Math.sqrt(n) +1;
        if(n%2==0)
          return false;
        for(int i=3;i<numSqRt;i=i+2) {
          if(n%i==0)
            return false;
        }
        return true;
      }
    }
