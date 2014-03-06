//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.06 at 10:44:38 AM EST 
//

package com.australia.atdw.remote.domain.product;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for product_serviceTypeRowType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="product_serviceTypeRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="service_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="international_ready_flag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sequence_number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="children_catered_for_flag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pets_allowed_flag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="disabled_access_flag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pickup_available_flag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="service_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rate_from" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="rate_to" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="rate_comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attribute_id_rate_basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attribute_id_rate_basis_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attribute_id_rate_basis_definition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_service_configuration_relationship" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="product_service_external_system_relationship" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product_serviceTypeRowType")
public class ProductServiceTypeRowType {

	@XmlElement(name = "service_id")
	protected int serviceId;
	@XmlElement(name = "service_name")
	protected String serviceName;
	@XmlElement(name = "international_ready_flag")
	protected int internationalReadyFlag;
	@XmlElement(name = "sequence_number")
	protected int sequenceNumber;
	@XmlElement(name = "children_catered_for_flag")
	protected int childrenCateredForFlag;
	@XmlElement(name = "pets_allowed_flag")
	protected int petsAllowedFlag;
	@XmlElement(name = "disabled_access_flag")
	protected int disabledAccessFlag;
	@XmlElement(name = "pickup_available_flag")
	protected int pickupAvailableFlag;
	@XmlElement(name = "service_description")
	protected String serviceDescription;
	@XmlElement(name = "rate_from")
	protected BigDecimal rateFrom;
	@XmlElement(name = "rate_to")
	protected BigDecimal rateTo;
	@XmlElement(name = "rate_comment")
	protected String rateComment;
	@XmlElement(name = "attribute_id_rate_basis")
	protected String attributeIdRateBasis;
	@XmlElement(name = "attribute_id_rate_basis_description")
	protected String attributeIdRateBasisDescription;
	@XmlElement(name = "attribute_id_rate_basis_definition")
	protected String attributeIdRateBasisDefinition;
	@XmlElement(name = "product_service_configuration_relationship")
	protected String productServiceConfigurationRelationship;
	@XmlElement(name = "product_service_external_system_relationship")
	protected String productServiceExternalSystemRelationship;

	/**
	 * Gets the value of the serviceId property.
	 * 
	 */
	public int getServiceId() {
		return serviceId;
	}

	/**
	 * Sets the value of the serviceId property.
	 * 
	 */
	public void setServiceId(int value) {
		this.serviceId = value;
	}

	/**
	 * Gets the value of the serviceName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * Sets the value of the serviceName property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setServiceName(String value) {
		this.serviceName = value;
	}

	/**
	 * Gets the value of the internationalReadyFlag property.
	 * 
	 */
	public int getInternationalReadyFlag() {
		return internationalReadyFlag;
	}

	/**
	 * Sets the value of the internationalReadyFlag property.
	 * 
	 */
	public void setInternationalReadyFlag(int value) {
		this.internationalReadyFlag = value;
	}

	/**
	 * Gets the value of the sequenceNumber property.
	 * 
	 */
	public int getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the value of the sequenceNumber property.
	 * 
	 */
	public void setSequenceNumber(int value) {
		this.sequenceNumber = value;
	}

	/**
	 * Gets the value of the childrenCateredForFlag property.
	 * 
	 */
	public int getChildrenCateredForFlag() {
		return childrenCateredForFlag;
	}

	/**
	 * Sets the value of the childrenCateredForFlag property.
	 * 
	 */
	public void setChildrenCateredForFlag(int value) {
		this.childrenCateredForFlag = value;
	}

	/**
	 * Gets the value of the petsAllowedFlag property.
	 * 
	 */
	public int getPetsAllowedFlag() {
		return petsAllowedFlag;
	}

	/**
	 * Sets the value of the petsAllowedFlag property.
	 * 
	 */
	public void setPetsAllowedFlag(int value) {
		this.petsAllowedFlag = value;
	}

	/**
	 * Gets the value of the disabledAccessFlag property.
	 * 
	 */
	public int getDisabledAccessFlag() {
		return disabledAccessFlag;
	}

	/**
	 * Sets the value of the disabledAccessFlag property.
	 * 
	 */
	public void setDisabledAccessFlag(int value) {
		this.disabledAccessFlag = value;
	}

	/**
	 * Gets the value of the pickupAvailableFlag property.
	 * 
	 */
	public int getPickupAvailableFlag() {
		return pickupAvailableFlag;
	}

	/**
	 * Sets the value of the pickupAvailableFlag property.
	 * 
	 */
	public void setPickupAvailableFlag(int value) {
		this.pickupAvailableFlag = value;
	}

	/**
	 * Gets the value of the serviceDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getServiceDescription() {
		return serviceDescription;
	}

	/**
	 * Sets the value of the serviceDescription property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setServiceDescription(String value) {
		this.serviceDescription = value;
	}

	/**
	 * Gets the value of the rateFrom property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getRateFrom() {
		return rateFrom;
	}

	/**
	 * Sets the value of the rateFrom property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setRateFrom(BigDecimal value) {
		this.rateFrom = value;
	}

	/**
	 * Gets the value of the rateTo property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getRateTo() {
		return rateTo;
	}

	/**
	 * Sets the value of the rateTo property.
	 * 
	 * @param value allowed object is {@link BigDecimal }
	 * 
	 */
	public void setRateTo(BigDecimal value) {
		this.rateTo = value;
	}

	/**
	 * Gets the value of the rateComment property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRateComment() {
		return rateComment;
	}

	/**
	 * Sets the value of the rateComment property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setRateComment(String value) {
		this.rateComment = value;
	}

	/**
	 * Gets the value of the attributeIdRateBasis property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttributeIdRateBasis() {
		return attributeIdRateBasis;
	}

	/**
	 * Sets the value of the attributeIdRateBasis property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAttributeIdRateBasis(String value) {
		this.attributeIdRateBasis = value;
	}

	/**
	 * Gets the value of the attributeIdRateBasisDescription property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttributeIdRateBasisDescription() {
		return attributeIdRateBasisDescription;
	}

	/**
	 * Sets the value of the attributeIdRateBasisDescription property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAttributeIdRateBasisDescription(String value) {
		this.attributeIdRateBasisDescription = value;
	}

	/**
	 * Gets the value of the attributeIdRateBasisDefinition property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAttributeIdRateBasisDefinition() {
		return attributeIdRateBasisDefinition;
	}

	/**
	 * Sets the value of the attributeIdRateBasisDefinition property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setAttributeIdRateBasisDefinition(String value) {
		this.attributeIdRateBasisDefinition = value;
	}

	/**
	 * Gets the value of the productServiceConfigurationRelationship property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductServiceConfigurationRelationship() {
		return productServiceConfigurationRelationship;
	}

	/**
	 * Sets the value of the productServiceConfigurationRelationship property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProductServiceConfigurationRelationship(String value) {
		this.productServiceConfigurationRelationship = value;
	}

	/**
	 * Gets the value of the productServiceExternalSystemRelationship property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProductServiceExternalSystemRelationship() {
		return productServiceExternalSystemRelationship;
	}

	/**
	 * Sets the value of the productServiceExternalSystemRelationship property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setProductServiceExternalSystemRelationship(String value) {
		this.productServiceExternalSystemRelationship = value;
	}

}
