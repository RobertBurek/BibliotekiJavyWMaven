package pl.robertburek;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Robert Burek
 */

@Builder
@Data
public class ExampleModel {
    private String imie;
    private String nazwisko;
    @EqualsAndHashCode.Exclude
    private int wiek;
    @EqualsAndHashCode.Exclude
    private boolean maWlosy;
    private Ubranie ubranie;
}
