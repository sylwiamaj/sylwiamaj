package blog;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class blog {

    private List<Note> notes = new ArrayList();
    private String title;

    public blog(String title) {
        this.title = title;
    }

    public void add(Note note) {
        notes.add(note);
    }

    public String toString() {
        return title + "\n\n" + notes;
    }

    public Note mostPopular() {
        /*int max = 0;
        Note results =null;
        for(Note note : notes){
            int count = note.numerOfComments();
            if(count>max)
            {
                results = note;
                max = count;
            }
        } */
        if (notes.isEmpty()) {
            return null;
        }
        Note results = notes.get(0);
        for (Note note : notes) {
            int count = note.numerOfComments();
            if (count > results.numerOfComments()) {
                results = note;
            }

        }
        return null;
    }

    public List<Note> mostPopulars() {
      List<Comment> allComments = new ArrayList();
      for(Note note : notes){
          allComments.addAll(note.getComments());
      }
      Comment results = allComments.get(0);
      for(Comment comment : allComments){
               LocalDate d1 = comment.getDate();
                LocalDate d2 = comment.getDate();
                if(dl.isAfter(d2)){
                    result = comment;
            }
            
        }
            
        return null;
        
    }}

    public Comment lastComment() {
        return null;
    }

    public List<Comment> lastComments() {
        return null;
    }
}
