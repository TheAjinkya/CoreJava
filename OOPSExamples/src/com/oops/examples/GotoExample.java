package com.oops.examples;

class GotoExample {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			System.out.println("The round number " + i);
			if (i == 5) {

				break;
			}

		}
		{
			MyNote:

			System.out.println("Five rounds Completed and you are out of the Loop!");
		}

	}

}