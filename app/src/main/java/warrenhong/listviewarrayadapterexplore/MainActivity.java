package warrenhong.listviewarrayadapterexplore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateList();
        onClick();
    }

    public void populateList() {
        String[] companies = {"Google", "Twitter", "Uber", "Pinterest", "Beme","Samsung", "Amazon",
        "Facebook", "Snapchat", "Tumblr", "Apple"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, R.layout.listview, companies);

        //CREATING THE LIST OF ITEMS
        ListView listView = (ListView) findViewById(R.id.listViewMain);
        listView.setAdapter(arrayAdapter);
    }

    public void onClick() {
        ListView listView = (ListView) findViewById(R.id.listViewMain);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view;
                String compName = "You've Clicked on " + textView.getText().toString();
                Toast.makeText(MainActivity.this, compName, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
