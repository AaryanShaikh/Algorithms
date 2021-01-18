using System;
using System.Collections.Generic;

namespace Code_Coach_Challenge
{
    class Program
    {
        static void Main(string[] args)
        {
            string postText = Console.ReadLine();

            Post post = new Post();
            post.Text = postText;
            post.ShowPost();

        }
    }

    class Post
    {
        private string text;
        
        //write a constructor here
        public Post()
        {
        	Console.WriteLine("New post");
        }
        

        public void ShowPost()
        {
            Console.WriteLine(text);
        }
        
        //write a property for member text
        public string Text
        {
        	  get { return text; }
        	  set { text = value;}
        }
        
    }
}