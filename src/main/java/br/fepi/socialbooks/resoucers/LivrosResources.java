package br.fepi.socialbooks.resoucers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.socialbooks.domain.Livro;

@RestController
public class LivrosResources {
	
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public List<Livro> listar() {
		
		Livro livro1 = new Livro("Manual do Imério");
		Livro livro2 = new Livro("DUNA");
		Livro livro3 = new Livro("Game Of Thrones");
		Livro livro4 = new Livro("Uma odisséia no espaço");
		Livro livro5 = new Livro("Artemis");
		Livro livro6 = new Livro("Diário perdido");
		Livro livro7 = new Livro("zelda Ocarina Of Time");
		Livro livro8 = new Livro("A queda de gondolin");
		Livro livro9 = new Livro("Dracula");
		Livro livro10 = new Livro("O Senhor do Anéis");
		Livro livro11 = new Livro("Hoobit");
		Livro livro12 = new Livro("Ivan o terrivel");
		Livro livro13 = new Livro("Moby Dicky");
		Livro livro14 = new Livro("Viagem ao centro da terra");
		Livro livro15 = new Livro("Star War: uma nova esperança");
		Livro livro16 = new Livro("Cyberpunk 2020");
		Livro livro17 = new Livro("Necromancer");
		Livro livro18 = new Livro("Phantastes");
		Livro livro19 = new Livro("Interstelar");
		Livro livro20 = new Livro("Perdido em marte");
		Livro livro21 = new Livro("As Viagens de Guliver");
		Livro livro22 = new Livro("Alice no país das maravilhas");
		Livro livro23 = new Livro("Mil e uma noites");
		Livro livro24 = new Livro("O manifesto comunista");
		Livro livro25 = new Livro("O capital");


		Livro[] livros = {livro1, livro2, livro3, livro4,livro5,livro6,livro7,livro8,
			livro9,livro10,livro11,livro12,livro13,livro14,livro15,livro16,livro17,livro18,livro19,livro20,
			livro21,livro22,livro23,livro24,livro25};
		
		return Arrays.asList(livros);
				
	}
	
}
