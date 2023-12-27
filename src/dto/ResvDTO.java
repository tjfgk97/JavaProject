package dto;

public class ResvDTO {
    private Long id;
    private String resvName;
    private String resvEmail;
    private String resvMobile;

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
    public ResvDTO(String resvName, String resvEmail, String resvMobile) {
        this.id = idValue++;
        this.resvName = resvName;
        this.resvEmail = resvEmail;
        this.resvMobile = resvMobile;
    }
}
