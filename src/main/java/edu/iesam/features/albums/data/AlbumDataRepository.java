package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.model.Album;
import edu.iesam.features.albums.domain.repository.AlbumRepository;

import java.util.ArrayList;

public class AlbumDataRepository implements AlbumRepository {

    private AlbumMemLocalDataSource albumMemLocalDataSource;

    public AlbumDataRepository(AlbumMemLocalDataSource albumMemLocalDataSource) {
        this.albumMemLocalDataSource = albumMemLocalDataSource;
    }

    @Override
    public ArrayList<Album> getAlbums(){
        return albumMemLocalDataSource.findAll();
    }
    @Override
    public void deleteAlbum(String id){ albumMemLocalDataSource.deleteAlbum(id); }
}
