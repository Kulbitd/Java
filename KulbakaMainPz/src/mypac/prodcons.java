package mypac;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import mypac.pz5.Mass;

public class prodcons {

	public static void main(String[] args) {
		Mass lol = new Mass();
		lol.lenghtmas(1, 14);
		BlockingQueue queue = new LinkedBlockingQueue<>(10);
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
		
	}

	public static class Consumer implements Runnable {

		private final BlockingQueue queue;

		@Override
		public void run() {

		try {
		while (true) {
		Object  take = queue.take();
		process(take);
		}
		} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
		}

		}

		private void process(Object take) throws InterruptedException {
		String[] sr = take.toString().split(",");
		
		int x = Integer.valueOf(sr[0]);
		int y = Integer.valueOf(sr[1]);
		System.out.println("[Consumer] Take : " + take.toString());
		System.out.println("[Consumer] R =  " + Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2)) );
		Thread.sleep(0,01);
		}

		public Consumer(BlockingQueue queue) {
		this.queue = queue;
		}
		}
	public static class Producer implements Runnable {
	

		private final BlockingQueue<Points> queue;
		
		
		@Override
		public void run() {

		try {
		process();
		} catch (InterruptedException e) {
		Thread.currentThread().interrupt();
		}

		}

		private void process() throws InterruptedException {
		// положить 20 дюймов в очередь
		Mass lol = new Mass();
		lol.lenghtmas(1, 14);
		for (int i = 0; i < lol.mas.length; i++) {
		System.out.println("[Producer] Put : " + lol.mas[i]);
		queue.put(lol.mas[i]);
		Thread.sleep(1);
		}

		}

		public Producer(BlockingQueue queue) {
		this.queue = queue;
		}
		}
}
