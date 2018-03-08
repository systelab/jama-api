# UsergroupsApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserGroup**](UsergroupsApi.md#addUserGroup) | **POST** /usergroups | Create a new user group
[**addUserToGroup**](UsergroupsApi.md#addUserToGroup) | **POST** /usergroups/{id}/users | Add an existing user to the user group with the specified ID
[**deleteItem**](UsergroupsApi.md#deleteItem) | **DELETE** /usergroups/{id} | Delete the user group with the specified ID
[**getGroup**](UsergroupsApi.md#getGroup) | **GET** /usergroups/{id} | Get the user group with the specified ID
[**getGroupUsers**](UsergroupsApi.md#getGroupUsers) | **GET** /usergroups/{id}/users | Get all users for the user group with the specified ID
[**getUsers**](UsergroupsApi.md#getUsers) | **GET** /usergroups | Get all user groups
[**removeUserFromGroup**](UsergroupsApi.md#removeUserFromGroup) | **DELETE** /usergroups/{id}/users/{userId} | Remove an existing user from the user group with the specified ID
[**updateUserGroup**](UsergroupsApi.md#updateUserGroup) | **PUT** /usergroups/{id} | Update the user group with the specified ID


<a name="addUserGroup"></a>
# **addUserGroup**
> CreatedResponse addUserGroup(body)

Create a new user group



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
RequestUserGroup body = new RequestUserGroup(); // RequestUserGroup | 
try {
    CreatedResponse result = apiInstance.addUserGroup(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#addUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestUserGroup**](RequestUserGroup.md)|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addUserToGroup"></a>
# **addUserToGroup**
> CreatedResponse addUserToGroup(body, id)

Add an existing user to the user group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
RequestGroupUser body = new RequestGroupUser(); // RequestGroupUser | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addUserToGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#addUserToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestGroupUser**](RequestGroupUser.md)|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItem"></a>
# **deleteItem**
> AbstractRestResponse deleteItem(id)

Delete the user group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteItem(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#deleteItem");
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

<a name="getGroup"></a>
# **getGroup**
> UserGroupDataWrapper getGroup(id, include)

Get the user group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    UserGroupDataWrapper result = apiInstance.getGroup(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#getGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**UserGroupDataWrapper**](UserGroupDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupUsers"></a>
# **getGroupUsers**
> UserDataListWrapper getGroupUsers(id, startAt, maxResults, include)

Get all users for the user group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    UserDataListWrapper result = apiInstance.getGroupUsers(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#getGroupUsers");
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

[**UserDataListWrapper**](UserDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUsers"></a>
# **getUsers**
> UserGroupDataListWrapper getUsers(project, startAt, maxResults, include)

Get all user groups



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
Integer project = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    UserGroupDataListWrapper result = apiInstance.getUsers(project, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | **Integer**|  | [optional]
 **startAt** | **Integer**|  | [optional]
 **maxResults** | **Integer**| If not set, this defaults to 20. This cannot be larger than 50 | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**UserGroupDataListWrapper**](UserGroupDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeUserFromGroup"></a>
# **removeUserFromGroup**
> AbstractRestResponse removeUserFromGroup(userId, id)

Remove an existing user from the user group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
Integer userId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.removeUserFromGroup(userId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#removeUserFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserGroup"></a>
# **updateUserGroup**
> AbstractRestResponse updateUserGroup(body, id)

Update the user group with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UsergroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

UsergroupsApi apiInstance = new UsergroupsApi();
RequestUserGroup body = new RequestUserGroup(); // RequestUserGroup | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateUserGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsergroupsApi#updateUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestUserGroup**](RequestUserGroup.md)|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

