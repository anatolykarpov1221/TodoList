package todolist.model;

import java.time.LocalDateTime;

public class Task implements Comparable<Task>{
    private int id;
    private String task;
    //private int taskNumber;
    private LocalDateTime time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    //public int getTaskNumber() {
       // return taskNumber;
    //}

    //public void setTaskNumber(int taskNumber) {
       // this.taskNumber = taskNumber;
   // }

    public Task(int id, String task, LocalDateTime time) {
        this.id = id;
        this.task = task;
        this.time = time;

    }

    @Override
    public String toString() {
        return (id +1)+" : "+task+"time"+time;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Task task = (Task) object;

        return id == task.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Task o) {
        //return this.taskNumber - o.getTaskNumber(); // естественная сортировка по taskNumber, от меньшего к большему
        return Integer.compare(this.id, o.id); // возможный вариант
    }
}
