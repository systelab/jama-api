
# BaselineItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **Integer** |  |  [optional]
**currentVersion** | **Integer** | Currently active version of the versioned item. If no version is active, currentVersion will not be returned. |  [optional]
**baseline** | **Integer** | ID of a baseline |  [optional]
**baselineLocation** | [**BaselineLocation**](BaselineLocation.md) |  |  [optional]
**type** | **String** |  |  [optional]
**id** | **Integer** |  | 
**documentKey** | **String** |  | 
**globalId** | **String** |  | 
**project** | **Integer** | ID of a project | 
**itemType** | **Integer** | ID of an item type | 
**childItemType** | **Integer** | ID of an item type | 
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**lastActivityDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdBy** | **Integer** | ID of a user | 
**modifiedBy** | **Integer** | ID of a user | 
**resources** | [**Map&lt;String, AllowedResource&gt;**](AllowedResource.md) | A set of resources and allowed permissions | 
**fields** | **Map&lt;String, Object&gt;** | A map of field names to field values e.g. {\&quot;name\&quot;:\&quot;Sample Item\&quot;, \&quot;status\&quot;: 292, \&quot;release\&quot;: 2, \&quot;assigned\&quot;: 23} | 



