//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.12.21 时间 12:40:13 PM CST 
//


package org.tap.vpos.beans;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tap.vpos.beans package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tap.vpos.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VPOS }
     * 
     */
    public VPOS createVPOS() {
        return new VPOS();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link LoyaltyInfo }
     * 
     */
    public LoyaltyInfo createLoyaltyInfo() {
        return new LoyaltyInfo();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Tenders }
     * 
     */
    public Tenders createTenders() {
        return new Tenders();
    }

    /**
     * Create an instance of {@link Tender }
     * 
     */
    public Tender createTender() {
        return new Tender();
    }

}
