
package com.google.api.ads.dfp.jaxws.v201403;

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
 *       Provides methods for creating, updating and retrieving {@link ProductTemplate} objects.
 *       <p>
 *       A product template is used to generate a set of products. Products allow inventory managers to
 *       control what salespeople can sell.
 *       
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
@WebService(name = "ProductTemplateServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductTemplateServiceInterface {


    /**
     * 
     *         Creates new {@link ProductTemplate} objects.
     *         
     *         @param productTemplates the productTemplates to create
     *         @return the persisted product templates with their Ids filled in
     *       
     * 
     * @param productTemplates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201403.ProductTemplate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
    @RequestWrapper(localName = "createProductTemplates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfacecreateProductTemplates")
    @ResponseWrapper(localName = "createProductTemplatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfacecreateProductTemplatesResponse")
    public List<ProductTemplate> createProductTemplates(
        @WebParam(name = "productTemplates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
        List<ProductTemplate> productTemplates)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ProductTemplatePage} of {@link ProductTemplate} objects
     *         that satisfy the filtering criteria specified by given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProductTemplate#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProductTemplate#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code nameMacro}</td>
     *         <td>{@link ProductTemplate#nameMacro}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code description}</td>
     *         <td>{@link ProductTemplate#description}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ProductTemplate#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProductTemplate#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lineItemType}</td>
     *         <td>{@link LineItemType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code productType}</td>
     *         <td>{@link ProductType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code rateType}</td>
     *         <td>{@link RateType}</td>
     *         </tr>
     *         </table>
     *         
     *         @param statement a Publisher Query Language statement which specifies the
     *         filtering criteria over productTemplates
     *         @return the productTemplates that match the given statement
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201403.ProductTemplatePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
    @RequestWrapper(localName = "getProductTemplatesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfacegetProductTemplatesByStatement")
    @ResponseWrapper(localName = "getProductTemplatesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfacegetProductTemplatesByStatementResponse")
    public ProductTemplatePage getProductTemplatesByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs action on {@link ProductTemplate} objects that satisfy the given
     *         {@link Statement#query}.
     *         
     *         @param action the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of product templates
     *         @return the result of the action performed
     *       
     * 
     * @param action
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201403.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
    @RequestWrapper(localName = "performProductTemplateAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfaceperformProductTemplateAction")
    @ResponseWrapper(localName = "performProductTemplateActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfaceperformProductTemplateActionResponse")
    public UpdateResult performProductTemplateAction(
        @WebParam(name = "action", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
        ProductTemplateAction action,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ProductTemplate} objects.
     *         
     *         @param productTemplates the product templates to update
     *         @return the updated product templates
     *       
     * 
     * @param productTemplates
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201403.ProductTemplate>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
    @RequestWrapper(localName = "updateProductTemplates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfaceupdateProductTemplates")
    @ResponseWrapper(localName = "updateProductTemplatesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403", className = "com.google.api.ads.dfp.jaxws.v201403.ProductTemplateServiceInterfaceupdateProductTemplatesResponse")
    public List<ProductTemplate> updateProductTemplates(
        @WebParam(name = "productTemplates", targetNamespace = "https://www.google.com/apis/ads/publisher/v201403")
        List<ProductTemplate> productTemplates)
        throws ApiException_Exception
    ;

}
