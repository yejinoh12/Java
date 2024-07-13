package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*@Override
    public boolean equals(Object obj) {
        //다운캐스팅
        UserV2 user = (UserV2) obj;
        //string 과의 비교는 == 이 아닌 equals 를 사용해야함
        //현재 id 매개변수로 넘어온 id를 비교
        return id.equals(user.id);
    }*/

    // 더 정확한 equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

}
