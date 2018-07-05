    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int EvenOddDigitsSum(int input1,String input2){
        // Read only region end
        // Write code here...
        int i=0;
        if(input2.equals("odd"))
          i=1;
        int sum=0;
        while(input1>0) {
          if(input1%2==i)
            sum+=input1%10;
          input1/=10;
        }
        return sum;

      }
    }
