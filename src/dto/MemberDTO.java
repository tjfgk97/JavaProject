package dto;

public class MemberDTO {
    private Long id;
    private String memberName;
    private String memberMobile;
    private String memberPassword;
    private String memberCategory;
    private int memberAge;
    private String checkVaccination; // 접종 여부 확인하는 필드값



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberCategory() {
        return memberCategory;
    }

    public void setMemberCategory(String memberCategory) {
        this.memberCategory = memberCategory;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getCheckVaccination() {
        return checkVaccination;
    }

    public void setCheckVaccination(String checkVaccination) {
        this.checkVaccination = checkVaccination;
    }

    private static Long idValue = 1L;

    public MemberDTO(String memberName, String memberMobile, String memberPassword, String memberCategory) {
        this.id = idValue++;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
        this.memberPassword = memberPassword;
        this.memberCategory = memberCategory;
    }

    public MemberDTO(String memberMobile, String memberPassword) {
        this.memberMobile = memberMobile;
        this.memberPassword = memberPassword;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberCategory='" + memberCategory + '\'' +
                '}';
    }
}
