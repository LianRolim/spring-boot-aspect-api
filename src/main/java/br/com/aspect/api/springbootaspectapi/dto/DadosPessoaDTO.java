package br.com.aspect.api.springbootaspectapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DadosPessoaDTO implements Serializable {
    private static final long serialVersionUID = -1L;

    private String nome;
    private String sexo;
    private Integer idade;
    private String email;

}
