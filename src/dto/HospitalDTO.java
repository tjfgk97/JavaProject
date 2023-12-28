package dto;

public class HospitalDTO {
    private Long id;
//    private String hospitalPassword;
    private String hospitalName;
    private String hospitalEmail;
    private String hospitalMobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getHospitalPassword() {
//        return hospitalPassword;
//    }
//
//    public void setHospitalPassword(String hospitalPassword) {
//        this.hospitalPassword = hospitalPassword;
//    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalEmail() {
        return hospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        this.hospitalEmail = hospitalEmail;
    }

    public String getHospitalMobile() {
        return hospitalMobile;
    }

    public void setHospitalMobile(String hospitalMobile) {
        this.hospitalMobile = hospitalMobile;
    }

    private static Long idValue = 1L;
    public HospitalDTO(String hospitalPassword, String hospitalName, String hospitalEmail, String hospitalMobile) {
        this.id = idValue++;
//        this.hospitalPassword = hospitalPassword;
        this.hospitalName = hospitalName;
        this.hospitalEmail = hospitalEmail;
        this.hospitalMobile = hospitalMobile;
    }
}
