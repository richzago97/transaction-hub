package br.com.richard.learningspring.repository;

import br.com.richard.learningspring.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
