package com.example.ritesh.hobbies;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritesh on 4/4/2016.
 */
public class chfood extends Activity implements AdapterView.OnItemSelectedListener
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chfood);

        Spinner spinner= (Spinner)findViewById(R.id.spinn);
        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        List<String> categories=new ArrayList<String>();
        categories.add("Romance");
        categories.add("Drama");
        categories.add("Action");
        categories.add("AutoBiography");
        categories.add("Horror");
        categories.add("Mystery");
        categories.add("Religion, Spirituality & New Age");
        categories.add("Science");
        categories.add("History");
        categories.add("Comics");

        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item= parent.getItemAtPosition(position).toString();

        Toast.makeText(parent.getContext(),"Selected"+ item,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
