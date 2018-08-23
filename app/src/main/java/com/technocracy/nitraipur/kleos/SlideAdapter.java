package com.technocracy.nitraipur.kleos;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public int[] lst_images={
            R.drawable.image_1,
             R.drawable.image_2,
                R.drawable.image_3,
            R.drawable.image_4
    };
    public String[] lst_titles={
            "COSMONAUT",
            "SATELITE",
            "GALAXY",
            "ROCKET"

    };
    public String[] lst_description={
                "Description 1",
                "Description 2",
                "Description 3",
                "Description 4"


    };
    public SlideAdapter(Context context){
        this.context=context;
    }



    public int[] lst_background={
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212)
    };


    @Override
    public int getCount() {
        return lst_titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view== (LinearLayout)object);
    }
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide,container,false);
        LinearLayout linearLayout=(LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView slideimage=(ImageView)view.findViewById(R.id.slideimage);
        TextView TextTitle=(TextView)view.findViewById(R.id.textTitle);
        TextView description=(TextView)view.findViewById(R.id.textdescription);
        linearLayout.setBackgroundColor(lst_background[position]);
        slideimage.setImageResource(lst_images[position]);
        TextTitle.setText(lst_titles[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;




    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }

}
