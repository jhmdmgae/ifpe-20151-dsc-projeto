package com.ifpe.trabalhosoftwarecorporativo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author João Henrique 2
 */

@Entity
@Table(name = "DOCUMENTO")
public class Documento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Column(name = "TITULO", nullable = false)
    private String Titulo;
    
    @Column(name = "ARQUIVO", nullable = false)
    private byte[] Arquivo;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "STATUS_EVENTO", nullable = false)
    private StatusEvento Status;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public byte[] getArquivo() {
        return Arquivo;
    }

    public void setArquivo(byte[] Arquivo) {
        this.Arquivo = Arquivo;
    }

    public StatusEvento getTipo() {
        return Status;
    }

    public void setTipo(StatusEvento Status) {
        this.Status = Status;
    }
    
}
