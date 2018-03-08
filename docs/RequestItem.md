
# RequestItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**globalId** | **String** | Must use override if you want to set this value on POST. |  [optional]
**project** | **Integer** | Only required when creating a new item (POST). | 
**itemType** | **Integer** | ID of an item type | 
**childItemType** | **Integer** | ID of an item type | 
**location** | [**RequestLocation**](RequestLocation.md) |  | 
**fields** | **Map&lt;String, Object&gt;** | A map of field names to field values e.g. {\&quot;name\&quot;:\&quot;Sample Item\&quot;, \&quot;status\&quot;: 292, \&quot;release\&quot;: 2, \&quot;assigned\&quot;: 23} | 



