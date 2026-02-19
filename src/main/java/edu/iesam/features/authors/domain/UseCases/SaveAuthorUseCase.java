package edu.iesam.features.authors.domain.UseCases;

import edu.iesam.features.authors.domain.Repository.AuthorRepository;

public class SaveAuthorUseCase {
    private final AuthorRepository authorRepository;

    public SaveAuthorUseCase(AuthorRepository authorRepository ) {
        this.authorRepository = authorRepository;
    }

    public void execute(String id, String name, String nationality, String dateBorn){
        authorRepository.addAuthor(id, name, nationality, dateBorn);
    }
}
