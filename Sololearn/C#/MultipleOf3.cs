using System;
using System.Collections.Generic;


namespace SoloLearn
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = Convert.ToInt32(Console.ReadLine());
            
            //your code goes here
            string result = "";
            int i = 1 ;
            
            while ( i <= number )
            {
            	if ( i % 3 == 0 )
            	{
            		result = result + '*';
            	}
            	else
            	{
            		result = result + i.ToString();
            	}
            	i++;
            }
            
            Console.WriteLine ( result );
            
        }
    }
}