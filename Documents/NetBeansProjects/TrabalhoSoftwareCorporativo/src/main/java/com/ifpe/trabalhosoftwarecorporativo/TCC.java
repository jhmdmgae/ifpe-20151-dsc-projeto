package com.ifpe.trabalhosoftwarecorporativo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author JoÃ£o Henrique 2
 */

@Entity
@Table(name = "DOCUMENTO")
public class TCC implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Column(name = "TITULO", nullable = false)
    private String Titulo;
    
    //@OneToMany(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_aluno", referencedColumnName = "ID")
    private List<Aluno> Autores;
    
    @Column(name = "AREA_CONHECIMENTO", nullable = false)
    private String AreaConhecimento;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_DEFESA", nullable = true)
    private Date DataDefesa;
    
    @Column(name = "IMPRENTA", nullable = true)
    private String Imprenta;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "ID_PROFESSOR", referencedColumnName = "ID")
    private Professor Orientador;
    
    @Column(name = "BANCA_EXAMINADORA", nullable = false)
    private String BancaExaminadora;
    
    //mudar
    @Column(name = "TAGS", nullable = false)
    private String Tags;
    
    @Column(name = "RESUMO", nullable = false)
    private String Resumo;
    
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "arquivo", table = "ARQUIVO_TCC", nullable = true)
    private byte[] Arquivo;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "STATUS_TCC", nullable = false)
    private StatusTCC status;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "SITUACAO_DEFESA", nullable = false)
    private SituacaoDefesa SituacaoDefesa;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_INICIO", nullable = false)
    private Date DataInicio;

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

    public List<Aluno> getAutores() {
        return Autores;
    }

    public void setAutores(List<Aluno> Autores) {
        this.Autores = Autores;
    }

    public String getAreaConhecimento() {
        return AreaConhecimento;
    }

    public void setAreaConhecimento(String AreaConhecimento) {
        this.AreaConhecimento = AreaConhecimento;
    }

    public Date getDataDefesa() {
        return DataDefesa;
    }

    public void setDataDefesa(Date DataDefesa) {
        this.DataDefesa = DataDefesa;
    }

    public String getImprenta() {
        return Imprenta;
    }

    public void setImprenta(String Imprenta) {
        this.Imprenta = Imprenta;
    }

    public Professor getOrientador() {
        return Orientador;
    }

    public void setOrientador(Professor Orientador) {
        this.Orientador = Orientador;
    }

    public String getBancaExaminadora() {
        return BancaExaminadora;
    }

    public void setBancaExaminadora(String BancaExaminadora) {
        this.BancaExaminadora = BancaExaminadora;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    public String getResumo() {
        return Resumo;
    }

    public void setResumo(String Resumo) {
        this.Resumo = Resumo;
    }

    public byte[] getArquivo() {
        return Arquivo;
    }

    public void setArquivo(byte[] Arquivo) {
        this.Arquivo = Arquivo;
    }

    public StatusTCC getStatus() {
        return status;
    }

    public void setStatus(StatusTCC status) {
        this.status = status;
    }

    public SituacaoDefesa getSituacaoDefesa() {
        return SituacaoDefesa;
    }

    public void setSituacaoDefesa(SituacaoDefesa SituacaoDefesa) {
        this.SituacaoDefesa = SituacaoDefesa;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date DataInicio) {
        this.DataInicio = DataInicio;
    }

    
    
}
