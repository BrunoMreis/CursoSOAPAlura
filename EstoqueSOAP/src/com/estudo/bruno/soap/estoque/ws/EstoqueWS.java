package com.estudo.bruno.soap.estoque.ws;

import java.util.List;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ItemValidador;
import br.com.caelum.estoque.modelo.item.ListaItens;
import br.com.caelum.estoque.modelo.usuario.AutorizacaoException;
import br.com.caelum.estoque.modelo.usuario.TokenDao;
import br.com.caelum.estoque.modelo.usuario.TokenUsuario;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.ParameterStyle;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.xml.ws.ResponseWrapper;

@WebService
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public class EstoqueWS {

	private ItemDao dao = new ItemDao();

	@WebMethod(operationName = "todosOsItens")
	@ResponseWrapper(localName = "itens")
	@WebResult(name = "itens")
	public ListaItens getItens(@WebParam(name = "filtros") Filtros filtros) { // cuidado, plural
		System.out.println("Chamando getItens()");
		List<Filtro> lista = filtros.getLista();
		List<Item> itensResultado = dao.todosItens(lista);
		return new ListaItens(itensResultado);
	}

	@WebMethod(operationName = "cadastrarItem")
	@WebResult(name = "itens")
	public Item cadastrarItem(
			@WebParam(name = "tokenUsuario", header = true)TokenUsuario tokenUsuario,
			@WebParam(name = "item")Item item)
					throws AutorizacaoException {
		System.out.println("Cadastrando item " + item +" token "+ tokenUsuario);

		if(!new TokenDao().ehValido(tokenUsuario)) {
			throw new AutorizacaoException("Autorização falhou");
		}
		
		new ItemValidador(item).validate();
		
		dao.cadastrar(item);
		return item;
	}

	/*
	 * @WebMethod(operationName="todosOsItens")
	 * 
	 * @ResponseWrapper(localName="itens")
	 * 
	 * @WebResult(name="itens") public ArrayList<Item> getItens() {
	 * 
	 * System.out.println("Chamando getItens()"); return dao.todosItens();
	 * 
	 * }
	 */
}
