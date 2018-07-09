    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int getCodeThroughStrings(String input1){
        // Read only region end
        // Write code here...
        String[] words=input1.trim().split(" ");
        int sum=0;
        for(int i=0;i<words.length;i++) {
          sum+=words[i].length();
        }
        while(sum>9) {
          sum=sumDig(sum);
        }
        return sum;
      }
      int sumDig(int num) {
        int sum=0;
        while(num>0) {
          sum+=num%10;
          num/=10;
        }
        return sum;
      }
    }
