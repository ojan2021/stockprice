package edu.ada.micronaut.controller.impl;

import edu.ada.micronaut.controller.FinanceController;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.RequestAttribute;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.xml.ws.Response;

@Controller("/finance")
public class FinanceControllerImpl implements FinanceController {
    protected static Logger logger = LoggerFactory.getLogger(FinanceControllerImpl.class);
    @Override
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFinancialData(@RequestAttribute(name = "provider")
                                     String financial_data_provider_name) {
        logger.info("Provider :: {}", financial_data_provider_name);
        return null;
    }
}
