import java.util.Scanner;
import ru.netology.service.CustomsService;

public class Main {
    public static void main(String[] args) {
        String inputStr = "";
        int price = 0;
        int weight = 0;
        int duty = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        inputStr = sc.nextLine();
        price = Integer.parseInt(inputStr);

        System.out.print("Введите вес товара (в кг.): ");
        inputStr = sc.nextLine();
        weight = Integer.parseInt(inputStr);

        System.out.println();
        duty = calculateCustoms(price, weight);
        System.out.println("Способ рассчета без класса:");
        System.out.println("Размер пошлины (в руб.) составит: "+duty);

        System.out.println();
        duty = CustomsService.calculateCustoms(price, weight);
        System.out.println("Способ рассчета с классом (ставка на вес = "+ CustomsService.RATE_WEIGHT_DUTY +") :");
        System.out.println("Размер пошлины (в руб.) составит: "+duty);
    }

    public static int calculateCustoms(int price, int weight) {
        return (int) (price * 0.01 + weight * 100.0);
    }
}