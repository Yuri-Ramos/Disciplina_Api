package br.org.serratec.pizzariadosferas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.pizzariadosferas.model.funcionario;
import br.org.serratec.pizzariadosferas.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
 private FuncionarioRepository repositorio;
	
	public List<Funcionario> obterTodos(){
		//Aqui peg todos os funcionarios do banco
		return repositorio.findAll();
	}
	public Optional<Funcionario> obterPorId(){
		//Aqui peg todos os funcionarios do banco por id
		return repositorio.findById(id);
	}
	public funcionario cadastrar(Funcionario funcionario) {
		// Aqui salva vem a regra de negocio
		//salva o funcionario
		return repositorio.save(funcionario);
	}
	public funcionario atualizar(Long id, br.org.serratec.pizzariadosferas.model.funcionario funcionario) {
		// Aqui salva vem a regra de negocio
		//salva o funcionario
		funcionario.setId(id);
		return repositorio.save(funcionario);
	}
	public void deletar(Long id) {
		repositoro
		
	}
}
