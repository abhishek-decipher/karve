import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        description("""
        Get All Country Codes
    """)

        method POST()

        url value(producer('/categories/getCountriesCodes/'))
        headers {
            contentType applicationJson()
            body('''{
                "countryCode": "string",
                "languageCode": "string"
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
        Retrieve Car Types
    """)

        method POST()

        url value(producer('/categories/retrieveCarTypes/'))
        headers {
            contentType applicationJson()
            body('''{
                "carTypeId": "string",
                "languageCode": "string",
                "officeId": "string",
                "retrieveImages": true,
                "showAllCarTypes": true
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
        Retrieve Car Types
    """)

        method POST()

        url value(producer('/categories/retrieveCategories/'))
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
        Retrieve Car Types
    """)

        method POST()

        url value(producer('/categories/retrieveConcepts/'))
        headers {
            contentType applicationJson()
            body('''{
                "conceptId": 0,
                "languageCode": "string",
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
        Retrieve Places
    """)

        method POST()

        url value(producer('/categories/retrievePlaces/'))
        headers {
            contentType applicationJson()
            body('''{
                "officeCode": "string"
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
        Retrieve Widget Filters
    """)

        method POST()

        url value(producer('/categories/retrieveWidgetFilters/'))
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
