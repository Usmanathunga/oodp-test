package org.com.filestore;

import java.util.ArrayList;
import java.util.List;

public class CachedNameStore implements StroeName {

    private  StroeName cache;
    private final StroeName fileStore;
    private final boolean isFirstTimeRead = true;

    public CachedNameStore(StroeName fileStore) {
        //dependency injection - if our class is depending on an outside dependency it should not be instantiated
        //within our class should be injected via the constructor

        this.cache = cache;
        this.fileStore = fileStore;
    }

    @Override
    public void store(String name) {
        if(cache != null){
            cache.store(name);
        }
        fileStore.store(name);

    }

    @Override
    public List<String> getName() {

        if(cache == null){
            List<String> namesInFileStore = fileStore.getName();
            cache = new InMenoryNameStrore();
             for(String name:namesInFileStore){
                cache.store(name);
            }

        }

        return cache.getName();

    }
}
//x=[1,2,3,4,5,6]
//for(int i:x){
//    sout(i)
//        }