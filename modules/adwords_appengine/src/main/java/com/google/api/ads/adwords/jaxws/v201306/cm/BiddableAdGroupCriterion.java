
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A biddable (positive) criterion in an adgroup.
 *           
 * 
 * <p>Java class for BiddableAdGroupCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiddableAdGroupCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}AdGroupCriterion">
 *       &lt;sequence>
 *         &lt;element name="userStatus" type="{https://adwords.google.com/api/adwords/cm/v201306}UserStatus" minOccurs="0"/>
 *         &lt;element name="systemServingStatus" type="{https://adwords.google.com/api/adwords/cm/v201306}SystemServingStatus" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://adwords.google.com/api/adwords/cm/v201306}ApprovalStatus" minOccurs="0"/>
 *         &lt;element name="disapprovalReasons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="experimentData" type="{https://adwords.google.com/api/adwords/cm/v201306}BiddableAdGroupCriterionExperimentData" minOccurs="0"/>
 *         &lt;element name="firstPageCpc" type="{https://adwords.google.com/api/adwords/cm/v201306}Bid" minOccurs="0"/>
 *         &lt;element name="topOfPageCpc" type="{https://adwords.google.com/api/adwords/cm/v201306}Bid" minOccurs="0"/>
 *         &lt;element name="qualityInfo" type="{https://adwords.google.com/api/adwords/cm/v201306}QualityInfo" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://adwords.google.com/api/adwords/cm/v201306}Stats" minOccurs="0"/>
 *         &lt;element name="biddingStrategyConfiguration" type="{https://adwords.google.com/api/adwords/cm/v201306}BiddingStrategyConfiguration" minOccurs="0"/>
 *         &lt;element name="bidModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiddableAdGroupCriterion", propOrder = {
    "userStatus",
    "systemServingStatus",
    "approvalStatus",
    "disapprovalReasons",
    "destinationUrl",
    "experimentData",
    "firstPageCpc",
    "topOfPageCpc",
    "qualityInfo",
    "stats",
    "biddingStrategyConfiguration",
    "bidModifier"
})
public class BiddableAdGroupCriterion
    extends AdGroupCriterion
{

    protected UserStatus userStatus;
    protected SystemServingStatus systemServingStatus;
    protected ApprovalStatus approvalStatus;
    protected List<String> disapprovalReasons;
    protected String destinationUrl;
    protected BiddableAdGroupCriterionExperimentData experimentData;
    protected Bid firstPageCpc;
    protected Bid topOfPageCpc;
    protected QualityInfo qualityInfo;
    protected Stats stats;
    protected BiddingStrategyConfiguration biddingStrategyConfiguration;
    protected Double bidModifier;

    /**
     * Gets the value of the userStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UserStatus }
     *     
     */
    public UserStatus getUserStatus() {
        return userStatus;
    }

    /**
     * Sets the value of the userStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatus }
     *     
     */
    public void setUserStatus(UserStatus value) {
        this.userStatus = value;
    }

    /**
     * Gets the value of the systemServingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SystemServingStatus }
     *     
     */
    public SystemServingStatus getSystemServingStatus() {
        return systemServingStatus;
    }

    /**
     * Sets the value of the systemServingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemServingStatus }
     *     
     */
    public void setSystemServingStatus(SystemServingStatus value) {
        this.systemServingStatus = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalStatus }
     *     
     */
    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalStatus }
     *     
     */
    public void setApprovalStatus(ApprovalStatus value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the disapprovalReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disapprovalReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisapprovalReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDisapprovalReasons() {
        if (disapprovalReasons == null) {
            disapprovalReasons = new ArrayList<String>();
        }
        return this.disapprovalReasons;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the experimentData property.
     * 
     * @return
     *     possible object is
     *     {@link BiddableAdGroupCriterionExperimentData }
     *     
     */
    public BiddableAdGroupCriterionExperimentData getExperimentData() {
        return experimentData;
    }

    /**
     * Sets the value of the experimentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddableAdGroupCriterionExperimentData }
     *     
     */
    public void setExperimentData(BiddableAdGroupCriterionExperimentData value) {
        this.experimentData = value;
    }

    /**
     * Gets the value of the firstPageCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getFirstPageCpc() {
        return firstPageCpc;
    }

    /**
     * Sets the value of the firstPageCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setFirstPageCpc(Bid value) {
        this.firstPageCpc = value;
    }

    /**
     * Gets the value of the topOfPageCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getTopOfPageCpc() {
        return topOfPageCpc;
    }

    /**
     * Sets the value of the topOfPageCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setTopOfPageCpc(Bid value) {
        this.topOfPageCpc = value;
    }

    /**
     * Gets the value of the qualityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QualityInfo }
     *     
     */
    public QualityInfo getQualityInfo() {
        return qualityInfo;
    }

    /**
     * Sets the value of the qualityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityInfo }
     *     
     */
    public void setQualityInfo(QualityInfo value) {
        this.qualityInfo = value;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link Stats }
     *     
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stats }
     *     
     */
    public void setStats(Stats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the biddingStrategyConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }

    /**
     * Sets the value of the biddingStrategyConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public void setBiddingStrategyConfiguration(BiddingStrategyConfiguration value) {
        this.biddingStrategyConfiguration = value;
    }

    /**
     * Gets the value of the bidModifier property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBidModifier() {
        return bidModifier;
    }

    /**
     * Sets the value of the bidModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBidModifier(Double value) {
        this.bidModifier = value;
    }

}
