# FilesApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFile**](FilesApi.md#downloadFile) | **GET** /files | Download attachment file from the attachment with the specified Jama URL


<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(url)

Download attachment file from the attachment with the specified Jama URL



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

FilesApi apiInstance = new FilesApi();
String url = "url_example"; // String | 
try {
    apiInstance.downloadFile(url);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

