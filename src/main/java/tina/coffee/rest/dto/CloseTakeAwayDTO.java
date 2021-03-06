package tina.coffee.rest.dto;

import tina.coffee.function.JsonFunction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "CloseTakeAwayDTO",
        propOrder = {
                "orderItemDTOList",
                "actualPrice",
                "customerPay",
                "customerReceive"
        }
)
@XmlRootElement(name="CloseTakeAwayDTO")
public class CloseTakeAwayDTO {

    private List<CloseOrderItemDTO> orderItemDTOList;

    private BigDecimal actualPrice;

    private BigDecimal customerPay;

    private BigDecimal customerReceive;

    public List<CloseOrderItemDTO> getOrderItemDTOList() {
        return orderItemDTOList;
    }

    public void setOrderItemDTOList(List<CloseOrderItemDTO> orderItemDTOList) {
        this.orderItemDTOList = orderItemDTOList;
    }

    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    public BigDecimal getCustomerPay() {
        return customerPay;
    }

    public void setCustomerPay(BigDecimal customerPay) {
        this.customerPay = customerPay;
    }

    public BigDecimal getCustomerReceive() {
        return customerReceive;
    }

    public void setCustomerReceive(BigDecimal customerReceive) {
        this.customerReceive = customerReceive;
    }

    @Override
    public String toString() {
        return JsonFunction.toJson(this);
    }
}
