package edu.ada.micronaut.controller;

import javax.xml.ws.Response;

public interface FinanceController {
    Object getFinancialData(String financial_data_provider_name, String stock_index);
}
