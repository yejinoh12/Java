package collection.set.member;

/**
 * HashCode, Equals  구현 하지 않은 경우
 * object 의 기능을 가져다 쓰게됨
 */
public class MemberNoHashNoEq {

    private String id;

    public MemberNoHashNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}
