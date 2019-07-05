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
    int wiek;
    @EqualsAndHashCode.Exclude
    boolean maWlosy;
}
