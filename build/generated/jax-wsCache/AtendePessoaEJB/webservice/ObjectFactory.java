
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PesquisaPorNome_QNAME = new QName("http://webservice/", "pesquisaPorNome");
    private final static QName _ListarTodosResponse_QNAME = new QName("http://webservice/", "listarTodosResponse");
    private final static QName _ListarTodos_QNAME = new QName("http://webservice/", "listarTodos");
    private final static QName _PesquisaPorNomeResponse_QNAME = new QName("http://webservice/", "pesquisaPorNomeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTodosResponse }
     * 
     */
    public ListarTodosResponse createListarTodosResponse() {
        return new ListarTodosResponse();
    }

    /**
     * Create an instance of {@link PesquisaPorNome }
     * 
     */
    public PesquisaPorNome createPesquisaPorNome() {
        return new PesquisaPorNome();
    }

    /**
     * Create an instance of {@link PesquisaPorNomeResponse }
     * 
     */
    public PesquisaPorNomeResponse createPesquisaPorNomeResponse() {
        return new PesquisaPorNomeResponse();
    }

    /**
     * Create an instance of {@link ListarTodos }
     * 
     */
    public ListarTodos createListarTodos() {
        return new ListarTodos();
    }

    /**
     * Create an instance of {@link Cidade }
     * 
     */
    public Cidade createCidade() {
        return new Cidade();
    }

    /**
     * Create an instance of {@link Estado }
     * 
     */
    public Estado createEstado() {
        return new Estado();
    }

    /**
     * Create an instance of {@link Logradouro }
     * 
     */
    public Logradouro createLogradouro() {
        return new Logradouro();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaPorNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pesquisaPorNome")
    public JAXBElement<PesquisaPorNome> createPesquisaPorNome(PesquisaPorNome value) {
        return new JAXBElement<PesquisaPorNome>(_PesquisaPorNome_QNAME, PesquisaPorNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listarTodosResponse")
    public JAXBElement<ListarTodosResponse> createListarTodosResponse(ListarTodosResponse value) {
        return new JAXBElement<ListarTodosResponse>(_ListarTodosResponse_QNAME, ListarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listarTodos")
    public JAXBElement<ListarTodos> createListarTodos(ListarTodos value) {
        return new JAXBElement<ListarTodos>(_ListarTodos_QNAME, ListarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisaPorNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "pesquisaPorNomeResponse")
    public JAXBElement<PesquisaPorNomeResponse> createPesquisaPorNomeResponse(PesquisaPorNomeResponse value) {
        return new JAXBElement<PesquisaPorNomeResponse>(_PesquisaPorNomeResponse_QNAME, PesquisaPorNomeResponse.class, null, value);
    }

}
