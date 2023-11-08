package todolist;

import todolist.model.Task;
public interface ToDoList {
    boolean addTask(Task task);
    Task removeTask(int taskNumber);
    // print list of Tasks
    void viewTasks();
    // подумать над Task[] viewTasks();
    void exit();
    // quantity of tasks
    int quantity();

    }
