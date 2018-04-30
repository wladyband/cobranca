package com.iape.cobranca.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iape.cobranca.model.Conta;
import com.iape.cobranca.repository.ContaRepository;

@RestController
@RequestMapping("/")
public class ContaResource {

	@Autowired
	private ContaRepository contaRepository;
	
	@GetMapping
	public List<Conta> lista(){
		return contaRepository.findAll();
	}
	
	
}
