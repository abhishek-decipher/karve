package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        description("""
        Get All Clients
    """)

        method POST()

        url value(producer('/client/getAllClients/'))
        headers {
            contentType applicationJson()
            body('''{
                "birthDate": "string",
                "countryCode": "string"
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
        Get Client By Client Code
    """)

        method POST()

        url value(producer('/client/getClientbyClientCode/'))
        headers {
            contentType applicationJson()
            body('''{
             "clientCode": "string",
             "identityNumber": "string",
             "mail": "string"
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
        Get Client By License
    """)

        method POST()

        url value(producer('/client/getClientbylicense/'))
        headers {
            contentType applicationJson()
            body('''{
            "countryCode": "string",
            "licenseNumber": "string"
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
        Create Client
    """)

        method POST()

        url value(producer('/client/createClient/'))
        headers {
            contentType applicationJson()
            body('''{
            "clientInformation": {
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
            "isCompany": true
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

        url value(producer('/client/updateClient/'))
        headers {
            contentType applicationJson()
            body('''{
            "clientCode": "string",
            "clientInformation": {
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
            "isCompany": true
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


