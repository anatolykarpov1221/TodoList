package todolist;

import todolist.model.Task;
public interface ToDoList {
    boolean addTask(Task task);
    Task findTask(int taskNumber);
    Task removeTask(int taskNumber);
    // print list of Tasks
    void viewTasks();
    // quantity of tasks
    int quantity();

    }
