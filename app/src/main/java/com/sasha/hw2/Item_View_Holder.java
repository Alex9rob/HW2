package com.sasha.hw2;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Item_View_Holder extends RecyclerView.ViewHolder
{
    private ImageView photo;
    private EditText fName;
    private EditText lName;

    public Item_View_Holder(View itemview)
    {
        super(itemview);
        photo = (ImageView)itemview.findViewById(R.id.imageView);
        fName = (EditText) itemview.findViewById(R.id.FName);
        lName = (EditText) itemview.findViewById(R.id.LName);
    }

    public EditText getfName()
    {
        return fName;
    }

    public EditText getlName()
    {
        return lName;
    }

    public ImageView getPhoto()
    {
        return photo;
    }
}
