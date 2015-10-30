
	import java.util.Scanner;
	import java.util.Random;

	public class dicerollll {
	   public static void main(String[] args) {
	      Scanner Scnr = new Scanner(System.in);
	      Random randGen = new Random();
	      int i = 0;          // Loop counter iterates numRolls times
	      int[] ARRAYROLL = new int[10];
	      int die1 = 0;       // Dice values
	      int die2 = 0;       // Dice values
	      int rollTotal = 0;  // Sum of dice values


	      System.out.println("Enter number of rolls: ");
	      numRolls = Scnr.nextInt();
	      while (numRolls >= 0) {
	    	 if (numRolls >= 1) {
	         // Roll dice numRoll times
	    		 for (i = 0; i < numRolls; ++i) {
	    			 die1 = randGen.nextInt(6) + 1;
	    			 die2 = randGen.nextInt(6) + 1;
	    			 rollTotal = die1 + die2;
	            
	    			 if (rollTotal == 2) {
	    				 ARRAYROLL[0] = ARRAYROLL[0] + 1;
	    			 }
	    			 else if (rollTotal == 3) {
	    				 ARRAYROLL[1] = ARRAYROLL[1] + 1;
	    			 }
	    			 else if (rollTotal == 4) {
	    				 ARRAYROLL[2] = ARRAYROLL[2] + 1;
	    			 }
	    			 else if (rollTotal == 5) {
	    				 ARRAYROLL[3] = ARRAYROLL[3] + 1;
	    			 }
	    			 else if (rollTotal == 6) {
	    				 ARRAYROLL[4] = ARRAYROLL[4] + 1;
	    			 }
	    			 else if (rollTotal == 7) {
	    				 ARRAYROLL[5] = ARRAYROLL[5] + 1;
	    			 }
	    			 else if (rollTotal == 8) {
	    				 ARRAYROLL[6] = ARRAYROLL[6] + 1;
	    			 }
	    			 else if (rollTotal == 9) {
	    				 ARRAYROLL[7] = ARRAYROLL[7] + 1;
	    			 }
	    			 else if (rollTotal == 10) {
	    				 ARRAYROLL[8] = ARRAYROLL[8] + 1;
	    			 }
	    			 else if (rollTotal == 11) {
	    				 ARRAYROLL[9] = ARRAYROLL[9] + 1;
	    			 }
	    			 else if (rollTotal == 12) {
	    				 ARRAYROLL[10] = ARRAYROLL[10] + 1;
	    			 }
	    			 System.out.println("Roll " + (i+1) + " is " + 
	    					 rollTotal + " (" + die1 + 
	    					 "+" + die2 + ")");
	         	}

	         	// Print statistics on dice rolls
	         	System.out.println("\nDice roll statistics:");
	         	System.out.println("Times rolled 2:" + ARRAYROLL[0]);
	         	System.out.println("Times rolled 3:" + ARRAYROLL[1]);
	         	System.out.println("Times rolled 4:" + ARRAYROLL[2]);
	         	System.out.println("Times rolled 5:" + ARRAYROLL[3]);
	         	System.out.println("Times rolled 6:" + ARRAYROLL[4]);
	         	System.out.println("Times rolled 7:" + ARRAYROLL[5]);
	         	System.out.println("Times rolled 8:" + ARRAYROLL[6]);
	         	System.out.println("Times rolled 9:" + ARRAYROLL[7]);
	         	System.out.println("Times rolled 10:" + ARRAYROLL[8]);
	         	System.out.println("Times rolled 11:" + ARRAYROLL[9]);
	         	System.out.println("Times rolled 12:" + ARRAYROLL[10]);
	    	 } 
	    	 else{
	    	  System.out.println("Invalid rolls. Try again.");
	      	 }
	    	 System.out.println("Enter number of rolls again:");
	    	 numRolls = Scnr.nextInt();
	      }
	      return;
	   }
	}

