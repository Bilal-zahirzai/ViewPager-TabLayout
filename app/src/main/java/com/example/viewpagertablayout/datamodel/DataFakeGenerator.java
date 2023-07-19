package com.example.viewpagertablayout.datamodel;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import com.example.viewpagertablayout.R;

import java.util.ArrayList;
import java.util.List;

public class DataFakeGenerator {
    public static List<Clothe> getData(Context context){
        List<Clothe> list=new ArrayList<>();
        for (int i=1;i<=6;i++){
            Clothe list1=new Clothe();
            list1.setId(i);
            list1.setTitle("عنوان");
            list1.setViewCount("700"+i);
            switch (i){
                case 1:
                    list1.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.img1,null));
                    break;
                case 2:
                    list1.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.img2,null));
                    break;
                case 3:
                    list1.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.img3,null));
                    break;
                case 4:
                    list1.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.img4,null));
                    break;
                case 5:
                    list1.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.img5,null));
                    break;
                case 6:
                    list1.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.img6,null));
                    break;
            }
            list.add(list1);

        }
        return list;
    }
}
