/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Luis
 */
@Entity
@Table(name = "consulta")
public class Consulta implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_consulta", sequenceName = "seq_consulta_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_consulta", strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Calendar data;
    private Calendar hora;
    @NotNull(message = "A pré consulta não pode ser nulo")
    @Length(max = 50, message = "A pré consulta não pode ter mais de {max} caracteres")
    @NotBlank(message = "A pré consulta não pode ser em branco")
    @Column(name = "preconsulta", length = 50, nullable = false)
    private String preconsulta;
    @NotNull(message = "A pós consulta não pode ser nulo")
    @Length(max = 50, message = "A pós consulta não pode ter mais de {max} caracteres")
    @NotBlank(message = "A pós consulta não pode ser em branco")
    @Column(name = "posconsulta", length = 50, nullable = false)
    private String posconsulta;

    public Consulta() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public Calendar getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    /**
     * @return the preconsulta
     */
    public String getPreconsulta() {
        return preconsulta;
    }

    /**
     * @param preconsulta the preconsulta to set
     */
    public void setPreconsulta(String preconsulta) {
        this.preconsulta = preconsulta;
    }

    /**
     * @return the posconsulta
     */
    public String getPosconsulta() {
        return posconsulta;
    }

    /**
     * @param posconsulta the posconsulta to set
     */
    public void setPosconsulta(String posconsulta) {
        this.posconsulta = posconsulta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Consulta other = (Consulta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
