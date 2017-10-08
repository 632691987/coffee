package tina.coffee.function.print;

import com.google.common.collect.Lists;
import tina.coffee.function.CalFunction;
import tina.coffee.system.config.SystemConstant;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class PrintItemFooterBuilder {

    public static List<String> buildFooter(BigDecimal actualPrice, BigDecimal customerPay, BigDecimal customerReceive) {
        List<String> result = Lists.newArrayList();

        result.add("Timpo:" + CalFunction.getCurrentTime(SystemConstant.LONG_DATE_FORMAT  ));

        return result;
    }

}
