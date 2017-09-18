package components.SignupActivity;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import models.Pais;

/**
 * Created by eitdev on 18/09/17.
 */

public class PaisesArrayAdapter extends ArrayAdapter<Pais> {

    private Context context;

    private ArrayList<Pais> values;

    public PaisesArrayAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<Pais> paises) {
        super(context, resource, paises);
        this.context = context;
        this.values = paises;
    }

    public int getCount(){
        return values.size();
    }

    public Pais getItem(int position){
        return values.get(position);
    }

    public long getItemId(int position){
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        TextView label = new TextView(context);
        label.setTextColor(Color.WHITE);
        label.setTextSize(16);
        // Then you can get the current item using the values array (Users array) and the current position
        // You can NOW reference each method you has created in your bean object (User class)
        label.setText(values.get(position).getNombre());

        // And finally return your dynamic (or custom) view for each spinner item
        return label;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getDropDownView(position, convertView, parent);

        TextView label = new TextView(context);
        label.setTextColor(Color.WHITE);
        label.setTextSize(20);
        label.setText(values.get(position).getNombre());

        return label;
    }
}
