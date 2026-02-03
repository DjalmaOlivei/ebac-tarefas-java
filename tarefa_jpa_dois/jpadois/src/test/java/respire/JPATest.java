package respire;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import br.com.DAO.CarroDAO;
import br.com.DAO.MarcaDAO;
import br.com.DAO.AcessorioDAO;
import br.com.domain.Carro;
import br.com.domain.Marca;
import br.com.domain.Acessorio;

public class JPATest {

    public CarroDAO carroDAO;
    public MarcaDAO marcaDAO;
    public AcessorioDAO acessorioDAO;
    Marca marca;
    Carro carro;
    Acessorio acessorio;

    @Test
    public void test() {
        carroDAO = new CarroDAO();
        marcaDAO = new MarcaDAO();
        acessorioDAO = new AcessorioDAO();

        acessorio = criaAcessorio();
        marca = criaMarca();
        carro = criacarro(marca);

        
        marca.addAcessorio(acessorio);
        acessorio.addMarca(marca);

        
        Acessorio acessorioDB = acessorioDAO.cadastrar(acessorio);
        Carro carroDB = carroDAO.cadastrar(carro);
        Marca marcaDB = acessorioDB.getMarcas().get(acessorioDB.getMarcas().indexOf(marca));

        Assert.assertNotNull(marcaDB);
        Assert.assertNotNull(acessorioDB);
        Assert.assertNotNull(carroDB);
        
    }

    public static Carro criacarro(Marca marca){
        Carro carro = new Carro();
        
        carro.setModelo("saveiro");
        carro.setPlaca("lml1234");
        carro.setCor("verde");
        carro.setMarca(marca);

        return carro;
    }
    
    public static Marca criaMarca(){
        Marca marca = new Marca();

        marca.setNome("volkswagem");
        marca.setSlogan("slogan");

        return marca;
    }

    public static Acessorio criaAcessorio(){
        Acessorio acessorio = new Acessorio();
        
        acessorio.setNome("ar condicionado");
        acessorio.setDescricao("descrição");

        return acessorio;
    }

}
