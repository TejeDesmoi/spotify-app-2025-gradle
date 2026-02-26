package edu.iesam;

import edu.iesam.features.authors.Presentation.AuthorView;
import edu.iesam.features.songs.presentation.View.SongView;

public class Main {
    public static void main(String[] args) {
        SongView songView = new SongView();

        songView.askForSongToDelete();
        songView.PrintSongs();


    }
}