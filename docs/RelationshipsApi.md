# RelationshipsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearSuspectLink**](RelationshipsApi.md#clearSuspectLink) | **DELETE** /relationships/{relationshipId}/suspect | Remove an existing suspect link for the relationship with the specified ID
[**createRelationship**](RelationshipsApi.md#createRelationship) | **POST** /relationships | Create a new relationship
[**deleteRelationship**](RelationshipsApi.md#deleteRelationship) | **DELETE** /relationships/{relationshipId} | Delete the relationship with the specified ID
[**getRelationship**](RelationshipsApi.md#getRelationship) | **GET** /relationships/{relationshipId} | Get the relationship with the specified ID
[**getRelationships**](RelationshipsApi.md#getRelationships) | **GET** /relationships | Get all relationships in the project with the specified ID
[**updateRelationship**](RelationshipsApi.md#updateRelationship) | **PUT** /relationships/{relationshipId} | Update the relationship with the specified ID


<a name="clearSuspectLink"></a>
# **clearSuspectLink**
> AbstractRestResponse clearSuspectLink(relationshipId)

Remove an existing suspect link for the relationship with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshipsApi apiInstance = new RelationshipsApi();
Integer relationshipId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.clearSuspectLink(relationshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipsApi#clearSuspectLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationshipId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRelationship"></a>
# **createRelationship**
> CreatedResponse createRelationship(body)

Create a new relationship



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshipsApi apiInstance = new RelationshipsApi();
RequestRelationship body = new RequestRelationship(); // RequestRelationship | 
try {
    CreatedResponse result = apiInstance.createRelationship(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipsApi#createRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestRelationship**](RequestRelationship.md)|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRelationship"></a>
# **deleteRelationship**
> AbstractRestResponse deleteRelationship(relationshipId)

Delete the relationship with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshipsApi apiInstance = new RelationshipsApi();
Integer relationshipId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteRelationship(relationshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipsApi#deleteRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationshipId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationship"></a>
# **getRelationship**
> RelationshipDataWrapper getRelationship(relationshipId, include)

Get the relationship with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshipsApi apiInstance = new RelationshipsApi();
Integer relationshipId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataWrapper result = apiInstance.getRelationship(relationshipId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipsApi#getRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **relationshipId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**RelationshipDataWrapper**](RelationshipDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationships"></a>
# **getRelationships**
> RelationshipDataListWrapper getRelationships(project, startAt, maxResults, include)

Get all relationships in the project with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshipsApi apiInstance = new RelationshipsApi();
Integer project = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataListWrapper result = apiInstance.getRelationships(project, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipsApi#getRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**RelationshipDataListWrapper**](RelationshipDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRelationship"></a>
# **updateRelationship**
> AbstractRestResponse updateRelationship(body, relationshipId)

Update the relationship with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RelationshipsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

RelationshipsApi apiInstance = new RelationshipsApi();
RequestRelationship body = new RequestRelationship(); // RequestRelationship | 
Integer relationshipId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateRelationship(body, relationshipId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationshipsApi#updateRelationship");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestRelationship**](RequestRelationship.md)|  |
 **relationshipId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

