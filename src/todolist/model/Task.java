package todolist.model;

public class Task implements Comparable<Task>{
    private int id;
    private String task;
    private int taskNumber;

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

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public Task(int id, String task, int taskNumber) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;

    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Task task = (Task) object;

        return taskNumber == task.taskNumber;
    }

    @Override
    public int hashCode() {
        return taskNumber;
    }

    @Override
    public int compareTo(Task o) {
        // return this.taskNumber - o.getTaskNumber(); // естественная сортировка по taskNumber, от меньшего к большему
        return Integer.compare(this.taskNumber, o.taskNumber); // возможный вариант
    }
}
