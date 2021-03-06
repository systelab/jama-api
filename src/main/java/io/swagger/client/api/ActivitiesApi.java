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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AbstractRestResponse;
import io.swagger.client.model.ActivityDataListWrapper;
import io.swagger.client.model.ActivityDataWrapper;
import io.swagger.client.model.ItemDataListWrapper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivitiesApi {
    private ApiClient apiClient;

    public ActivitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActivitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getActivities
     * @param project  (required)
     * @param eventType Event type to filter on. More than one event type can be chosen (optional)
     * @param objectType Object type to filter on. More than one object type can be chosen (optional)
     * @param itemType ID of item type to filter on. More than one item type can be chosen (optional)
     * @param date Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (optional)
     * @param deleteEvents Get item delete events only (optional)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getActivitiesCall(Integer project, List<String> eventType, List<String> objectType, List<Integer> itemType, List<String> date, Boolean deleteEvents, Integer startAt, Integer maxResults, List<String> include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/activities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (project != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("project", project));
        if (eventType != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "eventType", eventType));
        if (objectType != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "objectType", objectType));
        if (itemType != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "itemType", itemType));
        if (date != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "date", date));
        if (deleteEvents != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deleteEvents", deleteEvents));
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxResults", maxResults));
        if (include != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getActivitiesValidateBeforeCall(Integer project, List<String> eventType, List<String> objectType, List<Integer> itemType, List<String> date, Boolean deleteEvents, Integer startAt, Integer maxResults, List<String> include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException("Missing the required parameter 'project' when calling getActivities(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getActivitiesCall(project, eventType, objectType, itemType, date, deleteEvents, startAt, maxResults, include, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all activities in the project with the specified ID
     * 
     * @param project  (required)
     * @param eventType Event type to filter on. More than one event type can be chosen (optional)
     * @param objectType Object type to filter on. More than one object type can be chosen (optional)
     * @param itemType ID of item type to filter on. More than one item type can be chosen (optional)
     * @param date Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (optional)
     * @param deleteEvents Get item delete events only (optional)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @return ActivityDataListWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ActivityDataListWrapper getActivities(Integer project, List<String> eventType, List<String> objectType, List<Integer> itemType, List<String> date, Boolean deleteEvents, Integer startAt, Integer maxResults, List<String> include) throws ApiException {
        ApiResponse<ActivityDataListWrapper> resp = getActivitiesWithHttpInfo(project, eventType, objectType, itemType, date, deleteEvents, startAt, maxResults, include);
        return resp.getData();
    }

    /**
     * Get all activities in the project with the specified ID
     * 
     * @param project  (required)
     * @param eventType Event type to filter on. More than one event type can be chosen (optional)
     * @param objectType Object type to filter on. More than one object type can be chosen (optional)
     * @param itemType ID of item type to filter on. More than one item type can be chosen (optional)
     * @param date Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (optional)
     * @param deleteEvents Get item delete events only (optional)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @return ApiResponse&lt;ActivityDataListWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ActivityDataListWrapper> getActivitiesWithHttpInfo(Integer project, List<String> eventType, List<String> objectType, List<Integer> itemType, List<String> date, Boolean deleteEvents, Integer startAt, Integer maxResults, List<String> include) throws ApiException {
        com.squareup.okhttp.Call call = getActivitiesValidateBeforeCall(project, eventType, objectType, itemType, date, deleteEvents, startAt, maxResults, include, null, null);
        Type localVarReturnType = new TypeToken<ActivityDataListWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all activities in the project with the specified ID (asynchronously)
     * 
     * @param project  (required)
     * @param eventType Event type to filter on. More than one event type can be chosen (optional)
     * @param objectType Object type to filter on. More than one object type can be chosen (optional)
     * @param itemType ID of item type to filter on. More than one item type can be chosen (optional)
     * @param date Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; (optional)
     * @param deleteEvents Get item delete events only (optional)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getActivitiesAsync(Integer project, List<String> eventType, List<String> objectType, List<Integer> itemType, List<String> date, Boolean deleteEvents, Integer startAt, Integer maxResults, List<String> include, final ApiCallback<ActivityDataListWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getActivitiesValidateBeforeCall(project, eventType, objectType, itemType, date, deleteEvents, startAt, maxResults, include, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ActivityDataListWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getActivityById
     * @param activityId  (required)
     * @param include Links to include as full objects in the linked map (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getActivityByIdCall(Integer activityId, List<String> include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/activities/{activityId}"
            .replaceAll("\\{" + "activityId" + "\\}", apiClient.escapeString(activityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (include != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getActivityByIdValidateBeforeCall(Integer activityId, List<String> include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new ApiException("Missing the required parameter 'activityId' when calling getActivityById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getActivityByIdCall(activityId, include, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the activity with the specified ID
     * 
     * @param activityId  (required)
     * @param include Links to include as full objects in the linked map (optional)
     * @return ActivityDataWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ActivityDataWrapper getActivityById(Integer activityId, List<String> include) throws ApiException {
        ApiResponse<ActivityDataWrapper> resp = getActivityByIdWithHttpInfo(activityId, include);
        return resp.getData();
    }

    /**
     * Get the activity with the specified ID
     * 
     * @param activityId  (required)
     * @param include Links to include as full objects in the linked map (optional)
     * @return ApiResponse&lt;ActivityDataWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ActivityDataWrapper> getActivityByIdWithHttpInfo(Integer activityId, List<String> include) throws ApiException {
        com.squareup.okhttp.Call call = getActivityByIdValidateBeforeCall(activityId, include, null, null);
        Type localVarReturnType = new TypeToken<ActivityDataWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the activity with the specified ID (asynchronously)
     * 
     * @param activityId  (required)
     * @param include Links to include as full objects in the linked map (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getActivityByIdAsync(Integer activityId, List<String> include, final ApiCallback<ActivityDataWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getActivityByIdValidateBeforeCall(activityId, include, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ActivityDataWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAffectedItems
     * @param activityId  (required)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAffectedItemsCall(Integer activityId, Integer startAt, Integer maxResults, List<String> include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/activities/{activityId}/affecteditems"
            .replaceAll("\\{" + "activityId" + "\\}", apiClient.escapeString(activityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxResults", maxResults));
        if (include != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "include", include));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAffectedItemsValidateBeforeCall(Integer activityId, Integer startAt, Integer maxResults, List<String> include, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new ApiException("Missing the required parameter 'activityId' when calling getAffectedItems(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAffectedItemsCall(activityId, startAt, maxResults, include, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all items affected by the activity with the specified ID
     * 
     * @param activityId  (required)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @return ItemDataListWrapper
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ItemDataListWrapper getAffectedItems(Integer activityId, Integer startAt, Integer maxResults, List<String> include) throws ApiException {
        ApiResponse<ItemDataListWrapper> resp = getAffectedItemsWithHttpInfo(activityId, startAt, maxResults, include);
        return resp.getData();
    }

    /**
     * Get all items affected by the activity with the specified ID
     * 
     * @param activityId  (required)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @return ApiResponse&lt;ItemDataListWrapper&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ItemDataListWrapper> getAffectedItemsWithHttpInfo(Integer activityId, Integer startAt, Integer maxResults, List<String> include) throws ApiException {
        com.squareup.okhttp.Call call = getAffectedItemsValidateBeforeCall(activityId, startAt, maxResults, include, null, null);
        Type localVarReturnType = new TypeToken<ItemDataListWrapper>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all items affected by the activity with the specified ID (asynchronously)
     * 
     * @param activityId  (required)
     * @param startAt  (optional)
     * @param maxResults If not set, this defaults to 20. This cannot be larger than 50 (optional)
     * @param include Links to include as full objects in the linked map (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAffectedItemsAsync(Integer activityId, Integer startAt, Integer maxResults, List<String> include, final ApiCallback<ItemDataListWrapper> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAffectedItemsValidateBeforeCall(activityId, startAt, maxResults, include, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ItemDataListWrapper>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for restoreItems
     * @param activityId  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call restoreItemsCall(Integer activityId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/activities/{activityId}/restore"
            .replaceAll("\\{" + "activityId" + "\\}", apiClient.escapeString(activityId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic", "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call restoreItemsValidateBeforeCall(Integer activityId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'activityId' is set
        if (activityId == null) {
            throw new ApiException("Missing the required parameter 'activityId' when calling restoreItems(Async)");
        }
        
        
        com.squareup.okhttp.Call call = restoreItemsCall(activityId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Restore item(s) associated with a delete activity.
     * 
     * @param activityId  (required)
     * @return AbstractRestResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AbstractRestResponse restoreItems(Integer activityId) throws ApiException {
        ApiResponse<AbstractRestResponse> resp = restoreItemsWithHttpInfo(activityId);
        return resp.getData();
    }

    /**
     * Restore item(s) associated with a delete activity.
     * 
     * @param activityId  (required)
     * @return ApiResponse&lt;AbstractRestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AbstractRestResponse> restoreItemsWithHttpInfo(Integer activityId) throws ApiException {
        com.squareup.okhttp.Call call = restoreItemsValidateBeforeCall(activityId, null, null);
        Type localVarReturnType = new TypeToken<AbstractRestResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Restore item(s) associated with a delete activity. (asynchronously)
     * 
     * @param activityId  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call restoreItemsAsync(Integer activityId, final ApiCallback<AbstractRestResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = restoreItemsValidateBeforeCall(activityId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AbstractRestResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
