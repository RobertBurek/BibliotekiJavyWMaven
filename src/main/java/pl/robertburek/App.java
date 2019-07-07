package pl.robertburek;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.extern.java.Log;
import pl.robertburek.injection.ListFiller;
import pl.robertburek.injection.injectmodule.RepositoryModule;


/**
 * Created by Robert Burek
 */
@Log
public class App {

    public static void main(String[] args) throws Exception {

        Injector injector = Guice.createInjector(new RepositoryModule());

        //1.
        injector.getInstance(ListFiller.class).getUsers();

        //2.
        ListFiller listFiller = new ListFiller();
        injector.injectMembers(listFiller);
        listFiller.getUsers();
    }
}
