    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int uniqueDigitsCount(int input1){
        // Read only region end
        // Write code here...
        int count=0;
        boolean dig[]=new boolean[10];
        while(input1>0) {
          dig[input1%10]=true;
          input1/=10;
        }
        for(int i=0;i<10;i++) {
          if(dig[i])
            count++;
        }
        return count;
      }
    }
