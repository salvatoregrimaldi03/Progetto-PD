
package oggetti;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oggetti package. 
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

    private final static QName _AggiornaOggetto_QNAME = new QName("http://oggetti/", "aggiornaOggetto");
    private final static QName _AggiornaOggettoResponse_QNAME = new QName("http://oggetti/", "aggiornaOggettoResponse");
    private final static QName _CreaOggetto_QNAME = new QName("http://oggetti/", "creaOggetto");
    private final static QName _CreaOggettoResponse_QNAME = new QName("http://oggetti/", "creaOggettoResponse");
    private final static QName _EliminaOggetto_QNAME = new QName("http://oggetti/", "eliminaOggetto");
    private final static QName _EliminaOggettoResponse_QNAME = new QName("http://oggetti/", "eliminaOggettoResponse");
    private final static QName _FindByCategoria_QNAME = new QName("http://oggetti/", "findByCategoria");
    private final static QName _FindByCategoriaResponse_QNAME = new QName("http://oggetti/", "findByCategoriaResponse");
    private final static QName _FindByID_QNAME = new QName("http://oggetti/", "findByID");
    private final static QName _FindByIDResponse_QNAME = new QName("http://oggetti/", "findByIDResponse");
    private final static QName _FindByLuogo_QNAME = new QName("http://oggetti/", "findByLuogo");
    private final static QName _FindByLuogoResponse_QNAME = new QName("http://oggetti/", "findByLuogoResponse");
    private final static QName _GetAll_QNAME = new QName("http://oggetti/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://oggetti/", "getAllResponse");
    private final static QName _OggettoSmarrito_QNAME = new QName("http://oggetti/", "oggettoSmarrito");
    private final static QName _TotNonRestituitiByCategoria_QNAME = new QName("http://oggetti/", "totNonRestituitiByCategoria");
    private final static QName _TotNonRestituitiByCategoriaResponse_QNAME = new QName("http://oggetti/", "totNonRestituitiByCategoriaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oggetti
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AggiornaOggetto }
     * 
     */
    public AggiornaOggetto createAggiornaOggetto() {
        return new AggiornaOggetto();
    }

    /**
     * Create an instance of {@link AggiornaOggettoResponse }
     * 
     */
    public AggiornaOggettoResponse createAggiornaOggettoResponse() {
        return new AggiornaOggettoResponse();
    }

    /**
     * Create an instance of {@link CreaOggetto }
     * 
     */
    public CreaOggetto createCreaOggetto() {
        return new CreaOggetto();
    }

    /**
     * Create an instance of {@link CreaOggettoResponse }
     * 
     */
    public CreaOggettoResponse createCreaOggettoResponse() {
        return new CreaOggettoResponse();
    }

    /**
     * Create an instance of {@link EliminaOggetto }
     * 
     */
    public EliminaOggetto createEliminaOggetto() {
        return new EliminaOggetto();
    }

    /**
     * Create an instance of {@link EliminaOggettoResponse }
     * 
     */
    public EliminaOggettoResponse createEliminaOggettoResponse() {
        return new EliminaOggettoResponse();
    }

    /**
     * Create an instance of {@link FindByCategoria }
     * 
     */
    public FindByCategoria createFindByCategoria() {
        return new FindByCategoria();
    }

    /**
     * Create an instance of {@link FindByCategoriaResponse }
     * 
     */
    public FindByCategoriaResponse createFindByCategoriaResponse() {
        return new FindByCategoriaResponse();
    }

    /**
     * Create an instance of {@link FindByID }
     * 
     */
    public FindByID createFindByID() {
        return new FindByID();
    }

    /**
     * Create an instance of {@link FindByIDResponse }
     * 
     */
    public FindByIDResponse createFindByIDResponse() {
        return new FindByIDResponse();
    }

    /**
     * Create an instance of {@link FindByLuogo }
     * 
     */
    public FindByLuogo createFindByLuogo() {
        return new FindByLuogo();
    }

    /**
     * Create an instance of {@link FindByLuogoResponse }
     * 
     */
    public FindByLuogoResponse createFindByLuogoResponse() {
        return new FindByLuogoResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link OggettoSmarrito }
     * 
     */
    public OggettoSmarrito createOggettoSmarrito() {
        return new OggettoSmarrito();
    }

    /**
     * Create an instance of {@link TotNonRestituitiByCategoria }
     * 
     */
    public TotNonRestituitiByCategoria createTotNonRestituitiByCategoria() {
        return new TotNonRestituitiByCategoria();
    }

    /**
     * Create an instance of {@link TotNonRestituitiByCategoriaResponse }
     * 
     */
    public TotNonRestituitiByCategoriaResponse createTotNonRestituitiByCategoriaResponse() {
        return new TotNonRestituitiByCategoriaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaOggetto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiornaOggetto }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "aggiornaOggetto")
    public JAXBElement<AggiornaOggetto> createAggiornaOggetto(AggiornaOggetto value) {
        return new JAXBElement<AggiornaOggetto>(_AggiornaOggetto_QNAME, AggiornaOggetto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaOggettoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggiornaOggettoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "aggiornaOggettoResponse")
    public JAXBElement<AggiornaOggettoResponse> createAggiornaOggettoResponse(AggiornaOggettoResponse value) {
        return new JAXBElement<AggiornaOggettoResponse>(_AggiornaOggettoResponse_QNAME, AggiornaOggettoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaOggetto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreaOggetto }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "creaOggetto")
    public JAXBElement<CreaOggetto> createCreaOggetto(CreaOggetto value) {
        return new JAXBElement<CreaOggetto>(_CreaOggetto_QNAME, CreaOggetto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaOggettoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreaOggettoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "creaOggettoResponse")
    public JAXBElement<CreaOggettoResponse> createCreaOggettoResponse(CreaOggettoResponse value) {
        return new JAXBElement<CreaOggettoResponse>(_CreaOggettoResponse_QNAME, CreaOggettoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaOggetto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminaOggetto }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "eliminaOggetto")
    public JAXBElement<EliminaOggetto> createEliminaOggetto(EliminaOggetto value) {
        return new JAXBElement<EliminaOggetto>(_EliminaOggetto_QNAME, EliminaOggetto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaOggettoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminaOggettoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "eliminaOggettoResponse")
    public JAXBElement<EliminaOggettoResponse> createEliminaOggettoResponse(EliminaOggettoResponse value) {
        return new JAXBElement<EliminaOggettoResponse>(_EliminaOggettoResponse_QNAME, EliminaOggettoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCategoria }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCategoria }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "findByCategoria")
    public JAXBElement<FindByCategoria> createFindByCategoria(FindByCategoria value) {
        return new JAXBElement<FindByCategoria>(_FindByCategoria_QNAME, FindByCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCategoriaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByCategoriaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "findByCategoriaResponse")
    public JAXBElement<FindByCategoriaResponse> createFindByCategoriaResponse(FindByCategoriaResponse value) {
        return new JAXBElement<FindByCategoriaResponse>(_FindByCategoriaResponse_QNAME, FindByCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "findByID")
    public JAXBElement<FindByID> createFindByID(FindByID value) {
        return new JAXBElement<FindByID>(_FindByID_QNAME, FindByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "findByIDResponse")
    public JAXBElement<FindByIDResponse> createFindByIDResponse(FindByIDResponse value) {
        return new JAXBElement<FindByIDResponse>(_FindByIDResponse_QNAME, FindByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByLuogo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByLuogo }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "findByLuogo")
    public JAXBElement<FindByLuogo> createFindByLuogo(FindByLuogo value) {
        return new JAXBElement<FindByLuogo>(_FindByLuogo_QNAME, FindByLuogo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByLuogoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindByLuogoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "findByLuogoResponse")
    public JAXBElement<FindByLuogoResponse> createFindByLuogoResponse(FindByLuogoResponse value) {
        return new JAXBElement<FindByLuogoResponse>(_FindByLuogoResponse_QNAME, FindByLuogoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OggettoSmarrito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OggettoSmarrito }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "oggettoSmarrito")
    public JAXBElement<OggettoSmarrito> createOggettoSmarrito(OggettoSmarrito value) {
        return new JAXBElement<OggettoSmarrito>(_OggettoSmarrito_QNAME, OggettoSmarrito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotNonRestituitiByCategoria }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TotNonRestituitiByCategoria }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "totNonRestituitiByCategoria")
    public JAXBElement<TotNonRestituitiByCategoria> createTotNonRestituitiByCategoria(TotNonRestituitiByCategoria value) {
        return new JAXBElement<TotNonRestituitiByCategoria>(_TotNonRestituitiByCategoria_QNAME, TotNonRestituitiByCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotNonRestituitiByCategoriaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TotNonRestituitiByCategoriaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://oggetti/", name = "totNonRestituitiByCategoriaResponse")
    public JAXBElement<TotNonRestituitiByCategoriaResponse> createTotNonRestituitiByCategoriaResponse(TotNonRestituitiByCategoriaResponse value) {
        return new JAXBElement<TotNonRestituitiByCategoriaResponse>(_TotNonRestituitiByCategoriaResponse_QNAME, TotNonRestituitiByCategoriaResponse.class, null, value);
    }

}
