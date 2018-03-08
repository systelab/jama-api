# CommentsApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addComment**](CommentsApi.md#addComment) | **POST** /comments | Create a new comment
[**getComment**](CommentsApi.md#getComment) | **GET** /comments/{id} | Get the comment with the specified ID
[**getComments**](CommentsApi.md#getComments) | **GET** /comments | Get all comments viewable by the current user
[**getReplies**](CommentsApi.md#getReplies) | **GET** /comments/{id}/replies | Get all reply comments for the comment with the specified ID


<a name="addComment"></a>
# **addComment**
> CreatedResponse addComment(body)

Create a new comment



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
RequestComment body = new RequestComment(); // RequestComment | 
try {
    CreatedResponse result = apiInstance.addComment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#addComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestComment**](RequestComment.md)|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getComment"></a>
# **getComment**
> CommentDataWrapper getComment(id, include)

Get the comment with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    CommentDataWrapper result = apiInstance.getComment(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**CommentDataWrapper**](CommentDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getComments"></a>
# **getComments**
> CommentDataListWrapper getComments(startAt, maxResults, rootCommentsOnly, include)

Get all comments viewable by the current user



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
Boolean rootCommentsOnly = false; // Boolean | whether to show only root comments; true to get only root comments, without their comment replies
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    CommentDataListWrapper result = apiInstance.getComments(startAt, maxResults, rootCommentsOnly, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **rootCommentsOnly** | **Boolean**| whether to show only root comments; true to get only root comments, without their comment replies | [optional] [default to false]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**CommentDataListWrapper**](CommentDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReplies"></a>
# **getReplies**
> CommentDataListWrapper getReplies(id, startAt, maxResults, include)

Get all reply comments for the comment with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

CommentsApi apiInstance = new CommentsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    CommentDataListWrapper result = apiInstance.getReplies(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentsApi#getReplies");
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

[**CommentDataListWrapper**](CommentDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

