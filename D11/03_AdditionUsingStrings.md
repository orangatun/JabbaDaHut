    import java.io.*;
    import  java.util.*;

    // Read only region start
    class UserMainCode
    {

      public String addNumberStrings(String input1,String input2){
        // Read only region end
        // Write code here...
        int len1=input1.length();
        int len2=input2.length();
        int lenMax=len1;
        StringBuffer str1=new StringBuffer(input1);
        StringBuffer str2=new StringBuffer(input2);
        StringBuffer sumStr=new StringBuffer();
        if(len1>len2) {
          lenMax=len1;
          do {
            str2.insert(0,"0");
            len2++;
          }while(len1>len2);
        }
        if(len2>len1) {
          lenMax=len2;
          do {
            str1.insert(0,"0");
          }while(len2>len1);
        }
        System.out.println(str1);
        System.out.println(str2);

        int count=lenMax/8;
        int car=0;
        int num1,num2;
        //int sum=
        int startIndex,endIndex=lenMax;
        for(int i=1;i<=count;i++) {
          startIndex=lenMax-(i*8);
          num1=Integer.parseInt(str1.substring(startIndex,endIndex));
          num2=Integer.parseInt(str2.substring(startIndex,endIndex));//lenMax-(8*(i-1))-1,lenMax-(8*i)-1));
          endIndex=startIndex;
          //System.out.println((num1+num2+car)/100000000==0);
          sumStr.insert(0,(num1+num2+car));
          if((num1+num2+car)/100000000!=0) {
              car=sumStr.charAt(0)-'0';
              sumStr.deleteCharAt(0);
          }
          else car=0;
          System.out.println(num1+" "+num2);
        }
        startIndex=0;
        num1=Integer.parseInt(str1.substring(startIndex,endIndex));
        num2=Integer.parseInt(str2.substring(startIndex,endIndex));//lenMax-(8*(i-1))-1,lenMax-(8*i)-1));
        sumStr.insert(0,(num1+num2+car));
        System.out.println(num1+" "+num2);
        System.out.println(sumStr);

        return sumStr.toString();


      }
    }
    
NOTE: This code has issues.
