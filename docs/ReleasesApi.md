# ReleasesApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRelease**](ReleasesApi.md#addRelease) | **POST** /releases | Create a new release
[**getRelease**](ReleasesApi.md#getRelease) | **GET** /releases/{releaseId} | Get the release with the specified ID
[**getReleases**](ReleasesApi.md#getReleases) | **GET** /releases | Get all releases in the project with the specified ID
[**putRelease**](ReleasesApi.md#putRelease) | **PUT** /releases/{releaseId} | Update the release with the specified ID


<a name="addRelease"></a>
# **addRelease**
> CreatedResponse addRelease(body)

Create a new release



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReleasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReleasesApi apiInstance = new ReleasesApi();
RequestRelease body = new RequestRelease(); // RequestRelease | 
try {
    CreatedResponse result = apiInstance.addRelease(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasesApi#addRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestRelease**](RequestRelease.md)|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRelease"></a>
# **getRelease**
> ReleaseDataWrapper getRelease(releaseId, include)

Get the release with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReleasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReleasesApi apiInstance = new ReleasesApi();
Integer releaseId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ReleaseDataWrapper result = apiInstance.getRelease(releaseId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasesApi#getRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **releaseId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**ReleaseDataWrapper**](ReleaseDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReleases"></a>
# **getReleases**
> ReleaseDataListWrapper getReleases(project, startAt, maxResults, include)

Get all releases in the project with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReleasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReleasesApi apiInstance = new ReleasesApi();
Integer project = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ReleaseDataListWrapper result = apiInstance.getReleases(project, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasesApi#getReleases");
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

[**ReleaseDataListWrapper**](ReleaseDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putRelease"></a>
# **putRelease**
> AbstractRestResponse putRelease(body, releaseId)

Update the release with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReleasesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ReleasesApi apiInstance = new ReleasesApi();
RequestRelease body = new RequestRelease(); // RequestRelease | 
Integer releaseId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.putRelease(body, releaseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReleasesApi#putRelease");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestRelease**](RequestRelease.md)|  |
 **releaseId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

