	import java.io.*;
	import  java.util.*;

	// Read only region start
	class UserMainCode
	{

		public int addLastDigits(int input1,int input2){
			// Read only region end
			// Write code here...
			if(input1<0)
				input1*=-1;
			if(input2<0)
				input2*=-1;
			return (input1%10)+(input2%10);
		}
	}
