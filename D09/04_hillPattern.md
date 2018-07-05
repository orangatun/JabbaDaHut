    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int totalHillWeight(int input1,int input2,int input3){
        // Read only region end
        // Write code here...
        int sum=0;
        int rowWeight=input2;
        for(int i=1;i<=input1;i++) {
          sum+=rowWeight*i;
          rowWeight+=input3;
        }
        return sum;
      }
    }
