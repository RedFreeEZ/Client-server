public class Lexer {

    public static int SUM(String inputStr){
        int sum = 0;

        inputStr = inputStr.replace("+", "s");

        String[] numbers = inputStr.split("s");
        for (String number : numbers){
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
