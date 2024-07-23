package com.assignment.questionAdepterTranslatorAPIS;

import com.assignment.questionAdepterTranslatorAPIS.external.GoogleTranslateApi;
import com.assignment.questionAdepterTranslatorAPIS.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslatorAdapter implements TranslationProviderAdapter{
    GoogleTranslateApi googleTranslateApi;

    public GoogleTranslatorAdapter() {
        this.googleTranslateApi = new GoogleTranslateApi();
    }
    @Override
    public String getTranslation(TranslationRequest translationRequest) {
        GoogleTranslationRequest newReq = new GoogleTranslationRequest(translationRequest.getText(),
                translationRequest.getSourceLanguage(),translationRequest.getTargetLanguage(),
                0.8);
        return googleTranslateApi.convert(newReq);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
}
