package pl.robertburek;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;


/**
 * Hello world!
 */
@Log
@AllArgsConstructor
public class App {
    Boolean a;
    Boolean b;
    Boolean c;

    public static void main(String[] args) {

        System.out.println("Hello World!");
        new App(true, true, true);

        ExampleModel exampleModel = new ExampleModel("Robert", "Nowak", 45, true);
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = new ExampleModel("","",0,true);
        exampleModelDuplicate.setNazwisko("Nowak");
        exampleModelDuplicate.setImie("Marianek");
        exampleModelDuplicate.setMaWlosy(false);
        exampleModelDuplicate.setWiek(25);
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);

        ExampleModel exampleModelBuilder = ExampleModel.builder()
                .imie("Marianek")
                .maWlosy(false)
                .nazwisko("Nowak")
                .wiek(25)
                .build();
        System.out.print("exampleModelBuilder: ");
        System.out.println(exampleModelBuilder);

        System.out.println("");
        System.out.println("exampleModelDuplicate  vs  exampleModelBuilder");
        System.out.println(exampleModelDuplicate.equals(exampleModelBuilder));
        if (exampleModelDuplicate.equals(exampleModelBuilder))
            log.info("Obiekty są takie same!");

        System.out.println("");
        System.out.println("exampleModel  vs  exampleModelDuplicate");
        System.out.println(exampleModel.equals(exampleModelDuplicate));
        if (!exampleModel.equals(exampleModelDuplicate))
            log.info("Obiekty nie są takie same!");

    }
}
