package edu.iesam.features.authors.Presentation;

import edu.iesam.features.authors.data.AuthorDataRepository;
import edu.iesam.features.authors.data.AuthorMemLocalDataSource;
import edu.iesam.features.authors.domain.UseCases.GetAuthorsUseCase;
import edu.iesam.features.authors.domain.UseCases.SaveAuthorUseCase;
import edu.iesam.features.authors.domain.model.Author;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthorView {
    AuthorMemLocalDataSource authorMemLocalDataSource = new AuthorMemLocalDataSource();
    AuthorDataRepository authorDataRepository = AuthorDataRepository.getInstance();

    public void printAuthors(){
        GetAuthorsUseCase getAuthorsUseCase = new GetAuthorsUseCase(authorDataRepository);
        ArrayList<Author> authors = getAuthorsUseCase.execute();
        System.out.println(authors);
    }
    public void askForAuthor(){
        SaveAuthorUseCase saveAuthorUseCase = new SaveAuthorUseCase(authorDataRepository);

        Scanner sc = new Scanner(System.in);
        String id;
        String name;
        String nationality;
        String dateBorn;

        System.out.print("Id del cantante: ");
        id = sc.nextLine();
        System.out.print("Nombre del cantante: ");
        name = sc.nextLine();
        System.out.print("Nacionalidad del cantante: ");
        nationality = sc.nextLine();
        System.out.print("Fecha nacimiento del cantante: ");
        dateBorn = sc.nextLine();

        saveAuthorUseCase.execute(id,name,nationality,dateBorn);
    }
}
