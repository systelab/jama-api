# RelationshiptypesApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRelationshipType**](RelationshiptypesApi.md#getRelationshipType) | **GET** /relationshiptypes/{id} | Get the relationship type with the specified ID
[**getRelationshipTypes**](RelationshiptypesApi.md#getRelationshipTypes) | **GET** /relationshiptypes | Get all relationship types


<a name="getRelationshipType"></a>
# **getRelationshipType**
> RelationshipTypeDataWrapper getRelationshipType(id, timestamp, include)

Get the relationship type with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshiptypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshiptypesApi apiInstance = new RelationshiptypesApi();
Integer id = 56; // Integer | 
String timestamp = "timestamp_example"; // String | Get relationship type at this date and time. Requires ISO8601 formatting (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipTypeDataWrapper result = apiInstance.getRelationshipType(id, timestamp, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshiptypesApi#getRelationshipType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **timestamp** | **String**| Get relationship type at this date and time. Requires ISO8601 formatting (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**RelationshipTypeDataWrapper**](RelationshipTypeDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationshipTypes"></a>
# **getRelationshipTypes**
> RelationshipTypeDataListWrapper getRelationshipTypes(startAt, maxResults, include)

Get all relationship types



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshiptypesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshiptypesApi apiInstance = new RelationshiptypesApi();
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipTypeDataListWrapper result = apiInstance.getRelationshipTypes(startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshiptypesApi#getRelationshipTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**RelationshipTypeDataListWrapper**](RelationshipTypeDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

