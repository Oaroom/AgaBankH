package com.ghen61.agabankh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by LG on 2018-06-13.
 */

public class ListAdapter extends BaseAdapter {

    public ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();


    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return listViewItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

       final int pos = position;
       final Context context = parent.getContext();

       if(convertView == null){

           LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView = inflater.inflate(R.layout.layout_item,parent,false);

       }


        TextView acc = (TextView) convertView.findViewById(R.id.accNumber);
        TextView money = (TextView) convertView.findViewById(R.id.money);
        TextView month = (TextView) convertView.findViewById(R.id.month);
        TextView once = (TextView) convertView.findViewById(R.id.once);


        ListViewItem listViewItem = listViewItemList.get(position);

        acc.setText(listViewItem.getAccount());
        money.setText(listViewItem.getMoney());
        once.setText(listViewItem.getOnetime());
        month.setText(listViewItem.getMonth());


        return convertView;
    }

    public void addItem(String acc, String moeny, String once, String month) {
        ListViewItem item = new ListViewItem();
        item.setAccount(acc);
        item.setMoney(moeny);
        item.setOnetime(once);
        item.setMonth(month);

        listViewItemList.add(item);
    }

    public void clearItem(){
        listViewItemList.clear();
    }
}

