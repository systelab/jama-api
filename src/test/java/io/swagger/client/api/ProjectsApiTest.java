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
import io.swagger.client.model.ItemTypeDataListWrapper;
import io.swagger.client.model.ProjectDataListWrapper;
import io.swagger.client.model.ProjectDataWrapper;
import io.swagger.client.model.RequestAttachment;
import io.swagger.client.model.RequestProject;
import io.swagger.client.model.TagDataListWrapper;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectsApi
 */
@Ignore
public class ProjectsApiTest {

    private final ProjectsApi api = new ProjectsApi();

    
    /**
     * Create a new project
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProjectTest() throws ApiException {
        RequestProject body = null;
        CreatedResponse response = api.addProject(body);

        // TODO: test validations
    }
    
    /**
     * Get all item types for the project with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getItemTypesInProjectTest() throws ApiException {
        Integer projectId = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        ItemTypeDataListWrapper response = api.getItemTypesInProject(projectId, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Get the project with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectTest() throws ApiException {
        Integer projectId = null;
        List<String> include = null;
        ProjectDataWrapper response = api.getProject(projectId, include);

        // TODO: test validations
    }
    
    /**
     * Get all projects
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectsTest() throws ApiException {
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        ProjectDataListWrapper response = api.getProjects(startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Get all tags for the project with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsInProjectTest() throws ApiException {
        Integer projectId = null;
        Integer startAt = null;
        Integer maxResults = null;
        List<String> include = null;
        TagDataListWrapper response = api.getTagsInProject(projectId, startAt, maxResults, include);

        // TODO: test validations
    }
    
    /**
     * Create a new attachment in the project with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAttachmentTest() throws ApiException {
        RequestAttachment body = null;
        Integer projectId = null;
        CreatedResponse response = api.postAttachment(body, projectId);

        // TODO: test validations
    }
    
    /**
     * Update the project with the specified ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putProjectTest() throws ApiException {
        RequestProject body = null;
        Integer projectId = null;
        AbstractRestResponse response = api.putProject(body, projectId);

        // TODO: test validations
    }
    
}
