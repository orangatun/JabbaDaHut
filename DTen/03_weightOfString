    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int weightOfString(String input1,int input2){
        // Read only region end
        // Write code here...
        String str=input1.trim().toUpperCase();
        if(input2==0)
          return weightAll(str) - weightVowel(str);
        else 
          return weightAll(str);
      }

      int weightAll(String str) {
        int len= str.length();
        int weight=0;
        char ch;
        for(int i=0;i<len;i++) {
          ch=str.charAt(i);
          if(Character.isUpperCase(ch))
            weight+=ch-'A'+1;
        }
        return weight;
      }

      int weightVowel(String str) {
        int len=str.length();
        int weight=0;
        char ch;
        for(int i=0;i<len;i++) {
          ch=str.charAt(i);
          switch(ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':weight+=ch-'A'+1;break;
            default:
          }
        }
        return weight;
      }
    }
