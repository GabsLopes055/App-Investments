package br.com.th.springboot.dto.response;

import java.time.LocalDateTime;

import br.com.th.springboot.entity.Stock;
import lombok.Data;

@Data
public class StockResponseDto {

    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static StockResponseDto fromEntity(Stock stock){
        
        var response = new StockResponseDto();
        response.setId(stock.getId());
        response.setName(stock.getName());
        response.setCreatedAt(stock.getCreatedAt());
        response.setUpdatedAt(stock.getUpdatedAt());

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
