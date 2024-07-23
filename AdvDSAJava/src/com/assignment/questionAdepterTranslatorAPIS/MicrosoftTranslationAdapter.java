package com.assignment.questionAdepterTranslatorAPIS;

import com.assignment.questionAdepterTranslatorAPIS.external.MicrosoftTranslateApi;

import java.util.List;


public class MicrosoftTranslationAdapter implements  TranslationProviderAdapter{
    private MicrosoftTranslateApi translateApi;

    public MicrosoftTranslationAdapter() {
        this.translateApi = new MicrosoftTranslateApi();
    }
    @Override
    public String getTranslation(TranslationRequest translationRequest) {
        return translateApi.translate(translationRequest.getText(),translationRequest.getSourceLanguage(),translationRequest.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguages() {
        return translateApi.getSupportedLanguages();
    }
}
