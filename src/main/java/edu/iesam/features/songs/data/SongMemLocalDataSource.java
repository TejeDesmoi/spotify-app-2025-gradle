package edu.iesam.features.songs.data;

import edu.iesam.features.authors.domain.model.Author;
import edu.iesam.features.songs.domain.Models.Song;

import java.util.ArrayList;

public class SongMemLocalDataSource {
    private ArrayList<Song> authorsBdStorage = new ArrayList<>();

    public SongMemLocalDataSource() {
        initData();
    }

    private void initData(){
        //Song song1 = new Song("1","Dont want to stop","","Ozzy Osborne","");
        //authorsBdStorage.add(song1);

        //Song song2 = new Song("2","Oasis","Inglesa","01-01-1980");
        //authorsBdStorage.add(song2);
    }

    public ArrayList<Song> findAll(){
        return authorsBdStorage;
    }

}
