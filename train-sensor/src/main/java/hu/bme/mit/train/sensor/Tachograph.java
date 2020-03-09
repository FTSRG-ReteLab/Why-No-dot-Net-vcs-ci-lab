package hu.bme.mit.train.sensor;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class Tachograph {
    public Table<String, Integer, Integer> table = HashBasedTable.create();

    public Tachograph() {
        table.put("14:12", 10, 12);
    }
}