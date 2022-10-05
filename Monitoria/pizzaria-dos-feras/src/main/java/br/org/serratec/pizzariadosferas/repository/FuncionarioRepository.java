package br.org.serratec.pizzariadosferas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.serratec.pizzariadosferas.model.funcionario;


@Repository
public interface FuncionarioRepository extends JpaRepository<funcionario,Long > {
	

}
