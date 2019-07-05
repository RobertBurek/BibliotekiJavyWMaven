package pl.robertburek;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Robert Burek
 */

@Builder
@Data
public class ExampleModel {
    private String imie;
    private String nazwisko;
    int wiek;
    boolean maWlosy;

}
