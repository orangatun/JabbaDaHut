	#include<stdio.h>
	#include<string.h>
	// Read only region start

	int lastDigitOf(int input1)
	{
	    // Read only region end
		// Write code here
		if(input1<0)
			return -1*(input1%10);
		return input1%10;

	}
