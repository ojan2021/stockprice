package edu.ada.micronaut.controller.impl;

import edu.ada.micronaut.controller.FinanceController;
import edu.ada.micronaut.service.FinancialService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller("/finance")
//@Secured(SecurityRule.IS_AUTHENTICATED)

public class FinanceControllerImpl implements FinanceController {
    protected static Logger logger = LoggerFactory.getLogger(FinanceControllerImpl.class);

    @Inject
    private FinancialService financialService;

    @Override
    @Get
//    @Secured("ADMIN")
    @Produces(MediaType.APPLICATION_JSON)
    public Object getFinancialData(@QueryValue("provider") String financial_data_provider_name,
                                   @QueryValue("stock_index") String stock_index) {

        if(financial_data_provider_name.equals("yahoo")){
            List<Object> stocks = Arrays.asList(stock_index.split(","));
            ArrayList<Object> stockValues = new ArrayList<>();
            for(int i = 0; i<stocks.size();i++)
                stockValues.add(financialService.getFinancialData((String) stocks.get(i)));
            return stockValues;
        } else {
            return HttpResponse.badRequest("Provider name is invalid!");
        }
    }

    @Get("/test")
    public String test(){
        return "test";
    }
}
