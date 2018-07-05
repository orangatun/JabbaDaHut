	import java.io.*;
	import  java.util.*;

	// Read only region start
	class UserMainCode
	{

		public int createPIN(int input1,int input2,int input3){
			// Read only region end
			// Write code here...
			int num[]={input1,input2,input3};
			int i,j,dig,finalNum=0;
			int min[]={9,9,9};
			int max=num[0]%10;
			for(i=0;i<3;i++) {
				for(j=0;j<3;j++) {
					dig=num[j]%10;
					if(dig>max)
						max=dig;
					if(dig<min[i])
						min[i]=dig;
					num[j]/=10;
				}
			}
			finalNum=max;
			for(i=2;i>=0;i--)
				finalNum=finalNum*10+min[i];
			return finalNum;
		}
	}
