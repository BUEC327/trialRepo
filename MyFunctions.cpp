#include<iostream>
#include<cmath>

using namespace std;


//Start myPow function
double myPow(double x, int n)
{
	int result = x;
	for (int i = 1; i < n; i++)
	{
		result = result * x;
	}	
	return result;
}

double myLog(double x)
{
	int N = 1; //initialze variable for iterations
	int stop; //initialize variable for how many iterations
	
}
