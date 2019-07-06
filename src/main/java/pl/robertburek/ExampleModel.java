package pl.robertburek;

import lombok.*;

import java.util.List;

/**
 * Created by Robert Burek
 */

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ExampleModel {
    @Getter
    @Setter
    private String imie;
    @Getter
    @Setter
    private String nazwisko;
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private int wiek;
    @Getter
    @Setter
    @EqualsAndHashCode.Exclude
    private boolean maWlosy;
    //    @EqualsAndHashCode.Exclude
//    @Getter
//    @Setter
//    private Ubranie ubranie;
    @EqualsAndHashCode.Exclude
    @Getter
    @Setter
    private List<Ubranie> ubrania;
}
