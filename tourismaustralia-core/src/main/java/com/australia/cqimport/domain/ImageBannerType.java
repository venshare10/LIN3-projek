//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.17 at 01:40:13 PM EST 
//

package com.australia.cqimport.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ImageBannerType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ImageBannerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="img_Banner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_BackgroundImageAlt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stf_TargetedCountries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isTemplate" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageBannerType", propOrder = { "imgBanner", "stfBackgroundImageAlt", "stfTargetedCountries" })
public class ImageBannerType {

	@XmlElement(name = "img_Banner", required = true)
	protected String imgBanner;
	@XmlElement(name = "stf_BackgroundImageAlt", required = true)
	protected String stfBackgroundImageAlt;
	@XmlElement(name = "stf_TargetedCountries", required = true)
	protected String stfTargetedCountries;
	@XmlAttribute(name = "isTemplate")
	protected Byte isTemplate;

	/**
	 * Gets the value of the imgBanner property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImgBanner() {
		return imgBanner;
	}

	/**
	 * Sets the value of the imgBanner property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setImgBanner(String value) {
		this.imgBanner = value;
	}

	/**
	 * Gets the value of the stfBackgroundImageAlt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfBackgroundImageAlt() {
		return stfBackgroundImageAlt;
	}

	/**
	 * Sets the value of the stfBackgroundImageAlt property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfBackgroundImageAlt(String value) {
		this.stfBackgroundImageAlt = value;
	}

	/**
	 * Gets the value of the stfTargetedCountries property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStfTargetedCountries() {
		return stfTargetedCountries;
	}

	/**
	 * Sets the value of the stfTargetedCountries property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setStfTargetedCountries(String value) {
		this.stfTargetedCountries = value;
	}

	/**
	 * Gets the value of the isTemplate property.
	 * 
	 * @return possible object is {@link Byte }
	 * 
	 */
	public Byte getIsTemplate() {
		return isTemplate;
	}

	/**
	 * Sets the value of the isTemplate property.
	 * 
	 * @param value allowed object is {@link Byte }
	 * 
	 */
	public void setIsTemplate(Byte value) {
		this.isTemplate = value;
	}

}
