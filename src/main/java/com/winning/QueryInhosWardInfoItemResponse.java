
package com.winning;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryInhosWardInfoItemResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OutXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "queryInhosWardInfoItemResult",
    "outXml"
})
@XmlRootElement(name = "QueryInhosWardInfoItemResponse")
public class QueryInhosWardInfoItemResponse {

    @XmlElement(name = "QueryInhosWardInfoItemResult")
    protected boolean queryInhosWardInfoItemResult;
    @XmlElement(name = "OutXml")
    protected String outXml;

    /**
     * ��ȡqueryInhosWardInfoItemResult���Ե�ֵ��
     * 
     */
    public boolean isQueryInhosWardInfoItemResult() {
        return queryInhosWardInfoItemResult;
    }

    /**
     * ����queryInhosWardInfoItemResult���Ե�ֵ��
     * 
     */
    public void setQueryInhosWardInfoItemResult(boolean value) {
        this.queryInhosWardInfoItemResult = value;
    }

    /**
     * ��ȡoutXml���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutXml() {
        return outXml;
    }

    /**
     * ����outXml���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutXml(String value) {
        this.outXml = value;
    }

}
