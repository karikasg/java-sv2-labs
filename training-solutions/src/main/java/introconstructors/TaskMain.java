package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task1 = new Task("Tanulás", "Tanulni kell");
        task1.start();
        task1.setDuration(90);
        System.out.println("Feladat: " + task1.getTitle() + " (" + task1.getDescription() + "), kezdés: " + task1.getStartDateTime() +
                ", időtartama: " + task1.getDuration() + " perc");
    }
}
