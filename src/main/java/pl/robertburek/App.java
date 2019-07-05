package pl.robertburek;

import com.google.gson.Gson;
import lombok.extern.java.Log;

/**
 * Hello world!
 */
@Log
public class App {

    public static void main(String[] args) {

        ExampleModel exampleModel = new ExampleModel("Marianek", "Nowak", 45, true);
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = ExampleModel.builder()
                .imie("Marianek")
                .maWlosy(false)
                .nazwisko("Nowak")
                .wiek(50)
                .build();
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);

        System.out.println("");
        System.out.print("exampleModel  vs  exampleModelDuplicate: ");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (exampleModelDuplicate.equals(exampleModelDuplicate))
            log.info("Obiekty są takie same!");

        System.out.println("-----------------------Gson------------------------");
        String json = new Gson().toJson(exampleModel);
        // Załóżmy, że string json przyszedł z internetu lub z pliku
        ExampleModel fromJsonExampleModel = new Gson().fromJson(json,ExampleModel.class);

        System.out.print("fromJsonExampleModel: ");
        System.out.println(fromJsonExampleModel);
        System.out.println("");
        System.out.print("exampleModel  vs  fromJsonExampleModel : ");
        System.out.println(exampleModel.equals(fromJsonExampleModel));
        if (exampleModel.equals(fromJsonExampleModel))
            log.info("Obiekty są takie same!");

        new Gson();
    }
}
