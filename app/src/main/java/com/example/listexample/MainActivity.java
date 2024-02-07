package com.example.listexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Spinner spinner;

    AutoCompleteTextView actxtView;
    //int [] arr= new arr[]{1,2,3,4,5}; use when size is known
    ArrayList<String> arrNames=new ArrayList<>();// used when size is not known

    ArrayList<String> arrIds=new ArrayList<>();

    ArrayList<String> arrLanguages=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        spinner=findViewById(R.id.spinner);

        actxtView=findViewById(R.id.actxtView);



        arrNames.add("Ram");
        arrNames.add("Rohan");
        arrNames.add("Rajan");
        arrNames.add("Rakesh");
        arrNames.add("Ram");
        arrNames.add("Rohan");
        arrNames.add("Rajan");
        arrNames.add("Rakesh");
        arrNames.add("Ram");
        arrNames.add("Rohan");
        arrNames.add("Rajan");
        arrNames.add("Rakesh");
        arrNames.add("Ram");
        arrNames.add("Rohan");
        arrNames.add("Rajan");
        arrNames.add("Rakesh");
        arrNames.add("Ram");
        arrNames.add("Rohan");
        arrNames.add("Rajan");
        arrNames.add("Rakesh");

        //arrayAdapter first take the element from the array,load in textview then loads the txtview in listview
        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrNames);
        //getApplicationContext implies from where it is called
        //for txtview android gives android.R.layout.simple_list_item_1

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(MainActivity.this, "Clicked First Item", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //spinner

        arrIds.add("Aadhaar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving License Card");
        arrIds.add("Ration Card");
        arrIds.add("Xth Score Card");
        arrIds.add("XII Score Card");


        ArrayAdapter<String> spinnerAdapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);

        spinner.setAdapter(spinnerAdapter);




        //AutoCompleteTextView

        arrLanguages.add("C");
        arrLanguages.add("C++");
        arrLanguages.add("C");
        arrLanguages.add("java");
        arrLanguages.add("C#");
        arrLanguages.add("CScript");
        arrLanguages.add("PHP");

        ArrayAdapter<String> actvAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrLanguages);

        actxtView.setAdapter(actvAdapter);

        actxtView.setThreshold(1);// kitne letters likhne k bad autocomplete dikhna start ho


    }





}