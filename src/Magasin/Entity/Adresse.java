/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magasin.Entity;

import javax.persistence.Embeddable;

/**
 *
 * @author admin
 */
@Embeddable
public class Adresse {
   private String rue;
    private String numero;
    private Integer codePostal;
    private  String pays;
    private String ville; 
    
    
}
