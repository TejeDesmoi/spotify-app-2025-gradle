package edu.iesam.features.authors.data;

import edu.iesam.features.authors.domain.Repository.AuthorRepository;
import edu.iesam.features.authors.domain.model.Author;

import java.util.ArrayList;

public class AuthorDataRepository implements AuthorRepository {
    private final AuthorMemLocalDataSource authorMemLocalDataSource;

    public AuthorDataRepository(AuthorMemLocalDataSource authorMemLocalDataSource){
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
}
