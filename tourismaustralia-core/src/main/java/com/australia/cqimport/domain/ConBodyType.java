//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.17 at 01:40:13 PM EST 
//

package com.australia.cqimport.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for con_BodyType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="con_BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopCategoryHighlights" type="{}TopCategoryHighlightsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubPageLayout" type="{}SubPageLayoutType" minOccurs="0"/>
 *         &lt;element name="BasicContent" type="{}BasicContentType" minOccurs="0"/>
 *         &lt;element name="StandardCampaignLayout" type="{}StandardCampaignLayoutType" minOccurs="0"/>
 *         &lt;element name="FeatureContent" type="{}FeatureContentType" minOccurs="0"/>
 *         &lt;element name="HubPageLayout" type="{}HubPageLayoutType" minOccurs="0"/>
 *         &lt;element name="GenericHTML" type="{}GenericHTMLType" minOccurs="0"/>
 *         &lt;element name="EventsLayout" type="{}EventsLayoutType" minOccurs="0"/>
 *         &lt;element name="MultiColumnListing" type="{}MultiColumnListingType" minOccurs="0"/>
 *         &lt;element name="FullWidthCampaignLayout" type="{}FullWidthCampaignLayoutType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "con_BodyType", propOrder = { "topCategoryHighlights", "subPageLayout", "basicContent",
	"standardCampaignLayout", "featureContent", "hubPageLayout", "genericHTML", "eventsLayout", "multiColumnListing",
	"fullWidthCampaignLayout" })
public class ConBodyType {

	@XmlElement(name = "TopCategoryHighlights")
	protected List<TopCategoryHighlightsType> topCategoryHighlights;
	@XmlElement(name = "SubPageLayout")
	protected SubPageLayoutType subPageLayout;
	@XmlElement(name = "BasicContent")
	protected BasicContentType basicContent;
	@XmlElement(name = "StandardCampaignLayout")
	protected StandardCampaignLayoutType standardCampaignLayout;
	@XmlElement(name = "FeatureContent")
	protected FeatureContentType featureContent;
	@XmlElement(name = "HubPageLayout")
	protected HubPageLayoutType hubPageLayout;
	@XmlElement(name = "GenericHTML")
	protected GenericHTMLType genericHTML;
	@XmlElement(name = "EventsLayout")
	protected EventsLayoutType eventsLayout;
	@XmlElement(name = "MultiColumnListing")
	protected MultiColumnListingType multiColumnListing;
	@XmlElement(name = "FullWidthCampaignLayout")
	protected FullWidthCampaignLayoutType fullWidthCampaignLayout;

	/**
	 * Gets the value of the topCategoryHighlights property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the topCategoryHighlights property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTopCategoryHighlights().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TopCategoryHighlightsType }
	 * 
	 * 
	 */
	public List<TopCategoryHighlightsType> getTopCategoryHighlights() {
		if (topCategoryHighlights == null) {
			topCategoryHighlights = new ArrayList<TopCategoryHighlightsType>();
		}
		return this.topCategoryHighlights;
	}

	/**
	 * Gets the value of the subPageLayout property.
	 * 
	 * @return possible object is {@link SubPageLayoutType }
	 * 
	 */
	public SubPageLayoutType getSubPageLayout() {
		return subPageLayout;
	}

	/**
	 * Sets the value of the subPageLayout property.
	 * 
	 * @param value allowed object is {@link SubPageLayoutType }
	 * 
	 */
	public void setSubPageLayout(SubPageLayoutType value) {
		this.subPageLayout = value;
	}

	/**
	 * Gets the value of the basicContent property.
	 * 
	 * @return possible object is {@link BasicContentType }
	 * 
	 */
	public BasicContentType getBasicContent() {
		return basicContent;
	}

	/**
	 * Sets the value of the basicContent property.
	 * 
	 * @param value allowed object is {@link BasicContentType }
	 * 
	 */
	public void setBasicContent(BasicContentType value) {
		this.basicContent = value;
	}

	/**
	 * Gets the value of the standardCampaignLayout property.
	 * 
	 * @return possible object is {@link StandardCampaignLayoutType }
	 * 
	 */
	public StandardCampaignLayoutType getStandardCampaignLayout() {
		return standardCampaignLayout;
	}

	/**
	 * Sets the value of the standardCampaignLayout property.
	 * 
	 * @param value allowed object is {@link StandardCampaignLayoutType }
	 * 
	 */
	public void setStandardCampaignLayout(StandardCampaignLayoutType value) {
		this.standardCampaignLayout = value;
	}

	/**
	 * Gets the value of the featureContent property.
	 * 
	 * @return possible object is {@link FeatureContentType }
	 * 
	 */
	public FeatureContentType getFeatureContent() {
		return featureContent;
	}

	/**
	 * Sets the value of the featureContent property.
	 * 
	 * @param value allowed object is {@link FeatureContentType }
	 * 
	 */
	public void setFeatureContent(FeatureContentType value) {
		this.featureContent = value;
	}

	/**
	 * Gets the value of the hubPageLayout property.
	 * 
	 * @return possible object is {@link HubPageLayoutType }
	 * 
	 */
	public HubPageLayoutType getHubPageLayout() {
		return hubPageLayout;
	}

	/**
	 * Sets the value of the hubPageLayout property.
	 * 
	 * @param value allowed object is {@link HubPageLayoutType }
	 * 
	 */
	public void setHubPageLayout(HubPageLayoutType value) {
		this.hubPageLayout = value;
	}

	/**
	 * Gets the value of the genericHTML property.
	 * 
	 * @return possible object is {@link GenericHTMLType }
	 * 
	 */
	public GenericHTMLType getGenericHTML() {
		return genericHTML;
	}

	/**
	 * Sets the value of the genericHTML property.
	 * 
	 * @param value allowed object is {@link GenericHTMLType }
	 * 
	 */
	public void setGenericHTML(GenericHTMLType value) {
		this.genericHTML = value;
	}

	/**
	 * Gets the value of the eventsLayout property.
	 * 
	 * @return possible object is {@link EventsLayoutType }
	 * 
	 */
	public EventsLayoutType getEventsLayout() {
		return eventsLayout;
	}

	/**
	 * Sets the value of the eventsLayout property.
	 * 
	 * @param value allowed object is {@link EventsLayoutType }
	 * 
	 */
	public void setEventsLayout(EventsLayoutType value) {
		this.eventsLayout = value;
	}

	/**
	 * Gets the value of the multiColumnListing property.
	 * 
	 * @return possible object is {@link MultiColumnListingType }
	 * 
	 */
	public MultiColumnListingType getMultiColumnListing() {
		return multiColumnListing;
	}

	/**
	 * Sets the value of the multiColumnListing property.
	 * 
	 * @param value allowed object is {@link MultiColumnListingType }
	 * 
	 */
	public void setMultiColumnListing(MultiColumnListingType value) {
		this.multiColumnListing = value;
	}

	/**
	 * Gets the value of the fullWidthCampaignLayout property.
	 * 
	 * @return possible object is {@link FullWidthCampaignLayoutType }
	 * 
	 */
	public FullWidthCampaignLayoutType getFullWidthCampaignLayout() {
		return fullWidthCampaignLayout;
	}

	/**
	 * Sets the value of the fullWidthCampaignLayout property.
	 * 
	 * @param value allowed object is {@link FullWidthCampaignLayoutType }
	 * 
	 */
	public void setFullWidthCampaignLayout(FullWidthCampaignLayoutType value) {
		this.fullWidthCampaignLayout = value;
	}

}
