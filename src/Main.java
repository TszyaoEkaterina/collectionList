import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите операцию:");
            String command = scanner.nextLine();
            if (command.equals("end")){
                break;
            }
            int operation = Integer.parseInt(command);
            switch (operation) {
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    delete();
                    break;
            }
        }
    }

    public static void add() {
        System.out.println("\nКакую покупку хотите добавить?");
        String newItem = scanner.nextLine();
        list.add(newItem);
        System.out.println("Итого в списке покупок: " + list.size());
    }

    public static void show() {
        System.out.println("\nСписок покупок:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }

    public static void delete() {
        show();
        System.out.println("Какую хотите удалить? Введите номер или название\n");
        String deletedItem = scanner.nextLine();
        try {
            int deletedIndex = (Integer.parseInt(deletedItem) - 1);
            System.out.println("\nПокупка \"" + (list.get(deletedIndex)) + "\" удалена, список покупок:");
            list.remove(deletedIndex);
        } catch (Exception e) {
            list.remove(deletedItem);
            System.out.println("\nПокупка \"" + deletedItem + "\" удалена, список покупок:");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
    }
}
