package br.com.richard.learningspring.dto;

import org.antlr.v4.runtime.misc.NotNull;



public class CreateDepositDto {
    @NotNull(message = "Value cannot be null")
    @DecimalMin(value = "0.01", message= "Value must be higher than 0.01")
    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
