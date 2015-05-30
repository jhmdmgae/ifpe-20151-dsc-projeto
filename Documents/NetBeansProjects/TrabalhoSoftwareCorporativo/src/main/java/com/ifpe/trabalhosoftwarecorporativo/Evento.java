package com.ifpe.trabalhosoftwarecorporativo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique 2
 */

@Entity
@Table(name = "EVENTO")
public class Evento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "INICIO", nullable = false)
    private Date Inicio;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TERMINO", nullable = false)
    private Date Termino;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "CATEGORIA_EVENTO", nullable = false)
    private String Categoria;
    
    @Column(name = "CATEGORIA", nullable = false)
    private String Local;
    
    @Column(name = "DESCRICAO", nullable = false)
    private String Descrição;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "STATUS_EVENTO", nullable = false)
    private String Status;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Date getInicio() {
        return Inicio;
    }

    public void setInicio(Date Inicio) {
        this.Inicio = Inicio;
    }

    public Date getTermino() {
        return Termino;
    }

    public void setTermino(Date Termino) {
        this.Termino = Termino;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
}
