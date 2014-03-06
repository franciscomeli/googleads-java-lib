
package com.google.api.ads.adwords.jaxws.v201402.express;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.google.api.ads.adwords.jaxws.v201402.cm.Selector;


/**
 * 
 *       A service which manages AdWords Express promotions.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "PromotionServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201402.cm.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201402.express.ObjectFactory.class
})
public interface PromotionServiceInterface {


    /**
     * 
     *         Retrieves the promotions that meet the criteria set in the given selector.
     *         @param selector the selector specifying the AdWords Express promotion to return
     *         @return list of AdWords Express promotion identified by the selector
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201402.express.PromotionPage
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.express.PromotionServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.express.PromotionServiceInterfacegetResponse")
    public PromotionPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402")
        Selector selector)
        throws ApiException
    ;

    /**
     * 
     *         Performs the given {@link PromotionOperation}.
     *         @param operations list of unique operations; the same AdWords Express promotion cannot be
     *         specified in more than one operation
     *         @return the updated AdWords Express promotion
     *       
     * 
     * @param operations
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201402.express.Promotion>
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.express.PromotionServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402", className = "com.google.api.ads.adwords.jaxws.v201402.express.PromotionServiceInterfacemutateResponse")
    public List<Promotion> mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/express/v201402")
        List<PromotionOperation> operations)
        throws ApiException
    ;

}
