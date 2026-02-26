package edu.iesam;

import edu.iesam.features.authors.Presentation.AuthorView;
import edu.iesam.features.songs.presentation.View.SongView;

public class Main {
    public static void main(String[] args) {
        /*AuthorView authorView = new AuthorView();

        authorView.askForAuthor();
        authorView.printAuthors();*/

        SongView songView = new SongView();

        songView.PrintSongs();

    }
}