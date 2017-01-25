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
@Table(name = "ROOMNO", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Roomno_1.findAll", query = "SELECT r FROM Roomno_1 r"),
    @NamedQuery(name = "Roomno_1.findByRoomno", query = "SELECT r FROM Roomno_1 r WHERE r.roomno = :roomno"),
    @NamedQuery(name = "Roomno_1.findByLocation", query = "SELECT r FROM Roomno_1 r WHERE r.location = :location")})
public class Roomno_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ROOMNO")
    private Short roomno;
    @Column(name = "LOCATION")
    private String location;

    public Roomno_1() {
    }

    public Roomno_1(Short roomno) {
        this.roomno = roomno;
    }

    public Short getRoomno() {
        return roomno;
    }

    public void setRoomno(Short roomno) {
        Short oldRoomno = this.roomno;
        this.roomno = roomno;
        changeSupport.firePropertyChange("roomno", oldRoomno, roomno);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomno != null ? roomno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomno_1)) {
            return false;
        }
        Roomno_1 other = (Roomno_1) object;
        if ((this.roomno == null && other.roomno != null) || (this.roomno != null && !this.roomno.equals(other.roomno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Roomno_1[ roomno=" + roomno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
