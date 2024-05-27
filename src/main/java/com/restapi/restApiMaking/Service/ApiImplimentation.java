package com.restapi.restApiMaking.Service;

import com.restapi.restApiMaking.Entities.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ApiImplimentation implements ApiInterface {

    public  List<Menu> items = new ArrayList<>();
    public ApiImplimentation() {
        items.add(new Menu(1,"noodle","is available"));
        items.add(new Menu(2,"pasta","is available"));
        items.add(new Menu(2,"burger","not available"));

    }

    @Override
    public List<Menu> getMenu() {
        return items;
    }
}
