package pl.robertburek;

import lombok.*;

/**
 * Created by Robert Burek
 */

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ExampleModel {
    @Getter @Setter
    private String imie;
    @Getter @Setter
    private String nazwisko;
    @Getter @Setter
    @EqualsAndHashCode.Exclude
    private int wiek;
    @Getter @Setter
    @EqualsAndHashCode.Exclude
    private boolean maWlosy;
//    @Getter @Setter
//    private Ubranie ubranie;
//    @Getter @Setter
//    private List<Ubranie> ubrania;
}
