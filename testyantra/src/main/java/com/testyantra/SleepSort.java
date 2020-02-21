package com.testyantra;

import java.util.concurrent.CountDownLatch;

public class SleepSort {
	public static void sleepSortAndPrint(int[] nums) {
		final CountDownLatch  doSignal = new CountDownLatch(nums.length);
		for(final int num:nums) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					doSignal.countDown();
					try {
						doSignal.await();
						Thread.sleep(num*500);
						System.out.println(num);
						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}).start();
		}
	}
 
	public static void main(String[] args) {
		int[] nums ={7, 3, 2, 1, 0, 5};
		for (int i = 0; i < args.length; i++)
			nums[i] = Integer.parseInt(args[i]);
		sleepSortAndPrint(nums); 
	}

}
