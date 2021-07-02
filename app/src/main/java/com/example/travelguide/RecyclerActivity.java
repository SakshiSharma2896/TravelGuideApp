package com.example.travelguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Collections;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        preferences= this.getSharedPreferences("MY Data", MODE_PRIVATE);
        mRecyclerView= findViewById(R.id.recycler_view);
        showData();
    }

    private void showData(){
        ArrayList<Model> models= new ArrayList<>();
        Model p= new Model();
        p.setTilte("Andhra Pradesh");
        p.setImage(R.drawable.andhra);
        models.add(p);
        p= new Model();
        p.setTilte("Arunachal Pradesh");
        p.setImage(R.drawable.arunachal);
        models.add(p);
        p= new Model();
        p.setTilte("Assam");
        p.setImage(R.drawable.assam);
        models.add(p);
        p= new Model();
        p.setTilte("Bihar");
        p.setImage(R.drawable.bihar);
        models.add(p);
        p= new Model();
        p.setTilte("Chhattisgarh");
        p.setImage(R.drawable.chhattisgarh);
        models.add(p);
        p= new Model();
        p.setTilte("Delhi");
        p.setImage(R.drawable.delhi);
        models.add(p);
        p= new Model();
        p.setTilte("Goa");
        p.setImage(R.drawable.goa);
        models.add(p);
        p= new Model();
        p.setTilte("Gujarat");
        p.setImage(R.drawable.gujarat);
        models.add(p);
        p= new Model();
        p.setTilte("Harayana");
        p.setImage(R.drawable.harayana);
        models.add(p);
        p= new Model();
        p.setTilte("Himachal Pradesh");
        p.setImage(R.drawable.hp);
        models.add(p);
        p= new Model();
        p.setTilte("Jammu Kashmir");
        p.setImage(R.drawable.jk);
        models.add(p);
        p= new Model();
        p.setTilte("Jharkhand");
        p.setImage(R.drawable.jharkhand);
        models.add(p);
        p= new Model();
        p.setTilte("Karanataka");
        p.setImage(R.drawable.karanataka);
        models.add(p);
        p= new Model();
        p.setTilte("Kerala");
        p.setImage(R.drawable.kerala);
        models.add(p);
        p= new Model();
        p.setTilte("Madhya Pradesh");
        p.setImage(R.drawable.mp);
        models.add(p);
        p= new Model();
        p.setTilte("Maharashtra");
        p.setImage(R.drawable.maharashtra);
        models.add(p);
        p= new Model();
        p.setTilte("Manipur");
        p.setImage(R.drawable.manipur);
        models.add(p);
        p= new Model();
        p.setTilte("Meghalaya");
        p.setImage(R.drawable.meghalaya);
        models.add(p);
        p= new Model();
        p.setTilte("Mizoram");
        p.setImage(R.drawable.mizoram);
        models.add(p);
        p= new Model();
        p.setTilte("Nagaland");
        p.setImage(R.drawable.nagaland);
        models.add(p);
        p= new Model();
        p.setTilte("Odisha");
        p.setImage(R.drawable.odisha);
        models.add(p);
        p= new Model();
        p.setTilte("Punjab");
        p.setImage(R.drawable.punjab);
        models.add(p);
        p= new Model();
        p.setTilte("Rajasthan");
        p.setImage(R.drawable.rajasthan);
        models.add(p);
        p= new Model();
        p.setTilte("Sikkim");
        p.setImage(R.drawable.sikkim);
        models.add(p);
        p= new Model();
        p.setTilte("Tamil Nadu");
        p.setImage(R.drawable.tamil);
        models.add(p);
        p= new Model();
        p.setTilte("Telangana");
        p.setImage(R.drawable.telangana);
        models.add(p);
        p= new Model();
        p.setTilte("Tripura");
        p.setImage(R.drawable.tripura);
        models.add(p);
        p= new Model();
        p.setTilte("Uttarakhand");
        p.setImage(R.drawable.uk);
        models.add(p);
        p= new Model();
        p.setTilte("Uttar Pradesh");
        p.setImage(R.drawable.up);
        models.add(p);
        p= new Model();
        p.setTilte("West Bengal");
        p.setImage(R.drawable.wb);
        models.add(p);

        String mSortSettings = preferences.getString("Sort","ascending");
        if (mSortSettings.equals("ascending")){
            Collections.sort(models, Model.BY_TITLE_ASCENDING);
        }else if (mSortSettings.equals("descending")) {
            Collections.sort(models, Model.BY_TITLE_DESCENDING);
        }

        mRecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myAdapter= new MyAdapter(this,models);
        mRecyclerView.setAdapter(myAdapter);
        //return models;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem item= menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                myAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                myAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if (id==R.id.action_sort){
            //Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
            showSortDialog();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private  void showSortDialog(){
        //options to display in dialog
        String[] options={"Ascending","Descending"};
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Sort By");
        builder.setIcon(R.drawable.ic_sort_black_24dp);
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(which==0){//Ascending is clicked
                    SharedPreferences.Editor editor= preferences.edit();
                    editor.putString("Sort", "ascending");
                    editor.apply();
                    showData();
                }
                if(which==1){//Descending is clicked
                    SharedPreferences.Editor editor= preferences.edit();
                    editor.putString("Sort", "descending");
                    editor.apply();
                    showData();
                }
            }
        });
        builder.create().show();

    }

}
