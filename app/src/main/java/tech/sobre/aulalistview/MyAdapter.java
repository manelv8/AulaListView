package tech.sobre.aulalistview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<String> {

    Activity ctx;
    ArrayList<String> arrayList;
    int resource;

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<String> lista) {
        super(context, resource, lista);
        ctx = (Activity) context;
        arrayList = (ArrayList<String>) lista;
        this.resource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        View view = ctx.getLayoutInflater().inflate(resource,parent,false);

        TextView tvCityName = view.findViewById(R.id.tvCityName);

        tvCityName.setText(arrayList.get(position));

        return view;


    }
}
