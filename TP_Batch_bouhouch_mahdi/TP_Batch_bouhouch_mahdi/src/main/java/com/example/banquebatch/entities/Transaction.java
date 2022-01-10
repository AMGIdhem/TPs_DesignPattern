package com.example.banquebatch.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction  implements Serializable {
    @Id
    private int idTransaction;
    private double montant;
    private Date dateTransaction;
    private Date dateDebit;

    @OneToOne(cascade = {CascadeType.ALL})
    private Compte compte;

}
