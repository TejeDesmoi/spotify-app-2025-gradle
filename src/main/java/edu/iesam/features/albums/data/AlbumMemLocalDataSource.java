package edu.iesam.features.albums.data;

import edu.iesam.features.albums.domain.model.Album;

import java.util.ArrayList;

public class AlbumMemLocalDataSource {
    private ArrayList<Album> albumsBdStorage = new ArrayList<Album>();

    public AlbumMemLocalDataSource(){
        initData();
    }

    private void initData(){
        Album album1 = new Album("1","Patera","2005");
        albumsBdStorage.add(album1);

        Album album2 = new Album("2","Chaos theory", "2025");
        albumsBdStorage.add(album2);
    }

    public ArrayList<Album> findAll(){
        return albumsBdStorage;
    }
    public void deleteAlbum(String id){
        albumsBdStorage.removeIf(s-> s.getId().equals(id));
    }
}
