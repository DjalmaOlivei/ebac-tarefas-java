package br.com.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "carro_seq", initialValue = 1, allocationSize = 1)
    private long id;
    
    @Column(name = "modelo", length = 50, nullable = false , unique = true)
    private String modelo;
    
    @Column(name = "placa", length = 50, nullable = false , unique = true)
    private String placa;
    
    @Column(name = "cor", length = 50, nullable = false)
    private String cor;
    
    @ManyToOne
    private Marca marca;

    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public long getId() {
        return id;
    }

    

}
