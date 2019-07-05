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

        ExampleModel exampleModel = new ExampleModel("Robert", "Nowak", 45, true);
        System.out.print("exampleModel: ");
        System.out.println(exampleModel);

        ExampleModel exampleModelDuplicate = new ExampleModel();
        exampleModelDuplicate.nazwisko = "Nowak";
        exampleModelDuplicate.setImie("Marianek");
        exampleModelDuplicate.setMaWlosy(false);
        exampleModelDuplicate.setWiek(25);
        System.out.print("exampleModelDuplicate: ");
        System.out.println(exampleModelDuplicate);

        ExampleModel exampleModelBuilder = ExampleModel.builder()
                .imie("Zosia")
                .maWlosy(false)
                .nazwisko("Nowak")
                .wiek(38)
                .build();
        System.out.print("exampleModelBuilder: ");
        System.out.println(exampleModelBuilder);

        System.out.println("");
        System.out.println("exampleModelDuplicate  vs  exampleModelBuilder");
        System.out.println(exampleModelDuplicate.equals(exampleModelBuilder));

        System.out.println("");
        System.out.println("exampleModel  vs  exampleModelDuplicate");
        System.out.println(exampleModel.equals(exampleModelDuplicate));

    }
}
