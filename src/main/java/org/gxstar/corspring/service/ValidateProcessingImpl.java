package org.gxstar.corspring.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class ValidateProcessingImpl implements ValidateProcessing {
    private final List<Validator> validators;

    public ValidateProcessingImpl(final Validator... validators) {
        this.validators = List.of(validators);
    }

    public void processValidation() {
        validators.forEach(Validator::validate);
    }
}
