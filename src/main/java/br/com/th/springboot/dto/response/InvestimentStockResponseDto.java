package br.com.th.springboot.dto.response;

import br.com.th.springboot.entity.InvestmentStock;
import lombok.Data;

@Data
public class InvestimentStockResponseDto {

    private String stock;
    private double percent;
    
    

    public static InvestimentStockResponseDto fromEntity(InvestmentStock investimento){
        var response = new InvestimentStockResponseDto();
       
        response.setStock(investimento.getStock().getName());
        response.setPercent(investimento.getPercent());
        
        return response;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
