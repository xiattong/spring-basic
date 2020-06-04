package com.xiattong.concurrency.threadlocal;

public class XtThreadLocal<T> {

    static class XtThreadLocalMap{

        private Entry entry;

        static class Entry{
            XtThreadLocal key;
            Object value;

            public Entry(XtThreadLocal<?> key,Object value){
                this.key = key;
                this.value = value;
            }
        }

        private void set(XtThreadLocal<?> key, Object value) {
            entry = new Entry(key,value);
        }

        private Entry getEntry() {
            return entry;
        }
    }

    public void set(XtThread thread,T value){
        // 拿到当前的 Thread,这里就用参数直接传
        // 拿到当前 Thread 的 ThreadLocalMap
        XtThreadLocalMap map = thread.threadLocalMap;
        map.set(this,value);
    }

    public T get(XtThread thread){
        // 拿到当前的 Thread,这里就用参数直接传
        // 拿到当前 Thread 的 ThreadLocalMap
        XtThreadLocalMap map = thread.threadLocalMap;
        return (T)map.getEntry().value;
    }
}
