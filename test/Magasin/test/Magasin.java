/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magasin.test;

import Magasin.Entity.Categorie;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class Magasin {
    @Test
    public void Magasin() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        Categorie c1=new Categorie ();
        c1.setNom("chaussures à talons");
        
  
        em.persist(c1);
        em.getTransaction().commit();
        
        
        
        Persistence.createEntityManagerFactory("PU");
         
    }
    
}
