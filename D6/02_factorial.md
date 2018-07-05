    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int nFactorial(int input1){
        // Read only region end
        // Write code here...
        int fact=1;
        while(input1>0) {
          fact*=input1;
          input1--;
        }
        return fact;
      }
    }
