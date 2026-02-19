package edu.iesam.features.authors.domain.model;

public class Author {
    //region Variable
    private String id;
    private String name;
    private String nationality;
    private String dateBorn;
    //endregion
    //region Getter/Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    //endregion
    //region Constructor
    public Author(String id, String name, String nationality, String dateBorn) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.dateBorn = dateBorn;
    }
    //endregion
}
