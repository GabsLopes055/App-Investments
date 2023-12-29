package br.com.th.springboot.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class InvestimentRequest {

    private Long id;

    @NotBlank(message = "O nome do investimento não pode ser em branco.")
    private String name;

    @Min(1)
    @NotNull(message = "Informe o id do client do investimento.")
    private Long clientId;

    @NotNull(message = "Informe o valor do investimento.")
    private double amount;

    @NotNull(message = "Informe o indicador de carência.")
    private Boolean indicadorCarencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Boolean getIndicadorCarencia() {
        return indicadorCarencia;
    }

    public void setIndicadorCarencia(Boolean indicadorCarencia) {
        this.indicadorCarencia = indicadorCarencia;
    }
}
