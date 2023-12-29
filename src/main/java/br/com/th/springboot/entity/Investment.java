package br.com.th.springboot.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data

@Entity
@Table(name = "investments")
public class Investment {
    

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    @NotNull
    private double amount;

    @NotNull
    private Boolean indicadorCarencia;
 
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    // Relacionamento one to many com investimentos <-> clients ou vice versa
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id",  nullable = false)
    Client cliente;
        
    //Relacionamento many to many com clients <-> investiments ou vice versa
    @OneToMany(mappedBy = "investment", fetch=FetchType.LAZY, cascade = CascadeType.ALL , orphanRemoval = true)
    List<InvestmentStock> investmentStock;


    @PrePersist
    public void prePersist(){
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }

    @PreUpdate
    public void preUpdate(){
        this.setUpdatedAt(LocalDateTime.now());
    }


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

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public List<InvestmentStock> getInvestmentStock() {
        return investmentStock;
    }

    public void setInvestmentStock(List<InvestmentStock> investmentStock) {
        this.investmentStock = investmentStock;
    }
}
