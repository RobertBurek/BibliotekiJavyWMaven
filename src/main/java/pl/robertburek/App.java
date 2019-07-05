package pl.robertburek;

import lombok.extern.java.Log;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.Arrays;
import java.util.List;


/**
 * Hello world!
 */
@Log
public class App {

    public static void main(String[] args) throws Exception {

        List<Ubranie> ubraniaLista = Arrays.asList(
                new Ubranie("Blue", true)
                , new Ubranie("Red", false));
        ExampleModel exampleModel = new ExampleModel("Marianek"
                , "Nowak"
                , 45
                , true
                , new Ubranie("Red", true));
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = new ExampleModel();
        exampleModelDuplicate.setImie("Marianek");
        exampleModelDuplicate.setMaWlosy(false);
        exampleModelDuplicate.setNazwisko("Nowak");
        exampleModelDuplicate.setWiek(50);
        exampleModelDuplicate.setUbranie(new Ubranie("Blue", false));
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);

        System.out.println("Sprawdzamy równość obiektów na podstawie equals z Lomboka");
        System.out.print("exampleModel  vs  exampleModelDuplicate: ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");

        System.out.println("----------------Simple XML--------------");
        List<ExampleModel> exampleModelList = Arrays.asList(exampleModel, exampleModelDuplicate);

        Serializer serializer = new Persister();
        File result = new File("example.xml");
        serializer.write(exampleModel, result);

        ExampleModel readExampleModel = serializer.read(ExampleModel.class, result);
        log.info(readExampleModel.toString());
        log.info(exampleModel.toString());
        log.info(String.valueOf(exampleModel.equals(readExampleModel)));

    }
}
