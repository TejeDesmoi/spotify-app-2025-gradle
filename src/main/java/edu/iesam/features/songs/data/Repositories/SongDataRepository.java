package edu.iesam.features.songs.data.Repositories;

import edu.iesam.features.songs.domain.Models.Song;
import edu.iesam.features.songs.domain.Repositories.SongRepository;

import java.util.ArrayList;

public class SongDataRepository implements SongRepository {

    @Override
    public ArrayList<Song> findAll() {
        ArrayList<Song> songs = new ArrayList<>();

        Song song = new Song();
        Song song2 = new Song();
        Song song3= new Song();

        song.setId("1");
        song.setTitle("A little piece of heaven");
        song.setAlbum("Avenged Sevenfold");
        song.setArtist("Avenged Sevenfold");
        song.setDuration("00:08:00");
        songs.add(song);


        song2.setId("2");
        song2.setTitle("Lija y terciopelo");
        song2.setAlbum("La patera");
        song2.setArtist("Marea");
        song2.setDuration("00:04:34");
        songs.add(song2);


        song3.setId("3");
        song3.setTitle("Hunters Moon");
        song3.setAlbum("Impera");
        song3.setArtist("Ghost");
        song3.setDuration("00:03:16");
        songs.add(song3);

        return songs;
    }

}
