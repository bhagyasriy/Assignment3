package com.core;

import java.util.Scanner;

class Guesser {
	int guessNum;

	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser, please guess the num between 1 and 10:");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Play {
	int guessNum1;
	int guessNum2;
	int guessNum3;
	int noOfPlayers;

	int guessNum1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player1, please guess the num between 1 and 10:");
		guessNum1 = scan.nextInt();
		return guessNum1;
	}

	int guessNum2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player2, please guess the num between 1 and 10:");
		guessNum2 = scan.nextInt();
		return guessNum2;
	}

	int guessNum3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player3, please guess the num between 1 and 10:");
		guessNum3 = scan.nextInt();
		return guessNum3;
	}

}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	boolean collectFromGuesser() {
		Guesser guesser = new Guesser();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean flag = false;
		numFromGuesser = guesser.guessNum();
		for (int i = 0; i < arr.length; i++) {
			if (numFromGuesser == arr[i]) {
				System.out.println("num is within the range " + numFromGuesser);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("num not in range: please eneter again");
		}
		return flag;
	}

	boolean collectFromPlayer1() {
		Play player1 = new Play();
		boolean flag = false;
		numFromPlayer1 = player1.guessNum1();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			if (numFromPlayer1 == arr[i]) {
				System.out.println("num is within the range " + numFromPlayer1);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("num not in range: please try again");
		}
		return flag;

	}

	boolean collectFromPlayer2() {
		Play player1 = new Play();
		boolean flag = false;
		numFromPlayer2 = player1.guessNum2();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			if (numFromPlayer2 == arr[i]) {
				System.out.println("num is within the range " + numFromPlayer2);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("num not in range: please try again");
		}
		return flag;

	}

	boolean collectFromPlayer3() {
		Play player1 = new Play();
		boolean flag = false;
		numFromPlayer3 = player1.guessNum3();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < arr.length; i++) {
			if (numFromPlayer3 == arr[i]) {
				System.out.println("num is within the range " + numFromPlayer3);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("num not in range: please try again");
		}
		return flag;

	}

	void compare() {

		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the game and There is a tie. Please try again");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("players 1 & 2 won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("players 1 & 3 won the game");
			} else {
				System.out.println("Player1 won the game");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the game and There is a tie. Please try again ");

			} else if (numFromGuesser == numFromPlayer1) {
				System.out.println("players 1 & 2 won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("players 2 & 3 won the game");
			}
			System.out.println("Player2 won the game");
		} else if (numFromGuesser == numFromPlayer3) {
			if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2) {
				System.out.println("All players won the game and There is a tie. Please try again ");

			} else if (numFromGuesser == numFromPlayer1) {
				System.out.println("players 1 & 3 won the game");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("players 2 & 3 won the game");
			}
			System.out.println("Player3 won the game");
		} else {
			System.out.println("Game lost: please try again");
		}
	}

}

public class GuesserGameDemoNew {

	public static void main(String[] args) {
		Umpire ump = new Umpire();

		if (ump.collectFromGuesser()) {

			if (ump.collectFromPlayer1()) {
				if (ump.collectFromPlayer2()) {
					if (ump.collectFromPlayer3()) {
						ump.compare();
					}
				}
			}
		}

	}

}
