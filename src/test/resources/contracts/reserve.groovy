package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        description("""
        Create Reserve
    """)

        method POST()

        url value(producer('/reserve/createReserve/'))
        headers {
            contentType applicationJson()
            body('''{
              "additionalNotes": "string",
              "affiliateCode": "string",
              "cancelationTimerSeconds": 0,
              "carTypeId": "string",
              "chargedAmount": 0,
              "clientCode": "string",
              "clientName": "string",
              "collectionAddress": "string",
              "conceptsIds": [
                0
              ],
              "countryCode": "string",
              "couponCode": "string",
              "creditCard": {
                "expirationMonth": "string",
                "expirationYear": "string",
                "number": "string",
                "titular": "string",
                "vendor": "string"
              },
              "currencyCode": "string",
              "deliveryAddress": "string",
              "discount": 0,
              "driverCode1": "string",
              "driverCode2": "string",
              "driverInformation1": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "driverInformation2": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "dropOffCollectionPlaceCode": 0,
              "dropOffDate": "string",
              "dropOffOfficeId": "string",
              "dropOffTime": "string",
              "flight": "string",
              "gatewayPaymentOrderId": "string",
              "languageCode": "string",
              "localAddress": "string",
              "paymentMethod": 0,
              "pickUpDate": "string",
              "pickUpDeliveryPlaceCode": 0,
              "pickUpOfficeId": "string",
              "pickUpTime": "string",
              "promotionCode": "string",
              "rateId": "string",
              "receiveComercialInfo": true,
              "reserveId": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
        Get List Of Reserve
    """)

        method POST()

        url value(producer('/reserve/listOfReserve/'))
        headers {
            contentType applicationJson()
            body('''{
              "brokerCode": "string",
              "driver1FirstName": "string",
              "driver1LastName": "string",
              "includeModifieds": true,
              "lastMinutes": 0,
              "locator": "string",
              "pickUpDate": "string",
              "pickUpOfficeId": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
        Update Client
    """)

        method PUT()

        url value(producer('/reserve/updateReserve/'))
        headers {
            contentType applicationJson()
            body('''{
              "additionalNotes": "string",
              "affiliateCode": "string",
              "carTypeId": "string",
              "chargedAmount": 0,
              "clientCode": "string",
              "clientName": "string",
              "collectionAddress": "string",
              "conceptsIds": [
                0
              ],
              "countryCode": "string",
              "couponCode": "string",
              "creditCard": {
                "expirationMonth": "string",
                "expirationYear": "string",
                "number": "string",
                "titular": "string",
                "vendor": "string"
              },
              "currencyCode": "string",
              "deliveryAddress": "string",
              "discount": 0,
              "driverCode1": "string",
              "driverCode2": "string",
              "driverInformation1": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "driverInformation2": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "dropOffCollectionPlaceCode": 0,
              "dropOffDate": "string",
              "dropOffOfficeId": "string",
              "dropOffTime": "string",
              "flight": "string",
              "languageCode": "string",
              "localAddress": "string",
              "paymentMethod": 0,
              "pickUpDate": "string",
              "pickUpDeliveryPlaceCode": 0,
              "pickUpOfficeId": "string",
              "pickUpTime": "string",
              "promotionCode": "string",
              "rateId": "string",
              "reserveId": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
        Update Reserve By Client Code
    """)

        method PUT()

        url value(producer('/reserve/updateReserve/clientCode/'))
        headers {
            contentType applicationJson()
            body('''{
              "clientCode": "string",
              "countryCode": "string",
              "driverCode1": "string",
              "driverCode2": "string",
              "languageCode": "string",
              "reserveCode": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
       Update Reserve Concepts
    """)

        method PUT()

        url value(producer('/reserve/updateReserveConcepts/'))
        headers {
            contentType applicationJson()
            body('''{
              "addConceptsIds": [
                0
              ],
              "chargedAmount": 0,
              "countryCode": "string",
              "deleteConceptsIds": [
                0
              ],
              "languageCode": "string",
              "paymentMethod": 0,
              "reserveId": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}


Contract.make {

    request {
        description("""
       Update Reserve concepts By Code
    """)

        method PUT()

        url value(producer('/reserve/updateReserveConcepts/Code/'))
        headers {
            contentType applicationJson()
            body('''{
              "addConceptsIds": [
                0
              ],
              "chargedAmount": 0,
              "countryCode": "string",
              "deleteConceptsIds": [
                0
              ],
              "languageCode": "string",
              "reserveCode": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}


Contract.make {

    request {
        description("""
       Update Reserve Information
    """)

        method PUT()

        url value(producer('/reserve/updateReserveInformation/'))
        headers {
            contentType applicationJson()
            body('''{
              "additionalNotes": "string",
              "clientName": "string",
              "collectionAddress": "string",
              "countryCode": "string",
              "creditCard": {
                "expirationMonth": "string",
                "expirationYear": "string",
                "number": "string",
                "titular": "string",
                "vendor": "string"
              },
              "deliveryAddress": "string",
              "driverInformation1": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "driverInformation2": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "flight": "string",
              "languageCode": "string",
              "localAddress": "string",
              "reserveId": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
      Update Reserve Information By Client Code
    """)

        method PUT()

        url value(producer('/reserve/updateReserveInformation/clientCode/'))
        headers {
            contentType applicationJson()
            body('''{
              
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
      Get all Reserve
    """)

        method POST()

        url value(producer('/reserve/getAllReserve/'))
        headers {
            contentType applicationJson()
            body('''{
              "countryCode": "string",
              "languageCode": "string",
              "reserveId": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
      Get all Reserve By Code
    """)

        method POST()

        url value(producer('/reserve/getAllReserveByCode/'))
        headers {
            contentType applicationJson()
            body('''{
              "countryCode": "string",
              "includeAllConcepts": true,
              "languageCode": "string",
              "reserveCode": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}

Contract.make {

    request {
        description("""
      Simulate Reserve
    """)

        method POST()

        url value(producer('/reserve/simulateReserve/'))
        headers {
            contentType applicationJson()
            body('''{
              "additionalNotes": "string",
              "affiliateCode": "string",
              "carTypeId": "string",
              "chargedAmount": 0,
              "clientCode": "string",
              "clientName": "string",
              "collectionAddress": "string",
              "conceptsIds": [
                0
              ],
              "countryCode": "string",
              "couponCode": "string",
              "creditCard": {
                "expirationMonth": "string",
                "expirationYear": "string",
                "number": "string",
                "titular": "string",
                "vendor": "string"
              },
              "currencyCode": "string",
              "deliveryAddress": "string",
              "discount": 0,
              "driverCode1": "string",
              "driverCode2": "string",
              "driverInformation1": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "driverInformation2": {
                "address": "string",
                "birthDate": "string",
                "birthPlace": "string",
                "countryCode": "string",
                "firstName": "string",
                "fullName": "string",
                "identityExpeditionCountryCode": "string",
                "identityExpeditionDate": "string",
                "identityExpeditionPlace": "string",
                "identityExpirationDate": "string",
                "identityNumber": "string",
                "lastName": "string",
                "licenseClass": "string",
                "licenseExpeditionCountryCode": "string",
                "licenseExpeditionDate": "string",
                "licenseExpeditionPlace": "string",
                "licenseNumber": "string",
                "mail": "string",
                "mobile": "string",
                "phone": "string",
                "postCode": "string",
                "province": "string",
                "salutation": "string",
                "title": "string",
                "town": "string"
              },
              "dropOffCollectionPlaceCode": 0,
              "dropOffDate": "string",
              "dropOffOfficeId": "string",
              "dropOffTime": "string",
              "flight": "string",
              "languageCode": "string",
              "localAddress": "string",
              "paymentMethod": 0,
              "pickUpDate": "string",
              "pickUpDeliveryPlaceCode": 0,
              "pickUpOfficeId": "string",
              "pickUpTime": "string",
              "promotionCode": "string",
              "rateId": "string",
              "reserveId": "string"
            }''')
        }
    }

    response {
        status 200
        headers {
            contentType applicationJson()
        }
    }

}