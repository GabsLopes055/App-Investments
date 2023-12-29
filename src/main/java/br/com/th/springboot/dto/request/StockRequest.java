package br.com.th.springboot.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class StockRequest {

    private Long id;

    @NotBlank(message = "O nome da ação não pode ser em branco.")
    private String name;

    private double percent;

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

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
