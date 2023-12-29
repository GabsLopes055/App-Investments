package br.com.th.springboot.dto.response;

import java.util.List;

import lombok.Data;

@Data
public class JwtResponseDto {

    private String type;
    private String token;

    private List<FieldError> erros;
    
    public static JwtResponseDto fromEntity(String type, String token, List<FieldError> erros){
        var response = new JwtResponseDto();
        
        response.setType(type);
        response.setToken(token);
        response.setErros(erros);
        
        return response;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<FieldError> getErros() {
        return erros;
    }

    public void setErros(List<FieldError> erros) {
        this.erros = erros;
    }
}
