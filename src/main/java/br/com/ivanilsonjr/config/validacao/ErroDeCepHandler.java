package br.com.ivanilsonjr.config.validacao;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;


@RestControllerAdvice
public class ErroDeCepHandler{

	@ExceptionHandler(value=HttpClientErrorException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public ErroDto handle(HttpClientErrorException exception){
			ErroDto erro = new ErroDto(exception.getRawStatusCode(), exception.getStatusText());
		return erro;
	}
	
}
