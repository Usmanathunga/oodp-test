package org.com.filestore;

import java.util.ArrayList;
import java.util.List;

public class InMenoryNameStrore implements StroeName {
    private List<String> names = new ArrayList<>();//Liskov substitution

    @Override
    public void store(String name) {
        names.add(name);

    }

    @Override
    public List<String> getName() {
        return names;
    }
}
