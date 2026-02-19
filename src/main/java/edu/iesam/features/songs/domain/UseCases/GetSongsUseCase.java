package edu.iesam.features.songs.domain.UseCases;

import edu.iesam.features.songs.domain.Models.Song;
import edu.iesam.features.songs.domain.Repositories.SongRepository;

import java.util.ArrayList;

public class GetSongsUseCase{
    private SongRepository songRepository;
    public GetSongsUseCase(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public ArrayList<Song> execute(){
        return songRepository.findAll();
    }

}
