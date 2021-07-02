package com.example.travelguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StatesPage extends AppCompatActivity {

    //int image[] = {R.drawable.andhra, R.drawable.arunachal, R.drawable.assam, R.drawable.bihar};
    //String name[] = {"Andhra", "Arunachal", "Assam", "Bihar"};
    //String desc[] = {"Andhra pradesh", "Arunachal Pradesh", "Assam", "Bihar"};
    //List<ItemModel> itemList = new ArrayList<>();
    //GridView gridView;
    //CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states_page);
        /*gridView = findViewById(R.id.gridview);
        for (int i = 0; i < name.length; i++) {
            ItemModel itemModel = new ItemModel(name[i], desc[i], image[i]);
            itemList.add(itemModel);
        }
        customAdapter= new CustomAdapter(itemList,this);
        gridView.setAdapter(customAdapter);
    }

    @Override
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem=menu.findItem(R.id.search_view);
        SearchView searchView= (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                customAdapter.getFilter().filter(newText);


                return false;
            }
        });



        return true;
    }

    @Override
    public boolean onOptionsItemSelcted(MenuItem item){
        int id=item.getItemId();
        if (id==R.id.search_view){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }





    public class CustomAdapter extends BaseAdapter implements Filterable {

        private  List<ItemModel> itemModelList;
        private List<ItemModel> itemModelListFiltered;
        private Context context;

        public CustomAdapter(List<ItemModel> itemModelList, Context context) {
            this.itemModelList = itemModelList;
            this.itemModelListFiltered=itemModelList;
            this.context = context;
        }

        @Override
        public int getCount() {
            return itemModelListFiltered.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View view= getLayoutInflater().inflate(R.layout.row_items,null);
            ImageView imageView= view.findViewById(R.id.imageView);
            TextView tvName=view.findViewById(R.id.tvName);
            TextView tvDesc=view.findViewById(R.id.tvDesc);
            imageView.setImageResource(itemModelListFiltered.get(position).getImage());
            tvName.setText(itemModelListFiltered.get(position).getName());
            tvDesc.setText(itemModelListFiltered.get(position).getDesc());
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(StatesPage.this,ItemViewActivity.class).putExtra("item",itemModelListFiltered.get(position)));
                }
            });

            return null;
        }

        @Override
        public Filter getFilter() {
            Filter filter= new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {

                    FilterResults filterResults= new FilterResults();
                    if (constraint==null|| constraint.length()==0){
                        filterResults.count=itemModelList.size();
                        filterResults.values= itemModelList;
                    }else {
                        String searchStr= constraint.toString().toLowerCase();
                        List<ItemModel> resultData= new ArrayList<>();
                        for (ItemModel itemModel:itemModelList){
                            if (itemModel.getName().contains(searchStr)|| itemModel.getDesc().contains(searchStr)){
                                resultData.add(itemModel);
                            }
                            filterResults.count= resultData.size();
                            filterResults.values= resultData;
                        }
                    }
                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {
                    itemModelListFiltered= (List<ItemModel>) results.values;
                    notifyDataSetChanged();
                }
            };
            return null;
        }
    }


}*/

        CardView button1 = findViewById(R.id.andhraid);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, AndhraPradesh.class));
            }
        });
        CardView button2 = findViewById(R.id.arunachalid);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, ArunachalPradesh.class));
            }
        });
        CardView button3 = findViewById(R.id.assamid);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Assam.class));
            }
        });
        CardView button4 = findViewById(R.id.bihar);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Bihar.class));
            }
        });
        CardView button5 = findViewById(R.id.chattisgarh);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Chattisgarh.class));
            }
        });
        CardView button6 = findViewById(R.id.delhi);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Delhi.class));
            }
        });
        CardView button7 = findViewById(R.id.goa);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Goa.class));
            }
        });
        CardView button8 = findViewById(R.id.gujarat);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Gujarat.class));
            }
        });
        CardView button9 = findViewById(R.id.haryana);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Harayana.class));
            }
        });
        CardView button10 = findViewById(R.id.hp);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, HimachalPradesh.class));
            }
        });
        CardView button11 = findViewById(R.id.jk);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, JammuKashmir.class));
            }
        });
        CardView button12 = findViewById(R.id.jha);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Jharkhand.class));
            }
        });
        CardView button13 = findViewById(R.id.kar);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Karnataka.class));
            }
        });
        CardView button14 = findViewById(R.id.ker);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Kerala.class));
            }
        });
        CardView button15 = findViewById(R.id.mp);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, MadhyaPradesh.class));
            }
        });
        CardView button16 = findViewById(R.id.maharashtra);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Maharashtra.class));
            }
        });
        CardView button17 = findViewById(R.id.manipur);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Manipur.class));
            }
        });
        CardView button18 = findViewById(R.id.meghalaya);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Meghalaya.class));
            }
        });
        CardView button19 = findViewById(R.id.mizo);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Mizoram.class));
            }
        });
        CardView button20 = findViewById(R.id.nagaland);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Nagaland.class));
            }
        });
        CardView button21 = findViewById(R.id.odisha);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Odisha.class));
            }
        });
        CardView button22 = findViewById(R.id.punjab);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Punjab.class));
            }
        });
        CardView button23 = findViewById(R.id.rajasthan);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Rajasthan.class));
            }
        });
        CardView button24 = findViewById(R.id.sikkim);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Sikkim.class));
            }
        });
        CardView button25 = findViewById(R.id.tamil);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, TamilNadu.class));
            }
        });
        CardView button26 = findViewById(R.id.telangana);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Telangana.class));
            }
        });
        CardView button27 = findViewById(R.id.tripura);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Tripura.class));
            }
        });
        CardView button28 = findViewById(R.id.uk);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, Uttarakhand.class));
            }
        });
        CardView button29 = findViewById(R.id.up);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, UttarPradesh.class));
            }
        });
        CardView button30 = findViewById(R.id.wb);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatesPage.this, WestBengal.class));
            }
        });
    }
}

