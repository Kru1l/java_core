package Hw1_Tasks;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@RequiredArgsConstructor
public class Book {
    @NonNull
    private String title;
    @NonNull
    private int pages;
    private ArrayList<String> Authors = new ArrayList<>();
    @NonNull
    private String genre;

    public Book() {
    }

    public Book(String title, int pages, ArrayList<String> authors, String genre) {
        this.title = title;
        this.pages = pages;
        Authors = authors;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book(" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", Authors=" + Authors +
                ", genre='" + genre + '\'' +
                ')';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return Authors;
    }

    public Book setAuthors(ArrayList<String> authors) {
        Authors = authors;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}