
package br.com.correiosws;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalcPrecoPrazoWSSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalcPrecoPrazoWSSoap {


    /**
     * Calcula o pre?o e o prazo com a data atual
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrecoPrazo", action = "http://tempuri.org/CalcPrecoPrazo")
    @WebResult(name = "CalcPrecoPrazoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrecoPrazo", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoPrazo")
    @ResponseWrapper(localName = "CalcPrecoPrazoResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoPrazoResponse")
    public CResultado calcPrecoPrazo(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        String sCdAvisoRecebimento);

    /**
     * Calcula o pre?o e o prazo com uma data especificada
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDtCalculo
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrecoPrazoData", action = "http://tempuri.org/CalcPrecoPrazoData")
    @WebResult(name = "CalcPrecoPrazoDataResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrecoPrazoData", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoPrazoData")
    @ResponseWrapper(localName = "CalcPrecoPrazoDataResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoPrazoDataResponse")
    public CResultado calcPrecoPrazoData(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        String sCdAvisoRecebimento,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        String sDtCalculo);

    /**
     * Calcula o pre?o e o prazo considerando as restri??es de entrega
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDtCalculo
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrecoPrazoRestricao", action = "http://tempuri.org/CalcPrecoPrazoRestricao")
    @WebResult(name = "CalcPrecoPrazoRestricaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrecoPrazoRestricao", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoPrazoRestricao")
    @ResponseWrapper(localName = "CalcPrecoPrazoRestricaoResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoPrazoRestricaoResponse")
    public CResultado calcPrecoPrazoRestricao(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        String sCdAvisoRecebimento,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        String sDtCalculo);

    /**
     * Calcula somente o pre?o com a data atual
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPreco", action = "http://tempuri.org/CalcPreco")
    @WebResult(name = "CalcPrecoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPreco", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPreco")
    @ResponseWrapper(localName = "CalcPrecoResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoResponse")
    public CResultado calcPreco(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        String sCdAvisoRecebimento);

    /**
     * Calcula somente o pre?o com uma data especificada
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDtCalculo
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrecoData", action = "http://tempuri.org/CalcPrecoData")
    @WebResult(name = "CalcPrecoDataResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrecoData", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoData")
    @ResponseWrapper(localName = "CalcPrecoDataResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoDataResponse")
    public CResultado calcPrecoData(
        @WebParam(name = "nCdEmpresa", targetNamespace = "http://tempuri.org/")
        String nCdEmpresa,
        @WebParam(name = "sDsSenha", targetNamespace = "http://tempuri.org/")
        String sDsSenha,
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        String nVlPeso,
        @WebParam(name = "nCdFormato", targetNamespace = "http://tempuri.org/")
        int nCdFormato,
        @WebParam(name = "nVlComprimento", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlComprimento,
        @WebParam(name = "nVlAltura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlAltura,
        @WebParam(name = "nVlLargura", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlLargura,
        @WebParam(name = "nVlDiametro", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlDiametro,
        @WebParam(name = "sCdMaoPropria", targetNamespace = "http://tempuri.org/")
        String sCdMaoPropria,
        @WebParam(name = "nVlValorDeclarado", targetNamespace = "http://tempuri.org/")
        BigDecimal nVlValorDeclarado,
        @WebParam(name = "sCdAvisoRecebimento", targetNamespace = "http://tempuri.org/")
        String sCdAvisoRecebimento,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        String sDtCalculo);

    /**
     * Calcula somente o prazo com a data atual
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrazo", action = "http://tempuri.org/CalcPrazo")
    @WebResult(name = "CalcPrazoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrazo", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazo")
    @ResponseWrapper(localName = "CalcPrazoResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazoResponse")
    public CResultado calcPrazo(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino);

    /**
     * Calcula somente o prazo com uma data especificada
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @param sDtCalculo
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrazoData", action = "http://tempuri.org/CalcPrazoData")
    @WebResult(name = "CalcPrazoDataResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrazoData", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazoData")
    @ResponseWrapper(localName = "CalcPrazoDataResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazoDataResponse")
    public CResultado calcPrazoData(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        String sDtCalculo);

    /**
     * Calcula o prazo considerando restri??o de entrega
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @param sDtCalculo
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrazoRestricao", action = "http://tempuri.org/CalcPrazoRestricao")
    @WebResult(name = "CalcPrazoRestricaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrazoRestricao", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazoRestricao")
    @ResponseWrapper(localName = "CalcPrazoRestricaoResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazoRestricaoResponse")
    public CResultado calcPrazoRestricao(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        String sDtCalculo);

    /**
     * Calcula os pre?os dos servi?os FAC
     * 
     * @param nVlPeso
     * @param strDataCalculo
     * @param nCdServico
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(operationName = "CalcPrecoFAC", action = "http://tempuri.org/CalcPrecoFAC")
    @WebResult(name = "CalcPrecoFACResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcPrecoFAC", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoFAC")
    @ResponseWrapper(localName = "CalcPrecoFACResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrecoFACResponse")
    public CResultado calcPrecoFAC(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "nVlPeso", targetNamespace = "http://tempuri.org/")
        String nVlPeso,
        @WebParam(name = "strDataCalculo", targetNamespace = "http://tempuri.org/")
        String strDataCalculo);

    /**
     * Calcula a data m?xima de entrega de determinado objeto
     * 
     * @param codigoObjeto
     * @return
     *     returns br.com.correiosws.CResultadoObjeto
     */
    @WebMethod(operationName = "CalcDataMaxima", action = "http://tempuri.org/CalcDataMaxima")
    @WebResult(name = "CalcDataMaximaResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CalcDataMaxima", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcDataMaxima")
    @ResponseWrapper(localName = "CalcDataMaximaResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcDataMaximaResponse")
    public CResultadoObjeto calcDataMaxima(
        @WebParam(name = "codigoObjeto", targetNamespace = "http://tempuri.org/")
        String codigoObjeto);

    /**
     * Lista os servi?os que est?o dispon?veis para c?lculo de pre?o e/ou prazo
     * 
     * @return
     *     returns br.com.correiosws.CResultadoServicos
     */
    @WebMethod(operationName = "ListaServicos", action = "http://tempuri.org/ListaServicos")
    @WebResult(name = "ListaServicosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListaServicos", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.ListaServicos")
    @ResponseWrapper(localName = "ListaServicosResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.ListaServicosResponse")
    public CResultadoServicos listaServicos();

    /**
     * Lista os servi?os que s?o calculados pelo STAR
     * 
     * @return
     *     returns br.com.correiosws.CResultadoServicos
     */
    @WebMethod(operationName = "ListaServicosSTAR", action = "http://tempuri.org/ListaServicosSTAR")
    @WebResult(name = "ListaServicosSTARResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ListaServicosSTAR", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.ListaServicosSTAR")
    @ResponseWrapper(localName = "ListaServicosSTARResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.ListaServicosSTARResponse")
    public CResultadoServicos listaServicosSTAR();

    /**
     * M?todo para mostrar se o trecho consultado utiliza modal a?reo ou terrestre
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @return
     *     returns br.com.correiosws.CResultadoModal
     */
    @WebMethod(operationName = "VerificaModal", action = "http://tempuri.org/VerificaModal")
    @WebResult(name = "VerificaModalResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "VerificaModal", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.VerificaModal")
    @ResponseWrapper(localName = "VerificaModalResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.VerificaModalResponse")
    public CResultadoModal verificaModal(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino);

    /**
     * Retorna a vers?o atual do componente
     * 
     * @return
     *     returns br.com.correiosws.Versao
     */
    @WebMethod(action = "http://tempuri.org/getVersao")
    @WebResult(name = "getVersaoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getVersao", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.GetVersao")
    @ResponseWrapper(localName = "getVersaoResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.GetVersaoResponse")
    public Versao getVersao();

    /**
     * Calcula o prazo usando nova procedure
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param strVerificaRestricao
     * @param sCepOrigem
     * @param sDtCalculo
     * @return
     *     returns br.com.correiosws.CResultado
     */
    @WebMethod(action = "http://tempuri.org/calcPrazoNovo")
    @WebResult(name = "calcPrazoNovoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "calcPrazoNovo", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazoNovo")
    @ResponseWrapper(localName = "calcPrazoNovoResponse", targetNamespace = "http://tempuri.org/", className = "br.com.correiosws.CalcPrazoNovoResponse")
    public CResultado calcPrazoNovo(
        @WebParam(name = "nCdServico", targetNamespace = "http://tempuri.org/")
        String nCdServico,
        @WebParam(name = "sCepOrigem", targetNamespace = "http://tempuri.org/")
        String sCepOrigem,
        @WebParam(name = "sCepDestino", targetNamespace = "http://tempuri.org/")
        String sCepDestino,
        @WebParam(name = "sDtCalculo", targetNamespace = "http://tempuri.org/")
        String sDtCalculo,
        @WebParam(name = "strVerificaRestricao", targetNamespace = "http://tempuri.org/")
        String strVerificaRestricao);

}
