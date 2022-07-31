package Extras.API;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lombok {
    private String email,password;

    public Lombok(String email, String password){
        this.email = email;
        this.password = password;
    }
}
