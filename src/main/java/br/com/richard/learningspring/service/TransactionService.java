package br.com.richard.learningspring.service;

import br.com.richard.learningspring.dto.CreateTransactionDto;
import br.com.richard.learningspring.model.Transaction;

public interface TransactionService {

    Transaction createTransaction(final CreateTransactionDto transactionData);

    Transaction retrieveTransaction(final long id);

}
