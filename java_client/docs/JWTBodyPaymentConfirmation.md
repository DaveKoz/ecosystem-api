
# JWTBodyPaymentConfirmation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iat** | [**BigDecimal**](BigDecimal.md) | issued at - seconds from epoc | 
**iss** | **String** | issuer name, the same as app_id (kik) | 
**exp** | [**BigDecimal**](BigDecimal.md) | expiration - seconds from epoc | 
**sub** | [**SubEnum**](#SubEnum) | subject | 
**offerId** | **String** | offer id - id is decided by digital service | 
**senderUserId** | **String** | user identifier - same value as given by register |  [optional]
**recipientUserId** | **String** | user identifier - same value as given by register |  [optional]
**payment** | [**JWTBodyPaymentConfirmationPayment**](JWTBodyPaymentConfirmationPayment.md) |  | 



<a name="SubEnum"></a>
## Enum: SubEnum
Name | Value
---- | -----
REGISTER | &quot;register&quot;
SPEND | &quot;spend&quot;
EARN | &quot;earn&quot;
PAY_TO_USER | &quot;pay_to_user&quot;
PAYMENT_CONFIRMED | &quot;payment_confirmed&quot;


