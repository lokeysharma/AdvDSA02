package com.assignment.questionAdepterInsurance;

import com.assignment.questionAdepterInsurance.external.TravelGuardApi;
import lombok.Getter;

@Getter
public class TravelGuardAdepter implements TravelInsuranceAdapter{

    private String id;
    private TravelGuardApi travelGuard;

    public TravelGuardAdepter(){
        this.travelGuard = new TravelGuardApi();
    }

    @Override
    public void submitClaim(String id, Double amount) {
        travelGuard.submitClaim(id, amount);
    }

    @Override
    public String getClaimStatus(String id) {
        return travelGuard.getClaimStatus(id);
    }
}
