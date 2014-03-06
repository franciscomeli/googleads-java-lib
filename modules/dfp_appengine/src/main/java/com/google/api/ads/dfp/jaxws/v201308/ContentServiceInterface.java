
package com.google.api.ads.dfp.jaxws.v201308;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service for retrieving {@link Content}.
 *       
 *       {@code Content} entities can be targeted in video {@link LineItem}s.
 *       
 *       You can query for content that belongs to a particular category or has
 *       assigned metadata.
 *       Categories and metadata for {@code Content} are stored in DFP as
 *       {@link CustomCriteria}.
 *       <p>
 *       For example, to find all {@code Content} that is "genre=comedy", you would:
 *       
 *       <ul>
 *       <li>Retrieve the custom targeting key corresponding to "genre" using
 *       {@link CustomTargetingService#getCustomTargetingKeysByStatement}</li>
 *       <li>Using the
 *       {@link CustomTargetingService#getCustomTargetingValuesByStatement}
 *       method and a filter like
 *       "WHERE customTargetingKeyId = :genreKeyId
 *       and name = 'comedy'", retrieve the ID for the "comedy"
 *       custom targeting value.</li>
 *       <li>Call {@link #getContentByStatementAndCustomTargetingValue} with a
 *       filter like "WHERE status = 'ACTIVE'" and the ID of the custom targeting
 *       value from step 2.</li>
 *       </ul>
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ContentServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ContentServiceInterface {


    /**
     * 
     *         Gets a {@link ContentPage} of {@link Content} objects that satisfy the
     *         given {@link Statement#query}. The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Content#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Content#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Content#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Content#lastModifiedDateTime}: Requires indexed content search to be enabled.</td>
     *         </tr>
     *         </table>
     *         
     *         @params filterStatement a Publisher Query Language statement used to
     *         filter a set of content
     *         @return the content that matches the given filter
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ContentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getContentByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ContentServiceInterfacegetContentByStatement")
    @ResponseWrapper(localName = "getContentByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ContentServiceInterfacegetContentByStatementResponse")
    public ContentPage getContentByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ContentPage} of {@link Content} objects that satisfy the
     *         given {@link Statement#query}. Additionally, filters on the given value ID
     *         and key ID that the value belongs to.
     *         
     *         The following fields are supported for filtering:
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Content#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link Content#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Content#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link Content#lastModifiedDateTime>}: Requires indexed content search to be enabled.</td>
     *         </tr>
     *         </table>
     *         
     *         @params filterStatement a Publisher Query Language statement used to
     *         filter a set of content
     *         @param customTargetingValueId the id of the value to match
     *         @return the content that matches the given filter
     *       
     * 
     * @param customTargetingValueId
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201308.ContentPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
    @RequestWrapper(localName = "getContentByStatementAndCustomTargetingValue", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ContentServiceInterfacegetContentByStatementAndCustomTargetingValue")
    @ResponseWrapper(localName = "getContentByStatementAndCustomTargetingValueResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308", className = "com.google.api.ads.dfp.jaxws.v201308.ContentServiceInterfacegetContentByStatementAndCustomTargetingValueResponse")
    public ContentPage getContentByStatementAndCustomTargetingValue(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Statement filterStatement,
        @WebParam(name = "customTargetingValueId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201308")
        Long customTargetingValueId)
        throws ApiException_Exception
    ;

}
