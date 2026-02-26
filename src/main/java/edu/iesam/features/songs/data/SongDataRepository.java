package edu.iesam.features.songs.data;

import edu.iesam.features.songs.domain.Models.Song;
import edu.iesam.features.songs.domain.Repositories.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {
    private final SongMemLocalDataSource songMemLocalDataSource;

    public SongDataRepository(SongMemLocalDataSource songMemLocalDataSource){
        this.songMemLocalDataSource = songMemLocalDataSource;
    }

    @Override
    public ArrayList<Song> findAll() {return songMemLocalDataSource.findAll();}

}
