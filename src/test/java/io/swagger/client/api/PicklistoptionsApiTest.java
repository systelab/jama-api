/*
 * Jama REST API
 * This is the documentation for the Jama REST API.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AbstractRestResponse;
import io.swagger.client.model.PickListOptionDataWrapper;
import io.swagger.client.model.RequestPickListOption;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PicklistoptionsApi
 */
@Ignore
public class PicklistoptionsApiTest {

    private final PicklistoptionsApi api = new PicklistoptionsApi();

    
    /**
     * Get the pick list option with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPicklistOptionTest() throws ApiException {
        Integer picklistOptionId = null;
        List<String> include = null;
        PickListOptionDataWrapper response = api.getPicklistOption(picklistOptionId, include);

        // TODO: test validations
    }
    
    /**
     * Update the pick list option with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePicklistOptionTest() throws ApiException {
        RequestPickListOption body = null;
        Integer picklistOptionId = null;
        AbstractRestResponse response = api.updatePicklistOption(body, picklistOptionId);

        // TODO: test validations
    }
    
}
