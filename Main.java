import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> taskList = new ArrayList<>();
        while (true) {
            System.out.println("Выберите операцию: ");
            System.out.println("\n0. Выход из программы" + "\n1. Добавить дело" + "\n2. Показать дела" + "\n3. Удалить дело по номеру" + "\n4. Удалить дело по названию");
            String input = scan.next();
            if (input.equals("0")) {
                System.out.println("Программа завершена!");
                break;
            }
            switch (input) {
                case ("1"):
                    System.out.println("Ваш выбор: " + input);
                    System.out.print("Введите название задачи: ");
                    String task = scan.next();
                    taskList.add(task);
                    System.out.println("Добавлено!" + "\nВаш список дел: ");
                    for (int i = 0; i < taskList.size(); i++) {
                        System.out.println((i + 1) + ". " + taskList.get(i));
                    }
                    break;
                case ("2"):
                    if (taskList.isEmpty()) {
                        System.out.println("Список дел пуст.");
                        break;
                    }
                    System.out.println("Ваши дела: \n");
                    for (int i = 0; i < taskList.size(); i++) {
                        System.out.println((i + 1) + ". " + taskList.get(i));
                    }
                    break;
                case ("3"):
                    if (taskList.isEmpty()) {
                        System.out.println("Список дел пуст.");
                        break;
                    }
                    System.out.print("Введите номер дела для удаления: ");
                    int index = scan.nextInt();
                    if (index > 0 && index <= taskList.size()) {
                        String removedTask = taskList.remove(index - 1);
                        System.out.println("Дело: " + removedTask + " удалено.");
                    } else {
                        System.out.println("Неверный номер дела.");
                    }
                    if (!taskList.isEmpty()) {
                        System.out.println("Оставшиеся дела:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                        }
                    } else {
                        System.out.println("Список дел пуст.");
                    }
                    break;
                case ("4"):
                    if (taskList.isEmpty()) {
                        System.out.println("Список дел пуст.");
                        break;
                    }
                    System.out.print("Введите задачу для удаления: ");
                    String taskName = scan.next();
                    boolean isRemoved = taskList.remove(taskName);
                    if (isRemoved) {
                        System.out.println("Дело '" + taskName + "' удалено.");
                    } else {
                        System.out.println("Дело '" + taskName + "' не найдено.");
                    }
                    if (!taskList.isEmpty()) {
                        System.out.println("Оставшиеся дела:");
                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println((i + 1) + ". " + taskList.get(i));
                        }
                    } else {
                        System.out.println("Список дел пуст.");
                    }
                    break;


            }


        }
    }
}