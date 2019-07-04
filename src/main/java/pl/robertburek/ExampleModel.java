package pl.robertburek;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Robert Burek
 */
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ExampleModel {

    @Getter
    @Setter
    private String imie;
    @Getter
    @Setter
    @EqualsAndHashCode.Include
    String nazwisko;
    @Getter
    @Setter
    int wiek;
    @Getter
    @Setter
    boolean maWlosy;

//    Wygenerowane za pomocą Intellij
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ExampleModel that = (ExampleModel) o;
//        return wiek == that.wiek &&
//                maWlosy == that.maWlosy &&
//                Objects.equals(imie, that.imie) &&
//                Objects.equals(nazwisko, that.nazwisko);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(imie, nazwisko, wiek, maWlosy);
//    }
}
