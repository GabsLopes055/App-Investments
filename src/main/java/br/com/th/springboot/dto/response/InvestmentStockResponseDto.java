package br.com.th.springboot.dto.response;

import java.util.List;
import java.util.stream.Collectors;

import br.com.th.springboot.entity.Investment;
import lombok.Data;

@Data
public class InvestmentStockResponseDto {

    private InvestimentResponseDto investment;
    private List<StockInvestmentResponseDto> stocks;
    

    public static InvestmentStockResponseDto fromEntity(Investment investment){
        
        var response = new InvestmentStockResponseDto();
        
        response.setInvestment(InvestimentResponseDto.fromEntity(investment));

        response.setStocks(
            investment.getInvestmentStock().stream().map(StockInvestmentResponseDto::fromEntity).collect(Collectors.toList())
        );

        
        return response;
    }

    public InvestimentResponseDto getInvestment() {
        return investment;
    }

    public void setInvestment(InvestimentResponseDto investment) {
        this.investment = investment;
    }

    public List<StockInvestmentResponseDto> getStocks() {
        return stocks;
    }

    public void setStocks(List<StockInvestmentResponseDto> stocks) {
        this.stocks = stocks;
    }
}
