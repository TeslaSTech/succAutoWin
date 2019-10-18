/*
It is way better to execute this from the command line using the:
java -Xmx16384M Main.java
so that it has actual ram to eat instead of starving.
So all I have to say is that you NEED to run this with commands for the most 
EPIC experience and an actual crash.
**/

import java.util.Scanner;
import java.lang.Math.*;
import java.util.Vector;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
//Change this number when adding new Crashers
    int deathNum = 2;
    Main oof = new Main();
//Intro
   	while (true) {
		oof.RamEater();
	}
//The Crashers
  }
  
  public void consoleSpam(int oof) {
    double a = 1;
    double b = 2;
    double c = 3;
    double d = 4;
    double e = 5;

    while (true) {
      a = a + Math.random()*100000;
      b = b + Math.random()*10000;
      c = c + Math.random()*1000;
      d = d + Math.random()*100;
      e = e + Math.random()*10;
      double fortnite = 1;
      fortnite = fortnite + a + b + c + d + e;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(fortnite);
    }
  }
  public void RamEater() {
    // literally found this gem online
    
    try {
		Runtime rt = Runtime.getRuntime();
		long freeMem = rt.freeMemory()/1000000;
		Vector v = new Vector();
		while (true) {
    while ((rt.freeMemory()/1000000) > 10)
      {
		byte b[] = new byte[1048576];
        v.add(b);
        System.out.println( "free memory (MB): " + (rt.freeMemory()/1000000) );
      }
		}
		
	  
    }
    catch (Exception e) {
      System.out.println("You ran out of free memory!");
    }
    finally {
      System.out.println("Wack dude it crashes and then runs out of memory.");
    }
  }
  
}