package br.fepi.socialbooks.resoucers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.socialbooks.domain.Livro;
import br.fepi.socialbooks.livros_repository.LivrosRepositorios;

@RestController
@RequestMapping(value = "/livros")
public class LivrosResources {

	@Autowired
	private LivrosRepositorios livro_repository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Livro> listar() {

		return livro_repository.findAll();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Livro buscaId(@PathVariable("id") Long id) {

		return livro_repository.findById(id).orElse(null);

	}

	@RequestMapping(method = RequestMethod.POST)
	public void inserir(@RequestBody Livro livro) {

		livro_repository.save(livro);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id")Long id){

		livro_repository.deleteById(id);
  

		}

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void alterar (@RequestBody Livro livro, 
	@PathVariable("id")Long id){

		livro.setId(id);
		livro_repository.save(livro);


	}
}