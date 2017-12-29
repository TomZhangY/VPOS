//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.12.21 时间 12:40:13 PM CST 
//


package org.tap.vpos.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="CustomerName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LoyaltyNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OriginalPoint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EarnedPoint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BalancePoint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="OriginalStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="EarnedStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="BalanceStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LoyaltyInfo")
public class LoyaltyInfo {

    @XmlAttribute(name = "CustomerName", required = true)
    protected String customerName;
    @XmlAttribute(name = "LoyaltyNumber", required = true)
    protected String loyaltyNumber;
    @XmlAttribute(name = "OriginalPoint", required = true)
    protected String originalPoint;
    @XmlAttribute(name = "EarnedPoint", required = true)
    protected String earnedPoint;
    @XmlAttribute(name = "BalancePoint", required = true)
    protected String balancePoint;
    @XmlAttribute(name = "OriginalStamp", required = true)
    protected String originalStamp;
    @XmlAttribute(name = "EarnedStamp", required = true)
    protected String earnedStamp;
    @XmlAttribute(name = "BalanceStamp", required = true)
    protected String balanceStamp;

    /**
     * 获取customerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * 获取loyaltyNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyNumber() {
        return loyaltyNumber;
    }

    /**
     * 设置loyaltyNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyNumber(String value) {
        this.loyaltyNumber = value;
    }

    /**
     * 获取originalPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalPoint() {
        return originalPoint;
    }

    /**
     * 设置originalPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalPoint(String value) {
        this.originalPoint = value;
    }

    /**
     * 获取earnedPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnedPoint() {
        return earnedPoint;
    }

    /**
     * 设置earnedPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnedPoint(String value) {
        this.earnedPoint = value;
    }

    /**
     * 获取balancePoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalancePoint() {
        return balancePoint;
    }

    /**
     * 设置balancePoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalancePoint(String value) {
        this.balancePoint = value;
    }

    /**
     * 获取originalStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalStamp() {
        return originalStamp;
    }

    /**
     * 设置originalStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalStamp(String value) {
        this.originalStamp = value;
    }

    /**
     * 获取earnedStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarnedStamp() {
        return earnedStamp;
    }

    /**
     * 设置earnedStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarnedStamp(String value) {
        this.earnedStamp = value;
    }

    /**
     * 获取balanceStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceStamp() {
        return balanceStamp;
    }

    /**
     * 设置balanceStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceStamp(String value) {
        this.balanceStamp = value;
    }

}
