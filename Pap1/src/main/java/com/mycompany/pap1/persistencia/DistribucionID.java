package com.mycompany.pap1.persistencia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DistribucionID implements Serializable {

    @Column(name = "beneficiario_email")
    private String beneficiarioEmail;

    @Column(name = "donacion_id")
    private int donacionId;

    public DistribucionID() {}

    public DistribucionID(String beneficiarioEmail, int donacionId) {
        this.beneficiarioEmail = beneficiarioEmail;
        this.donacionId = donacionId;
    }

    public String getBeneficiarioEmail() {
        return beneficiarioEmail;
    }

    public void setBeneficiarioEmail(String beneficiarioEmail) {
        this.beneficiarioEmail = beneficiarioEmail;
    }

    public int getDonacionId() {
        return donacionId;
    }

    public void setDonacionId(int donacionId) {
        this.donacionId = donacionId;
    }

    @Override
    public int hashCode() {
        return beneficiarioEmail.hashCode() + donacionId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DistribucionID other = (DistribucionID) obj;
        return beneficiarioEmail.equals(other.beneficiarioEmail) && donacionId == other.donacionId;
    }
}
