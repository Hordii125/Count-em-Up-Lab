
package org.example;



public class App {

    public static void main(String[] args) {
        //Creates an object of the Counter class
        GroceryCounterClass counter = new GroceryCounterClass();

        //display initial values
        System.out.println("Initial total: " + counter.currentTotal());
        System.out.println("Count overflow: " + counter.getCountOverflow());

        counter.hundredths();
        counter.tens();
        counter.ones();
        counter.ones();

        System.out.println("Current total: " + counter.currentTotal());
        System.out.println("Count overflow: " + counter.getCountOverflow());

        // Reset the counter
        counter.resetCounter();
        System.out.println("Counter reset.");
        System.out.println("Current total after reset: " + counter.currentTotal());
        System.out.println("Count overflow after reset: " + counter.getCountOverflow());


    }
}
