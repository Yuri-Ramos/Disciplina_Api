package br.org.serratec.pizzariadosferas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.serratec.pizzariadosferas.model.funcionario;
import br.org.serratec.pizzariadosferas.service.FuncionarioService;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {
	
	private FuncionarioService servico;
	
	
	@GetMapping
	public List<funcionario> obterTodos(){
		return servico.obterTodos();
	}
	@GetMapping("{id}")
	public Optional<funcionario> obterPorId(@PathVariable Long id){
		return servico.obterPorId();
	}
	@PostMapping
	public funcionario cadastrar(@RequestBody Funcionario funcionario) {
		return servico.cadastrar(funcionario);
		
		
	}
	@PutMapping
	public Funcionario atualizar(@PathVariable Long id, @RequestBody Funcionario funcionario) {
		return servico.atualizar(id, funcionario);
				
	}
	@DeleteMapping("(id")		
	
}
