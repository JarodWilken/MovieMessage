package css.edu.moviemessage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {
    private List<Movie> movieList;
    private Context context;
    private int layoutResource;
}
