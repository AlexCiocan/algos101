package main;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainShuffle {

	private static int[] seq = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	private static Logger logger = LoggerFactory.getLogger(MainShuffle.class);

	public static void main(String[] args) {
		logger.info("Starting array: " + Arrays.toString(seq));
		shuffleArray(seq);
		logger.info("Shuffled array: " + Arrays.toString(seq));
	}

	private static void shuffleArray(int[] seq) {
		Random rnd = ThreadLocalRandom.current();									// creates a random number generator wich is isolated to the current thread
		for (int i = seq.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			swapElements(seq, i, index);
		}
	}
	
	private static void swapElements(int[] seq, int i, int j) {
		int element = seq[i];
		seq[i] = seq[j];
		seq[j] = element;
	}
}
