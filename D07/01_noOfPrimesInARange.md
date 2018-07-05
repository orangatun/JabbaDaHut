    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int countPrimesInRange(int input1,int input2){
        // Read only region end
        // Write code here...
        int count=0;
        if(input1==2) {
          count++;
          input1=3;
        }
        if((input1==3)&&(input2>=3)) {
          count++;
          input1=4;
        }
        if(input1%2==0) {
          input1++;
        }
        for(int i=input1;i<=input2;i=i+2) {
          if(isPrime(i))
            count++;
        }
        return count;
      }
      boolean isPrime(int n) {
        int numSqRt=(int)Math.sqrt(n)+1;
        if(n%2==0)
          return false;
        for(int i=3;i<numSqRt;i=i+2) {
          if(n%i==0)
            return false;
        }
        return true;
      }
    }
