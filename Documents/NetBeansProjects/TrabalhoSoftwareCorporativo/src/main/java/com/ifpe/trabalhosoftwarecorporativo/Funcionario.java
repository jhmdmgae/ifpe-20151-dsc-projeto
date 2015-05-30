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
@Table(name = "FUNCIONARIO")
@Access(AccessType.FIELD)
@DiscriminatorValue(value = "F")
@PrimaryKeyJoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
public class Funcionario extends Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Column(name = "SIAPE", length = 10, nullable = false, unique = true)
    private String Siape;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "CARGO", nullable = false)
    private Cargo Cargo;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getSiape() {
        return Siape;
    }

    public void setSiape(String Siape) {
        this.Siape = Siape;
    }

    public Cargo getCargo() {
        return Cargo;
    }

    public void setCargo(Cargo Cargo) {
        this.Cargo = Cargo;
    }
    
}
