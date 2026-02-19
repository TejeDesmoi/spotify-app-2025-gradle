package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.model.Author;

import java.util.ArrayList;

public class AuthorMemLocalDataSource {

    private ArrayList<Author> authorsBdStorage = new ArrayList<>();

    public AuthorMemLocalDataSource() {
        initData();
    }

    private void initData(){
        Author author1 = new Author("1","Extremoduro","Epañola","01-01-1978");
        authorsBdStorage.add(author1);

        Author author2 = new Author("2","Oasis","Inglesa","01-01-1980");
        authorsBdStorage.add(author2);
    }

    public ArrayList<Author> findAll(){
        return authorsBdStorage;
    }

    public void addAuthor(String id, String name, String nationality, String dateBorn){
        Author newAuthor = new Author(id, name, nationality, dateBorn);
        authorsBdStorage.add(newAuthor);
    }
}
