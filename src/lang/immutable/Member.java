package lang.immutable;

public class Member {

    private String name;
    private ImmutableAddress address;

    public Member(String name, ImmutableAddress address) {
        this.address = address;
        this.name = name;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
