package br.com.domain;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;  
import java.util.ArrayList;

@Entity
@Table(name = "marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="marca_seq")
    @SequenceGenerator(name = "marca_seq", sequenceName = "marca_seq", initialValue = 1, allocationSize = 1)    
    private long id;

    @Column(name = "nome", length = 50, nullable = false , unique = true)
    private String nome;

    @Column(name = "slogam", length = 50)
    private String slogan;

    @OneToMany(mappedBy = "marca")
    private List<Carro> carros;

    @ManyToMany(mappedBy = "marcas")
    private List<Acessorio> acessorios;

    public Marca() {
        this.acessorios = new ArrayList<>();
        this.carros = new ArrayList<>();
    }
    
    public long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public void addCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void addAcessorio(Acessorio acessorio) {
        this.acessorios.add(acessorio);
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }


    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }


    

}
