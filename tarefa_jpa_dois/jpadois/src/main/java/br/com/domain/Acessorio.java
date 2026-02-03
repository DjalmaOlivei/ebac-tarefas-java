package br.com.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "acessorio")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="acessorio_id")
    @SequenceGenerator(name = "acessorio_id", sequenceName = "acessorio_id", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "nome", length = 50, nullable = false , unique = true)
    private String nome;
    
    @Column(name = "descricao", length = 50, nullable = false , unique = true)
    private String descricao;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "marca_acessorio",
        joinColumns = {@javax.persistence.JoinColumn(name = "id_acessorio_fk")},
        inverseJoinColumns = {@javax.persistence.JoinColumn(name = "id_marca_fk")}
    )
    private List<Marca> marcas;

    public Acessorio() {
        this.marcas = new ArrayList<>();
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Marca> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<Marca> marcas) {
        this.marcas = marcas;
    }

    public void addMarca(Marca marca) {
        this.marcas.add(marca);
    }

    

}
