package guru.qa;

public class FirstApp {
    public static void main(String[] args) {
        char symbol, anotherSymbol;
        symbol='w';
        boolean flag = false;
        byte aByte = 123; // -128 ... 127
        short aShort; //32768 ... 32767
        int aInt = aByte; // 2 xxx xxx xxx
        Integer boxed = null;
        char[][] array = new char[][] {{'w','a','s'}};

        long aLong =123L;
        float aFloat = 1.2F;
        double aDouble = 1.2D;


        String aString = null;

        int maxValue = getMaxIntNumber();
        System.out.println(summ(3, 7) );
    }

    static  int getMaxIntNumber (){
        return Integer.MAX_VALUE;
    }
    static int summ(int first, int second) {
        return first + second;
    }
}
