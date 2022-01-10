package com.example.banquebatch.batch;

import java.util.Date;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.example.banquebatch.entities.Compte;
import com.example.banquebatch.entities.Transaction;
import com.example.banquebatch.entities.TransactionDto;

import lombok.extern.slf4j.Slf4j;
	
@Slf4j
@Service
public class TransactionProcessor implements ItemProcessor<TransactionDto, Transaction> {

    @Override
    public Transaction process(final TransactionDto transactionDto) throws Exception {
        Transaction transformedTransaction = null;
        try {
            int idTransaction = transactionDto.getIdTransaction();
            double montant = transactionDto.getMontant();
            Date dateTransaction = transactionDto.getDateTransaction();
            int idCompte = transactionDto.getIdCompte();
            Compte transformedCompte = Compte.builder().idCompte(idCompte).solde(20000.00).build();
            transformedCompte.debiter(montant);
            transformedTransaction = new Transaction(idTransaction, montant, dateTransaction, new Date(), transformedCompte);
            log.info("Converting (" + transactionDto + ") into (" + transformedTransaction + ")");
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
        return transformedTransaction;
    }
}
