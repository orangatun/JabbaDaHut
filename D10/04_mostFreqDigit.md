    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int MostFrequentDigit(int input1,int input2,int input3,int input4){
        // Read only region end
        // Write code here...
        int num[]={input1,input2,input3,input4};
        int dig[]=new int[10];
        for(int i=0;i<4;i++) {
          while(num[i]>0) {
            dig[num[i]%10]++;
            num[i]/=10;
          }
        }
        int maxOccur=0,result=9;
        for(int i=9;i>=0;i--) {
          if(dig[i]>maxOccur) {
            maxOccur=dig[i];
            result=i;
          }
        }
        return result;
      }
    }
    
    
    NOTE: This code fails Test Case 9.
