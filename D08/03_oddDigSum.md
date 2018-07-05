    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int OddDigitsSum(int input1){
        // Read only region end
        // Write code here...
        int sum=0;
        while(input1>0) {
          if(input1%2==1)
            sum+=input1%10;
          input1/=10;
        }
        return sum;
      }
    }
