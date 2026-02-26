package edu.iesam.features.songs.domain.UseCases;

import edu.iesam.features.songs.domain.Models.Song;
import edu.iesam.features.songs.domain.Repositories.SongRepository;

public class SaveSongUseCase {
    private final SongRepository songRepository;

    public SaveSongUseCase(SongRepository songRepository){this.songRepository = songRepository;}

    public void execute(String id, String title, String album, String artist, String genre, String duration){
        songRepository.addSong(id,title,album,artist,genre,duration);
    }
}
