#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldRouteBuilder extends RouteBuilder {
  @Override
  public void configure() throws Exception {

    from("direct:orgUnits")
        .to("dhis2://get/collection?path=organisationUnits&arrayName=organisationUnits&client=${symbol_pound}dhis2Client")
        .marshal()
        .json();
  }
}
