/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author MAHE
 */
@Entity
@Table(name = "DOCTOR", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Doctor.findAll", query = "SELECT d FROM Doctor d"),
    @NamedQuery(name = "Doctor.findByDoctorid", query = "SELECT d FROM Doctor d WHERE d.doctorid = :doctorid"),
    @NamedQuery(name = "Doctor.findByName", query = "SELECT d FROM Doctor d WHERE d.name = :name"),
    @NamedQuery(name = "Doctor.findBySpecialization", query = "SELECT d FROM Doctor d WHERE d.specialization = :specialization"),
    @NamedQuery(name = "Doctor.findByIllness", query = "SELECT d FROM Doctor d WHERE d.illness = :illness"),
    @NamedQuery(name = "Doctor.findByPhoneno", query = "SELECT d FROM Doctor d WHERE d.phoneno = :phoneno"),
    @NamedQuery(name = "Doctor.findByAddress", query = "SELECT d FROM Doctor d WHERE d.address = :address")})
public class Doctor implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DOCTORID")
    private Integer doctorid;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SPECIALIZATION")
    private String specialization;
    @Column(name = "ILLNESS")
    private String illness;
    @Column(name = "PHONENO")
    private Long phoneno;
    @Column(name = "ADDRESS")
    private String address;

    public Doctor() {
    }

    public Doctor(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        Integer oldDoctorid = this.doctorid;
        this.doctorid = doctorid;
        changeSupport.firePropertyChange("doctorid", oldDoctorid, doctorid);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        String oldSpecialization = this.specialization;
        this.specialization = specialization;
        changeSupport.firePropertyChange("specialization", oldSpecialization, specialization);
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        String oldIllness = this.illness;
        this.illness = illness;
        changeSupport.firePropertyChange("illness", oldIllness, illness);
    }

    public Long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(Long phoneno) {
        Long oldPhoneno = this.phoneno;
        this.phoneno = phoneno;
        changeSupport.firePropertyChange("phoneno", oldPhoneno, phoneno);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (doctorid != null ? doctorid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Doctor)) {
            return false;
        }
        Doctor other = (Doctor) object;
        if ((this.doctorid == null && other.doctorid != null) || (this.doctorid != null && !this.doctorid.equals(other.doctorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Doctor[ doctorid=" + doctorid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
