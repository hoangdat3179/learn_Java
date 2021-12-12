import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Film{
    @SerializedName("id")
    private int id;
    @SerializedName("Title")
    private String title;
    @SerializedName("Genres")
    private String genres;
    @SerializedName("Director")
    private String director;
    @SerializedName("Length")
    private int length;
    @SerializedName("PublishingYear")
    private int publishingYear;
    @SerializedName("View")
    private int view;



    @Override
    public String toString() {
        return "Danh sách phim: "+
                " ID: " + id +
                " Title: " + title +
                " Genres: " + genres +
                " Director: " + director +
                " Length: " + length +
                " PublishingYear: " + publishingYear +
                " View: " + view;
    }
}
