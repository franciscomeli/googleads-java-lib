
package com.google.api.ads.dfp.jaxws.v201311;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for retrieving, reconciling and reverting {@link ReconciliationOrderReport}
 *       objects.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ReconciliationOrderReportServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReconciliationOrderReportServiceInterface {


    /**
     * 
     *         Returns the {@link ReconciliationOrderReport} object uniquely identified by given ID.
     *         
     *         @param reconciliationOrderReportId the ID of the {@link ReconciliationOrderReport},
     *         which must already exist.
     *         @return the {@link ReconciliationOrderReport} uniquely identified by given ID.
     *       
     * 
     * @param reconciliationOrderReportId
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReport
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "getReconciliationOrderReport", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReportServiceInterfacegetReconciliationOrderReport")
    @ResponseWrapper(localName = "getReconciliationOrderReportResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReportServiceInterfacegetReconciliationOrderReportResponse")
    public ReconciliationOrderReport getReconciliationOrderReport(
        @WebParam(name = "reconciliationOrderReportId", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Long reconciliationOrderReportId)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets an {@link ReconciliationOrderReportPage} of {@link ReconciliationOrderReport} objects
     *         that satisfy the given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ReconciliationOrderReport#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ReconciliationOrderReport#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code submissionDateTime}</td>
     *         <td>{@link ReconciliationOrderReport#submissionDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code submitterId}</td>
     *         <td>{@link ReconciliationOrderReport#submitterId}</td>
     *         </tr>
     *         </table>
     *         
     *         The {@code reconciliationReportId} field is required and can only be combined with an
     *         {@code AND} to other conditions. Furthermore, the results may only belong to
     *         one {@link ReconciliationReport}.
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of reconciliation order reports.
     *         @return the reconciliation order reports that match the given filter.
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReportPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "getReconciliationOrderReportsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReportServiceInterfacegetReconciliationOrderReportsByStatement")
    @ResponseWrapper(localName = "getReconciliationOrderReportsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReportServiceInterfacegetReconciliationOrderReportsByStatementResponse")
    public ReconciliationOrderReportPage getReconciliationOrderReportsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on the {@link ReconciliationOrderReport} objects that match the given
     *         {@link Statement#query}. The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code orderId}</td>
     *         <td>{@link ReconciliationOrderReport#orderId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code reconciliationReportId}</td>
     *         <td>{@link ReconciliationOrderReport#reconciliationReportId}</td>
     *         </tr>
     *         </table>
     *         
     *         The {@code reconciliationReportId} field and {@code orderId} are required and can only be
     *         combined with an {@code AND}. Furthermore, the results may only belong to one
     *         {@link ReconciliationReport}.
     *         Only orders to which the API user has access will be included.
     *         
     *         @param reconciliationOrderReportAction the action to perform.
     *         @param filterStatement a Publisher Query Language statement used to filter a set of orders and
     *         one reconciliation report.
     *         @return the result of the action performed.
     *       
     * 
     * @param reconciliationOrderReportAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201311.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
    @RequestWrapper(localName = "performReconciliationOrderReportAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReportServiceInterfaceperformReconciliationOrderReportAction")
    @ResponseWrapper(localName = "performReconciliationOrderReportActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311", className = "com.google.api.ads.dfp.jaxws.v201311.ReconciliationOrderReportServiceInterfaceperformReconciliationOrderReportActionResponse")
    public UpdateResult performReconciliationOrderReportAction(
        @WebParam(name = "reconciliationOrderReportAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        ReconciliationOrderReportAction reconciliationOrderReportAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201311")
        Statement filterStatement)
        throws ApiException_Exception
    ;

}
