	#include<stdio.h>
	#include<string.h>
	// Read only region start

	int secondLastDigitOf(int input1)
	{
	    // Read only region end
		// Write code here
		if(input1/10==0)
			return -1;
		if(input1<0)
			return -1*(input1%100)/10;
		return (input1%100)/10;

	}
