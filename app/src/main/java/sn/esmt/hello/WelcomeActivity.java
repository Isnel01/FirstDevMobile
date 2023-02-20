package sn.esmt.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class WelcomeActivity extends ListActivity {
    TextView selection;
    String[] items={ "Kaolack", "Thies", "Dakar", "Saint Louis", "Tamba",
            "Louga", "Fatick", "Touba", "Diourbel", "Kolda", "Ziguinchor", };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        setListAdapter(new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,items)
        );
        selection=(TextView)findViewById(R.id.selection);
    }
    public void onListItemClick(ListView parent, View v, int position, long id) {
        selection.setText(items[position]);
    }
}