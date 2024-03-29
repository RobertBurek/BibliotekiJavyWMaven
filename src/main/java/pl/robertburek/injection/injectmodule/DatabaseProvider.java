package pl.robertburek.injection.injectmodule;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import pl.robertburek.injection.Database;

/**
 * Created by Robert Burek
 */
public class DatabaseProvider implements Provider<Database> {

    @Inject
    @Named("DB_URL")
    private String host;

    @Override
    public Database get() {
        //3. medota zasięgu dla Database
        // sprawdzić czy istnieje i ewentualnie utworzyć lub nie
        Database repository = new Database();
        repository.setHost(host);
        return repository;
    }
}
