/**
 * 
 */
package com.ss.lesson.four.two;

/**
 * @author estringer
 *
 */
public class Deadlock {

	static class Duck {
		private final String name;
		private final String feathers;
		public Duck(String name, String feathers) {
			this.name = name;
			this.feathers = feathers;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @return the feathers
		 */
		public String getFeathers() {
			return feathers;
		}
		public synchronized void quack(Duck quacker) {
			System.out.format("%s: %s" + " has quacked to me!%n", this.name, quacker.getName());
			quacker.quackBack(this);
		}
		public synchronized void quackBack(Duck quacker) {
			System.out.format("%s: %s" + " has quacked back to me!%n", this.name, quacker.getName());
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Duck ducky = 
				new Duck("Ducky", "Yellow");
		final Duck mallard =
				new Duck("Mallard", "Green");
		new Thread(new Runnable() {
			public void run() { ducky.quack(mallard); }
		}).start();
		new Thread(new Runnable() {
			public void run() { mallard.quack(ducky); }
		}).start();
	}

}
