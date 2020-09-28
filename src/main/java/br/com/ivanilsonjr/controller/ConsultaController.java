package br.com.ivanilsonjr.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.ivanilsonjr.controller.dto.ConsultaDto;
import br.com.ivanilsonjr.model.Cep;
import br.com.ivanilsonjr.service.ViaCepService;

@Controller
public class ConsultaController {

	@Autowired
	ViaCepService viaCepService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("cepInserido") Cep cep) {
		return "index";
	}
	
	@PostMapping(value="/")
	public String consultarCep(@ModelAttribute("cepInserido") @Valid Cep cep, BindingResult result, RedirectAttributes attributes, Model model){
		String codigoSemMascara = cep.getCodigo()
				.replace(".","")
				.replace("-","");
		if(result.hasErrors()) {
			return "index";
		}else {
		ResponseEntity<ConsultaDto> consultaResultado = viaCepService.consultarCep(codigoSemMascara);
			if(consultaResultado != null) {
			model.addAttribute("cep" , consultaResultado.getBody());
			model.addAttribute("mensagem", "Consulta concluída com sucesso.");
				return "index";
			}else {
				attributes.addFlashAttribute("mensagemErro", "CEP não encontrado no banco de dados do ViaCEP, tente novamente.");
				return "redirect:/";
			}
		}

		
		
	}
}
