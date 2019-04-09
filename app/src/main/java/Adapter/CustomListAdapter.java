package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yosepheldwin.altershop.R;

import java.util.ArrayList;

import Model.HargaPOJO;
import Widget.TextViewLatoRegular;

public class CustomListAdapter extends ArrayAdapter<HargaPOJO> {

    private ArrayList<HargaPOJO> alllistset;
    Context mContext;

    public CustomListAdapter(Context context, ArrayList<HargaPOJO> listSet) {
        super(context,0, listSet);

        this.mContext = context;
        this.alllistset = listSet;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View listItem = convertView;
        if (listItem==null){

            listItem = LayoutInflater.from(mContext).inflate(R.layout.custom_list,parent, false);

            HargaPOJO hapojo = alllistset.get(position);

            TextViewLatoRegular tv_nama = (TextViewLatoRegular)listItem.findViewById(R.id.lato_r);
            tv_nama.setText(hapojo.getNamaProduk());

            TextView tv_harga = (TextView)listItem.findViewById(R.id.txt_view);
            tv_harga.setText(hapojo.getHargaProduk());

            ImageView brand = (ImageView)listItem.findViewById(R.id.item_info);
            brand.setImageResource(hapojo.getGambarProduk());


        }

        return listItem;
    }
}
