
# ItemTypeField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  | 
**name** | **String** |  | 
**label** | **String** |  | 
**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) |  | 
**readOnly** | **Boolean** |  | 
**readOnlyAllowApiOverwrite** | **Boolean** |  |  [optional]
**required** | **Boolean** |  | 
**triggerSuspect** | **Boolean** |  | 
**synchronize** | **Boolean** |  | 
**pickList** | **Integer** | ID of a pick list | 
**textType** | [**TextTypeEnum**](#TextTypeEnum) |  | 
**itemType** | **Integer** | ID of an item type | 


<a name="FieldTypeEnum"></a>
## Enum: FieldTypeEnum
Name | Value
---- | -----
INTEGER | &quot;INTEGER&quot;
STRING | &quot;STRING&quot;
TEXT | &quot;TEXT&quot;
LOOKUP | &quot;LOOKUP&quot;
DATE | &quot;DATE&quot;
USER | &quot;USER&quot;
RELEASE | &quot;RELEASE&quot;
BOOLEAN | &quot;BOOLEAN&quot;
GROUP | &quot;GROUP&quot;
MULTI_LOOKUP | &quot;MULTI_LOOKUP&quot;
DOCUMENT_TYPE_ITEM_LOOKUP | &quot;DOCUMENT_TYPE_ITEM_LOOKUP&quot;
URL_STRING | &quot;URL_STRING&quot;
DOCUMENT_TYPE | &quot;DOCUMENT_TYPE&quot;
PROJECT | &quot;PROJECT&quot;
STEPS | &quot;STEPS&quot;
TIME | &quot;TIME&quot;
TEST_RUN_STATUS | &quot;TEST_RUN_STATUS&quot;
DOCUMENT_TYPE_CATEGORY_ITEM_LOOKUP | &quot;DOCUMENT_TYPE_CATEGORY_ITEM_LOOKUP&quot;
TEST_CASE_STATUS | &quot;TEST_CASE_STATUS&quot;
ACTIONS | &quot;ACTIONS&quot;
ROLLUP | &quot;ROLLUP&quot;
RELATIVE_DATE_RANGE | &quot;RELATIVE_DATE_RANGE&quot;
CALCULATED | &quot;CALCULATED&quot;
RELATIONSHIP_STATUS | &quot;RELATIONSHIP_STATUS&quot;


<a name="TextTypeEnum"></a>
## Enum: TextTypeEnum
Name | Value
---- | -----
TEXTAREA | &quot;TEXTAREA&quot;
RICHTEXT | &quot;RICHTEXT&quot;
KEY | &quot;KEY&quot;
ATTACHMENT | &quot;ATTACHMENT&quot;



