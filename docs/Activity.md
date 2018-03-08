
# Activity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**date** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**details** | **String** |  | 
**action** | **String** |  | 
**user** | **Integer** | ID of a user | 
**userComment** | **String** |  | 
**item** | **Integer** | ID of an item | 
**eventType** | [**EventTypeEnum**](#EventTypeEnum) |  | 
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) |  | 


<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
CREATE | &quot;CREATE&quot;
UPDATE | &quot;UPDATE&quot;
DELETE | &quot;DELETE&quot;
PUBLIC | &quot;PUBLIC&quot;
BATCH_SUMMARY | &quot;BATCH_SUMMARY&quot;


<a name="ObjectTypeEnum"></a>
## Enum: ObjectTypeEnum
Name | Value
---- | -----
PROJECT | &quot;PROJECT&quot;
ITEM | &quot;ITEM&quot;
USER | &quot;USER&quot;
RELATIONSHIP | &quot;RELATIONSHIP&quot;
COMMENT | &quot;COMMENT&quot;
ITEM_TAG | &quot;ITEM_TAG&quot;
TAG | &quot;TAG&quot;
ITEM_ATTACHMENT | &quot;ITEM_ATTACHMENT&quot;
URL | &quot;URL&quot;
TEST_RESULT | &quot;TEST_RESULT&quot;
BASELINE | &quot;BASELINE&quot;
CHANGE_REQUEST | &quot;CHANGE_REQUEST&quot;
REVIEW | &quot;REVIEW&quot;
REVISION | &quot;REVISION&quot;
REVISION_ITEM | &quot;REVISION_ITEM&quot;
TEST_PLAN | &quot;TEST_PLAN&quot;
TEST_CYCLE | &quot;TEST_CYCLE&quot;
TEST_RUN | &quot;TEST_RUN&quot;
INTEGRATION | &quot;INTEGRATION&quot;
MISCELLANEOUS | &quot;MISCELLANEOUS&quot;



