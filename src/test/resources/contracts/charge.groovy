import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        description("""
        Create Charge
    """)

        method POST()

        url value(producer('/charge/createCharge/'))
        headers {
            contentType applicationJson()
            body('''{
               "chargedAmount": 0,
                "gatewayPaymentOrderId": "string",
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
        Retrieve Discount
    """)

        method POST()

        url value(producer('/charge/retrieveDiscount/'))
        headers {
            contentType applicationJson()
            body('''{
               "carTypeId": "string",
               "officeId": "string"
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
        Retrieve Rates
    """)

        method POST()

        url value(producer('/charge/retrieveRates/'))
        headers {
            contentType applicationJson()
            body('''{
                "clientId": "string",
                "onlyRateHeader": true,
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



