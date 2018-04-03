package by.kolbun.andersen;

import by.kolbun.andersen.entity.Note;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ExampleUtils {
    public static ArrayList<Note> notesList = new ArrayList<>();

    static {
        notesList.add(new Note(1, "note1", new Date(), 1, new ArrayList<String>()));
        String[] st = new String[]{"a", "b", "c"};
        List<String> l = Arrays.asList(st);
        notesList.add(new Note(2, "note2", new Date(), 1, l));
//        l.remove(0);
        notesList.add(new Note(3, "note3", new Date(), 2, l));

        System.out.println("\t\tInitialization of NotesList is completed");
    }

    public static Note getNoteById(int id) {
        for (Note n : notesList)
            if (id == n.getId()) return n;
        return null;
    }
}
