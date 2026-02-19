package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.model.Album;
import edu.iesam.features.albums.domain.repository.AlbumRepository;

import java.util.ArrayList;

public class AlbumDataRepository implements AlbumRepository {

    private AlbumMemLocalDataSource albumMemLocalDataSource;

    public AlbumDataRepository(AlbumMemLocalDataSource albumMemLocalDataSource) {
        this.albumMemLocalDataSource = albumMemLocalDataSource;
    }

    public ArrayList<Album> getAlbums(){
        return albumMemLocalDataSource.findAll();
    }
}
