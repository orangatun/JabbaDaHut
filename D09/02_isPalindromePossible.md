    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int isPalinNumPossible(int input1){
        // Read only region end
        // Write code here...
        boolean dig[]=new boolean[10];
        int count=0;
        while(input1>0) {
          if(dig[input1%10])
            dig[input1%10]=false;
          else
            dig[input1%10]=true;
          input1/=10;
        }
        for(int i=0;i<10;i++) {
          if(dig[i])
            count++;
        }
        if(count<=1)
          return 2;
        return 1;
      }
    }
