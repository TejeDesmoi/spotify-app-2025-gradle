package edu.iesam;

import edu.iesam.features.authors.Presentation.AuthorView;

public class Main {
    public static void main(String[] args) {
        AuthorView authorView = new AuthorView();

        authorView.askForAuthor();
        authorView.printAuthors();

    }
}