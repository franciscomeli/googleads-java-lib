
package com.google.api.ads.dfp.jaxws.v201311;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for managing {@link RateCard} objects.
 *       <p>
 *       To use this service, you need to have the new sales management solution
 *       enabled on your network. If you do not see a "Sales" tab in
 *       <a href="https://www.google.com/dfp">DoubleClick for Publishers (DFP)</a>,
 *       you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "RateCardServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RateCardServiceInterface {


    /**
     * 
     *         Creates a new {@link RateCard}. Rate cards must be activated before being
     *         associated with proposal line items and products.
     *         
     *         @param rateCard the rate card to be created
     *         @return the rate card with corresponding fields set by Google.
     *       
     * 
     * @param rateCard
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.RateCard
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "createRateCard", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacecreateRateCard")
    @ResponseWrapper(localName = "createRateCardResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacecreateRateCardResponse")
    public RateCard createRateCard(
        @WebParam(name = "rateCard", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        RateCard rateCard)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Creates a list of {@link RateCard} objects. Rate cards must be activated
     *         before being associated with proposal line items and products.
     *         
     *         @param rateCards the rate cards to be created
     *         @return the created rate cards.
     *       
     * 
     * @param rateCards
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201311.RateCard>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "createRateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacecreateRateCards")
    @ResponseWrapper(localName = "createRateCardsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacecreateRateCardsResponse")
    public List<RateCard> createRateCards(
        @WebParam(name = "rateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        List<RateCard> rateCards)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the {@link RateCard} uniquely identified by the given ID.
     *         
     *         @param rateCardId the ID of the rate card, which must already exist
     *       
     * 
     * @param rateCardId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.RateCard
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "getRateCard", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacegetRateCard")
    @ResponseWrapper(localName = "getRateCardResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacegetRateCardResponse")
    public RateCard getRateCard(
        @WebParam(name = "rateCardId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Long rateCardId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link RateCardPage} of {@link RateCard} objects that satisfy the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link RateCard#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link RateCard#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link RateCard#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link RateCard#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement to filter a list of rate cards.
     *         @return the rate cards that match the filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.RateCardPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "getRateCardsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacegetRateCardsByStatement")
    @ResponseWrapper(localName = "getRateCardsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfacegetRateCardsByStatementResponse")
    public RateCardPage getRateCardsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs action on {@link RateCard} objects that satisfy the
     *         given {@link Statement#query}.
     *         
     *         @param rateCardAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of rate cards.
     *         @return the result of the action performed
     *       
     * 
     * @param rateCardAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "performRateCardAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfaceperformRateCardAction")
    @ResponseWrapper(localName = "performRateCardActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfaceperformRateCardActionResponse")
    public UpdateResult performRateCardAction(
        @WebParam(name = "rateCardAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        RateCardAction rateCardAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link RateCard}.
     *         
     *         @param rateCard the rate card to be updated
     *         @return the updated rate card
     *       
     * 
     * @param rateCard
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.RateCard
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "updateRateCard", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfaceupdateRateCard")
    @ResponseWrapper(localName = "updateRateCardResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfaceupdateRateCardResponse")
    public RateCard updateRateCard(
        @WebParam(name = "rateCard", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        RateCard rateCard)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates a list of {@link RateCard} objects.
     *         
     *         @param rateCards the rate cards to be updated
     *         @return the updated rate cards
     *       
     * 
     * @param rateCards
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201311.RateCard>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "updateRateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfaceupdateRateCards")
    @ResponseWrapper(localName = "updateRateCardsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.RateCardServiceInterfaceupdateRateCardsResponse")
    public List<RateCard> updateRateCards(
        @WebParam(name = "rateCards", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        List<RateCard> rateCards)
        throws ApiException_Exception
    ;

}
