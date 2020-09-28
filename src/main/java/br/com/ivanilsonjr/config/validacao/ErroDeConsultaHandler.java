package br.com.ivanilsonjr.config.validacao;


import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class ErroDeConsultaHandler{

	@ExceptionHandler(value=HttpClientErrorException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public ModelAndView handle(HttpClientErrorException exception,Model model){
			ErroDto erro = new ErroDto(exception.getRawStatusCode(), exception.getStatusText());
			ModelAndView mv = new ModelAndView("error/erroView");
			mv.addObject("mensagemCodigo", erro.getCodigoErro());
			mv.addObject("mensagemErro","Erro: " + erro.getErro() + ", verifique com o administrador.");
			return mv;
	}
	
	@ExceptionHandler(value=HttpServerErrorException.class)
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView handle2(HttpServerErrorException exception,Model model){
			ErroDto erro = new ErroDto(exception.getRawStatusCode(), exception.getStatusText());
			ModelAndView mv = new ModelAndView("error/erroView");
			mv.addObject("mensagemCodigo", erro.getCodigoErro());
			mv.addObject("mensagemErro","Erro: " + erro.getErro() + ", verifique com o administrador.");
			return mv;
	}
	
}
