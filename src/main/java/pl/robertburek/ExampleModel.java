package pl.robertburek;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Robert Burek
 */
@ToString
public class ExampleModel {

    @Getter
    @Setter
    private String imie;
    @Getter
    @Setter
    String nazwisko;
    @Getter
    @Setter
    int wiek;
    @Getter
    @Setter
    boolean maWlosy;

}
