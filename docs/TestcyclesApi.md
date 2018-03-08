# TestcyclesApi


Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTestCycle**](TestcyclesApi.md#deleteTestCycle) | **DELETE** /testcycles/{testCycleId} | Delete the test cycle with the specified ID, including the test runs in the test cycle
[**getTestCycle**](TestcyclesApi.md#getTestCycle) | **GET** /testcycles/{testCycleId} | Get the test cycle with the specified ID
[**getTestCycleTestGroup**](TestcyclesApi.md#getTestCycleTestGroup) | **GET** /testcycles/{testCycleId}/testgroup/{testGroupId} | Get the test cycle test group for the test cycle with the specified ID
[**getTestRuns**](TestcyclesApi.md#getTestRuns) | **GET** /testcycles/{testCycleId}/testruns | Get all test runs for the test cycle with the specified ID
[**getVersionOnItem3**](TestcyclesApi.md#getVersionOnItem3) | **GET** /testcycles/{testCycleId}/versions/{versionNum} | Get the numbered version for the item with the specified ID
[**getVersionedItem3**](TestcyclesApi.md#getVersionedItem3) | **GET** /testcycles/{testCycleId}/versions/{versionNum}/versioneditem | Get the  snapshot of the test cycle at the specified version
[**getVersionsOnItem3**](TestcyclesApi.md#getVersionsOnItem3) | **GET** /testcycles/{testCycleId}/versions | Get all versions for the item with the specified ID
[**patchTestCycle**](TestcyclesApi.md#patchTestCycle) | **PATCH** /testcycles/{testCycleId} | Update the test cycle with the specified ID, including regenerating the test runs in the test cycle
[**updateTestCycle**](TestcyclesApi.md#updateTestCycle) | **PUT** /testcycles/{testCycleId} | Update the test cycle with the specified ID, including regenerating the test runs in the test cycle


<a name="deleteTestCycle"></a>
# **deleteTestCycle**
> AbstractRestResponse deleteTestCycle(testCycleId)

Delete the test cycle with the specified ID, including the test runs in the test cycle



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
Integer testCycleId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteTestCycle(testCycleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#deleteTestCycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testCycleId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestCycle"></a>
# **getTestCycle**
> TestCycleDataWrapper getTestCycle(testCycleId, include)

Get the test cycle with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
Integer testCycleId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestCycleDataWrapper result = apiInstance.getTestCycle(testCycleId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#getTestCycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testCycleId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TestCycleDataWrapper**](TestCycleDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestCycleTestGroup"></a>
# **getTestCycleTestGroup**
> TestCycleTestGroupDataWrapper getTestCycleTestGroup(testGroupId, testCycleId, include)

Get the test cycle test group for the test cycle with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
Integer testGroupId = 56; // Integer | Get the test group with the specified ID
Integer testCycleId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestCycleTestGroupDataWrapper result = apiInstance.getTestCycleTestGroup(testGroupId, testCycleId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#getTestCycleTestGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testGroupId** | **Integer**| Get the test group with the specified ID |
 **testCycleId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**TestCycleTestGroupDataWrapper**](TestCycleTestGroupDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTestRuns"></a>
# **getTestRuns**
> TestRunDataListWrapper getTestRuns(testCycleId, startAt, maxResults, include)

Get all test runs for the test cycle with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
Integer testCycleId = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TestRunDataListWrapper result = apiInstance.getTestRuns(testCycleId, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#getTestRuns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testCycleId** | **Integer**|  |
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

<a name="getVersionOnItem3"></a>
# **getVersionOnItem3**
> VersionDataWrapper getVersionOnItem3(versionNum, testCycleId, include)

Get the numbered version for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
Integer versionNum = 56; // Integer | 
Integer testCycleId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataWrapper result = apiInstance.getVersionOnItem3(versionNum, testCycleId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#getVersionOnItem3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **versionNum** | **Integer**|  |
 **testCycleId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionDataWrapper**](VersionDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionedItem3"></a>
# **getVersionedItem3**
> VersionedTestCycleDataWrapper getVersionedItem3(versionNum, testCycleId, include)

Get the  snapshot of the test cycle at the specified version



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
Integer versionNum = 56; // Integer | 
Integer testCycleId = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionedTestCycleDataWrapper result = apiInstance.getVersionedItem3(versionNum, testCycleId, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#getVersionedItem3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **versionNum** | **Integer**|  |
 **testCycleId** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**VersionedTestCycleDataWrapper**](VersionedTestCycleDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionsOnItem3"></a>
# **getVersionsOnItem3**
> VersionDataListWrapper getVersionsOnItem3(testCycleId, startAt, maxResults, include)

Get all versions for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
Integer testCycleId = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataListWrapper result = apiInstance.getVersionsOnItem3(testCycleId, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#getVersionsOnItem3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **testCycleId** | **Integer**|  |
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

<a name="patchTestCycle"></a>
# **patchTestCycle**
> AbstractRestResponse patchTestCycle(body, testCycleId)

Update the test cycle with the specified ID, including regenerating the test runs in the test cycle



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
List<RequestPatchOperation> body = Arrays.asList(new RequestPatchOperation()); // List<RequestPatchOperation> | 
Integer testCycleId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.patchTestCycle(body, testCycleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#patchTestCycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;RequestPatchOperation&gt;**](RequestPatchOperation.md)|  |
 **testCycleId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTestCycle"></a>
# **updateTestCycle**
> AbstractRestResponse updateTestCycle(body, testCycleId)

Update the test cycle with the specified ID, including regenerating the test runs in the test cycle



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TestcyclesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

TestcyclesApi apiInstance = new TestcyclesApi();
RequestTestCycle body = new RequestTestCycle(); // RequestTestCycle | 
Integer testCycleId = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateTestCycle(body, testCycleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcyclesApi#updateTestCycle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTestCycle**](RequestTestCycle.md)|  |
 **testCycleId** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

