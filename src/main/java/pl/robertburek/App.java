package pl.robertburek;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
@Log
public class App {

    public static void main(String[] args) {

        Gson gson = new Gson();

        List<Ubranie> ubraniaLista = Arrays.asList(
                new Ubranie("Blue", true)
                , new Ubranie("Red", false));
        ExampleModel exampleModel = new ExampleModel("Marianek"
                , "Nowak"
                , 45
                , true
                , ubraniaLista);
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = ExampleModel.builder()
                .imie("Marianek")
                .maWlosy(false)
                .nazwisko("Nowak")
                .wiek(50)
                .ubrania(ubraniaLista)
                .build();
        System.out.print("exampleModelDuplicate: ");
        log.info(exampleModelDuplicate.toString());

        System.out.println("Sprawdzamy równość obiektów na podstawie equals z Lomboka");
        System.out.print("exampleModel  vs  exampleModelDuplicate: ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");

        System.out.println("----------------Gson dla tablicy obiektów--------------");
        List<ExampleModel> exampleModelList = Arrays.asList(exampleModel, exampleModelDuplicate);
        String json = gson.toJson(exampleModelList);
        log.info(json);
        // dane json są tablicą, zatem należy zastosować klasę TypeToken
        List<ExampleModel> fromJsonExampleList = gson.fromJson(json,
                new TypeToken<List<ExampleModel>>() {
                }.getType());

        System.out.print("fromJsonExampleList: ");
        System.out.println(fromJsonExampleList);
        System.out.println("");
        System.out.print("exampleModelList  vs  fromJsonExampleList : ");
        System.out.println(exampleModelList.equals(fromJsonExampleList));
        if (exampleModelList.equals(fromJsonExampleList))
            log.info("Lista obiektów jest taka sama!");
            log.info(fromJsonExampleList.toString());

        new Gson();
    }
}
