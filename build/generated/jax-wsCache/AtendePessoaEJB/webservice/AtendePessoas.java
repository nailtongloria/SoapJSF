
package webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AtendePessoas", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/ProjetoFinalDad/AtendePessoas/AtendePessoaEJB?wsdl")
public class AtendePessoas
    extends Service
{

    private final static URL ATENDEPESSOAS_WSDL_LOCATION;
    private final static WebServiceException ATENDEPESSOAS_EXCEPTION;
    private final static QName ATENDEPESSOAS_QNAME = new QName("http://webservice/", "AtendePessoas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProjetoFinalDad/AtendePessoas/AtendePessoaEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ATENDEPESSOAS_WSDL_LOCATION = url;
        ATENDEPESSOAS_EXCEPTION = e;
    }

    public AtendePessoas() {
        super(__getWsdlLocation(), ATENDEPESSOAS_QNAME);
    }

    public AtendePessoas(WebServiceFeature... features) {
        super(__getWsdlLocation(), ATENDEPESSOAS_QNAME, features);
    }

    public AtendePessoas(URL wsdlLocation) {
        super(wsdlLocation, ATENDEPESSOAS_QNAME);
    }

    public AtendePessoas(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ATENDEPESSOAS_QNAME, features);
    }

    public AtendePessoas(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AtendePessoas(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AtendePessoaEJB
     */
    @WebEndpoint(name = "AtendePessoaEJBPort")
    public AtendePessoaEJB getAtendePessoaEJBPort() {
        return super.getPort(new QName("http://webservice/", "AtendePessoaEJBPort"), AtendePessoaEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AtendePessoaEJB
     */
    @WebEndpoint(name = "AtendePessoaEJBPort")
    public AtendePessoaEJB getAtendePessoaEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "AtendePessoaEJBPort"), AtendePessoaEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ATENDEPESSOAS_EXCEPTION!= null) {
            throw ATENDEPESSOAS_EXCEPTION;
        }
        return ATENDEPESSOAS_WSDL_LOCATION;
    }

}