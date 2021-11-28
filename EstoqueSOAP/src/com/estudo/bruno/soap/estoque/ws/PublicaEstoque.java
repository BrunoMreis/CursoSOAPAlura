package com.estudo.bruno.soap.estoque.ws;

import jakarta.xml.ws.Endpoint;

public class PublicaEstoque {

	public static void main(String[] args) {
		
		
		EstoqueWS implementacaoWS = new EstoqueWS();
		String URL = "http://localhost:8080/estoquews";

		System.out.println("EstoqueWS rodando: " + URL);

		//associando URL com a implementacao
		Endpoint.publish(URL, implementacaoWS);
		
		
	}

}
