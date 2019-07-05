package pl.robertburek;

import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;


/**
 * Hello world!
 */
@Log
public class App {

    public static void main(String[] args) {

        List<Ubranie> ubraniaLista = Arrays.asList(
                new Ubranie("Blue", true)
                , new Ubranie("Red", false));
        ExampleModel exampleModel = new ExampleModel("Marianek"
                , "Nowak"
                , 45
                , true);
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = ExampleModel.builder()
                .imie("Marianek")
                .maWlosy(false)
                .nazwisko("Nowak")
                .wiek(50)
                .build();
        System.out.print("exampleModelDuplicate: ");
        log.info(exampleModelDuplicate.toString());

        System.out.println("Sprawdzamy równość obiektów na podstawie equals z Lomboka");
        System.out.print("exampleModel  vs  exampleModelDuplicate: ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");

        System.out.println("----------------Simple XML--------------");
        List<ExampleModel> exampleModelList = Arrays.asList(exampleModel, exampleModelDuplicate);

    }
}
