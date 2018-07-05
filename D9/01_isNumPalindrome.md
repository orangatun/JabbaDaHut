    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int isPalinNum(int input1){
        // Read only region end
        // Write code here...
        int palin=0;
        for(int i=input1;i>0;i/=10) {
          palin=(palin*10)+i%10;
        }
        if(input1==palin)
          return 2;
        return 1;
      }
    }
