package todolist;

import todolist.model.Task;

import java.util.Arrays;

public class ToDoListImpl implements ToDoList{
    //fields
    private Task[] tasks;
    // private int capacity;
    private int quantity;

    // constructor
    public ToDoListImpl(int capacity){
        tasks = new Task[capacity];
        this.quantity = 0;
    }

    @Override
    public boolean addTask(Task task) {
        if (task == null || quantity == tasks.length) {
            return false;
        }
        tasks[quantity] = task;// ставим в конец массива
        quantity++;
        return true;
    }
    @Override
    public Task findTask(int taskNumber) {
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == taskNumber - 1) {
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public Task removeTask(int id) {
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id) {
                Task removedTask = tasks[i];
                // Сдвигаем задачи на одну позицию влево, перезаписывая удаляемую задачу
                for (int j = i; j < quantity - 1; j++) {
                    tasks[j] = tasks[j + 1];
                    // Обновляем индексы
                    tasks[j].setId(j);
                }
                tasks[quantity - 1] = null; // Удаляем последний элемент
                quantity--;

                return removedTask;
            }
        }
        return null; // В случае, если задача не была найдена
    }



    @Override
    public void viewTasks() {
        // for loop, print tasks
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks.");
    }

//    @Override
//    public void exit() {
//	    System.exit(0);
//    }

    @Override
    public int quantity() {
        return quantity;
    }
}

