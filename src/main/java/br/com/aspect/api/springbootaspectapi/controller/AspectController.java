package br.com.aspect.api.springbootaspectapi.controller;

import br.com.aspect.api.springbootaspectapi.dto.DadosPessoaDTO;
import br.com.aspect.api.springbootaspectapi.iface.Timed;
import br.com.aspect.api.springbootaspectapi.service.AspectService;
import br.com.aspect.api.springbootaspectapi.util.NameParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/aspect")
public class AspectController {

    @Autowired
    AspectService service;

    @Timed
    @RequestMapping(value="/all", method=RequestMethod.GET)
    public ResponseEntity<List<DadosPessoaDTO>> buscarDados(@RequestParam(value = NameParams.NOME, required = false) String nome) {
        return ResponseEntity.ok().body(service.findDados(nome));
    }

}
