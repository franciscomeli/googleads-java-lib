
package com.google.api.ads.dfp.jaxws.v201302;

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
@WebServiceClient(name = "CreativeWrapperService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201302", wsdlLocation = "https://www.google.com/apis/ads/publisher/v201302/CreativeWrapperService?wsdl")
public class CreativeWrapperService
    extends Service
{

    private final static URL CREATIVEWRAPPERSERVICE_WSDL_LOCATION;
    private final static WebServiceException CREATIVEWRAPPERSERVICE_EXCEPTION;
    private final static QName CREATIVEWRAPPERSERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201302", "CreativeWrapperService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://www.google.com/apis/ads/publisher/v201302/CreativeWrapperService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREATIVEWRAPPERSERVICE_WSDL_LOCATION = url;
        CREATIVEWRAPPERSERVICE_EXCEPTION = e;
    }

    public CreativeWrapperService() {
        super(__getWsdlLocation(), CREATIVEWRAPPERSERVICE_QNAME);
    }

    public CreativeWrapperService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns CreativeWrapperServiceInterface
     */
    @WebEndpoint(name = "CreativeWrapperServiceInterfacePort")
    public CreativeWrapperServiceInterface getCreativeWrapperServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201302", "CreativeWrapperServiceInterfacePort"), CreativeWrapperServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreativeWrapperServiceInterface
     */
    @WebEndpoint(name = "CreativeWrapperServiceInterfacePort")
    public CreativeWrapperServiceInterface getCreativeWrapperServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201302", "CreativeWrapperServiceInterfacePort"), CreativeWrapperServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREATIVEWRAPPERSERVICE_EXCEPTION!= null) {
            throw CREATIVEWRAPPERSERVICE_EXCEPTION;
        }
        return CREATIVEWRAPPERSERVICE_WSDL_LOCATION;
    }

}
