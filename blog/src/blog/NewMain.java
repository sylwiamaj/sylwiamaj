package blog;

import java.time.LocalDate;

public class NewMain {

    public static void main(String[] args) {
        blog blog = new blog("Blog programistyczny");
        Note note1 = new Note("Co nowego w Java 9","Co nowego w Java 9");
        Note note2 = new Note("Kolekcje","Kolekcje");
        Note note3 = new Note("JavaFX","Aplikacje desktopowe");
        blog.add(note3);
        blog.add(note2);
        blog.add(note1);
        Comment c1 = new Comment("jan","Kolekcje są bardzo trudne");
        note2.add(c1);
        Comment c2 = new Comment("qwerty","No coś ty, bardzo łatwe");
        note2.add(c2);
        System.out.println(blog);
        System.out.println(blog.mostPopular());
        LocalDate d1 = LocalDate.of(2018,March,6);
        LocalDate d2 = LocalDate.of(2018,March,6);
        long u = dl. 
        System.out.println(u);
    }
    
}