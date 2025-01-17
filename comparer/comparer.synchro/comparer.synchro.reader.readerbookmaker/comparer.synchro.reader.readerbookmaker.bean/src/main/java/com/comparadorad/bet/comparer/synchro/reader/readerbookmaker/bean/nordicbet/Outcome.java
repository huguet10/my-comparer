//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.19 at 01:14:38 PM CET 
//

package com.comparadorad.bet.comparer.synchro.reader.readerbookmaker.bean.nordicbet;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;sequence>
 *           &lt;element ref="{}Participant"/>
 *           &lt;element ref="{}OptionalValue1" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{}OptionalValue1"/>
 *           &lt;element ref="{}OptionalValue2"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *       &lt;attribute name="odds" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "participant", "optionalValue1", "optionalValue2" })
@XmlRootElement(name = "Outcome")
public class Outcome {

	@XmlElement(name = "Participant", required = false)
	protected Participant participant;
	
	@XmlElement(name = "OptionalValue1", required = false)
	protected String optionalValue1;

	/** The optional value2. */
	@XmlElement(name = "OptionalValue2", required = false)
	protected String optionalValue2;

	/** The odds. */
	@XmlAttribute(name = "odds", required = true)
	protected BigDecimal odds;

	/** The name. */
	@XmlAttribute(name = "name", required = true)
	protected String name;

	/** The id. */
	@XmlAttribute(name = "id", required = true)
	protected long id;


	/**
	 * Gets the value of the odds property.
	 * 
	 * @return the odds possible object is {@link BigDecimal }
	 */
	public BigDecimal getOdds() {
		return odds;
	}

	/**
	 * Sets the value of the odds property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setOdds(BigDecimal value) {
		this.odds = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return the name possible object is {@link String }
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            the new id
	 */
	public void setId(long value) {
		this.id = value;
	}

	/**
	 * Gets the optional value1.
	 * 
	 * @return the optional value1
	 */
	public String getOptionalValue1() {
		return optionalValue1;
	}

	/**
	 * Sets the optional value1.
	 * 
	 * @param pOptionalValue1
	 *            the new optional value1
	 */
	public void setOptionalValue1(String pOptionalValue1) {
		optionalValue1 = pOptionalValue1;
	}

	/**
	 * Gets the optional value2.
	 * 
	 * @return the optional value2
	 */
	public String getOptionalValue2() {
		return optionalValue2;
	}

	/**
	 * Sets the optional value2.
	 * 
	 * @param pOptionalValue2
	 *            the new optional value2
	 */
	public void setOptionalValue2(String pOptionalValue2) {
		optionalValue2 = pOptionalValue2;
	}
	
	/**
	 * Returns the Participant
	 * @return
	 */
	public Participant getParticipant() {
		return participant;
	}

}
