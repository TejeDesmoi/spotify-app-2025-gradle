package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Repository.AuthorRepository;
import edu.iesam.features.authors.domain.model.Author;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {
    private final AuthorMemLocalDataSource authorMemLocalDataSource;
    public static AuthorDataRepository instance;

    private AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource){
        this.authorMemLocalDataSource = authorMemLocalDataSource;
    }

    @Override
    public ArrayList<Author> getAuthors() {
        return authorMemLocalDataSource.findAll();
    }

    @Override
    public void addAuthor(String id, String name, String nationality, String dateBorn) {
        authorMemLocalDataSource.addAuthor(id, name, nationality, dateBorn);
    }
    @Override
    public void deleteAuthor(String id){
        authorMemLocalDataSource.deleteAuthor(id);
    }

    public static AuthorDataRepository getInstance(){
        if (instance == null){
            instance = new AuthorDataRepository(new AuthorMemLocalDataSource());
        }

        return instance;
    }
}
