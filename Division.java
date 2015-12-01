import java.io.Console;

public class Division {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me your first number!");
    String stringNumber = myConsole.readLine();
    Integer firstNumber = Integer.parseInt(stringNumber);

    System.out.println("Give me your second number!");
    String stringNum = myConsole.readLine();
    Integer secondNumber = Integer.parseInt(stringNum);

    Integer addNumber = firstNumber / secondNumber;

    String stringAddNumber = Integer.toString(addNumber);

    System.out.println("Dividing the two numbers together I got: " + addNumber);
  }
}
