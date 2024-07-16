package collection.set.member;

import java.util.Objects;

/**
 * Hashcode만 오버라이딩
 */
public class MemberOnlyHash{

    private String id;

    public MemberOnlyHash(String id) {
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

    @Override
    public int hashCode() {
        return Objects.hashCode(id); //id를 기준으로 hash코드 생성
    }
}
