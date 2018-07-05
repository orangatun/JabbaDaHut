    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int nonRepeatDigitsCount(int input1){
        // Read only region end
        // Write code here...
        int dig[]=new int[10];
        int count=0;
        while(input1>0) {
          dig[input1%10]++;
          input1/=10;
        }
        for(int i=0;i<10;i++) {
          if(dig[i]==1)
            count++;
        }
        return count;
      }
    }
