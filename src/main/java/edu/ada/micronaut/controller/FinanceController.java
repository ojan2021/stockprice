package edu.ada.micronaut.controller;

import javax.xml.ws.Response;

public interface FinanceController {
    Response getFinancialData(String financial_data_provider_name);
}
