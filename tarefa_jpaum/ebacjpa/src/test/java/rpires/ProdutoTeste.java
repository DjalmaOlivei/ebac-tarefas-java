package rpires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import br.com.domain.Produto;
import br.com.DAO.ProdutoDao;

public class ProdutoTeste {

    @Test
    public void cadastroTeste(){
        Produto produto = new Produto();
        produto.setNome("produto1");
        produto.setDescricao("descricao do produto1");
        produto.setFornecedor("fornecedor1");
        ProdutoDao produtoDAO = new ProdutoDao();
        Produto result = produtoDAO.cadastrar(produto);

        assertNotNull(result);
        assertNotNull(result.getId());
        

    }

}
