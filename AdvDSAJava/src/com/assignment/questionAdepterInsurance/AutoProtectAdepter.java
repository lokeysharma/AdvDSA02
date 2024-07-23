package com.assignment.questionAdepterInsurance;

import com.assignment.questionAdepterInsurance.external.AutoProtectApi;

public class AutoProtectAdepter implements TravelInsuranceAdapter{
    String id;
    private AutoProtectApi autoProtectApi;

    public AutoProtectAdepter() {
        this.autoProtectApi = new AutoProtectApi();
    }
    @Override
    public void submitClaim(String id, Double amount) {
        autoProtectApi.addClaim(amount);
    }

    @Override
    public String getClaimStatus(String id) {
        return autoProtectApi.getStatus(id).toString();
    }
}
