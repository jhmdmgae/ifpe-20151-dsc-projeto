package com.ifpe.trabalhosoftwarecorporativo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique 2
 */

@Entity
@Table(name = "USUARIO")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DISC_USUARIO", discriminatorType = DiscriminatorType.STRING, length = 1)
@Access(AccessType.FIELD)
@SecondaryTable(name = "FOTO_USUARIO",pkJoinColumns = {@PrimaryKeyJoinColumn(name = "ID_USUARIO")})
public class Usuario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Column(name = "NOME", length = 50, nullable = false)
    private String Nome;
    
    @Column(name = "EMAIL", length = 50, nullable = false)
    private String Email;
    
    @Column(name = "SENHA", length = 20, nullable = false)
    private String Senha;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private Date dataNascimento;
    
    @ElementCollection
    @CollectionTable(name = "TELEFONE", joinColumns = @JoinColumn(name = "ID_USUARIO", nullable = false))
    @Column(name = "TELEFONE")
    private Collection<String> Telefones;
    
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "FOTO", table = "FOTO_USUARIO", nullable = true)
    private byte[] Foto;

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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Collection<String> getTelefones() {
        return Telefones;
    }

    public void setTelefones(Collection<String> Telefones) {
        this.Telefones = Telefones;
    }
    
    public void addTelefone(String telefone) {
        Telefones.add(telefone);
    }

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }    
    
}
