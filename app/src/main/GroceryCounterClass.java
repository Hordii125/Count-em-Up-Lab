public GroceryCounterClass {
    private int digits[];

    private int count_overflow;

    //Constructor for GroceryCounter
    public GroceryCounterConstructor() {
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
        CountAction(1);
    }

    //second digit
    public void ones(){ 
        CountAction(2);
    }

    //third digit
    public void tenths(){
        CountAction(3);
    }

    //fourth digit
    public void hundredths(){
        CountAction(4);
    }

    //method to display the current total in a formatted string
    public String currentTotal() {
        int firstDigit = digits[0];
        int secondDigit = digits[1];
        int thirdDigit = digits[2];
        int fourthDigit = digits[3];

        if (firstDigit == 0) {
            return String.format("$%d.%d%d", secondDigit, thirdDigit, fourthDigit);
        } else {
            return String.format("$%d.%d%d", firstDigit, secondDigit, thirdDigit, fourthDigit);
        }
    }
}