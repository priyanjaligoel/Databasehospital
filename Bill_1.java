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
@Table(name = "BILL", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Bill_1.findAll", query = "SELECT b FROM Bill_1 b"),
    @NamedQuery(name = "Bill_1.findByBill", query = "SELECT b FROM Bill_1 b WHERE b.bill = :bill"),
    @NamedQuery(name = "Bill_1.findByDoctorid", query = "SELECT b FROM Bill_1 b WHERE b.doctorid = :doctorid")})
public class Bill_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "BILL")
    private Long bill;
    @Id
    @Basic(optional = false)
    @Column(name = "DOCTORID")
    private Integer doctorid;

    public Bill_1() {
    }

    public Bill_1(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Long getBill() {
        return bill;
    }

    public void setBill(Long bill) {
        Long oldBill = this.bill;
        this.bill = bill;
        changeSupport.firePropertyChange("bill", oldBill, bill);
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        Integer oldDoctorid = this.doctorid;
        this.doctorid = doctorid;
        changeSupport.firePropertyChange("doctorid", oldDoctorid, doctorid);
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
        if (!(object instanceof Bill_1)) {
            return false;
        }
        Bill_1 other = (Bill_1) object;
        if ((this.doctorid == null && other.doctorid != null) || (this.doctorid != null && !this.doctorid.equals(other.doctorid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Bill_1[ doctorid=" + doctorid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
