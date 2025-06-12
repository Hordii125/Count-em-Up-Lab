package org.example;

public class GroceryCounterClass {
    private int digits[];

    private int count_overflow;

    //Constructor for GroceryCounter
    public GroceryCounterClass() {
        this.digits = new int[4];
        this.count_overflow = 0;
    }

    //Method that zeroes the counter
    public void resetCounter() {
        for (int i = 0; i < 4; i++) {
            digits[i] = 0;
        }
    }

    //Method that changes the digits of the counter
    public void CountAction(int digitIndex) {
        digits[digitIndex]++;
        for (int i = digitIndex; i < 4; i++) {
            if (digits[i] > 9) {
                digits[i] = 0;
                if (i < 3) {
                    digits[i - 1]++;
                } else {
                    resetCounter();
                    count_overflow++;
                }
            }
        }

    }

    //That returns how many times the counter has overflowed
    public int getCountOverflow() {
        return count_overflow;
    }

    //first digit 
    public void tens(){
        CountAction(0);
    }

    //second digit
    public void ones(){ 
        CountAction(1);
    }

    //third digit
    public void tenths(){
        CountAction(2);
    }

    //fourth digit
    public void hundredths(){
        CountAction(3);
    }

    //method to display the current total in a formatted string
    public String currentTotal() {
        int tens = digits[0]; //$10 bills
        int ones = digits[1]; //$1 bills
        int tenths = digits[2]; //10 cents
        int hundredths = digits[3]; //1 cent 

        int dollars = tens * 10 + ones; //00.
        int cents = tenths * 10 + hundredths; //.00

        return String.format("$%d.%02d", dollars, cents);
    }
}