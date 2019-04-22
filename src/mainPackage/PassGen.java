package mainPackage;

import java.util.Scanner;

public class PassGen {

	public static int charValue, numValue, symValue;
	char[] vowels = {'a','e','i','o','u'};
	char[] constant = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	char[] symbol = {'!','@','#','$','%','^','&','*','(',')'};
	int randVowel, randX, randConstant, randNum, ranSym;
	
	public void Generator() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter number of characters.");
		charValue = userInput.nextInt(); //user Input for characters
		System.out.println("Please enter number of Symbols.");
		symValue = userInput.nextInt(); //user Input for Symbols
		System.out.println("Please enter number of numbers.");
		numValue = userInput.nextInt(); //user Input for numbers
		System.out.println("You have selected " +charValue + " characters, " +numValue + " numbers" + " and " + symValue +" symbols.");
		
// Random Char		
		for (int iCounter = 0; iCounter < charValue; iCounter++) {
			//Generate random number
			randVowel = (int) Math.round(Math.random() * 4);
			randConstant = (int) Math.round(Math.random() * 20);
			randX = (int) Math.round(Math.random() * 1);		
			
			/*
						Algorithm 
			 	constant 0 2 3 5 6 8 9 11 12 14 15
				vowel 1 4 7 10 13 16 19
			*/
			
			if ((iCounter -1) % 3 == 0) {
				System.out.print(vowels[randVowel]);
				}
			else {
				System.out.print(constant[randConstant]);
			}
				
		}
		
// Random Symbol		
		for (int iCounter = 0; iCounter < symValue; iCounter++) {
			//Generate random number
			ranSym = (int) Math.round(Math.random() * 8);
				
			System.out.print(symbol[ranSym]);

		}

// Random Number		
		for (int iCounter = 0; iCounter < numValue; iCounter++) {
			//Generate random number
			randNum = (int) Math.round(Math.random() * 9);
				
			System.out.print(randNum);

		}

		
		userInput.close();
	}
	
}
