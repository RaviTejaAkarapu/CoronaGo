package com.example.coronago.dummydata;

import java.util.ArrayList;
import java.util.List;

public class DummyDataProvider {

    public static List<DummyModel> prepareDummyModelData() {
        List<DummyModel> coronaCaseList = new ArrayList<>();
        coronaCaseList.add(new DummyModel("Laddakh", "10", "2015"));
        coronaCaseList.add(new DummyModel("Jammu & Kashmir", "10", "2015"));
        coronaCaseList.add(new DummyModel("Himanchal Pradesh", "29", "2015"));
        coronaCaseList.add(new DummyModel("Panjab", "200", "2015"));
        coronaCaseList.add(new DummyModel("Haryana", "30", "2015"));
        coronaCaseList.add(new DummyModel("Uttrakhand", "20", "2015"));
        coronaCaseList.add(new DummyModel("Uttar Pradesh", "34", "2009"));
        coronaCaseList.add(new DummyModel("Rajasthan", "983", "2009"));
        coronaCaseList.add(new DummyModel("Gujrat", "3434", "2014"));
        coronaCaseList.add(new DummyModel("Madhya Pradesh", "3434", "2008"));
        coronaCaseList.add(new DummyModel("Delhi", "23", "1986"));
        coronaCaseList.add(new DummyModel("Bihar", "434", "2000"));
        coronaCaseList.add(new DummyModel("West Bengal", "8787", "1985"));
        coronaCaseList.add(new DummyModel("Sikkim", "4334", "1981"));
        coronaCaseList.add(new DummyModel("Assam", "343", "1965"));
        coronaCaseList.add(new DummyModel("Arunanchal Pradesh", "34", "2014"));
        coronaCaseList.add(new DummyModel("Mijoram", "343", "1965"));
        coronaCaseList.add(new DummyModel("Nagaland", "343", "1965"));
        coronaCaseList.add(new DummyModel("Manipur", "343", "1965"));
        coronaCaseList.add(new DummyModel("Udissa", "343", "1965"));
        coronaCaseList.add(new DummyModel("Telangna", "343", "1965"));
        coronaCaseList.add(new DummyModel("Andhra Pradesh", "343", "1965"));
        coronaCaseList.add(new DummyModel("Maharastra", "343", "1965"));


        return coronaCaseList;
    }
}
