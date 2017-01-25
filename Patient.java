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
@Table(name = "PATIENT", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p"),
    @NamedQuery(name = "Patient.findById", query = "SELECT p FROM Patient p WHERE p.id = :id"),
    @NamedQuery(name = "Patient.findByName", query = "SELECT p FROM Patient p WHERE p.name = :name"),
    @NamedQuery(name = "Patient.findByTelephoneno", query = "SELECT p FROM Patient p WHERE p.telephoneno = :telephoneno"),
    @NamedQuery(name = "Patient.findByAddress", query = "SELECT p FROM Patient p WHERE p.address = :address"),
    @NamedQuery(name = "Patient.findByAge", query = "SELECT p FROM Patient p WHERE p.age = :age"),
    @NamedQuery(name = "Patient.findBySex", query = "SELECT p FROM Patient p WHERE p.sex = :sex"),
    @NamedQuery(name = "Patient.findByRoomno", query = "SELECT p FROM Patient p WHERE p.roomno = :roomno"),
    @NamedQuery(name = "Patient.findByDoctorid", query = "SELECT p FROM Patient p WHERE p.doctorid = :doctorid"),
    @NamedQuery(name = "Patient.findByProblem", query = "SELECT p FROM Patient p WHERE p.problem = :problem")})
public class Patient implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TELEPHONENO")
    private Long telephoneno;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "AGE")
    private Short age;
    @Column(name = "SEX")
    private Character sex;
    @Column(name = "ROOMNO")
    private Short roomno;
    @Column(name = "DOCTORID")
    private Integer doctorid;
    @Column(name = "PROBLEM")
    private String problem;

    public Patient() {
    }

    public Patient(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Long getTelephoneno() {
        return telephoneno;
    }

    public void setTelephoneno(Long telephoneno) {
        Long oldTelephoneno = this.telephoneno;
        this.telephoneno = telephoneno;
        changeSupport.firePropertyChange("telephoneno", oldTelephoneno, telephoneno);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        Short oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        Character oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public Short getRoomno() {
        return roomno;
    }

    public void setRoomno(Short roomno) {
        Short oldRoomno = this.roomno;
        this.roomno = roomno;
        changeSupport.firePropertyChange("roomno", oldRoomno, roomno);
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        Integer oldDoctorid = this.doctorid;
        this.doctorid = doctorid;
        changeSupport.firePropertyChange("doctorid", oldDoctorid, doctorid);
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        String oldProblem = this.problem;
        this.problem = problem;
        changeSupport.firePropertyChange("problem", oldProblem, problem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Patient[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
