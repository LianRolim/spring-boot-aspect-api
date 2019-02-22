package br.com.aspect.api.springbootaspectapi.service;

import br.com.aspect.api.springbootaspectapi.component.PopulaDadosComponent;
import br.com.aspect.api.springbootaspectapi.dto.DadosPessoaDTO;
import br.com.aspect.api.springbootaspectapi.iface.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AspectService {

    @Autowired
    PopulaDadosComponent component;

    @Timed
    public List<DadosPessoaDTO> findDados(String nome) {
        return component.populaDadosRetorno();
    }

}
