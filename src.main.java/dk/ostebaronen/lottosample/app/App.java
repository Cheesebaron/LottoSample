package dk.ostebaronen.lottosample.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		int sampleSize = 7;
		ArrayList<Integer> test = 
				createArrayList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36});

		getRandomSample(test, sampleSize);
	}
	
	public static ArrayList<Integer> createArrayList(int[] array) {
		ArrayList<Integer> returnVal = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) returnVal.add(array[i]);
		
		return returnVal;
	}
	
	public static void getRandomSample(ArrayList<Integer> input, int sampleSize) {
		Random rand = new Random();
		int output[] = new int[sampleSize];
		
		for (int i = 0; i < sampleSize; i++) output[i] = input.remove(rand.nextInt(input.size()));
		
		Arrays.sort(output);
		
		for (int j = 0; j < output.length; j++)
            System.out.print(output[j] + " ");
	}
}
