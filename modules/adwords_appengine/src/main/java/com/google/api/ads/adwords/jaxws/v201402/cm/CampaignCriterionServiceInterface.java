
package com.google.api.ads.adwords.jaxws.v201402.cm;

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
 *       Use this service to manage campaign-level criteria.
 *       
 *       <p>A campaign-level negative criterion prevents the campaign's ads from
 *       showing on specific placements, specific keywords, demographics, and so on.</p>
 *       
 *       <p>Additionally, the service can be used to target criteria such as
 *       {@linkplain Criterion.Type#LOCATION location}, {@linkplain Criterion.Type#LANGUAGE language},
 *       {@linkplain Criterion.Type#CARRIER carrier}, {@linkplain Criterion.Type#PLATFORM platform}, and
 *       so on. The targeting criteria can be added using the Criterion Id listed in the
 *       <a href="/adwords/api/docs/appendix/platforms">documentation</a>.</p>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CampaignCriterionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CampaignCriterionServiceInterface {


    /**
     * 
     *         Gets campaign criteria.
     *         
     *         @param serviceSelector The selector specifying the {@link CampaignCriterion}s to return.
     *         @return A list of campaign criteria.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionServiceInterfacegetResponse")
    public CampaignCriterionPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, removes or updates campaign criteria.
     *         
     *         @param operations The operations to apply.
     *         @return The added campaign criteria (without any optional parts).
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionServiceInterfacemutateResponse")
    public CampaignCriterionReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        List<CampaignCriterionOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of campaign criteria that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of campaign criteria.
     *         @throws ApiException if problems occur while parsing the query or fetching campaign criteria.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.cm.CampaignCriterionServiceInterfacequeryResponse")
    public CampaignCriterionPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402")
        String query)
        throws ApiException_Exception
    ;

}
