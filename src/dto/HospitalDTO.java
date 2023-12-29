package dto;

public class HospitalDTO {
    private String vaccineName;
    private int vaccineCount;

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getVaccineCount() {
        return vaccineCount;
    }

    public void setVaccineCount(int vaccineCount) {
        this.vaccineCount = vaccineCount;
    }

    public HospitalDTO(String vaccineName, int vaccineCount) {
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
                ", vaccineCount=" + vaccineCount +
                '}';
    }
}
