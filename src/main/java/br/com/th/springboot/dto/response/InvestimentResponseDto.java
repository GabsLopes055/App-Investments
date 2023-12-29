package br.com.th.springboot.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import br.com.th.springboot.entity.Investment;
import br.com.th.springboot.entity.Stock;
import lombok.Data;

@Data
public class InvestimentResponseDto {

    private Long id;
    private Long clientId;
    private String name;
    private double amount;
    private Boolean indicadorCarencia;
    private List<Stock> stocks;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    

    public static InvestimentResponseDto fromEntity(Investment investimento){
        
        var response = new InvestimentResponseDto();
        
        response.setId(investimento.getId());
        response.setClientId(investimento.getCliente().getId());
        response.setName(investimento.getName());
        response.setAmount(investimento.getAmount());
        response.setIndicadorCarencia(investimento.getIndicadorCarencia());
        
        response.setCreatedAt(investimento.getCreatedAt());
        response.setUpdatedAt(investimento.getUpdatedAt());

        // System.out.println("Ações dos Investimentos: "+investimento.getInvestmentStock().toString());

        return response;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
