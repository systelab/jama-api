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
import io.swagger.client.model.CreatedResponse;
import io.swagger.client.model.RequestGroupUser;
import io.swagger.client.model.RequestUserGroup;
import io.swagger.client.model.UserDataListWrapper;
import io.swagger.client.model.UserGroupDataListWrapper;
import io.swagger.client.model.UserGroupDataWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsergroupsApi
 */
@Ignore
public class UsergroupsApiTest {

    private final UsergroupsApi api = new UsergroupsApi();

    
    /**
     * Create a new user group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserGroupTest() throws ApiException {
        RequestUserGroup body = null;
        CreatedResponse response = api.addUserGroup(body);

        // TODO: test validations
    }
    
    /**
     * Add an existing user to the user group with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserToGroupTest() throws ApiException {
        RequestGroupUser body = null;
        Integer id = null;
        CreatedResponse response = api.addUserToGroup(body, id);

        // TODO: test validations
    }
    
    /**
     * Delete the user group with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteItemTest() throws ApiException {
        Integer id = null;
        AbstractRestResponse response = api.deleteItem(id);

        // TODO: test validations
    }
    
    /**
     * Get the user group with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        Integer id = null;
        List<String> include = null;
        UserGroupDataWrapper response = api.getGroup(id, include);

        // TODO: test validations
    }
    
    /**
     * Get all users for the user group with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupUsersTest() throws ApiException {
        Integer id = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        UserDataListWrapper response = api.getGroupUsers(id, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Get all user groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        Integer project = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        UserGroupDataListWrapper response = api.getUsers(project, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Remove an existing user from the user group with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserFromGroupTest() throws ApiException {
        Integer userId = null;
        Integer id = null;
        AbstractRestResponse response = api.removeUserFromGroup(userId, id);

        // TODO: test validations
    }
    
    /**
     * Update the user group with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserGroupTest() throws ApiException {
        RequestUserGroup body = null;
        Integer id = null;
        AbstractRestResponse response = api.updateUserGroup(body, id);

        // TODO: test validations
    }
    
}
