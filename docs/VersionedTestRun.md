
# VersionedTestRun

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | **Integer** |  |  [optional]
**currentVersion** | **Integer** | Currently active version of the versioned item. If no version is active, currentVersion will not be returned. |  [optional]
**id** | **Integer** |  | 
**documentKey** | **String** |  | 
**globalId** | **String** |  | 
**project** | **Integer** | ID of a project | 
**itemType** | **Integer** | ID of an item type | 
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**modifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**lastActivityDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdBy** | **Integer** | ID of a user | 
**modifiedBy** | **Integer** | ID of a user | 
**testCaseVersionNumber** | **Integer** | The version of the test case at the time of test run creation | 
**testCaseCurrentVersionNumber** | **Integer** | The current version of the test case that the test run is based on |  [optional]
**sortOrderFromTestGroup** | **Integer** | The sort order within the test group at the time of test cycle creation | 
**testGroup** | **List&lt;Integer&gt;** | ID of a test cycle and ID of a test group | 
**resources** | [**Map&lt;String, AllowedResource&gt;**](AllowedResource.md) | A set of resources and allowed permissions | 
**fields** | **Map&lt;String, Object&gt;** | A map of field names to field values e.g. {\&quot;name\&quot;:\&quot;Sample Item\&quot;, \&quot;status\&quot;: 292, \&quot;release\&quot;: 2, \&quot;assigned\&quot;: 23} | 



