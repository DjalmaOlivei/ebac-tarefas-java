import domain.Pessoa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class separaFemininoTest {

    @Test
    void separaFemenino() {

        Predicate<List<Pessoa>> runSeparaFeminino = n -> n
                .stream()
                .allMatch(t -> t.getSexo() == 'F');

    assertTrue(runSeparaFeminino.test(separaFemenino(populate())));
    }


    public static List<Pessoa> separaFemenino(List<Pessoa> Lpessoas){
        return Lpessoas.stream().filter(n -> n.getSexo() == 'F').toList();
    }

    public static List<Pessoa> populate(){

        List<Pessoa> LP = new ArrayList<>();

        LP.add(new Pessoa("João",'M'));
        LP.add(new Pessoa("Maria",'F'));
        LP.add(new Pessoa("Jose",'M'));
        LP.add(new Pessoa("Mendonça",'M'));
        LP.add(new Pessoa("Flaviana",'F'));
        LP.add(new Pessoa("Joseilda",'F'));
        LP.add(new Pessoa("Florentina",'F'));
        LP.add(new Pessoa("Marco",'M'));
        LP.add(new Pessoa("Gael",'M'));

        return LP;

    }
}