    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int MostFrequentDigit(int input1,int input2,int input3,int input4){
        // Read only region end
        // Write code here...
        StringBuffer num=new StringBuffer();
        int dig[]=new int[10];
        num.append(input1);
        num.append(input2);
        num.append(input3);
        num.append(input4);
        int len=num.length();
        for(int i=0;i<len;i++) {
          dig[(int)(num.charAt(i)-'0')]++;
        }
        int max=0,n=0;
        for(int j=9;j>=0;j--) {
          if(dig[j]>max) {
            max=dig[j];
            n=j;
          }
        }
        return n;
      }
    }
