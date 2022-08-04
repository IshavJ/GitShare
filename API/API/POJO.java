package API;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class POJO {
    private String name,job,email,password;
}
