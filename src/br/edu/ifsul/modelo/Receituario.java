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
@Table(name = "receituario")
public class Receituario implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_receituario", sequenceName = "seq_receituario_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_receituario", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NotNull(message = "A posologia não pode ser nulo")
    @Length(max = 50, message = "A posologia não pode ter mais de {max} caracteres")
    @NotBlank(message = "A posologia não pode ser em branco")
    @Column(name = "posologia", length = 50, nullable = false)
    private String posologia;
    
    private Calendar validade;

    public Receituario() {
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the posologia
     */
    public String getPosologia() {
        return posologia;
    }

    /**
     * @param posologia the posologia to set
     */
    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    /**
     * @return the validade
     */
    public Calendar getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(Calendar validade) {
        this.validade = validade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Receituario other = (Receituario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
