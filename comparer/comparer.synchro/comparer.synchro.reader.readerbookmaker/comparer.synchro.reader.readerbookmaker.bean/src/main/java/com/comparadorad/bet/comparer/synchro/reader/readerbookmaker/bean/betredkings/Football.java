//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.06.03 a las 04:13:49 PM CEST 
//


package com.comparadorad.bet.comparer.synchro.reader.readerbookmaker.bean.betredkings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}Sport"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sport"
})
@XmlRootElement(name = "Football")
public class Football {

    @XmlElement(name = "Sport", required = true)
    protected Sport sport;

    /**
     * Obtiene el valor de la propiedad sport.
     * 
     * @return
     *     possible object is
     *     {@link Sport }
     *     
     */
    public Sport getSport() {
        return sport;
    }

    /**
     * Define el valor de la propiedad sport.
     * 
     * @param value
     *     allowed object is
     *     {@link Sport }
     *     
     */
    public void setSport(Sport value) {
        this.sport = value;
    }

}
