package com.emailautomation;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.gmail.GmailScopes;

import java.util.Collections;
import java.util.List;


public class GmailConfig {

    private static final String APPLICATION_NAME = "EmailAutomation";


    private static final JsonFactory JSON_FACTORY =
            GsonFactory.getDefaultInstance();

    private static final String TOKENS_DIRECTORY_PATH = "tokens";


    private static final String CREDENTIALS_FILE_PATH =
            "/credentials.json";

    private static final List<String> SCOPES =
            Collections.singletonList(GmailScopes.GMAIL_READONLY);


}

