# PicklistoptionsApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPicklistOption**](PicklistoptionsApi.md#getPicklistOption) | **GET** /picklistoptions/{picklistOptionId} | Get the pick list option with the specified ID
[**updatePicklistOption**](PicklistoptionsApi.md#updatePicklistOption) | **PUT** /picklistoptions/{picklistOptionId} | Update the pick list option with the specified ID


<a name="getPicklistOption"></a>
# **getPicklistOption**
> PickListOptionDataWrapper getPicklistOption(picklistOptionId, include)

Get the pick list option with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PicklistoptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PicklistoptionsApi apiInstance = new PicklistoptionsApi();
Integer picklistOptionId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    PickListOptionDataWrapper result = apiInstance.getPicklistOption(picklistOptionId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PicklistoptionsApi#getPicklistOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **picklistOptionId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**PickListOptionDataWrapper**](PickListOptionDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePicklistOption"></a>
# **updatePicklistOption**
> AbstractRestResponse updatePicklistOption(body, picklistOptionId)

Update the pick list option with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PicklistoptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

PicklistoptionsApi apiInstance = new PicklistoptionsApi();
RequestPickListOption body = new RequestPickListOption(); // RequestPickListOption | 
Integer picklistOptionId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updatePicklistOption(body, picklistOptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PicklistoptionsApi#updatePicklistOption");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestPickListOption**](RequestPickListOption.md)|  |
 **picklistOptionId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

