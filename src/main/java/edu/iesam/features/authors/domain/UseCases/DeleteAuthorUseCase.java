package edu.iesam.features.authors.domain.UseCases;

import edu.iesam.features.authors.domain.Repository.AuthorRepository;

public class DeleteAuthorUseCase {
    private AuthorRepository authorRepository;

    public DeleteAuthorUseCase(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void execute (String id){
        authorRepository.deleteAuthor(id);
    }
}
