package revision;

import practice_array.Mock;

public class Mock2 {
	    public static void main(String[] args) {
	      int num=121;
	     int r;
	     
	       int t=num;
	      int rev = 0;
	      while(num>0)
	      {
	          r=num%10;
	          rev=(rev*10)+r;
	          num=num/10;
	      }
	      if(rev==t)
	      {
	      System.out.println("Palindrom");
	      }
	      else{
	      System.out.println("Not Palindrom");
	          }
	}
	}

