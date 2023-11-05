package org.gxstar.corspring.web;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.gxstar.corspring.service.ValidateProcessing;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InitCommand {
    private final ValidateProcessing validateProcessing;

    @PostConstruct
    void init() {
        validateProcessing.processValidation();
    }
}
