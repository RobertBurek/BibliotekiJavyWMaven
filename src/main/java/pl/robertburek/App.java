package pl.robertburek;

import lombok.AllArgsConstructor;


/**
 * Hello world!
 */
@AllArgsConstructor
public class App {
    Boolean a;
    Boolean b;
    Boolean c;

    public static void main(String[] args) {

        System.out.println("Hello World!");
        new App(true, true, true);

        ExampleModel exampleModel = new ExampleModel();
        exampleModel.nazwisko = "Nowak";
        exampleModel.setImie("Marian");
        exampleModel.setMaWlosy(true);
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = new ExampleModel();
        exampleModelDuplicate.nazwisko = "Nowak";
        exampleModelDuplicate.setImie("Marianek");
        exampleModelDuplicate.setMaWlosy(false);
        exampleModelDuplicate.setWiek(25);
        System.out.println(exampleModelDuplicate);

        System.out.println(exampleModel.equals(exampleModelDuplicate));

    }
}
