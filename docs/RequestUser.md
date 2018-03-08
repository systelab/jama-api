
# RequestUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | Required when creating a new user (POST). Optional on update (PUT) | 
**password** | **String** | Required when creating a new user (POST). Not valid on update (PUT) | 
**firstName** | **String** | Required when creating a new user (POST). Optional on update (PUT) | 
**lastName** | **String** | Required when creating a new user (POST). Optional on update (PUT) | 
**email** | **String** | Required when creating a new user (POST). Optional on update (PUT) | 
**phone** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**location** | **String** |  |  [optional]
**licenseType** | [**LicenseTypeEnum**](#LicenseTypeEnum) | Required when creating a new user (POST). Optional on update (PUT) | 


<a name="LicenseTypeEnum"></a>
## Enum: LicenseTypeEnum
Name | Value
---- | -----
NAMED | &quot;NAMED&quot;
FLOATING | &quot;FLOATING&quot;
STAKEHOLDER | &quot;STAKEHOLDER&quot;
FLOATING_COLLABORATOR | &quot;FLOATING_COLLABORATOR&quot;
RESERVED_COLLABORATOR | &quot;RESERVED_COLLABORATOR&quot;
FLOATING_REVIEWER | &quot;FLOATING_REVIEWER&quot;
RESERVED_REVIEWER | &quot;RESERVED_REVIEWER&quot;
NAMED_REVIEWER | &quot;NAMED_REVIEWER&quot;
EXPIRING_TRIAL | &quot;EXPIRING_TRIAL&quot;
INACTIVE | &quot;INACTIVE&quot;



