package dto;

public class HospitalDTO {
    private String vaccineName;
    private String vaccineCount;



    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCount() {
        return vaccineCount;
    }

    public void setVaccineCount(String vaccineCount) {
        this.vaccineCount = vaccineCount;
    }

    public HospitalDTO(String vaccineName, String vaccineCount) {
        this.vaccineName = vaccineName;
        this.vaccineCount = vaccineCount;
    }

    public HospitalDTO(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    @Override
    public String toString() {
        return "HospitalDTO{" +
                "vaccineName='" + vaccineName + '\'' +
                ", vaccineCount='" + vaccineCount + '\'' +
                '}';
    }
}
