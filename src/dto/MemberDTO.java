package dto;

public class MemberDTO {
    private Long id;
    private String memberName;
    private String memberMobile;
    private String memberPassword;
    private int memberCategory;
    private int memberAge;
//    private String memberEmail;
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

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }
    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public int getMemberCategory() {
        return memberCategory;
    }

    public void setMemberCategory(int memberCategory) {
        this.memberCategory = memberCategory;
    }
    //    public String getMemberEmail() {
//        return memberEmail;
//    }

//    public void setMemberEmail(String memberEmail) {
//        this.memberEmail = memberEmail;
//    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getCheckVaccination() {
        return checkVaccination;
    }

    public void setCheckVaccination(String checkVaccination) {
        this.checkVaccination = checkVaccination;
    }

    private static Long idValue = 1L;

    public MemberDTO(String memberName, String memberMobile, String memberPassword, int memberCategory, int memberAge, String checkVaccination) {
        this.id = idValue++;
        this.memberName = memberName;
        this.memberMobile = memberMobile;
        this.memberPassword = memberPassword;
        this.memberCategory = memberCategory;
        this.memberAge = memberAge;
        this.checkVaccination = checkVaccination;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", memberName='" + memberName + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberCategory=" + memberCategory +
                ", memberAge=" + memberAge +
                ", checkVaccination='" + checkVaccination + '\'' +
                '}';
    }
}
