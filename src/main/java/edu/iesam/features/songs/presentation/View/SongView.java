package edu.iesam.features.songs.presentation.View;

import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.domain.Models.Song;
import edu.iesam.features.songs.domain.UseCases.GetSongsUseCase;

import java.util.ArrayList;

public class SongView {

    public static void PrintSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(SongDataRepository.getInstance());
        ArrayList<Song> songList = getSongsUseCase.execute();

        System.out.println(songList);
    }
}
