package com.ifpe.trabalhosoftwarecorporativo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique 2
 */
@Entity
@Table(name = "DISCIPLINA")
public class Disciplina implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Column(name = "NOME", nullable = false)
    private String Nome;
    
    @Temporal(TemporalType.TIME)
    private String Horario;
    
    @Column(name = "EMENTA", nullable = false)
    private String Ementa;
    
    @Column(name = "CARGA_HORARIA", nullable = false)
    private int CargaHoraria;
    
    @Column(name = "CREDITOS", nullable = false)
    private int Creditos;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PROFESSOR", referencedColumnName = "ID")
    private Professor Professor;
    
    @Column(name = "LOCAL", length = 50, nullable = false)
    private String Local;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getEmenta() {
        return Ementa;
    }

    public void setEmenta(String Ementa) {
        this.Ementa = Ementa;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int Creditos) {
        this.Creditos = Creditos;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String Local) {
        this.Local = Local;
    }
    
}
