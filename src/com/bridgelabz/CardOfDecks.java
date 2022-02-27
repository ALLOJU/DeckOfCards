package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class CardOfDecks {

	//method for shuffle cards
	public static String[] shuffleCardsDeck(String[] cardsArray) {
		Random random=new Random();
		int f1,f2;
		String temp;
		for(int i=0;i<52;i++) {
			f1=random.nextInt(51);
			f2=random.nextInt(51);
			if(f1!=f2) {
				temp = cardsArray[f1];
				cardsArray[f1]=cardsArray[f2];
				cardsArray[f2]=temp;
			}
			
		}
		return cardsArray;
	}

	
	

	public static void main(String[] args) {
		//declaring variables
		String[] cardType={ "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cardNumbers={ "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String[] cardsArray=new String[52];		
		Scanner sc=new Scanner(System.in);
		int start = 0, end = 12, j1 = 0;
		// for combination of cardType and cardNumbers
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				cardsArray[j] = cardType[i] + " " + cardNumbers[j1];
				j1++;
			}
			j1 = 0;
			start = end + 1;
			end += 13;
		}
		shuffleCardsDeck(cardsArray);
		
		// printing cards for 4 players

				int j2 = 0;
				for (int i = 1; i <= 4; i++) {
					System.out.print("For Player " + i + ": \n");
					for (int j = 0; j < 9; j++) {

						System.out.print(cardsArray[j2] + "-->");
						j2++;
					}
					System.out.println();
				}

	}


	
}
