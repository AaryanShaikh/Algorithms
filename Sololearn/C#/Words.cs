using System;
using System.Collections.Generic;

namespace Code_Coach_Challenge
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] words = {
                "home",
                "programming",
                "victory",
                "C#",
                "football",
                "sport",
                "book",
                "learn",
                "dream",
                "fun"
            };

            string letter = Console.ReadLine();

            int count = 0;
            int flag = 0;
            
            //your code goes here
            while ( count < 10 )
            {
             if ( words[count].Contains(letter) )
             {
             	     Console.WriteLine( words [ count ] );
flag = 1;
             }
             count++;
            }
            if ( flag == 0 )
            {
            	   Console.WriteLine( "No match");
            }
        }
    }
}