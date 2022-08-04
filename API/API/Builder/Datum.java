package API.Builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Datum {
    private Integer id;
    private String email;

    @SerializedName("first_name")
    @JsonProperty("first_name")
    private String firstName;

    @SerializedName("last_name")
    @JsonProperty("last_name")
    private String lastName;

    private String avatar;
}
