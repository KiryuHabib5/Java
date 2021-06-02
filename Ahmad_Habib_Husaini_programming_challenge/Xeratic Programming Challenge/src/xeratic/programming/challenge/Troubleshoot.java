package xeratic.programming.challenge;
public class Troubleshoot {

    public static int initialVal = 50;

    public int function1(int input, int multiplier) {
        int temp = input;
        for (int i = 0; i < multiplier; i++) {
            temp = temp * multiplier;
        }
        initialVal = temp;
        return temp;
    }

    public int function2(int input, int multiplier) {
        int temp = input;
        for (int i = 0; i < multiplier; i++) {
            temp = temp + multiplier;
        }
        return temp;
    }

    public static int calculate(int initialValNew) {
        Troubleshoot ts = new Troubleshoot();

        int initialval = initialValNew;
        int multiplier1 = 4;
        int multiplier2 = 6;

        initialval = ts.function1(initialval, multiplier1);
        initialval = ts.function2(initialval, multiplier2);

        return initialval;
    }
}
