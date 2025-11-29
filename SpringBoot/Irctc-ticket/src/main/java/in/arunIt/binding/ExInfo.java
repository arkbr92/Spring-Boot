package in.arunIt.binding;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Data;



public class ExInfo {
	private String exCode;
	private String exMsg;
	private LocalDate exDate;
	public String getExCode() {
		return exCode;
	}
	public void setExCode(String exCode) {
		this.exCode = exCode;
	}
	public String getExMsg() {
		return exMsg;
	}
	public void setExMsg(String exMsg) {
		this.exMsg = exMsg;
	}
	public LocalDate getExDate() {
		return exDate;
	}
	public void setExDate(LocalDate exDate) {
		this.exDate = exDate;
	}
	

}
