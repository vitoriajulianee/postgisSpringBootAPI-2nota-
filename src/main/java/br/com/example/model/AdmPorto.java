package br.com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "porto_seco_2014")
public class AdmPorto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    @Column(name = "objectid")
    private String codigo;
    @Column(name = "nome_muni")
    private String municipio; 
    @Column(name = "adm")
    private String adm; 
    @Column(name = "geocodigo")
    private String geoCodigo; 
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getAdm() {
        return adm;
    }

    public void setAdm(String adm) {
        this.adm = adm;
    }

    public String getGeoCodigo() {
        return geoCodigo;
    }

    public void setGeoCodigo(String geoCodigo) {
        this.geoCodigo = geoCodigo;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "AdmPorto{" + "gid=" + gid + ", codigo=" + codigo + ", municipio=" + municipio + ", adm=" + adm + ", geoCodigo=" + geoCodigo + ", geometria=" + geometria + '}';
    }

   
    
}