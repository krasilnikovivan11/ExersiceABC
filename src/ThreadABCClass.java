abstract class ThreadABCClass {
    public static char symbol = 'C';

   synchronized public static void setSymbol(char symbol) {
        ThreadABCClass.symbol = symbol;
    }
}
