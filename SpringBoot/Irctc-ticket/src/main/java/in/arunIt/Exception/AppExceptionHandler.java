package in.arunIt.Exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.arunIt.binding.ExInfo;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<ExInfo> handlerException(Exception e){


		ExInfo info=new ExInfo();
		info.setExCode("SBI0001");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDate.now());
		return new ResponseEntity<> (info, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
