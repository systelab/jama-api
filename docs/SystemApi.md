# SystemApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDomains**](SystemApi.md#getDomains) | **GET** /system/settings/corsdomains | Get the current CORS domain whitelist
[**setDomains**](SystemApi.md#setDomains) | **POST** /system/settings/corsdomains | Update CORS domain whitelist


<a name="getDomains"></a>
# **getDomains**
> CrossOriginDomainWhiteList getDomains()

Get the current CORS domain whitelist



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemApi apiInstance = new SystemApi();
try {
    CrossOriginDomainWhiteList result = apiInstance.getDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#getDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CrossOriginDomainWhiteList**](CrossOriginDomainWhiteList.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setDomains"></a>
# **setDomains**
> AbstractRestResponse setDomains(body)

Update CORS domain whitelist



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

SystemApi apiInstance = new SystemApi();
CrossOriginDomainWhiteList body = new CrossOriginDomainWhiteList(); // CrossOriginDomainWhiteList | 
try {
    AbstractRestResponse result = apiInstance.setDomains(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#setDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrossOriginDomainWhiteList**](CrossOriginDomainWhiteList.md)|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

