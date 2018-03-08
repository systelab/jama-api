# BaselinesApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBaseline**](BaselinesApi.md#getBaseline) | **GET** /baselines/{baselineId} | Get the baseline with the specified ID
[**getBaselines**](BaselinesApi.md#getBaselines) | **GET** /baselines | Get all baselines in the project with the specified ID
[**getRelationshipsForVersion**](BaselinesApi.md#getRelationshipsForVersion) | **GET** /baselines/{baselineId}/versioneditems/{itemId}/versionedrelationships | Get all versioned relationships for the item in the baseline
[**getVersionedItem**](BaselinesApi.md#getVersionedItem) | **GET** /baselines/{baselineId}/versioneditems/{itemId} | Get the baseline item with the specified ID in a baseline with the specified ID
[**getVersionedItems**](BaselinesApi.md#getVersionedItems) | **GET** /baselines/{baselineId}/versioneditems | Get all baseline items in a baseline with the specified ID


<a name="getBaseline"></a>
# **getBaseline**
> BaselineDataWrapper getBaseline(baselineId, include)

Get the baseline with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaselinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BaselinesApi apiInstance = new BaselinesApi();
Integer baselineId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    BaselineDataWrapper result = apiInstance.getBaseline(baselineId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaselinesApi#getBaseline");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baselineId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**BaselineDataWrapper**](BaselineDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBaselines"></a>
# **getBaselines**
> BaselineDataListWrapper getBaselines(project, startAt, maxResults, include)

Get all baselines in the project with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaselinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BaselinesApi apiInstance = new BaselinesApi();
Integer project = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    BaselineDataListWrapper result = apiInstance.getBaselines(project, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaselinesApi#getBaselines");
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

[**BaselineDataListWrapper**](BaselineDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelationshipsForVersion"></a>
# **getRelationshipsForVersion**
> VersionedRelationshipDataListWrapper getRelationshipsForVersion(itemId, baselineId, startAt, maxResults, include)

Get all versioned relationships for the item in the baseline



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaselinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BaselinesApi apiInstance = new BaselinesApi();
Integer itemId = 56; // Integer | 
Integer baselineId = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionedRelationshipDataListWrapper result = apiInstance.getRelationshipsForVersion(itemId, baselineId, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaselinesApi#getRelationshipsForVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **baselineId** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionedRelationshipDataListWrapper**](VersionedRelationshipDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionedItem"></a>
# **getVersionedItem**
> BaselineItemDataWrapper getVersionedItem(itemId, baselineId, include)

Get the baseline item with the specified ID in a baseline with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaselinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BaselinesApi apiInstance = new BaselinesApi();
Integer itemId = 56; // Integer | 
Integer baselineId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    BaselineItemDataWrapper result = apiInstance.getVersionedItem(itemId, baselineId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaselinesApi#getVersionedItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **Integer**|  |
 **baselineId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**BaselineItemDataWrapper**](BaselineItemDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionedItems"></a>
# **getVersionedItems**
> BaselineItemDataListWrapper getVersionedItems(baselineId, startAt, maxResults, include)

Get all baseline items in a baseline with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaselinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

BaselinesApi apiInstance = new BaselinesApi();
Integer baselineId = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    BaselineItemDataListWrapper result = apiInstance.getVersionedItems(baselineId, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaselinesApi#getVersionedItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **baselineId** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**BaselineItemDataListWrapper**](BaselineItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

