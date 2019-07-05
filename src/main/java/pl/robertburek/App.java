package pl.robertburek;

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

    }
}
