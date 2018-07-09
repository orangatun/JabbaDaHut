    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int findStringCode(String input1){
        // Read only region end
        // Write code here...
        String sum="";
        String[] str=input1.trim().toUpperCase().split(" ");
        for(int i=0;i<str.length;i++) {
          sum=sum+findWordCode(str[i]);
        }
        return Integer.parseInt(sum);
      }

      String findWordCode(String word) {
        int len=word.length();
        int lenB2=len/2;
        int sum=0;
        for(int i=0;i<lenB2;i++) {
          sum+=Math.abs(word.charAt(i)-word.charAt(len-i-1));
          System.out.println((char)word.charAt(i));			
          System.out.println((char)word.charAt(len-i-1));

        }
        if(len%2==1) {
          sum+=word.charAt(lenB2)-'A'+1;
        }
        return String.valueOf(sum);

      }
    }
