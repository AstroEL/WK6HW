package week6HW;

	/*
	 * 	 * Create a class named App that has a main method.
	 * In this class instantiate an instance of each of your classes that implement Logger.
	 * Test both methods on each instance.
	 * 
	 */

public class App {
	static Logger Logger;
	public static void main(String[] args) {
		
		Logger loggerA = new AsterikLogger();
		Logger loggerS = new SpacedLogger();
		
		loggerA.log("Hello");
		loggerA.error("OH NO");
		
		loggerS.log("WARNING");
		loggerS.error("WARNING");
		
	}

}
