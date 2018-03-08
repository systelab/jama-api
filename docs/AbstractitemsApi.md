# AbstractitemsApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAbstractItems**](AbstractitemsApi.md#getAbstractItems) | **GET** /abstractitems | Search for items, test plans, test cycles, test runs, or attachments
[**getItem**](AbstractitemsApi.md#getItem) | **GET** /abstractitems/{id} | Get any item, test plan, test cycle, test run, or attachment with the specified ID
[**getVersionOnItem**](AbstractitemsApi.md#getVersionOnItem) | **GET** /abstractitems/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
[**getVersionedItem**](AbstractitemsApi.md#getVersionedItem) | **GET** /abstractitems/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the item at the specified version
[**getVersionedRelationships**](AbstractitemsApi.md#getVersionedRelationships) | **GET** /abstractitems/{id}/versionedrelationships | Get all versioned relationships that were associated to the item at the specified time
[**getVersionsOnItem**](AbstractitemsApi.md#getVersionsOnItem) | **GET** /abstractitems/{id}/versions | Get all versions for the item with the specified ID


<a name="getAbstractItems"></a>
# **getAbstractItems**
> ItemDataListWrapper getAbstractItems(project, itemType, documentKey, release, createdDate, modifiedDate, lastActivityDate, contains, sortBy, startAt, maxResults, include)

Search for items, test plans, test cycles, test runs, or attachments



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AbstractitemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AbstractitemsApi apiInstance = new AbstractitemsApi();
List<Integer> project = Arrays.asList(56); // List<Integer> | 
List<Integer> itemType = Arrays.asList(56); // List<Integer> | 
List<String> documentKey = Arrays.asList("documentKey_example"); // List<String> | 
List<Integer> release = Arrays.asList(56); // List<Integer> | 
List<String> createdDate = Arrays.asList("createdDate_example"); // List<String> | Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
List<String> modifiedDate = Arrays.asList("modifiedDate_example"); // List<String> | Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
List<String> lastActivityDate = Arrays.asList("lastActivityDate_example"); // List<String> | Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
List<String> contains = Arrays.asList("contains_example"); // List<String> | Filter on the text contents of the item. Strings taken literally. Multiple 'contains' values will be bitwise ORed.
List<String> sortBy = Arrays.asList("sortBy_example"); // List<String> | Sort orders can be added with the name of the field by which to sort, followed by .asc or .desc (e.g. 'name.asc' or 'modifiedDate.desc'). If not set, this defaults to sorting by sequence.asc and then documentKey.asc
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getAbstractItems(project, itemType, documentKey, release, createdDate, modifiedDate, lastActivityDate, contains, sortBy, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbstractitemsApi#getAbstractItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **itemType** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **documentKey** | [**List&lt;String&gt;**](String.md)|  | [optional]
 **release** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional]
 **createdDate** | [**List&lt;String&gt;**](String.md)| Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; | [optional]
 **modifiedDate** | [**List&lt;String&gt;**](String.md)| Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; | [optional]
 **lastActivityDate** | [**List&lt;String&gt;**](String.md)| Filter datetime fields after a single date or within a range of values. Provide one or two values in ISO8601 format (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; | [optional]
 **contains** | [**List&lt;String&gt;**](String.md)| Filter on the text contents of the item. Strings taken literally. Multiple &#39;contains&#39; values will be bitwise ORed. | [optional]
 **sortBy** | [**List&lt;String&gt;**](String.md)| Sort orders can be added with the name of the field by which to sort, followed by .asc or .desc (e.g. &#39;name.asc&#39; or &#39;modifiedDate.desc&#39;). If not set, this defaults to sorting by sequence.asc and then documentKey.asc | [optional]
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

<a name="getItem"></a>
# **getItem**
> AbstractItemDataWrapper getItem(id, include)

Get any item, test plan, test cycle, test run, or attachment with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AbstractitemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AbstractitemsApi apiInstance = new AbstractitemsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AbstractItemDataWrapper result = apiInstance.getItem(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbstractitemsApi#getItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**AbstractItemDataWrapper**](AbstractItemDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionOnItem"></a>
# **getVersionOnItem**
> VersionDataWrapper getVersionOnItem(versionNum, id, include)

Get the numbered version for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AbstractitemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AbstractitemsApi apiInstance = new AbstractitemsApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataWrapper result = apiInstance.getVersionOnItem(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbstractitemsApi#getVersionOnItem");
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

<a name="getVersionedItem"></a>
# **getVersionedItem**
> AbstractVersionedItemDataWrapper getVersionedItem(versionNum, id, include)

Get the  snapshot of the item at the specified version



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AbstractitemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AbstractitemsApi apiInstance = new AbstractitemsApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AbstractVersionedItemDataWrapper result = apiInstance.getVersionedItem(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbstractitemsApi#getVersionedItem");
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

[**AbstractVersionedItemDataWrapper**](AbstractVersionedItemDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionedRelationships"></a>
# **getVersionedRelationships**
> VersionedRelationshipDataListWrapper getVersionedRelationships(id, timestamp, startAt, maxResults, include)

Get all versioned relationships that were associated to the item at the specified time



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AbstractitemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AbstractitemsApi apiInstance = new AbstractitemsApi();
Integer id = 56; // Integer | 
String timestamp = "timestamp_example"; // String | Get relationships for the specified item at this date and time. Requires ISO8601 formatting (milliseconds or seconds) - \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" or \"yyyy-MM-dd'T'HH:mm:ssZ\"
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionedRelationshipDataListWrapper result = apiInstance.getVersionedRelationships(id, timestamp, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbstractitemsApi#getVersionedRelationships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **timestamp** | **String**| Get relationships for the specified item at this date and time. Requires ISO8601 formatting (milliseconds or seconds) - \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; or \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; |
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

<a name="getVersionsOnItem"></a>
# **getVersionsOnItem**
> VersionDataListWrapper getVersionsOnItem(id, startAt, maxResults, include)

Get all versions for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AbstractitemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

AbstractitemsApi apiInstance = new AbstractitemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataListWrapper result = apiInstance.getVersionsOnItem(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AbstractitemsApi#getVersionsOnItem");
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

