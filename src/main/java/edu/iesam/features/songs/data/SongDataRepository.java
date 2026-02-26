package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Models.Song;
import edu.iesam.features.songs.domain.Repositories.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {
    private final SongMemLocalDataSource songMemLocalDataSource;
    public static SongDataRepository instance;

    public SongDataRepository(SongMemLocalDataSource songMemLocalDataSource){
        this.songMemLocalDataSource = songMemLocalDataSource;
    }

    @Override
    public ArrayList<Song> findAll() {return songMemLocalDataSource.findAll();}

    @Override
    public void addSong(String id, String title, String album, String artist, String genre, String duration) {
        songMemLocalDataSource.addSong(id,title,album,artist,genre,duration);
    }

    public static SongDataRepository getInstance(){
        if (instance == null){
            instance = new SongDataRepository(new SongMemLocalDataSource());
        }

        return instance;
    }
}
