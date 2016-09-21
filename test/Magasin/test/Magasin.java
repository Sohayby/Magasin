/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magasin.test;

import Magasin.Entity.Categorie;
import Magasin.Entity.Produit;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class Magasin {

    @Test
    public void testeListeProduit() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Categorie cat = em.find(Categorie.class, (long) 202);
        for (Produit p : cat.getProduits()) {
            System.out.println(p);
        }
    }

//    @Test 
    public void Magasin() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();

        Categorie c1 = new Categorie();
        c1.setNom("Basket");
        em.persist(c1);

        Categorie c2 = new Categorie();
        c2.setNom("lunettes solaires");
        em.persist(c2);

        Produit rayban = new Produit();
        rayban.setCategorie(c2);
        em.persist(rayban);

        em.getTransaction().commit();

    }

}
