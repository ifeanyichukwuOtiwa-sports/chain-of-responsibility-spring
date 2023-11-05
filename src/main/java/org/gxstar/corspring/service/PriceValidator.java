package org.gxstar.corspring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(3)
public class PriceValidator implements Validator {
    @Override
    public void validate() {
        log.info("Validating for Prices");
    }
}
