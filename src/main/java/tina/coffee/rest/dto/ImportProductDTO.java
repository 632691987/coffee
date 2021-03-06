package tina.coffee.rest.dto;

import javax.validation.constraints.NotBlank;
import tina.coffee.function.JsonFunction;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "ImportProductDTO",
        propOrder = {
                "ipId",
                "ipCountable",
                "cnName",
                "enName",
                "spName"
        }
)
@XmlRootElement(name="ImportProductDTO")
public class ImportProductDTO {

    private int ipId;

    @NotNull
    private boolean ipCountable;

    private BigDecimal count;

    @NotBlank
    private String cnName;

    @NotBlank
    private String enName;

    @NotBlank
    private String spName;

    public int getIpId() {
        return ipId;
    }

    public void setIpId(int ipId) {
        this.ipId = ipId;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName;
    }

    public boolean isIpCountable() {
        return ipCountable;
    }

    public void setIpCountable(boolean ipCountable) {
        this.ipCountable = ipCountable;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return JsonFunction.toJson(this);
    }
}
