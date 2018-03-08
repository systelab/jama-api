# TestplansApi

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAttachmentToItem**](TestplansApi.md#addAttachmentToItem) | **POST** /testplans/{id}/attachments | Add an existing attachment to the item with the specified ID
[**addItemLink**](TestplansApi.md#addItemLink) | **POST** /testplans/{id}/links | Create a new link for the item with the specified ID
[**addTagToItem**](TestplansApi.md#addTagToItem) | **POST** /testplans/{id}/tags | Add an existing tag to the item with the specified ID
[**addTestGroup**](TestplansApi.md#addTestGroup) | **POST** /testplans/{id}/testgroups | Create a new test group to the test plan with the specified ID
[**createTestCycle**](TestplansApi.md#createTestCycle) | **POST** /testplans/{id}/testcycles | Create a new test cycle
[**createTestPlan**](TestplansApi.md#createTestPlan) | **POST** /testplans | Create a new test plan
[**deleteItemLink**](TestplansApi.md#deleteItemLink) | **DELETE** /testplans/{id}/links/{linkId} | Delete the link with the specified ID
[**deleteTestCase**](TestplansApi.md#deleteTestCase) | **DELETE** /testplans/{id}/testgroups/{testGroupId}/testcases/{testCaseId} | Remove an existing test case from the test group
[**deleteTestGroup**](TestplansApi.md#deleteTestGroup) | **DELETE** /testplans/{id}/testgroups/{testGroupId} | Delete the test group with the specified ID
[**deleteTestPlan**](TestplansApi.md#deleteTestPlan) | **DELETE** /testplans/{id} | Delete the test plan with the specified ID
[**getActivities**](TestplansApi.md#getActivities) | **GET** /testplans/{id}/activities | Get all activities for the test plan with the specified ID
[**getAttachments**](TestplansApi.md#getAttachments) | **GET** /testplans/{id}/attachments | Get all attachments for the item with the specified ID
[**getDownstreamRelated**](TestplansApi.md#getDownstreamRelated) | **GET** /testplans/{id}/downstreamrelated | Get all downstream related items for the test plan with the specified ID
[**getDownstreamRelationships**](TestplansApi.md#getDownstreamRelationships) | **GET** /testplans/{id}/downstreamrelationships | Get all downstream relationships for the test plan with the specified ID
[**getItemComments**](TestplansApi.md#getItemComments) | **GET** /testplans/{id}/comments | Get all comments for the item with the specified ID
[**getItemLinks**](TestplansApi.md#getItemLinks) | **GET** /testplans/{id}/links | Get all links for the item with the specified ID
[**getLinkById**](TestplansApi.md#getLinkById) | **GET** /testplans/{id}/links/{linkId} | Get the link with the specified ID
[**getLock**](TestplansApi.md#getLock) | **GET** /testplans/{id}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
[**getTagOnItem**](TestplansApi.md#getTagOnItem) | **GET** /testplans/{id}/tags/{tagId} | Get the tag with the specified ID
[**getTagsOnItem**](TestplansApi.md#getTagsOnItem) | **GET** /testplans/{id}/tags | Get all tags for the item with the specified ID
[**getTestCaseById**](TestplansApi.md#getTestCaseById) | **GET** /testplans/{id}/testgroups/{testGroupId}/testcases/{testCaseId} | Get the test case with the specified ID
[**getTestCases**](TestplansApi.md#getTestCases) | **GET** /testplans/{id}/testgroups/{testGroupId}/testcases | Get all test cases associated with the test group with the specified ID
[**getTestCycles**](TestplansApi.md#getTestCycles) | **GET** /testplans/{id}/testcycles | Get all test cycles for the test plan with the specified ID
[**getTestGroupById**](TestplansApi.md#getTestGroupById) | **GET** /testplans/{id}/testgroups/{testGroupId} | Get the test group with the specified ID
[**getTestGroups**](TestplansApi.md#getTestGroups) | **GET** /testplans/{id}/testgroups | Get all test groups for the test plan with the specified ID
[**getTestPlan**](TestplansApi.md#getTestPlan) | **GET** /testplans/{id} | Get the test plan with the specified ID
[**getTestPlans**](TestplansApi.md#getTestPlans) | **GET** /testplans | Get all test plans in the project with the specified ID
[**getUpstreamRelated**](TestplansApi.md#getUpstreamRelated) | **GET** /testplans/{id}/upstreamrelated | Get all upstream related items for the test plan with the specified ID
[**getUpstreamRelationships**](TestplansApi.md#getUpstreamRelationships) | **GET** /testplans/{id}/upstreamrelationships | Get all upstream relationships for the test plan with the specified ID
[**getVersionOnItem4**](TestplansApi.md#getVersionOnItem4) | **GET** /testplans/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
[**getVersionedItem4**](TestplansApi.md#getVersionedItem4) | **GET** /testplans/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the test plan at the specified version
[**getVersionsOnItem4**](TestplansApi.md#getVersionsOnItem4) | **GET** /testplans/{id}/versions | Get all versions for the item with the specified ID
[**patchTestPlan**](TestplansApi.md#patchTestPlan) | **PATCH** /testplans/{id} | Update the test plan with the specified ID
[**postTestCase**](TestplansApi.md#postTestCase) | **POST** /testplans/{id}/testgroups/{testGroupId}/testcases | Add an existing test case to the test group with the specified ID
[**removeAttachmentFromItem**](TestplansApi.md#removeAttachmentFromItem) | **DELETE** /testplans/{id}/attachments/{attachmentId} | Remove an existing attachment from the item
[**removeTagFromItem**](TestplansApi.md#removeTagFromItem) | **DELETE** /testplans/{id}/tags/{tagId} | Remove an existing tag from the item with the specified ID
[**toggleArchivedStatus**](TestplansApi.md#toggleArchivedStatus) | **PUT** /testplans/{id}/archived | Update the archived status of the test plan
[**updateItemLink**](TestplansApi.md#updateItemLink) | **PUT** /testplans/{id}/links/{linkId} | Update the link with the specified ID
[**updateLock**](TestplansApi.md#updateLock) | **PUT** /testplans/{id}/lock | Update the locked state of the item with the specified ID
[**updateTestGroup**](TestplansApi.md#updateTestGroup) | **PUT** /testplans/{id}/testgroups/{testGroupId} | Update the test group with the specified ID
[**updateTestPlan**](TestplansApi.md#updateTestPlan) | **PUT** /testplans/{id} | Update the test plan with the specified ID


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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestItemAttachment body = new RequestItemAttachment(); // RequestItemAttachment | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addAttachmentToItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#addAttachmentToItem");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestLink body = new RequestLink(); // RequestLink | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addItemLink(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#addItemLink");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestItemTag body = new RequestItemTag(); // RequestItemTag | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addTagToItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#addTagToItem");
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

<a name="addTestGroup"></a>
# **addTestGroup**
> CreatedResponse addTestGroup(body, id)

Create a new test group to the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestTestGroup body = new RequestTestGroup(); // RequestTestGroup | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addTestGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#addTestGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTestGroup**](RequestTestGroup.md)|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTestCycle"></a>
# **createTestCycle**
> CreatedResponse createTestCycle(body, id)

Create a new test cycle



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestTestCycle body = new RequestTestCycle(); // RequestTestCycle | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.createTestCycle(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#createTestCycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTestCycle**](RequestTestCycle.md)|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTestPlan"></a>
# **createTestPlan**
> CreatedResponse createTestPlan(body)

Create a new test plan



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestTestPlan body = new RequestTestPlan(); // RequestTestPlan | 
try {
    CreatedResponse result = apiInstance.createTestPlan(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#createTestPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTestPlan**](RequestTestPlan.md)|  |

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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer linkId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteItemLink(linkId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#deleteItemLink");
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

<a name="deleteTestCase"></a>
# **deleteTestCase**
> AbstractRestResponse deleteTestCase(testCaseId, testGroupId, id)

Remove an existing test case from the test group



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer testCaseId = 56; // Integer | 
Integer testGroupId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteTestCase(testCaseId, testGroupId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#deleteTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testCaseId** | **Integer**|  |
 **testGroupId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTestGroup"></a>
# **deleteTestGroup**
> AbstractRestResponse deleteTestGroup(testGroupId, id)

Delete the test group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer testGroupId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteTestGroup(testGroupId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#deleteTestGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testGroupId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTestPlan"></a>
# **deleteTestPlan**
> AbstractRestResponse deleteTestPlan(id)

Delete the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteTestPlan(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#deleteTestPlan");
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

Get all activities for the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ActivityDataListWrapper result = apiInstance.getActivities(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getActivities");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AttachmentDataListWrapper result = apiInstance.getAttachments(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getAttachments");
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

Get all downstream related items for the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AbstractItemDataListWrapper result = apiInstance.getDownstreamRelated(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getDownstreamRelated");
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

Get all downstream relationships for the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataListWrapper result = apiInstance.getDownstreamRelationships(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getDownstreamRelationships");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
Boolean rootCommentsOnly = false; // Boolean | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    CommentDataListWrapper result = apiInstance.getItemComments(id, startAt, maxResults, rootCommentsOnly, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getItemComments");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LinkDataListWrapper result = apiInstance.getItemLinks(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getItemLinks");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer linkId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LinkDataWrapper result = apiInstance.getLinkById(linkId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getLinkById");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LockDataWrapper result = apiInstance.getLock(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getLock");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer tagId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TagDataWrapper result = apiInstance.getTagOnItem(tagId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTagOnItem");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TagDataListWrapper result = apiInstance.getTagsOnItem(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTagsOnItem");
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

<a name="getTestCaseById"></a>
# **getTestCaseById**
> ItemDataWrapper getTestCaseById(testCaseId, testGroupId, id, include)

Get the test case with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer testCaseId = 56; // Integer | 
Integer testGroupId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataWrapper result = apiInstance.getTestCaseById(testCaseId, testGroupId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTestCaseById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testCaseId** | **Integer**|  |
 **testGroupId** | **Integer**|  |
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**ItemDataWrapper**](ItemDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestCases"></a>
# **getTestCases**
> ItemDataListWrapper getTestCases(testGroupId, id, startAt, maxResults, include)

Get all test cases associated with the test group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer testGroupId = 56; // Integer | 
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getTestCases(testGroupId, id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTestCases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testGroupId** | **Integer**|  |
 **id** | **Integer**|  |
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

<a name="getTestCycles"></a>
# **getTestCycles**
> TestCycleDataListWrapper getTestCycles(id, startAt, maxResults, include)

Get all test cycles for the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestCycleDataListWrapper result = apiInstance.getTestCycles(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTestCycles");
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

[**TestCycleDataListWrapper**](TestCycleDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestGroupById"></a>
# **getTestGroupById**
> TestGroupDataWrapper getTestGroupById(testGroupId, id, include)

Get the test group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer testGroupId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestGroupDataWrapper result = apiInstance.getTestGroupById(testGroupId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTestGroupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testGroupId** | **Integer**|  |
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TestGroupDataWrapper**](TestGroupDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestGroups"></a>
# **getTestGroups**
> TestGroupDataListWrapper getTestGroups(id, startAt, maxResults, include)

Get all test groups for the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestGroupDataListWrapper result = apiInstance.getTestGroups(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTestGroups");
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

[**TestGroupDataListWrapper**](TestGroupDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestPlan"></a>
# **getTestPlan**
> TestPlanDataWrapper getTestPlan(id, include)

Get the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestPlanDataWrapper result = apiInstance.getTestPlan(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTestPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TestPlanDataWrapper**](TestPlanDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestPlans"></a>
# **getTestPlans**
> TestPlanDataListWrapper getTestPlans(project, startAt, maxResults, include)

Get all test plans in the project with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer project = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestPlanDataListWrapper result = apiInstance.getTestPlans(project, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getTestPlans");
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

[**TestPlanDataListWrapper**](TestPlanDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpstreamRelated"></a>
# **getUpstreamRelated**
> AbstractItemDataListWrapper getUpstreamRelated(id, startAt, maxResults, include)

Get all upstream related items for the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AbstractItemDataListWrapper result = apiInstance.getUpstreamRelated(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getUpstreamRelated");
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

Get all upstream relationships for the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataListWrapper result = apiInstance.getUpstreamRelationships(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getUpstreamRelationships");
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

<a name="getVersionOnItem4"></a>
# **getVersionOnItem4**
> VersionDataWrapper getVersionOnItem4(versionNum, id, include)

Get the numbered version for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataWrapper result = apiInstance.getVersionOnItem4(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getVersionOnItem4");
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

<a name="getVersionedItem4"></a>
# **getVersionedItem4**
> VersionedTestPlanDataWrapper getVersionedItem4(versionNum, id, include)

Get the  snapshot of the test plan at the specified version



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionedTestPlanDataWrapper result = apiInstance.getVersionedItem4(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getVersionedItem4");
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

[**VersionedTestPlanDataWrapper**](VersionedTestPlanDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionsOnItem4"></a>
# **getVersionsOnItem4**
> VersionDataListWrapper getVersionsOnItem4(id, startAt, maxResults, include)

Get all versions for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataListWrapper result = apiInstance.getVersionsOnItem4(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#getVersionsOnItem4");
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

<a name="patchTestPlan"></a>
# **patchTestPlan**
> AbstractRestResponse patchTestPlan(body, id)

Update the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
List<RequestPatchOperation> body = Arrays.asList(new RequestPatchOperation()); // List<RequestPatchOperation> | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.patchTestPlan(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#patchTestPlan");
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

<a name="postTestCase"></a>
# **postTestCase**
> CreatedResponse postTestCase(body, testGroupId, id)

Add an existing test case to the test group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestTestGroupTestCase body = new RequestTestGroupTestCase(); // RequestTestGroupTestCase | 
Integer testGroupId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.postTestCase(body, testGroupId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#postTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTestGroupTestCase**](RequestTestGroupTestCase.md)|  |
 **testGroupId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer attachmentId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.removeAttachmentFromItem(attachmentId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#removeAttachmentFromItem");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer tagId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.removeTagFromItem(tagId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#removeTagFromItem");
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

<a name="toggleArchivedStatus"></a>
# **toggleArchivedStatus**
> AbstractRestResponse toggleArchivedStatus(body, id)

Update the archived status of the test plan



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestArchivedStatus body = new RequestArchivedStatus(); // RequestArchivedStatus | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.toggleArchivedStatus(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#toggleArchivedStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestArchivedStatus**](RequestArchivedStatus.md)|  |
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer linkId = 56; // Integer | 
RequestLink body = new RequestLink(); // RequestLink | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateItemLink(linkId, body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#updateItemLink");
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
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestLock body = new RequestLock(); // RequestLock | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateLock(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#updateLock");
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

<a name="updateTestGroup"></a>
# **updateTestGroup**
> AbstractRestResponse updateTestGroup(testGroupId, body, id)

Update the test group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
Integer testGroupId = 56; // Integer | 
RequestTestGroup body = new RequestTestGroup(); // RequestTestGroup | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateTestGroup(testGroupId, body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#updateTestGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testGroupId** | **Integer**|  |
 **body** | [**RequestTestGroup**](RequestTestGroup.md)|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTestPlan"></a>
# **updateTestPlan**
> AbstractRestResponse updateTestPlan(body, id)

Update the test plan with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestplansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestplansApi apiInstance = new TestplansApi();
RequestTestPlan body = new RequestTestPlan(); // RequestTestPlan | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateTestPlan(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestplansApi#updateTestPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTestPlan**](RequestTestPlan.md)|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

