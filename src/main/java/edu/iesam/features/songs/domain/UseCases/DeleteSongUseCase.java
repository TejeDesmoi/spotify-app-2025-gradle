package edu.iesam.features.songs.domain.UseCases;

import edu.iesam.features.songs.domain.Repositories.SongRepository;

public class DeleteSongUseCase {
    private SongRepository songRepository;

    public DeleteSongUseCase(SongRepository songRepository){
        this.songRepository = songRepository;
    }

    public void execute(String id){
        songRepository.deleteSong(id);
    }
}
