package com.jpii.navalbattle.debug;

import java.util.concurrent.TimeUnit;

/**
 * Stopwatch class, used for measuring how long something took.
 * @author MKirkby
 *
 */
public class Timespan {
	
	private long startTime = 0;
	
	/**
	 * Initialises the stopwatch class.
	 */
	public Timespan() {
		
	}
	
	/**
	 * Starts the stopwatch.
	 */
	public void start()	{
		startTime = System.nanoTime();
	}
	
	/**
	 * Stops and resets the stopwatch, and returns the duration, in milliseconds.
	 * @return
	 */
	public long stop() {
		long duration = System.nanoTime() - startTime;
		startTime = 0;
		return TimeUnit.MILLISECONDS.convert(duration, TimeUnit.NANOSECONDS);
	}
	
	public String stopFormatted() {
		long duration = System.nanoTime() - startTime;
		startTime = 0;
		return " operation took: " + TimeUnit.MILLISECONDS.convert(duration, TimeUnit.NANOSECONDS);
	}
}
