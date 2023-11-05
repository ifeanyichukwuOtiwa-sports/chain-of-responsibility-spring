package org.gxstar.corspring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Order(1)
public class OddsValidator implements Validator {
    @Override
    public void validate() {
        log.info("Validating Odds");
    }
}
