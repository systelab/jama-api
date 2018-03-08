# TestrunsApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAttachmentToItem**](TestrunsApi.md#addAttachmentToItem) | **POST** /testruns/{id}/attachments | Add an existing attachment to the item with the specified ID
[**addItemLink**](TestrunsApi.md#addItemLink) | **POST** /testruns/{id}/links | Create a new link for the item with the specified ID
[**addTagToItem**](TestrunsApi.md#addTagToItem) | **POST** /testruns/{id}/tags | Add an existing tag to the item with the specified ID
[**deleteItemLink**](TestrunsApi.md#deleteItemLink) | **DELETE** /testruns/{id}/links/{linkId} | Delete the link with the specified ID
[**deleteTestRun**](TestrunsApi.md#deleteTestRun) | **DELETE** /testruns/{id} | Delete the test run with the specified ID
[**getActivities**](TestrunsApi.md#getActivities) | **GET** /testruns/{id}/activities | Get all activities for the test run with the specified ID
[**getAttachments**](TestrunsApi.md#getAttachments) | **GET** /testruns/{id}/attachments | Get all attachments for the item with the specified ID
[**getDownstreamRelated**](TestrunsApi.md#getDownstreamRelated) | **GET** /testruns/{id}/downstreamrelated | Get all downstream related items for the test run with the specified ID
[**getDownstreamRelationships**](TestrunsApi.md#getDownstreamRelationships) | **GET** /testruns/{id}/downstreamrelationships | Get all downstream relationships for the test run with the specified ID
[**getItemComments**](TestrunsApi.md#getItemComments) | **GET** /testruns/{id}/comments | Get all comments for the item with the specified ID
[**getItemLinks**](TestrunsApi.md#getItemLinks) | **GET** /testruns/{id}/links | Get all links for the item with the specified ID
[**getLinkById**](TestrunsApi.md#getLinkById) | **GET** /testruns/{id}/links/{linkId} | Get the link with the specified ID
[**getLock**](TestrunsApi.md#getLock) | **GET** /testruns/{id}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
[**getTagOnItem**](TestrunsApi.md#getTagOnItem) | **GET** /testruns/{id}/tags/{tagId} | Get the tag with the specified ID
[**getTagsOnItem**](TestrunsApi.md#getTagsOnItem) | **GET** /testruns/{id}/tags | Get all tags for the item with the specified ID
[**getTestRun**](TestrunsApi.md#getTestRun) | **GET** /testruns/{id} | Get the test run with the specified ID
[**getTestRuns**](TestrunsApi.md#getTestRuns) | **GET** /testruns | Search for test runs associated with test cases, test plans, an test cycles
[**getUpstreamRelated**](TestrunsApi.md#getUpstreamRelated) | **GET** /testruns/{id}/upstreamrelated | Get all upstream related items for the test run with the specified ID
[**getUpstreamRelationships**](TestrunsApi.md#getUpstreamRelationships) | **GET** /testruns/{id}/upstreamrelationships | Get all upstream relationships for the test run with the specified ID
[**getVersionOnItem5**](TestrunsApi.md#getVersionOnItem5) | **GET** /testruns/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
[**getVersionedItem5**](TestrunsApi.md#getVersionedItem5) | **GET** /testruns/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the test run at the specified version
[**getVersionsOnItem5**](TestrunsApi.md#getVersionsOnItem5) | **GET** /testruns/{id}/versions | Get all versions for the item with the specified ID
[**makeTestRunCurrent**](TestrunsApi.md#makeTestRunCurrent) | **POST** /testruns/{id}/updatedtestcase | Delete the current test run and then create a new test run based on the latest test case version.
[**patchTestRun**](TestrunsApi.md#patchTestRun) | **PATCH** /testruns/{id} | Update the execution results for the test run with the specified ID
[**removeAttachmentFromItem**](TestrunsApi.md#removeAttachmentFromItem) | **DELETE** /testruns/{id}/attachments/{attachmentId} | Remove an existing attachment from the item
[**removeTagFromItem**](TestrunsApi.md#removeTagFromItem) | **DELETE** /testruns/{id}/tags/{tagId} | Remove an existing tag from the item with the specified ID
[**updateItemLink**](TestrunsApi.md#updateItemLink) | **PUT** /testruns/{id}/links/{linkId} | Update the link with the specified ID
[**updateLock**](TestrunsApi.md#updateLock) | **PUT** /testruns/{id}/lock | Update the locked state of the item with the specified ID
[**updateTestRun**](TestrunsApi.md#updateTestRun) | **PUT** /testruns/{id} | Update the execution results for the test run with the specified ID


<a name="addAttachmentToItem"></a>
# **addAttachmentToItem**
> CreatedResponse addAttachmentToItem(body, id)

Add an existing attachment to the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
RequestItemAttachment body = new RequestItemAttachment(); // RequestItemAttachment | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addAttachmentToItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#addAttachmentToItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestItemAttachment**](RequestItemAttachment.md)|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addItemLink"></a>
# **addItemLink**
> CreatedResponse addItemLink(body, id)

Create a new link for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
RequestLink body = new RequestLink(); // RequestLink | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addItemLink(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#addItemLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestLink**](RequestLink.md)|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addTagToItem"></a>
# **addTagToItem**
> CreatedResponse addTagToItem(body, id)

Add an existing tag to the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
RequestItemTag body = new RequestItemTag(); // RequestItemTag | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addTagToItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#addTagToItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestItemTag**](RequestItemTag.md)|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemLink"></a>
# **deleteItemLink**
> AbstractRestResponse deleteItemLink(linkId, id)

Delete the link with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer linkId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteItemLink(linkId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#deleteItemLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTestRun"></a>
# **deleteTestRun**
> AbstractRestResponse deleteTestRun(id)

Delete the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteTestRun(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#deleteTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActivities"></a>
# **getActivities**
> ActivityDataListWrapper getActivities(id, startAt, maxResults, include)

Get all activities for the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ActivityDataListWrapper result = apiInstance.getActivities(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getActivities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
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

<a name="getAttachments"></a>
# **getAttachments**
> AttachmentDataListWrapper getAttachments(id, startAt, maxResults, include)

Get all attachments for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AttachmentDataListWrapper result = apiInstance.getAttachments(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getAttachments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**AttachmentDataListWrapper**](AttachmentDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDownstreamRelated"></a>
# **getDownstreamRelated**
> AbstractItemDataListWrapper getDownstreamRelated(id, startAt, maxResults, include)

Get all downstream related items for the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AbstractItemDataListWrapper result = apiInstance.getDownstreamRelated(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getDownstreamRelated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**AbstractItemDataListWrapper**](AbstractItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDownstreamRelationships"></a>
# **getDownstreamRelationships**
> RelationshipDataListWrapper getDownstreamRelationships(id, startAt, maxResults, include)

Get all downstream relationships for the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataListWrapper result = apiInstance.getDownstreamRelationships(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getDownstreamRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
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

<a name="getItemComments"></a>
# **getItemComments**
> CommentDataListWrapper getItemComments(id, startAt, maxResults, rootCommentsOnly, include)

Get all comments for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
Boolean rootCommentsOnly = false; // Boolean | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    CommentDataListWrapper result = apiInstance.getItemComments(id, startAt, maxResults, rootCommentsOnly, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getItemComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
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

<a name="getItemLinks"></a>
# **getItemLinks**
> LinkDataListWrapper getItemLinks(id, startAt, maxResults, include)

Get all links for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LinkDataListWrapper result = apiInstance.getItemLinks(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getItemLinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**LinkDataListWrapper**](LinkDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLinkById"></a>
# **getLinkById**
> LinkDataWrapper getLinkById(linkId, id, include)

Get the link with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer linkId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LinkDataWrapper result = apiInstance.getLinkById(linkId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getLinkById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkId** | **Integer**|  |
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**LinkDataWrapper**](LinkDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLock"></a>
# **getLock**
> LockDataWrapper getLock(id, include)

Get the locked state, last locked date, and last locked by user for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LockDataWrapper result = apiInstance.getLock(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**LockDataWrapper**](LockDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagOnItem"></a>
# **getTagOnItem**
> TagDataWrapper getTagOnItem(tagId, id, include)

Get the tag with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer tagId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TagDataWrapper result = apiInstance.getTagOnItem(tagId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getTagOnItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **Integer**|  |
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TagDataWrapper**](TagDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagsOnItem"></a>
# **getTagsOnItem**
> TagDataListWrapper getTagsOnItem(id, startAt, maxResults, include)

Get all tags for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TagDataListWrapper result = apiInstance.getTagsOnItem(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getTagsOnItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TagDataListWrapper**](TagDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestRun"></a>
# **getTestRun**
> TestRunDataWrapper getTestRun(id, include)

Get the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestRunDataWrapper result = apiInstance.getTestRun(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TestRunDataWrapper**](TestRunDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestRuns"></a>
# **getTestRuns**
> TestRunDataListWrapper getTestRuns(testCycle, testCase, testPlan, sortBy, startAt, maxResults, include)

Search for test runs associated with test cases, test plans, an test cycles

Must include at least one query parameter from testCycle, testCase, or testPlan

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
List<Integer> testCycle = Arrays.asList(56); // List<Integer> | Filter by test runs in test cycle id
List<Integer> testCase = Arrays.asList(56); // List<Integer> | Filter by test runs from test case id
List<Integer> testPlan = Arrays.asList(56); // List<Integer> | Filter by test runs in test plan id
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort orders can be added with the name of the field by which to sort, followed by .asc or .desc (e.g. 'name.asc' or 'testCycle.desc'). If not set, this defaults to documentKey.asc.
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestRunDataListWrapper result = apiInstance.getTestRuns(testCycle, testCase, testPlan, sortBy, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getTestRuns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testCycle** | [**List&lt;Integer&gt;**](Integer.md)| Filter by test runs in test cycle id | [optional]
 **testCase** | [**List&lt;Integer&gt;**](Integer.md)| Filter by test runs from test case id | [optional]
 **testPlan** | [**List&lt;Integer&gt;**](Integer.md)| Filter by test runs in test plan id | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort orders can be added with the name of the field by which to sort, followed by .asc or .desc (e.g. &#39;name.asc&#39; or &#39;testCycle.desc&#39;). If not set, this defaults to documentKey.asc. | [optional]
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TestRunDataListWrapper**](TestRunDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpstreamRelated"></a>
# **getUpstreamRelated**
> AbstractItemDataListWrapper getUpstreamRelated(id, startAt, maxResults, include)

Get all upstream related items for the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AbstractItemDataListWrapper result = apiInstance.getUpstreamRelated(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getUpstreamRelated");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**AbstractItemDataListWrapper**](AbstractItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpstreamRelationships"></a>
# **getUpstreamRelationships**
> RelationshipDataListWrapper getUpstreamRelationships(id, startAt, maxResults, include)

Get all upstream relationships for the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataListWrapper result = apiInstance.getUpstreamRelationships(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getUpstreamRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
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

<a name="getVersionOnItem5"></a>
# **getVersionOnItem5**
> VersionDataWrapper getVersionOnItem5(versionNum, id, include)

Get the numbered version for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataWrapper result = apiInstance.getVersionOnItem5(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getVersionOnItem5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **versionNum** | **Integer**|  |
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionDataWrapper**](VersionDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionedItem5"></a>
# **getVersionedItem5**
> VersionedTestRunDataWrapper getVersionedItem5(versionNum, id, include)

Get the  snapshot of the test run at the specified version



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionedTestRunDataWrapper result = apiInstance.getVersionedItem5(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getVersionedItem5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **versionNum** | **Integer**|  |
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionedTestRunDataWrapper**](VersionedTestRunDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionsOnItem5"></a>
# **getVersionsOnItem5**
> VersionDataListWrapper getVersionsOnItem5(id, startAt, maxResults, include)

Get all versions for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataListWrapper result = apiInstance.getVersionsOnItem5(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#getVersionsOnItem5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
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

<a name="makeTestRunCurrent"></a>
# **makeTestRunCurrent**
> CreatedResponse makeTestRunCurrent(id)

Delete the current test run and then create a new test run based on the latest test case version.



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.makeTestRunCurrent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#makeTestRunCurrent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchTestRun"></a>
# **patchTestRun**
> AbstractRestResponse patchTestRun(body, id)

Update the execution results for the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
List<RequestPatchOperation> body = Arrays.asList(new RequestPatchOperation()); // List<RequestPatchOperation> | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.patchTestRun(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#patchTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;RequestPatchOperation&gt;**](RequestPatchOperation.md)|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeAttachmentFromItem"></a>
# **removeAttachmentFromItem**
> AbstractRestResponse removeAttachmentFromItem(attachmentId, id)

Remove an existing attachment from the item



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer attachmentId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.removeAttachmentFromItem(attachmentId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#removeAttachmentFromItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attachmentId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTagFromItem"></a>
# **removeTagFromItem**
> AbstractRestResponse removeTagFromItem(tagId, id)

Remove an existing tag from the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer tagId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.removeTagFromItem(tagId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#removeTagFromItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemLink"></a>
# **updateItemLink**
> AbstractRestResponse updateItemLink(linkId, body, id)

Update the link with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
Integer linkId = 56; // Integer | 
RequestLink body = new RequestLink(); // RequestLink | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateItemLink(linkId, body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#updateItemLink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **linkId** | **Integer**|  |
 **body** | [**RequestLink**](RequestLink.md)|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLock"></a>
# **updateLock**
> AbstractRestResponse updateLock(body, id)

Update the locked state of the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
RequestLock body = new RequestLock(); // RequestLock | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateLock(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#updateLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestLock**](RequestLock.md)|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTestRun"></a>
# **updateTestRun**
> AbstractRestResponse updateTestRun(body, id)

Update the execution results for the test run with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestrunsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestrunsApi apiInstance = new TestrunsApi();
RequestTestRun body = new RequestTestRun(); // RequestTestRun | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateTestRun(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestrunsApi#updateTestRun");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTestRun**](RequestTestRun.md)|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

