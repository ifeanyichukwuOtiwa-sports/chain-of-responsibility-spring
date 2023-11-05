package org.gxstar.corspring.config;

import org.gxstar.corspring.service.BonusValidator;
import org.gxstar.corspring.service.OddsValidator;
import org.gxstar.corspring.service.PriceValidator;
import org.gxstar.corspring.service.Validator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
@ComponentScan(basePackages = "org.gxstar.corspring")
public class CORSbApplicationConfig {

//    @Bean
//    Validator[] validators() {
//        return new Validator[]{new PriceValidator(), new BonusValidator(), new OddsValidator()};
//    }

//    @Bean
//    List<Validator> validators() {
//        return List.of(new PriceValidator(), new BonusValidator(), new OddsValidator());
//    }
}
