    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public long nthFibonacci(int input1){
        // Read only region end
        // Write code here...
        int prev=0,next=1;
        for(int i=1;i<input1;i++) {
          next=next+prev;
          prev=next-prev;
        }
        return prev;
      }
    }
