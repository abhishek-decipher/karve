import org.springframework.cloud.contract.spec.Contract

Contract.make {

    request {
        description("""
        Get All offices
    """)

        method POST()

        url value(producer('/office/getAllOffices/'))
        headers {
            contentType applicationJson()
            body('''{
                "languageCode": "string",
                 "officeZoneIds": [
                     "string"
                ]
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
        Get All Office Zones
    """)

        method POST()

        url value(producer('/office/getAllOfficeZones/'))
        headers {
            contentType applicationJson()
            body('''{
                "languageCode": "string",
                "officeZoneIds": [
                     "string"
                ]
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

