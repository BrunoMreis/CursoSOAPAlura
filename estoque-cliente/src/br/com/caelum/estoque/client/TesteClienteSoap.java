package br.com.caelum.estoque.client;

public class TesteClienteSoap {

	public static void main(String[] args) {

		EstoqueWS estoqueWS = new EstoqueWS_Service().getEstoqueWSPort();
	
		Filtro filtro = new Filtro();
		filtro.setNome("DeLL");
		filtro.setTipo(TipoItem.TABLET);
		
		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);

		
		ListaItens lista = estoqueWS.todosOsItens(filtros);
	
		for (Item item : lista.getItem()) {
			System.out.println(item.getCodigo());
			System.out.println(item.getNome());
			System.out.println(item.getTipo());
			System.out.println(item.getQuantidade());
		}
	}

}
