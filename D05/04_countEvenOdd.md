	import java.io.*;
	import  java.util.*;

	// Read only region start
	class UserMainCode
	{

		public int countEvensOdds(int input1,int input2,int input3,int input4,int input5,String input6){
			// Read only region end
			// Write code here...
			if(input6.equals("even"))
			  return 5+(((input1<<31)>>31)+((input2<<31)>>31)+((input3<<31)>>31)+((input4<<31)>>31)+((input5<<31)>>31));
		else if(input6.equals("odd"))
			  return -1*(((input1<<31)>>31)+((input2<<31)>>31)+((input3<<31)>>31)+((input4<<31)>>31)+((input5<<31)>>31));

			throw new UnsupportedOperationException("countEvensOdds(int input1,int input2,int input3,int input4,int input5,String input6)");
		}
	}
