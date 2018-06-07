package tech.sobre.aulalistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String minhaLista[];
    ArrayList<String> arrayList;

    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        minhaLista = getResources().getStringArray(R.array.lista_cidades);

        arrayList = new ArrayList<String>(Arrays.asList(minhaLista));

        adapter = new MyAdapter(this,R.layout.simple_list,arrayList);

//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//                android.R.layout.simple_list_item_1,
//                minhaLista);

        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(
                        getApplicationContext(),
                        arrayList.get(position),
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });
//
//       listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//           @Override
//           public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
//               Toast.makeText(
//                       getApplicationContext(),
//                       minhaLista[position] + "long click",
//                       Toast.LENGTH_SHORT)
//                       .show();
//               return true;
//           }
//       });

    }
}
