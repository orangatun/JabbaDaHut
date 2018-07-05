    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public int isPalindrome(String input1){
        // Read only region end
        // Write code here...
        StringBuffer str=new StringBuffer(input1);
        String revStr=str.reverse().toString();
        if(input1.equalsIgnoreCase(revStr))
          return 2;
        return 1;		
      }
    }
