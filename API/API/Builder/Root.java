package API.Builder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Root {
    private Integer page;

    @SerializedName("per_page")
    @JsonProperty("per_page")
    private Integer perPage;
    private Integer total;

    @SerializedName("total_pages")
    @JsonProperty("total_pages")
    private Integer totalPages;

    //Handling via @ser..
    private List<Datum> data;
    private Support support;
    private Datum dataList;

    private String name;
    private String job;
    private String id;
    private String createdAt;
}
