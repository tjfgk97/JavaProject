package dto;

public class ResvDTO {
    private Long id;
    private String resvName;
    private String resvMobile;
    private String resvVaccine;
    private String resvDate;



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

    public String getResvMobile() {
        return resvMobile;
    }

    public void setResvMobile(String resvMobile) {
        this.resvMobile = resvMobile;
    }
    public String getResvDate() {
        return resvDate;
    }

    public void setResvDate(String resvDate) {
        this.resvDate = resvDate;
    }

    private static Long idValue = 1L;

    public ResvDTO(String resvName, String resvMobile, String resvVaccine, String resvDate) {
        this.id = idValue++;
        this.resvName = resvName;
        this.resvMobile = resvMobile;
        this.resvVaccine = resvVaccine;
        this.resvDate = resvDate;
    }

    public ResvDTO(String resvName, String resvMobile, String resvVaccine) {
        this.resvName = resvName;
        this.resvMobile = resvMobile;
        this.resvVaccine = resvVaccine;
    }

    @Override
    public String toString() {
        return "ResvDTO{" +
                "id=" + id +
                ", resvName='" + resvName + '\'' +
                ", resvMobile='" + resvMobile + '\'' +
                ", resvVaccine='" + resvVaccine + '\'' +
                ", resvDate='" + resvDate + '\'' +
                '}';
    }
}
