package edu.iesam.features.songs.domain.Repositories;

import edu.iesam.features.songs.domain.Models.Song;

import java.util.ArrayList;

public interface SongRepository {
    public ArrayList<Song> findAll();
    public void addSong (String id, String title, String album, String artist, String genre, String duration);
    public void deleteSong(String id);
}
