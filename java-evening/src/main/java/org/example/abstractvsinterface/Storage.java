package org.example.abstractvsinterface;

import java.util.List;

public abstract class Storage {
    int itemCount = -1;
    abstract void store(List<String> data);
    abstract List<String> retrieve();
    boolean isEmpty() {
        if (itemCount == -1) {
            itemCount = retrieve().size();
        }
        return itemCount == 0;
    }

    class LocalStorage extends Storage {

        @Override
        public void store(List<String> data) {

        }

        @Override
        public List<String> retrieve() {
            return null;
        }
    }

    class NetworkStorage extends Storage {

        @Override
        public void store(List<String> data) {

        }

        @Override
        public List<String> retrieve() {
            return null;
        }
    }

    class MemoryStorage extends Storage {

        @Override
        public void store(List<String> data) {

        }

        @Override
        public List<String> retrieve() {
            return null;
        }
    }
}
