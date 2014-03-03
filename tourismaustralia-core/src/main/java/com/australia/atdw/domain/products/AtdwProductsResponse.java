//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.26 at 10:24:01 AM EST 
//

package com.australia.atdw.domain.products;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for atdw_search_responseType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="atdw_search_responseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number_of_results" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="query_time" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="products" type="{}productsType"/>
 *         &lt;element name="facet_groups" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atdw_search_responseType", propOrder = { "numberOfResults", "queryTime", "products", "facetGroups" })
@XmlRootElement(name = "atdw_search_response")
public class AtdwProductsResponse {

	@XmlElement(name = "number_of_results")
	protected int numberOfResults;
	@XmlElement(name = "query_time")
	protected int queryTime;
	@XmlElement(required = true)
	protected Products products;
	@XmlElement(name = "facet_groups", required = true)
	protected String facetGroups;

	/**
	 * Gets the value of the numberOfResults property.
	 * 
	 */
	public int getNumberOfResults() {
		return numberOfResults;
	}

	/**
	 * Sets the value of the numberOfResults property.
	 * 
	 */
	public void setNumberOfResults(int value) {
		this.numberOfResults = value;
	}

	/**
	 * Gets the value of the queryTime property.
	 * 
	 */
	public int getQueryTime() {
		return queryTime;
	}

	/**
	 * Sets the value of the queryTime property.
	 * 
	 */
	public void setQueryTime(int value) {
		this.queryTime = value;
	}

	/**
	 * Gets the value of the products property.
	 * 
	 * @return possible object is {@link Products }
	 * 
	 */
	public Products getProducts() {
		return products;
	}

	/**
	 * Sets the value of the products property.
	 * 
	 * @param value allowed object is {@link Products }
	 * 
	 */
	public void setProducts(Products value) {
		this.products = value;
	}

	/**
	 * Gets the value of the facetGroups property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFacetGroups() {
		return facetGroups;
	}

	/**
	 * Sets the value of the facetGroups property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFacetGroups(String value) {
		this.facetGroups = value;
	}

}
