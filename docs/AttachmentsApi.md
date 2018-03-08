# AttachmentsApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFile**](AttachmentsApi.md#downloadFile) | **GET** /attachments/{attachmentId}/file | Download attachment file from the attachment with the specified ID
[**getAttachmentItem**](AttachmentsApi.md#getAttachmentItem) | **GET** /attachments/{attachmentId} | Get the attachment with the specified ID
[**getItemComments**](AttachmentsApi.md#getItemComments) | **GET** /attachments/{attachmentId}/comments | Get all comments for the item with the specified ID
[**getLock**](AttachmentsApi.md#getLock) | **GET** /attachments/{attachmentId}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
[**getVersionOnItem1**](AttachmentsApi.md#getVersionOnItem1) | **GET** /attachments/{attachmentId}/versions/{versionNum} | Get the numbered version for the item with the specified ID
[**getVersionedItem1**](AttachmentsApi.md#getVersionedItem1) | **GET** /attachments/{attachmentId}/versions/{versionNum}/versioneditem | Get the  snapshot of the attachment at the specified version
[**getVersionsOnItem1**](AttachmentsApi.md#getVersionsOnItem1) | **GET** /attachments/{attachmentId}/versions | Get all versions for the item with the specified ID
[**updateLock**](AttachmentsApi.md#updateLock) | **PUT** /attachments/{attachmentId}/lock | Update the locked state of the item with the specified ID
[**uploadFile**](AttachmentsApi.md#uploadFile) | **PUT** /attachments/{attachmentId}/file | Upload attachment file to the attachment with the specified ID


<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(attachmentId)

Download attachment file from the attachment with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer attachmentId = 56; // Integer | 
try {
    apiInstance.downloadFile(attachmentId);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getAttachmentItem"></a>
# **getAttachmentItem**
> AttachmentDataWrapper getAttachmentItem(attachmentId, include)

Get the attachment with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer attachmentId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AttachmentDataWrapper result = apiInstance.getAttachmentItem(attachmentId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getAttachmentItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**AttachmentDataWrapper**](AttachmentDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItemComments"></a>
# **getItemComments**
> CommentDataListWrapper getItemComments(attachmentId, startAt, maxResults, rootCommentsOnly, include)

Get all comments for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer attachmentId = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
Boolean rootCommentsOnly = false; // Boolean | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    CommentDataListWrapper result = apiInstance.getItemComments(attachmentId, startAt, maxResults, rootCommentsOnly, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getItemComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **rootCommentsOnly** | **Boolean**|  | [optional] [default to false]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**CommentDataListWrapper**](CommentDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLock"></a>
# **getLock**
> LockDataWrapper getLock(attachmentId, include)

Get the locked state, last locked date, and last locked by user for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer attachmentId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LockDataWrapper result = apiInstance.getLock(attachmentId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**LockDataWrapper**](LockDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionOnItem1"></a>
# **getVersionOnItem1**
> VersionDataWrapper getVersionOnItem1(versionNum, attachmentId, include)

Get the numbered version for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer versionNum = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataWrapper result = apiInstance.getVersionOnItem1(versionNum, attachmentId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getVersionOnItem1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **versionNum** | **Integer**|  |
 **attachmentId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionDataWrapper**](VersionDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionedItem1"></a>
# **getVersionedItem1**
> VersionedAttachmentDataWrapper getVersionedItem1(versionNum, attachmentId, include)

Get the  snapshot of the attachment at the specified version



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer versionNum = 56; // Integer | 
Integer attachmentId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionedAttachmentDataWrapper result = apiInstance.getVersionedItem1(versionNum, attachmentId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getVersionedItem1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **versionNum** | **Integer**|  |
 **attachmentId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionedAttachmentDataWrapper**](VersionedAttachmentDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionsOnItem1"></a>
# **getVersionsOnItem1**
> VersionDataListWrapper getVersionsOnItem1(attachmentId, startAt, maxResults, include)

Get all versions for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer attachmentId = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataListWrapper result = apiInstance.getVersionsOnItem1(attachmentId, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#getVersionsOnItem1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionDataListWrapper**](VersionDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLock"></a>
# **updateLock**
> AbstractRestResponse updateLock(body, attachmentId)

Update the locked state of the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
RequestLock body = new RequestLock(); // RequestLock | 
Integer attachmentId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateLock(body, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#updateLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestLock**](RequestLock.md)|  |
 **attachmentId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> AbstractRestResponse uploadFile(attachmentId, body)

Upload attachment file to the attachment with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AttachmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AttachmentsApi apiInstance = new AttachmentsApi();
Integer attachmentId = 56; // Integer | 
FormDataMultiPart body = new FormDataMultiPart(); // FormDataMultiPart | 
try {
    AbstractRestResponse result = apiInstance.uploadFile(attachmentId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AttachmentsApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **body** | [**FormDataMultiPart**](FormDataMultiPart.md)|  | [optional]

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

