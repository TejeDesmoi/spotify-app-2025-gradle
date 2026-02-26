package edu.iesam.features.songs.presentation.View;

import edu.iesam.features.songs.data.SongDataRepository;
import edu.iesam.features.songs.domain.Models.Song;
import edu.iesam.features.songs.domain.UseCases.DeleteSongUseCase;
import edu.iesam.features.songs.domain.UseCases.GetSongsUseCase;
import edu.iesam.features.songs.domain.UseCases.SaveSongUseCase;

import java.util.ArrayList;
import java.util.Scanner;

public class SongView {

    public void PrintSongs(){
        GetSongsUseCase getSongsUseCase = new GetSongsUseCase(SongDataRepository.getInstance());
        ArrayList<Song> songList = getSongsUseCase.execute();

        System.out.println(songList);
    }
    public void askForSong(){
        SaveSongUseCase saveSongUseCase = new SaveSongUseCase(SongDataRepository.getInstance());

        Scanner sc = new Scanner(System.in);
        String id;
        String title;
        String album;
        String artist;
        String genre;
        String duration;

        System.out.println();
        id = sc.nextLine();
        System.out.println();
        title = sc.nextLine();
        System.out.println();
        album = sc.nextLine();
        System.out.println();
        artist = sc.nextLine();
        System.out.println();
        genre = sc.nextLine();
        System.out.println();
        duration = sc.nextLine();

        saveSongUseCase.execute(id,title,album,artist,genre,duration);

    }
    public void askForSongToDelete(){
        DeleteSongUseCase deleteSongUseCase = new DeleteSongUseCase(SongDataRepository.getInstance());

        Scanner sc = new Scanner(System.in);
        String id;

        System.out.print("Escriba el id de la cancion que desea borrar: ");
        id = sc.nextLine();

        deleteSongUseCase.execute(id);
    }
}
