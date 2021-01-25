package labAssignment2;

import java.util.Scanner;

public class moviePrediction {
	public static void main(String[] args) {
		int[][] trainData = { { 100, 0, 0 }, { 0, 100, 1 }, { 90, 17, 0 }, { 21, 80, 1 } };
		double[] distanceArray = { 0, 0, 0, 0 };

		double tempX, tempY, tempDob;
		int positionInt;

		Scanner sc = new Scanner(System.in);

		for (int k = 0; k < 3; k++) {
			int usrX = sc.nextInt();
			int usrY = sc.nextInt();
			for (int i = 0; i <= 3; i++) {
				tempX = (usrX - trainData[i][0]);
				tempX *= tempX;

				tempY = (usrY - trainData[i][1]);
				tempY *= tempY;

				tempDob = tempX + tempY;
				tempDob = Math.sqrt(tempDob);

				distanceArray[i] = tempDob;
			}

			tempDob = distanceArray[0];
			positionInt = 0;

			for (int j = 1; j <= 3; j++) {
				if (distanceArray[j] < tempDob) {
					positionInt = j;
				}
			}

			if (trainData[positionInt][2] > 0) {
				System.out.println("Comedy");
			} else {
				System.out.println("Action");
			}
		}
		sc.close();
	}
}
