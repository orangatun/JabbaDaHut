    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int digitSum(int input1){
        // Read only region end
        // Write code here...
        int sum=input1%10;
        while(input1/10!=0) {
          input1/=10;
          sum+=input1%10;
        }
        if(sum/10!=0)
          sum=digitSum(sum);
        return sum;
      }
    }
