import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        description("""
        Get quotation
    """)

        method POST()

        url value(producer('/quotation/getQuotation/'))
        headers {
            contentType applicationJson()
            body('''{
            "categoryId": "string",
             "countryCode": "string",
             "currencyCode": "string",
             "driverAge": 0,
             "dropOffCollectionPlaceCode": 0,
             "dropOffDate": "string",
             "dropOffOfficeId": "string",
             "dropOffTime": "string",
             "includeConcepts": true,
             "kilometers": 0,
             "languageCode": "string",
             "pickUpDate": "string",
             "pickUpDeliveryPlaceCode": 0,
             "pickUpOfficeId": "string",
             "pickUpTime": "string",
             "promotionCode": "string"
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
        Quotation Car Types
    """)

        method POST()

        url value(producer('/quotation/getQuotationCarTypes/'))
        headers {
            contentType applicationJson()
            body('''{
                  "carTypeId": "string",
                  "countryCode": "string",
                  "currencyCode": "string",
                  "driverAge": 0,
                  "dropOffCollectionPlaceCode": 0,
                  "dropOffDate": "string",
                  "dropOffOfficeId": "string",
                  "dropOffTime": "string",
                  "kilometers": 0,
                  "languageCode": "string",
                  "pickUpDate": "string",
                  "pickUpDeliveryPlaceCode": 0,
                  "pickUpOfficeId": "string",
                  "pickUpTime": "string",
                  "promotionCode": "string",
                  "rateId": "string"
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


