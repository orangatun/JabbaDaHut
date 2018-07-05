    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public String secondWordUpperCase(String input1){
        // Read only region end
        // Write code here...
        String[] words=input1.trim().split(" ");
        if(words.length<2)
          return "LESS";
        return words[1].toUpperCase();
      }
    }
