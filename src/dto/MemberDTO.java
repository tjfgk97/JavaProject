package dto;

public class MemberDTO {
    private Long id;
    private String memberName;
    private int memberAge;
    private String memberEmail;
    private String memberMobile;

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

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    private static Long idValue = 1L;
    public MemberDTO(String name, int age, String memberEmail, String memberMobile) {
        this.id = idValue++;
        this.memberName = name;
        this.memberAge = age;
        this.memberEmail = memberEmail;
        this.memberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "MemberRepository{" +
                "id=" + id +
                ", name='" + memberName + '\'' +
                ", age=" + memberAge +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberMobile='" + memberMobile + '\'' +
                '}';
    }
}
