import java.util.Scanner;
public class HW2Task1 {
    


    public static void main(String[] args) {
        
        methodInpFlt();
    }

    private static void methodInpFlt() {
        float A;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число типа float");
                String input = scanner.nextLine();
                A=Float.parseFloat(input);
                System.out.println("Данные введены корректно");
                break;
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод. Введены некорректные данные");
            }
           
        }
    }
}

