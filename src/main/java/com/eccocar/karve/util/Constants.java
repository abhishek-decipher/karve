package com.eccocar.karve.util;

public class Constants {
	
	private Constants() {
		
	}
	
	public static final String ORGANIZATION_SUPER_ADMIN = "eccocar";
	public static final String TITLE = "eccocar";
	public static final String DESCRIPTION_NEW_LINE = "\n";
	public static final String DESCRIPTION_INTRO = "eccocar karve REST API.";
	public static final String DESCRIPTION_STEPS = "Steps to use this API: ";
	public static final String DESCRIPTION_1 = "1. In the `heimdall-controller` section, generate a bearer token using `clientId` and `clientSecret`. "
			+ "That way an `acccess_token` is obtained that should look this way:";
	public static final String DESCRIPTION_2 = "`\"access_token\": \"xxx-xxx-xxx-xxx-xxx\"`";
	public static final String DESCRIPTION_3 = "2. Paste that `acccess_token` in any enpoint in the `Authorization` field, preceded by the word `Bearer` and a space. It should look like this: ";
	public static final String DESCRIPTION_4 = "`Bearer xxx-xxx-xxx-xxx-xxx`";
	public static final String CONTACT_NAME = "Eccocar Sharing SL";
	public static final String CONTACT_URL = "www.eccocar.com";
	public static final String CONTACT_EMAIL = "contacto@eccocar.com";
	public static final String VERSION = "1.0";
	public static final String TERMS_OF_SERVICE_URL = "www.eccocar.com";
	public static final String LICENSE = "Apache License Version 2.0";
	public static final String LICENSE_URL = "www.eccocar.com";
	
	public static final String descriptionBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append(DESCRIPTION_INTRO);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_STEPS);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_1);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_2);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_3);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_NEW_LINE);
		sb.append(DESCRIPTION_4);
		
		return sb.toString();
		
	}
}