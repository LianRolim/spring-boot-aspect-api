package br.com.aspect.api.springbootaspectapi.component;

import br.com.aspect.api.springbootaspectapi.dto.DadosPessoaDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopulaDadosComponent {

    public List<DadosPessoaDTO> populaDadosRetorno(){

        List<DadosPessoaDTO> pessoa = new ArrayList<>();

        pessoa.add(DadosPessoaDTO
                .builder()
                .email("lianrolim@gmail.com")
                .idade(27)
                .nome("Lian Rolim")
                .sexo("MASCULINO")
                .build());

        pessoa.add(DadosPessoaDTO
                .builder()
                .email("teste@gmail.com")
                .idade(14)
                .nome("Teste Um")
                .sexo("MASCULINO")
                .build());

        pessoa.add(DadosPessoaDTO
                .builder()
                .email("teste@gmail.com")
                .idade(19)
                .nome("Gabriela Teste")
                .sexo("FEMININO")
                .build());

        return pessoa;

    }


}
