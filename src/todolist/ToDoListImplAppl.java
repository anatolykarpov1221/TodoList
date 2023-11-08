package todolist;

import todolist.menulist.Menu;
import todolist.model.Task;

import java.util.Scanner;

public class ToDoListImplAppl {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to ToDo Application!");
        ToDoListImpl toDoList = new ToDoListImpl(10);
        int id = 0;

        // начало цикла
        while (true) {
            // print menu
            Menu.printMenu(); // статический метод вызываем по имени класса
            // ask choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();
            // execute
            switch (choice) {
                case 1: {
                    scanner.nextLine();
                    System.out.println("Input task: ");
                    String task = scanner.nextLine();
                    Task newTask = new Task(id, task, id + 1);
                    toDoList.addTask(newTask);
                    break;
                }
                case 2: {
                    System.out.println("Your tasks: ");
                    toDoList.viewTasks();
                    break;
                }
                case 3: {
                    System.out.println("Input task number: ");
                    int taskNumber = scanner.nextInt();
                    Task removedTask = toDoList.removeTask(taskNumber - 1);
                    System.out.println(removedTask + " is removed.");
                    break;
                }
                case 4:{
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                }

                default: {
                    System.out.println("Wrong input.");
                }
            }
        }
    }

}
