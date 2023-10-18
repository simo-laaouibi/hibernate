/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;

/**
 *
 * @author SIMO LAAOUIBI
 */
@Embeddable
public class MariagePK implements Serializable {
    
    private int femme ;
    private int homme ;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut ;

    public MariagePK() {
    }

    public MariagePK(int femme, int homme, Date dateDebut) {
        this.femme = femme;
        this.homme = homme;
        this.dateDebut = dateDebut;
    }

    public int getFemme() {
        return femme;
    }

    public void setFemme(int femme) {
        this.femme = femme;
    }

    public int getHomme() {
        return homme;
    }

    public void setHomme(int homme) {
        this.homme = homme;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Override
    public String toString() {
        return "MariagePK{" + "femme=" + femme + ", homme=" + homme + ", dateDebut=" + dateDebut + '}';
    }
    
    
    
}
