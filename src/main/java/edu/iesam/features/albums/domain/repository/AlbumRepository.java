package edu.iesam.features.albums.domain.repository;

import edu.iesam.features.albums.domain.model.Album;

import java.util.ArrayList;

public interface AlbumRepository {
    public ArrayList<Album> getAlbums();
}
