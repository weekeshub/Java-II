package cs152.hw5;

// Andrew Weekes
// CS 152
// Homework 5

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) throws IOException {

		// new LinkedList for dictionary
		LinkedList head = new LinkedList("");

		// read each line of file
		File file = new File("Dictionary.txt");
		Scanner scan = new Scanner(file);

		// scan each line
		while (scan.hasNextLine()) {
			String line = scan.nextLine();

			// add word to linked list if length >= 5 or length <= 12
			if (line.length() >= 5 && line.length() <= 12) {
				head.addAtFront(line);
			}
		}

		// generate random index, return value at that index
		double random = (Math.random() * head.size());
		String word = head.getIndexData((int) random);

		// convert "word" to an array
		char[] array = (word.toCharArray());

		// declare new array that is the same length as word array
		char[] array2 = new char[array.length];

		// declare new array for guessed letters
		char[] array3 = new char[6];

		// print array, which is the word
//		for (int index = 0; index < array.length; index++) {
//			System.out.print(array[index]);
//		}
//		System.out.print("\n");

		// change the values in array2 to "_"
		for (int index = 0; index < array2.length; index++) {
			array2[index] = '_';
		}
		System.out.print("\n");

		// is guess correct?
		boolean correct;

		// counter for number of wrong guesses
		int wrong = 0;

		// ask for letters until wrong == 6
		while (wrong <= 6) {

			// print current array2
			for (int index = 0; index < array2.length; index++) {
				System.out.print(array2[index] + " ");
			}

			// ask for letter
			Scanner scan2 = new Scanner(System.in);
			System.out.print("\n\nEnter a letter: ");
			char guess = scan2.next().charAt(0);
			correct = false;

			// fill in array2 with guess if correct
			for (int index = 0; index < array2.length; index++) {
				if (array[index] == guess) {
					array2[index] = guess;
					correct = true;
				}
			}

			if (correct) {
				System.out.print("\n\n\n");
			}

			// if guess is wrong, increment wrong counter
			if (!correct) {
				wrong++;

				// if wrong == 1, print head and letter guessed
				if (wrong == 1) {
					printHead();
					System.out.print("Letters guessed: ");
					for (int index = 0; index < array3.length; index++) {
						array3[0] = guess;
						System.out.print(array3[index]);
					}
					System.out.print("\n\n");

					// if wrong == 2, print body and letter guessed
				} else if (wrong == 2) {
					printBody();
					System.out.print("Letters guessed: ");
					for (int index = 0; index < array3.length; index++) {
						array3[1] = guess;
						System.out.print(array3[index]);
					}
					System.out.print("\n\n");

					// if wrong == 3, print left arm and letter guessed
				} else if (wrong == 3) {
					printLeftArm();
					System.out.print("Letters guessed: ");
					for (int index = 0; index < array3.length; index++) {
						array3[2] = guess;
						System.out.print(array3[index]);
					}
					System.out.print("\n\n");

					// if wrong == 4, print right arm and letter guessed
				} else if (wrong == 4) {
					printRightArm();
					System.out.print("Letters guessed: ");
					for (int index = 0; index < array3.length; index++) {
						array3[3] = guess;
						System.out.print(array3[index]);
					}
					System.out.print("\n\n");

					// if wrong == 5, print left leg and letter guessed
				} else if (wrong == 5) {
					printLeftLeg();
					System.out.print("Letters guessed: ");
					for (int index = 0; index < array3.length; index++) {
						array3[4] = guess;
						System.out.print(array3[index]);
					}
					System.out.print("\n\n");

					// if wrong == 6, print right leg and letter guessed
				} else if (wrong == 6) {
					printRightLeg();
					System.out.print("Letters guessed: ");
					for (int index = 0; index < array3.length; index++) {
						array3[5] = guess;
						System.out.print(array3[index]);
					}
					System.out.print("\n\n");
				}

			}

			// if no more attempts, print "you lost", what the word was, and break out of
			// loop
			if (wrong == 6) {
				System.out.print("\nOh no! You have run out of attempts. The word was: ");
				for (int index = 0; index < array.length; index++) {
					System.out.print(array[index]);
				}
				break;
			}

			// if all letters are guessed correctly, announce winner, print word, and break
			// out of loop"
			if (Arrays.equals(array, array2)) {
				System.out.print("Winner! You have guessed the word correctly! It was: ");
				for (int index = 0; index < array.length; index++) {
					System.out.print(array[index]);
				}
				break;
			}
		}
	}


	// methods to print current stage of Hangman
	
	public static void printHead() {
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("          |    	     ");
		System.out.println("    ______|_____ 	 ");
		System.out.println("   /            \\   ");
		System.out.println("  /    O    O    \\  ");
		System.out.println("  \\      __      /  ");
		System.out.println("   \\____________/   ");
		System.out.println("\n                   ");
	}

	public static void printBody() {
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("          |    	     ");
		System.out.println("    ______|_____ 	 ");
		System.out.println("   /            \\   ");
		System.out.println("  /    O    O    \\  ");
		System.out.println("  \\      __      /  ");
		System.out.println("   \\____________/   ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("\n                   ");
	}

	public static void printLeftArm() {
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("          |    	     ");
		System.out.println("    ______|_____ 	 ");
		System.out.println("   /            \\   ");
		System.out.println("  /    O    O    \\  ");
		System.out.println("  \\      __      /  ");
		System.out.println("   \\____________/   ");
		System.out.println("          |          ");
		System.out.println("  \\       |         ");
		System.out.println("   \\      |         ");
		System.out.println("    \\_____|         ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("\n                   ");
	}

	public static void printRightArm() {
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("          |    	     ");
		System.out.println("    ______|_____ 	 ");
		System.out.println("   /            \\   ");
		System.out.println("  /    O    O    \\  ");
		System.out.println("  \\      __      /  ");
		System.out.println("   \\____________/   ");
		System.out.println("          |          ");
		System.out.println("  \\       |      /  ");
		System.out.println("   \\      |     /   ");
		System.out.println("    \\_____|____/    ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("\n                   ");
	}

	public static void printLeftLeg() {
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("          |    	     ");
		System.out.println("    ______|_____ 	 ");
		System.out.println("   /            \\   ");
		System.out.println("  /    O    O    \\  ");
		System.out.println("  \\      __      /  ");
		System.out.println("   \\____________/   ");
		System.out.println("          |          ");
		System.out.println("  \\       |      /  ");
		System.out.println("   \\      |     /   ");
		System.out.println("    \\_____|____/    ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("         /           ");
		System.out.println("        /            ");
		System.out.println("       /             ");
		System.out.println("      /              ");
	}

	public static void printRightLeg() {
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("\n                   ");
		System.out.println("          |    	     ");
		System.out.println("    ______|_____ 	 ");
		System.out.println("   /            \\   ");
		System.out.println("  /    O    O    \\  ");
		System.out.println("  \\      __      /  ");
		System.out.println("   \\____________/   ");
		System.out.println("          |          ");
		System.out.println("  \\       |      /  ");
		System.out.println("   \\      |     /   ");
		System.out.println("    \\_____|____/    ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("          |          ");
		System.out.println("         / \\        ");
		System.out.println("        /   \\       ");
		System.out.println("       /     \\      ");
		System.out.println("      /       \\     ");
	}

}
