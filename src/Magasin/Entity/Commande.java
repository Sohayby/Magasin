/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magasin.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author admin
 */
@Entity
public class Commande implements Serializable {

    public enum Statut {
        EN_COURS,
        TERMINEE,
        PAYE,
        LIVREE
    }
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     @ManyToOne //définit type de jointure
    @JoinColumn(name = "client_id")
     private Client client;
    
    @Embedded
    private Adresse adresse;
    private String moyenDePaiement;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getMoyenDePaiement() {
        return moyenDePaiement;
    }

    public void setMoyenDePaiement(String moyenDePaiement) {
        this.moyenDePaiement = moyenDePaiement;
    }

    public String getModeDeLivraison() {
        return modeDeLivraison;
    }

    public void setModeDeLivraison(String modeDeLivraison) {
        this.modeDeLivraison = modeDeLivraison;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public float getFraisDePort() {
        return fraisDePort;
    }

    public void setFraisDePort(float fraisDePort) {
        this.fraisDePort = fraisDePort;
    }

    public Date getDateEtHeure() {
        return dateEtHeure;
    }

    public void setDateEtHeure(Date dateEtHeure) {
        this.dateEtHeure = dateEtHeure;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Statut getStatut() {
        return Statut;
    }

    public void setStatut(Statut Statut) {
        this.Statut = Statut;
    }
    private String modeDeLivraison;
    private float prixTotal;
    private float fraisDePort;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEtHeure;
    @Temporal(TemporalType.DATE)
    private Date dateLivraison;
    @Enumerated(EnumType.STRING)
    private Statut Statut;

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Magasin.Entity.Commande[ id=" + id + " ]";
    }

}
