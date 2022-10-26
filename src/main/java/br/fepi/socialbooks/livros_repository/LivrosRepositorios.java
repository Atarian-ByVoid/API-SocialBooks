package br.fepi.socialbooks.livros_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.fepi.socialbooks.domain.Livro;

public interface LivrosRepositorios extends JpaRepository <Livro, Long>{


    
}
