package dev.elma.micro_services_app_spring.services;

import dev.elma.micro_services_app_spring.dtos.CompteDTORequest;
import dev.elma.micro_services_app_spring.dtos.CompteDTOResponse;

public interface IBankServices {
    CompteDTOResponse addNewAccount(CompteDTORequest compteDTORequest);
}
