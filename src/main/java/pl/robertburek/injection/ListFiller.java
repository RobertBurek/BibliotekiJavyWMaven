package pl.robertburek.injection;


/**
 * Created by Robert Burek
 */
public class ListFiller {

    @Inject
    private Repository repository;



    public void getUser() {
        repository.getUsers();
        //przetworzenie users na format zgodny z listą użytkowników
    }
}

