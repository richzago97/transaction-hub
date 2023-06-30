package br.com.richard.learningspring.dto;

import br.com.richard.learningspring.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.antlr.v4.runtime.misc.NotNull;

public class CreateTransactionDto {

    private long payer_id;


    private long payee_id;


    private float value;

    public long getPayer_id() {
        return payer_id;
    }

    public void setPayer_id(long payer_id) {
        this.payer_id = payer_id;
    }

    public long getPayee_id() {
        return payee_id;
    }

    public void setPayee_id(long payee_id) {
        this.payee_id = payee_id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
