package com.example.ziyu16901.com;

import java.util.Random;

/**
 * Created by 16901 on 2015/12/21
 */
public class CardData {
 //   private static final Random RANDOM = new Random();
//
//    public static int getRandomCheeseDrawable() {
//        switch (RANDOM.nextInt(5)) {
//            default:
//            case 0:
//                return R.drawable.cheese_1;
//            case 1:
//                return R.drawable.cheese_2;
//            case 2:
//                return R.drawable.cheese_3;
//            case 3:
//                return R.drawable.cheese_4;
//            case 4:
//                return R.drawable.cheese_5;
//        }
//    }

    public CardData(String title,String organization,String time){
//        this.image = image;
        this.title = title;
        this.organization = organization;
        this.time = time;
    }
//    public String image = "image";
    public String title = "title";
    public String organization ="organization";
    public String time ="time";

}
