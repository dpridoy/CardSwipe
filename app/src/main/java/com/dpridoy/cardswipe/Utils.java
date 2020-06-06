package com.dpridoy.cardswipe;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<CategoryModel> getCategory(){
        List<CategoryModel> models=new ArrayList<>();
        CategoryModel categoryModel5=new CategoryModel();
        categoryModel5.setCategoryName("Technology");
        categoryModel5.setImageUrl("https://images.unsplash.com/photo-1519389950473-47ba0277781c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80");
        models.add(categoryModel5);

        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setCategoryName("Business");
        categoryModel.setImageUrl("https://images.unsplash.com/39/lIZrwvbeRuuzqOoWJUEn_Photoaday_CSD%20(1%20of%201)-5.jpg?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80");
        models.add(categoryModel);

        CategoryModel categoryModel2=new CategoryModel();
        categoryModel2.setCategoryName("Sports");
        categoryModel2.setImageUrl("https://images.unsplash.com/photo-1471295253337-3ceaaedca402?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1048&q=80");
        models.add(categoryModel2);

        CategoryModel categoryModel3=new CategoryModel();
        categoryModel3.setCategoryName("Entertainment");
        categoryModel3.setImageUrl("https://images.unsplash.com/photo-1470229722913-7c0e2dbbafd3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80");
        models.add(categoryModel3);

        CategoryModel categoryModel4=new CategoryModel();
        categoryModel4.setCategoryName("Science");
        categoryModel4.setImageUrl("https://images.unsplash.com/photo-1554475901-4538ddfbccc2?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1052&q=80");
        models.add(categoryModel4);

        CategoryModel categoryModel6=new CategoryModel();
        categoryModel6.setCategoryName("Health");
        categoryModel6.setImageUrl("https://images.unsplash.com/photo-1532938911079-1b06ac7ceec7?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80");
        models.add(categoryModel6);


        CategoryModel categoryModel7=new CategoryModel();
        categoryModel7.setCategoryName("Politics");
        categoryModel7.setImageUrl("https://images.unsplash.com/photo-1534598974068-2d51eda7628f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80");
        models.add(categoryModel7);

        return models;
    }

}
