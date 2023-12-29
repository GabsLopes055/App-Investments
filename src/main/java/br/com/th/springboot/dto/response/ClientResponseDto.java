package br.com.th.springboot.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import br.com.th.springboot.entity.Client;
import lombok.Data;

@Data
public class ClientResponseDto {

    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<InvestimentResponseDto> investimentos;

    private List<FieldError> erros;

    public static ClientResponseDto fromEntity(Client client, List<InvestimentResponseDto> investimentos){
        var response = new ClientResponseDto();
        response.setId(client.getId());
        response.setName(client.getName());
        response.setEmail(client.getEmail());
        response.setCreatedAt(client.getCreatedAt());
        response.setUpdatedAt(client.getUpdatedAt());
        response.setInvestimentos(investimentos);

        return response;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<InvestimentResponseDto> getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(List<InvestimentResponseDto> investimentos) {
        this.investimentos = investimentos;
    }

    public List<FieldError> getErros() {
        return erros;
    }

    public void setErros(List<FieldError> erros) {
        this.erros = erros;
    }
}
