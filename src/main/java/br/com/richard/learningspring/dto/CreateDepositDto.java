package br.com.richard.learningspring.dto;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;



public class CreateDepositDto {
    @NotNull(message = "value cannot be null")
    @DecimalMin(value = "0.01", message= "value must be higher than 0.01")
    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
