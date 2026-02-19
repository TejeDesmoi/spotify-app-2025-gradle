package edu.iesam.features.albums.domain.usecases;

import edu.iesam.features.albums.domain.model.Album;
import edu.iesam.features.albums.domain.repository.AlbumRepository;

import java.util.ArrayList;

public class GetAlbumsUseCase {
    private AlbumRepository albumRepository;

    public GetAlbumsUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public ArrayList<Album> execute(){return albumRepository.getAlbums();}
}
