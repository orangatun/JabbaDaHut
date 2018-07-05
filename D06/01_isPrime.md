
    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int isPrime(int input1){
        // Read only region end
        // Write code here...
        if((input1==2)||(input1==3))
          return 2;
        if(input1%2==0)
          return 1;
        int inSq=(int)Math.sqrt(input1)+1;
        for(int i=3;i<inSq;i++) {
          if(input1%i==0)
            return 1; 
        }  
        return 2;

      }
    }
