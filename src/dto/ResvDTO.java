package dto;

public class ResvDTO {
    private Long id;
    private String resvName;
    private String resvEmail;
    private String resvMobile;
    private String resvVaccine;

    public String getResvVaccine() {
        return resvVaccine;
    }

    public void setResvVaccine(String resvVaccine) {
        this.resvVaccine = resvVaccine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResvName() {
        return resvName;
    }

    public void setResvName(String resvName) {
        this.resvName = resvName;
    }

    public String getResvEmail() {
        return resvEmail;
    }

    public void setResvEmail(String resvEmail) {
        this.resvEmail = resvEmail;
    }

    public String getResvMobile() {
        return resvMobile;
    }

    public void setResvMobile(String resvMobile) {
        this.resvMobile = resvMobile;
    }

    private static Long idValue = 1L;
    public ResvDTO(String resvName, String resvEmail, String resvMobile, String resvVaccine) {
        this.id = idValue++;
        this.resvName = resvName;
        this.resvEmail = resvEmail;
        this.resvMobile = resvMobile;
        this.resvVaccine = resvVaccine;
    }

    public ResvDTO(String resvName, String resvMobile, String resvVaccine) {
        this.resvName = resvName;
        this.resvMobile = resvMobile;
        this.resvVaccine = resvVaccine;
    }

    @Override
    public String toString() {
        return "ResvDTO{" +
                "resvName='" + resvName + '\'' +
                ", resvMobile='" + resvMobile + '\'' +
                ", resvVaccine='" + resvVaccine + '\'' +
                '}';
    }
}
