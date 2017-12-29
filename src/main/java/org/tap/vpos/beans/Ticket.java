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
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}LoyaltyInfo"/&gt;
 *         &lt;element ref="{}Items"/&gt;
 *         &lt;element ref="{}Tenders"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Action" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="DiscountAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="NetTotalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TotalAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TxnNo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TxnTime" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loyaltyInfo",
    "items",
    "tenders"
})
@XmlRootElement(name = "Ticket")
public class Ticket {

    @XmlElement(name = "LoyaltyInfo", required = true)
    protected LoyaltyInfo loyaltyInfo;
    @XmlElement(name = "Items", required = true)
    protected Items items;
    @XmlElement(name = "Tenders", required = true)
    protected Tenders tenders;
    @XmlAttribute(name = "Action", required = true)
    protected String action;
    @XmlAttribute(name = "Description", required = true)
    protected String description;
    @XmlAttribute(name = "DiscountAmount", required = true)
    protected String discountAmount;
    @XmlAttribute(name = "NetTotalAmount", required = true)
    protected String netTotalAmount;
    @XmlAttribute(name = "TotalAmount", required = true)
    protected String totalAmount;
    @XmlAttribute(name = "TxnNo", required = true)
    protected String txnNo;
    @XmlAttribute(name = "TxnTime", required = true)
    protected String txnTime;

    /**
     * 获取loyaltyInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyInfo }
     *     
     */
    public LoyaltyInfo getLoyaltyInfo() {
        return loyaltyInfo;
    }

    /**
     * 设置loyaltyInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyInfo }
     *     
     */
    public void setLoyaltyInfo(LoyaltyInfo value) {
        this.loyaltyInfo = value;
    }

    /**
     * 获取items属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getItems() {
        return items;
    }

    /**
     * 设置items属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setItems(Items value) {
        this.items = value;
    }

    /**
     * 获取tenders属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Tenders }
     *     
     */
    public Tenders getTenders() {
        return tenders;
    }

    /**
     * 设置tenders属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Tenders }
     *     
     */
    public void setTenders(Tenders value) {
        this.tenders = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取discountAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置discountAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountAmount(String value) {
        this.discountAmount = value;
    }

    /**
     * 获取netTotalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetTotalAmount() {
        return netTotalAmount;
    }

    /**
     * 设置netTotalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetTotalAmount(String value) {
        this.netTotalAmount = value;
    }

    /**
     * 获取totalAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAmount() {
        return totalAmount;
    }

    /**
     * 设置totalAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAmount(String value) {
        this.totalAmount = value;
    }

    /**
     * 获取txnNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnNo() {
        return txnNo;
    }

    /**
     * 设置txnNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnNo(String value) {
        this.txnNo = value;
    }

    /**
     * 获取txnTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnTime() {
        return txnTime;
    }

    /**
     * 设置txnTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnTime(String value) {
        this.txnTime = value;
    }

}
