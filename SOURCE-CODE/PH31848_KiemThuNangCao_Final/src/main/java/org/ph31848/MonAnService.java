package org.ph31848;

import java.util.ArrayList;
import java.util.List;

public class MonAnService {

    private List<MonAn> list = new ArrayList<>();

    public boolean delete(MonAn monAn) {
        boolean result = false;
        if (monAn == null) {
            throw new IllegalArgumentException();
        } else if (list == null) {
            throw new IllegalArgumentException();
        } else if (list.size() <= 0) {
            throw new IllegalArgumentException();
        } else if (monAn.getTrangThai() < 0 || monAn.getTrangThai() > 1) {
            throw new IllegalArgumentException();
        } else {
            result = list.remove(monAn);
        }
        return result;
    }

    public List<MonAn> getList() {
        return list;
    }
}
