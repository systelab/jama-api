# ActivitiesApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActivities**](ActivitiesApi.md#getActivities) | **GET** /activities | Get all activities in the project with the specified ID
[**getActivityById**](ActivitiesApi.md#getActivityById) | **GET** /activities/{activityId} | Get the activity with the specified ID
[**getAffectedItems**](ActivitiesApi.md#getAffectedItems) | **GET** /activities/{activityId}/affecteditems | Get all items affected by the activity with the specified ID
[**restoreItems**](ActivitiesApi.md#restoreItems) | **POST** /activities/{activityId}/restore | Restore item(s) associated with a delete activity.


<a name="getActivities"></a>
# **getActivities**
> ActivityDataListWrapper getActivities(project, eventType, objectType, itemType, date, deleteEvents, startAt, maxResults, include)

Get all activities in the project with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActivitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ActivitiesApi apiInstance = new ActivitiesApi();
Integer project = 56; // Integer | 
List<String> eventType = Arrays.asList("eventType_example"); // List<String> | Event type to filter on. More than one event type can be chosen
List<String> objectType = Arrays.asList("objectType_example"); // List<String> | Object type to filter on. More than one object type can be chosen
List<Integer> itemType = Arrays.asList(56); // List<Integer> | ID of item type to filter on. More than one item type can be chosen
List<String> date = Arrays.asList("date_example"); // List<String> | Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
Boolean deleteEvents = true; // Boolean | Get item delete events only
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ActivityDataListWrapper result = apiInstance.getActivities(project, eventType, objectType, itemType, date, deleteEvents, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#getActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | **Integer**|  |
 **eventType** | [**List&lt;String&gt;**](String.md)| Event type to filter on. More than one event type can be chosen | [optional] [enum: BATCH_SUMMARY, CREATE, DELETE, PUBLIC, UPDATE]
 **objectType** | [**List&lt;String&gt;**](String.md)| Object type to filter on. More than one object type can be chosen | [optional] [enum: BASELINE, CHANGE_REQUEST, COMMENT, INTEGRATION, ITEM, ITEM_ATTACHMENT, ITEM_TAG, RELATIONSHIP, MISCELLANEOUS, PROJECT, REVIEW, REVISION, REVISION_ITEM, TAG, TEST_CYCLE, TEST_PLAN, TEST_RESULT, TEST_RUN, URL, USER]
 **itemType** | [**List&lt;Integer&gt;**](Integer.md)| ID of item type to filter on. More than one item type can be chosen | [optional]
 **date** | [**List&lt;String&gt;**](String.md)| Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; | [optional]
 **deleteEvents** | **Boolean**| Get item delete events only | [optional]
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**ActivityDataListWrapper**](ActivityDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActivityById"></a>
# **getActivityById**
> ActivityDataWrapper getActivityById(activityId, include)

Get the activity with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActivitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ActivitiesApi apiInstance = new ActivitiesApi();
Integer activityId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ActivityDataWrapper result = apiInstance.getActivityById(activityId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#getActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**ActivityDataWrapper**](ActivityDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAffectedItems"></a>
# **getAffectedItems**
> ItemDataListWrapper getAffectedItems(activityId, startAt, maxResults, include)

Get all items affected by the activity with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActivitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ActivitiesApi apiInstance = new ActivitiesApi();
Integer activityId = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getAffectedItems(activityId, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#getAffectedItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**ItemDataListWrapper**](ItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restoreItems"></a>
# **restoreItems**
> AbstractRestResponse restoreItems(activityId)

Restore item(s) associated with a delete activity.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActivitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ActivitiesApi apiInstance = new ActivitiesApi();
Integer activityId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.restoreItems(activityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitiesApi#restoreItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

