package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.model.Album;
import edu.iesam.features.albums.domain.usecases.GetAlbumsUseCase;

import java.util.ArrayList;

public class AlbumsView {
    public void printAlbums(){
        AlbumMemLocalDataSource albumMemLocalDataSource = new AlbumMemLocalDataSource();
        AlbumDataRepository albumDataRepository = new AlbumDataRepository(albumMemLocalDataSource);
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(albumDataRepository);

        ArrayList<Album> albums = getAlbumsUseCase.execute();

        System.out.println(albums);
    }

}
