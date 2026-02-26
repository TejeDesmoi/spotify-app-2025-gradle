package edu.iesam.features.songs.data;

import edu.iesam.features.authors.domain.model.Author;
import edu.iesam.features.songs.domain.Models.Song;

import java.util.ArrayList;

public class SongMemLocalDataSource {
    private ArrayList<Song> songArrayList = new ArrayList<>();

    public SongMemLocalDataSource() {
        initData();
    }

    private void initData(){
        Song song1 = new Song("1","Dont want to stop","Solo","Ozzy Osborne","Metal","3:20");
        songArrayList.add(song1);

        Song song2 = new Song("2","Marea","Patera","Marea","Rock","3:20");
        songArrayList.add(song2);
    }

    public ArrayList<Song> findAll(){
        return songArrayList;
    }
    public void addSong (String id, String title, String album, String artist, String genre, String duration){
        Song newSong = new Song(id,title,album,artist,genre,duration);
        songArrayList.add(newSong);
    }
    public void deleteSong(String id){
        songArrayList.removeIf(s -> s.getId().equals(id));
    }
}
