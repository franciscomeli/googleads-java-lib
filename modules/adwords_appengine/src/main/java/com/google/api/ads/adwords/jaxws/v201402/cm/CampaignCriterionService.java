
package com.google.api.ads.adwords.jaxws.v201402.cm;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CampaignCriterionService", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201402", wsdlLocation = "https://adwords.google.com/api/adwords/cm/v201402/CampaignCriterionService?wsdl")
public class CampaignCriterionService
    extends Service
{

    private final static URL CAMPAIGNCRITERIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAMPAIGNCRITERIONSERVICE_EXCEPTION;
    private final static QName CAMPAIGNCRITERIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/cm/v201402", "CampaignCriterionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/cm/v201402/CampaignCriterionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAMPAIGNCRITERIONSERVICE_WSDL_LOCATION = url;
        CAMPAIGNCRITERIONSERVICE_EXCEPTION = e;
    }

    public CampaignCriterionService() {
        super(__getWsdlLocation(), CAMPAIGNCRITERIONSERVICE_QNAME);
    }

    public CampaignCriterionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CampaignCriterionServiceInterface
     */
    @WebEndpoint(name = "CampaignCriterionServiceInterfacePort")
    public CampaignCriterionServiceInterface getCampaignCriterionServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201402", "CampaignCriterionServiceInterfacePort"), CampaignCriterionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CampaignCriterionServiceInterface
     */
    @WebEndpoint(name = "CampaignCriterionServiceInterfacePort")
    public CampaignCriterionServiceInterface getCampaignCriterionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/cm/v201402", "CampaignCriterionServiceInterfacePort"), CampaignCriterionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAMPAIGNCRITERIONSERVICE_EXCEPTION!= null) {
            throw CAMPAIGNCRITERIONSERVICE_EXCEPTION;
        }
        return CAMPAIGNCRITERIONSERVICE_WSDL_LOCATION;
    }

}
