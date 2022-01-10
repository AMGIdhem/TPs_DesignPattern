package com.example.banquebatch.batch;

import com.example.banquebatch.dao.TransactionRepository;
import com.example.banquebatch.entities.Transaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionWriter implements ItemWriter<Transaction> {

    @Autowired
    private TransactionRepository transactionRepository;


    @Override
    public void write(List<? extends Transaction> transactions) throws Exception {
        for(Transaction transaction : transactions){
            transactionRepository.save(transaction);
        }

    }
}
