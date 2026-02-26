package edu.iesam.features.authors.domain.Repository;

import edu.iesam.features.authors.domain.model.Author;

import java.util.ArrayList;

public interface AuthorRepository {
    ArrayList<Author> getAuthors();
    void addAuthor(String id, String name, String nationality, String dateBorn);
    void deleteAuthor(String id);
}
