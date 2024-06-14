#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.springframework.stereotype.Component;

import java.time.temporal.ChronoUnit;

@Component
public class UptimeExpression implements Expression {
    @Override
    public <T> T evaluate(Exchange exchange, Class<T> type) {
        return (T) Long.valueOf(exchange.getContext().getUptime().get(ChronoUnit.SECONDS));
    }
}
