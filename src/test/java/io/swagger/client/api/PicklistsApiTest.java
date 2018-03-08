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
import io.swagger.client.model.CreatedResponse;
import io.swagger.client.model.PickListDataListWrapper;
import io.swagger.client.model.PickListDataWrapper;
import io.swagger.client.model.PickListOptionDataListWrapper;
import io.swagger.client.model.RequestPickListOption;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PicklistsApi
 */
@Ignore
public class PicklistsApiTest {

    private final PicklistsApi api = new PicklistsApi();

    
    /**
     * Create a new pick list option for the pick list with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPickListOptionToPickListTest() throws ApiException {
        RequestPickListOption body = null;
        Integer picklistId = null;
        CreatedResponse response = api.addPickListOptionToPickList(body, picklistId);

        // TODO: test validations
    }
    
    /**
     * Get the pick list with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPickListTest() throws ApiException {
        Integer picklistId = null;
        List<String> include = null;
        PickListDataWrapper response = api.getPickList(picklistId, include);

        // TODO: test validations
    }
    
    /**
     * Get all pick list options for the pick list with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPickListOptionsTest() throws ApiException {
        Integer picklistId = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        PickListOptionDataListWrapper response = api.getPickListOptions(picklistId, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Get all pick lists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPickListsTest() throws ApiException {
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        PickListDataListWrapper response = api.getPickLists(startAt, maxResults, include);

        // TODO: test validations
    }
    
}