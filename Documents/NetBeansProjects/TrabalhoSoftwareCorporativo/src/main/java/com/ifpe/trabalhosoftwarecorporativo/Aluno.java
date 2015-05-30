package com.ifpe.trabalhosoftwarecorporativo;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author João Henrique 2
 */
@Entity
@Table(name = "ALUNO")
@Access(AccessType.FIELD)
@DiscriminatorValue(value = "A")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
public class Aluno extends Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;

    @Column(name = "MATRICULA", length = 20, nullable = false, unique = true)
    private String matricula;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "STATUS_ALUNO", nullable = false)
    private StatusAluno status;

    @Column(name = "ESTAGIARIO", nullable = true)
    private boolean estagiario;

    @Column(name = "TURMA", length = 14, nullable = false, unique = true)
    private String turma;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public StatusAluno getStatus() {
        return status;
    }

    public void setStatus(StatusAluno status) {
        this.status = status;
    }

    public boolean isEstagiario() {
        return estagiario;
    }

    public void setEstagiario(boolean estagiario) {
        this.estagiario = estagiario;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
