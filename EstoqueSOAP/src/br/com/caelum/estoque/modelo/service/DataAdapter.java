package br.com.caelum.estoque.modelo.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DataAdapter extends XmlAdapter<Date, String> {
	
	private String pattern= "dd/MM/yyyy";
	




	@Override
	public String unmarshal(Date date) throws Exception {
		return new SimpleDateFormat().format(date);
	}

	@Override
	public Date marshal(String dataString) throws Exception {
		return new SimpleDateFormat(this.pattern).parse(dataString);
	}
	
}
