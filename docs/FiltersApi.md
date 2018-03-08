# FiltersApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFilter**](FiltersApi.md#getFilter) | **GET** /filters/{id} | Get the filter with the specified ID
[**getFilters**](FiltersApi.md#getFilters) | **GET** /filters | Get all filters in the project with the specified ID viewable by the current user
[**getResults**](FiltersApi.md#getResults) | **GET** /filters/{id}/results | Get all result items for the filter with the specified ID


<a name="getFilter"></a>
# **getFilter**
> FilterDataWrapper getFilter(id, include)

Get the filter with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FiltersApi apiInstance = new FiltersApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    FilterDataWrapper result = apiInstance.getFilter(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#getFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**FilterDataWrapper**](FilterDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilters"></a>
# **getFilters**
> FilterDataListWrapper getFilters(project, author, startAt, maxResults, include)

Get all filters in the project with the specified ID viewable by the current user



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FiltersApi apiInstance = new FiltersApi();
Integer project = 56; // Integer | 
Integer author = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    FilterDataListWrapper result = apiInstance.getFilters(project, author, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#getFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | **Integer**|  |
 **author** | **Integer**|  | [optional]
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**FilterDataListWrapper**](FilterDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResults"></a>
# **getResults**
> ItemDataListWrapper getResults(id, project, startAt, maxResults, include)

Get all result items for the filter with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FiltersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FiltersApi apiInstance = new FiltersApi();
Integer id = 56; // Integer | 
Integer project = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getResults(id, project, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FiltersApi#getResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **project** | **Integer**|  | [optional]
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

