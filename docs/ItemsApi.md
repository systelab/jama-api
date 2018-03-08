# ItemsApi

All URIs are relative to *https://jama.systelab.net/contour/rest/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAttachmentToItem**](ItemsApi.md#addAttachmentToItem) | **POST** /items/{id}/attachments | Add an existing attachment to the item with the specified ID
[**addItem**](ItemsApi.md#addItem) | **POST** /items | Create a new item
[**addItemLink**](ItemsApi.md#addItemLink) | **POST** /items/{id}/links | Create a new link for the item with the specified ID
[**addTagToItem**](ItemsApi.md#addTagToItem) | **POST** /items/{id}/tags | Add an existing tag to the item with the specified ID
[**breakSyncOnItem**](ItemsApi.md#breakSyncOnItem) | **DELETE** /items/{id}/synceditems/{syncedItemId} | Remove an existing item from the Global ID pool of the item with the specified ID (break sync)
[**connectItemToGlobalIDPool**](ItemsApi.md#connectItemToGlobalIDPool) | **POST** /items/{id}/synceditems | Add an existing item to the Global ID pool of the item with the specified ID
[**deleteItem**](ItemsApi.md#deleteItem) | **DELETE** /items/{id} | Delete the item with the specified ID (item becomes inactive and can be un-deleted if necessary)
[**deleteItemLink**](ItemsApi.md#deleteItemLink) | **DELETE** /items/{id}/links/{linkId} | Delete the link with the specified ID
[**duplicateItem**](ItemsApi.md#duplicateItem) | **POST** /items/{id}/duplicate | Create a duplicate of item
[**executeTransition**](ItemsApi.md#executeTransition) | **POST** /items/{id}/workflowtransitions | Executes a workflow transition for the item with the specified ID. Valid transitions can be found at /items/{id}/workflowtransitionoptions
[**getActivities**](ItemsApi.md#getActivities) | **GET** /items/{id}/activities | Get all activities for the item with the specified ID
[**getAttachments**](ItemsApi.md#getAttachments) | **GET** /items/{id}/attachments | Get all attachments for the item with the specified ID
[**getChildItems**](ItemsApi.md#getChildItems) | **GET** /items/{id}/children | Get all children items for the item with the specified ID
[**getDownstreamRelated**](ItemsApi.md#getDownstreamRelated) | **GET** /items/{id}/downstreamrelated | Get all downstream related items for the item with the specified ID
[**getDownstreamRelationships**](ItemsApi.md#getDownstreamRelationships) | **GET** /items/{id}/downstreamrelationships | Get all downstream relationships for the item with the specified ID
[**getItem**](ItemsApi.md#getItem) | **GET** /items/{id} | Get the item with the specified ID
[**getItemComments**](ItemsApi.md#getItemComments) | **GET** /items/{id}/comments | Get all comments for the item with the specified ID
[**getItemLinks**](ItemsApi.md#getItemLinks) | **GET** /items/{id}/links | Get all links for the item with the specified ID
[**getItems**](ItemsApi.md#getItems) | **GET** /items | Get all items in the project with the specified ID
[**getLinkById**](ItemsApi.md#getLinkById) | **GET** /items/{id}/links/{linkId} | Get the link with the specified ID
[**getLocation**](ItemsApi.md#getLocation) | **GET** /items/{id}/location | Get the location for the item with the specified ID
[**getLock**](ItemsApi.md#getLock) | **GET** /items/{id}/lock | Get the locked state, last locked date, and last locked by user for the item with the specified ID
[**getParentItem**](ItemsApi.md#getParentItem) | **GET** /items/{id}/parent | Get the parent item for the item with the specified ID
[**getSyncItems**](ItemsApi.md#getSyncItems) | **GET** /items/{id}/synceditems | Get all synchronized items for the item with the specified ID
[**getSyncStatus**](ItemsApi.md#getSyncStatus) | **GET** /items/{id}/synceditems/{syncedItemId}/syncstatus | Get the sync status for the synced item with the specified ID
[**getTagOnItem**](ItemsApi.md#getTagOnItem) | **GET** /items/{id}/tags/{tagId} | Get the tag with the specified ID
[**getTagsOnItem**](ItemsApi.md#getTagsOnItem) | **GET** /items/{id}/tags | Get all tags for the item with the specified ID
[**getUpstreamRelated**](ItemsApi.md#getUpstreamRelated) | **GET** /items/{id}/upstreamrelated | Get all upstream related items for the item with the specified ID
[**getUpstreamRelationships**](ItemsApi.md#getUpstreamRelationships) | **GET** /items/{id}/upstreamrelationships | Get all upstream relationships for the item with the specified ID
[**getVersionOnItem2**](ItemsApi.md#getVersionOnItem2) | **GET** /items/{id}/versions/{versionNum} | Get the numbered version for the item with the specified ID
[**getVersionedItem2**](ItemsApi.md#getVersionedItem2) | **GET** /items/{id}/versions/{versionNum}/versioneditem | Get the  snapshot of the item at the specified version
[**getVersionsOnItem2**](ItemsApi.md#getVersionsOnItem2) | **GET** /items/{id}/versions | Get all versions for the item with the specified ID
[**getWorkflowTransitionOptions**](ItemsApi.md#getWorkflowTransitionOptions) | **GET** /items/{id}/workflowtransitionoptions | Get all valid workflow transitions that can be made on the item with the specified ID
[**patchItem**](ItemsApi.md#patchItem) | **PATCH** /items/{id} | Update the item with the specified ID
[**putItem**](ItemsApi.md#putItem) | **PUT** /items/{id} | Update the item with the specified ID
[**removeAttachmentFromItem**](ItemsApi.md#removeAttachmentFromItem) | **DELETE** /items/{id}/attachments/{attachmentId} | Remove an existing attachment from the item
[**removeTagFromItem**](ItemsApi.md#removeTagFromItem) | **DELETE** /items/{id}/tags/{tagId} | Remove an existing tag from the item with the specified ID
[**updateItemLink**](ItemsApi.md#updateItemLink) | **PUT** /items/{id}/links/{linkId} | Update the link with the specified ID
[**updateLocation**](ItemsApi.md#updateLocation) | **PUT** /items/{id}/location | Update the location for the item with the specified ID as an asynchronous request (a successful response signifies that the work was started and a work identifier is given. This identifier will be used in a future feature). Any child items are moved along with this item. Note that this currently only supports moving items between projects
[**updateLock**](ItemsApi.md#updateLock) | **PUT** /items/{id}/lock | Update the locked state of the item with the specified ID


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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestItemAttachment body = new RequestItemAttachment(); // RequestItemAttachment | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addAttachmentToItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#addAttachmentToItem");
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

<a name="addItem"></a>
# **addItem**
> CreatedResponse addItem(body, setGlobalIdManually)

Create a new item



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestItem body = new RequestItem(); // RequestItem | 
Boolean setGlobalIdManually = true; // Boolean | This value must be set to true if you attempt to manually set the Global ID field of an item
try {
    CreatedResponse result = apiInstance.addItem(body, setGlobalIdManually);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#addItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestItem**](RequestItem.md)|  |
 **setGlobalIdManually** | **Boolean**| This value must be set to true if you attempt to manually set the Global ID field of an item | [optional]

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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestLink body = new RequestLink(); // RequestLink | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addItemLink(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#addItemLink");
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestItemTag body = new RequestItemTag(); // RequestItemTag | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.addTagToItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#addTagToItem");
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

<a name="breakSyncOnItem"></a>
# **breakSyncOnItem**
> AbstractRestResponse breakSyncOnItem(syncedItemId, id)

Remove an existing item from the Global ID pool of the item with the specified ID (break sync)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer syncedItemId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.breakSyncOnItem(syncedItemId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#breakSyncOnItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncedItemId** | **Integer**|  |
 **id** | **Integer**|  |

### Return type

[**AbstractRestResponse**](AbstractRestResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="connectItemToGlobalIDPool"></a>
# **connectItemToGlobalIDPool**
> CreatedResponse connectItemToGlobalIDPool(body, id)

Add an existing item to the Global ID pool of the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestItemSyncedItem body = new RequestItemSyncedItem(); // RequestItemSyncedItem | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.connectItemToGlobalIDPool(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#connectItemToGlobalIDPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestItemSyncedItem**](RequestItemSyncedItem.md)|  |
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

Delete the item with the specified ID (item becomes inactive and can be un-deleted if necessary)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteItem(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#deleteItem");
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer linkId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.deleteItemLink(linkId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#deleteItemLink");
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

<a name="duplicateItem"></a>
# **duplicateItem**
> CreatedResponse duplicateItem(id, body)

Create a duplicate of item

Copies the name and description fields. Only items without children can be have a duplicate created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
DuplicateConfig body = new DuplicateConfig(); // DuplicateConfig | 
try {
    CreatedResponse result = apiInstance.duplicateItem(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#duplicateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **body** | [**DuplicateConfig**](DuplicateConfig.md)|  | [optional]

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeTransition"></a>
# **executeTransition**
> CreatedResponse executeTransition(body, id)

Executes a workflow transition for the item with the specified ID. Valid transitions can be found at /items/{id}/workflowtransitionoptions



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestTransition body = new RequestTransition(); // RequestTransition | 
Integer id = 56; // Integer | 
try {
    CreatedResponse result = apiInstance.executeTransition(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#executeTransition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestTransition**](RequestTransition.md)|  |
 **id** | **Integer**|  |

### Return type

[**CreatedResponse**](CreatedResponse.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getActivities"></a>
# **getActivities**
> ActivityDataListWrapper getActivities(id, startAt, maxResults, include)

Get all activities for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ActivityDataListWrapper result = apiInstance.getActivities(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getActivities");
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    AttachmentDataListWrapper result = apiInstance.getAttachments(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getAttachments");
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

<a name="getChildItems"></a>
# **getChildItems**
> ItemDataListWrapper getChildItems(id, startAt, maxResults, include)

Get all children items for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getChildItems(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getChildItems");
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

[**ItemDataListWrapper**](ItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDownstreamRelated"></a>
# **getDownstreamRelated**
> ItemDataListWrapper getDownstreamRelated(id, startAt, maxResults, include)

Get all downstream related items for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getDownstreamRelated(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getDownstreamRelated");
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

[**ItemDataListWrapper**](ItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDownstreamRelationships"></a>
# **getDownstreamRelationships**
> RelationshipDataListWrapper getDownstreamRelationships(id, startAt, maxResults, include)

Get all downstream relationships for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataListWrapper result = apiInstance.getDownstreamRelationships(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getDownstreamRelationships");
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

<a name="getItem"></a>
# **getItem**
> ItemDataWrapper getItem(id, include)

Get the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataWrapper result = apiInstance.getItem(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**ItemDataWrapper**](ItemDataWrapper.md)

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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
Boolean rootCommentsOnly = false; // Boolean | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    CommentDataListWrapper result = apiInstance.getItemComments(id, startAt, maxResults, rootCommentsOnly, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getItemComments");
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LinkDataListWrapper result = apiInstance.getItemLinks(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getItemLinks");
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

<a name="getItems"></a>
# **getItems**
> ItemDataListWrapper getItems(project, rootOnly, startAt, maxResults, include)

Get all items in the project with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer project = 56; // Integer | 
Boolean rootOnly = true; // Boolean | Set this to true to only get root-level nodes from the item tree
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getItems(project, rootOnly, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **project** | **Integer**|  |
 **rootOnly** | **Boolean**| Set this to true to only get root-level nodes from the item tree | [optional]
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer linkId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LinkDataWrapper result = apiInstance.getLinkById(linkId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getLinkById");
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

<a name="getLocation"></a>
# **getLocation**
> LocationDataWrapper getLocation(id, include)

Get the location for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LocationDataWrapper result = apiInstance.getLocation(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**LocationDataWrapper**](LocationDataWrapper.md)

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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    LockDataWrapper result = apiInstance.getLock(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getLock");
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

<a name="getParentItem"></a>
# **getParentItem**
> ItemDataWrapper getParentItem(id, include)

Get the parent item for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataWrapper result = apiInstance.getParentItem(id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getParentItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**ItemDataWrapper**](ItemDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncItems"></a>
# **getSyncItems**
> ItemDataListWrapper getSyncItems(id, startAt, maxResults, include)

Get all synchronized items for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getSyncItems(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getSyncItems");
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

[**ItemDataListWrapper**](ItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncStatus"></a>
# **getSyncStatus**
> SyncStatusDataWrapper getSyncStatus(syncedItemId, id, include)

Get the sync status for the synced item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer syncedItemId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    SyncStatusDataWrapper result = apiInstance.getSyncStatus(syncedItemId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getSyncStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncedItemId** | **Integer**|  |
 **id** | **Integer**|  |
 **include** | [**List&lt;String&gt;**](String.md)| Links to include as full objects in the linked map | [optional]

### Return type

[**SyncStatusDataWrapper**](SyncStatusDataWrapper.md)

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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer tagId = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TagDataWrapper result = apiInstance.getTagOnItem(tagId, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getTagOnItem");
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    TagDataListWrapper result = apiInstance.getTagsOnItem(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getTagsOnItem");
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

<a name="getUpstreamRelated"></a>
# **getUpstreamRelated**
> ItemDataListWrapper getUpstreamRelated(id, startAt, maxResults, include)

Get all upstream related items for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    ItemDataListWrapper result = apiInstance.getUpstreamRelated(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getUpstreamRelated");
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

[**ItemDataListWrapper**](ItemDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpstreamRelationships"></a>
# **getUpstreamRelationships**
> RelationshipDataListWrapper getUpstreamRelationships(id, startAt, maxResults, include)

Get all upstream relationships for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    RelationshipDataListWrapper result = apiInstance.getUpstreamRelationships(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getUpstreamRelationships");
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

<a name="getVersionOnItem2"></a>
# **getVersionOnItem2**
> VersionDataWrapper getVersionOnItem2(versionNum, id, include)

Get the numbered version for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataWrapper result = apiInstance.getVersionOnItem2(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getVersionOnItem2");
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

<a name="getVersionedItem2"></a>
# **getVersionedItem2**
> VersionedItemDataWrapper getVersionedItem2(versionNum, id, include)

Get the  snapshot of the item at the specified version



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer versionNum = 56; // Integer | 
Integer id = 56; // Integer | 
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionedItemDataWrapper result = apiInstance.getVersionedItem2(versionNum, id, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getVersionedItem2");
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

[**VersionedItemDataWrapper**](VersionedItemDataWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVersionsOnItem2"></a>
# **getVersionsOnItem2**
> VersionDataListWrapper getVersionsOnItem2(id, startAt, maxResults, include)

Get all versions for the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    VersionDataListWrapper result = apiInstance.getVersionsOnItem2(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getVersionsOnItem2");
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

<a name="getWorkflowTransitionOptions"></a>
# **getWorkflowTransitionOptions**
> WorkflowTransitionDataListWrapper getWorkflowTransitionOptions(id, startAt, maxResults, include)

Get all valid workflow transitions that can be made on the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer id = 56; // Integer | 
Integer startAt = 56; // Integer | 
Integer maxResults = 56; // Integer | If not set, this defaults to 20. This cannot be larger than 50
List<String> include = Arrays.asList("include_example"); // List<String> | Links to include as full objects in the linked map
try {
    WorkflowTransitionDataListWrapper result = apiInstance.getWorkflowTransitionOptions(id, startAt, maxResults, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#getWorkflowTransitionOptions");
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

[**WorkflowTransitionDataListWrapper**](WorkflowTransitionDataListWrapper.md)

### Authorization

[basic](../README.md#basic), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="patchItem"></a>
# **patchItem**
> AbstractRestResponse patchItem(body, id)

Update the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
List<RequestPatchOperation> body = Arrays.asList(new RequestPatchOperation()); // List<RequestPatchOperation> | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.patchItem(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#patchItem");
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

<a name="putItem"></a>
# **putItem**
> AbstractRestResponse putItem(body, id, setGlobalIdManually)

Update the item with the specified ID



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestItem body = new RequestItem(); // RequestItem | 
Integer id = 56; // Integer | 
Boolean setGlobalIdManually = true; // Boolean | This value must be set to true if you attempt to manually set the Global ID field of an item
try {
    AbstractRestResponse result = apiInstance.putItem(body, id, setGlobalIdManually);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#putItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestItem**](RequestItem.md)|  |
 **id** | **Integer**|  |
 **setGlobalIdManually** | **Boolean**| This value must be set to true if you attempt to manually set the Global ID field of an item | [optional]

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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer attachmentId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.removeAttachmentFromItem(attachmentId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#removeAttachmentFromItem");
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer tagId = 56; // Integer | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.removeTagFromItem(tagId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#removeTagFromItem");
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
Integer linkId = 56; // Integer | 
RequestLink body = new RequestLink(); // RequestLink | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateItemLink(linkId, body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#updateItemLink");
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

<a name="updateLocation"></a>
# **updateLocation**
> AbstractRestResponse updateLocation(body, id)

Update the location for the item with the specified ID as an asynchronous request (a successful response signifies that the work was started and a work identifier is given. This identifier will be used in a future feature). Any child items are moved along with this item. Note that this currently only supports moving items between projects



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestMoveLocation body = new RequestMoveLocation(); // RequestMoveLocation | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateLocation(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RequestMoveLocation**](RequestMoveLocation.md)|  |
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
//import io.swagger.client.api.ItemsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basic
HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
basic.setUsername("YOUR USERNAME");
basic.setPassword("YOUR PASSWORD");

// Configure OAuth2 access token for authorization: oauth2
OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
oauth2.setAccessToken("YOUR ACCESS TOKEN");

ItemsApi apiInstance = new ItemsApi();
RequestLock body = new RequestLock(); // RequestLock | 
Integer id = 56; // Integer | 
try {
    AbstractRestResponse result = apiInstance.updateLock(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#updateLock");
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

