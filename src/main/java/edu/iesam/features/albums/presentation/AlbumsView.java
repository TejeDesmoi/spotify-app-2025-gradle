package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.model.Album;
import edu.iesam.features.albums.domain.usecases.DeleteAlbumUseCase;
import edu.iesam.features.albums.domain.usecases.GetAlbumsUseCase;

import java.util.ArrayList;
import java.util.Scanner;

public class AlbumsView {
    public void printAlbums(){
        AlbumDataRepository albumDataRepository = new AlbumDataRepository(new AlbumMemLocalDataSource());
        GetAlbumsUseCase getAlbumsUseCase = new GetAlbumsUseCase(albumDataRepository);

        ArrayList<Album> albums = getAlbumsUseCase.execute();

        System.out.println(albums);
    }
    public void askForAlbumToDelete(){
        DeleteAlbumUseCase deleteAlbumUseCase = new DeleteAlbumUseCase(new AlbumDataRepository(new AlbumMemLocalDataSource()));

        Scanner sc = new Scanner(System.in);
        String id;

        System.out.print("Id del album a eliminar: ");
        id = sc.nextLine();

        deleteAlbumUseCase.execute(id);
    }

}
