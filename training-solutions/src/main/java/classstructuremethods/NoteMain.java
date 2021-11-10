package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
    Note note = new Note();
    note.setName("Karikás Gábor");
    note.setTopic("Git");
    note.setText("Ma csak 2 órát szenvedtem, hogy helyreállítsam...");
        System.out.println(note.getNoteText());
    }
}
