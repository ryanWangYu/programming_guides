package com.example.remotedownloadandcache;

import android.content.Context;
import android.support.v4.util.LruCache;

import java.io.File;

public class RYCache {
    private MemCache mMemCache;
    
    private int MEM_CACHE_SIZE = 10 *1024 * 1024;   //10mb
    
    public RYCache(Context context) {
        mMemCache = new MemCache(MEM_CACHE_SIZE);
    }
    
    public void readCacheAsync(String key, CacheEventListener listener) {
        if (listener != null) {
            Object value = mMemCache.get(key);
            if (value != null) {
                listener.onReadCachedObjectsFinished(value);
            } else {
                
            }
        }
    }
    
    public void writeObjectToCacheAsync(String key, Object value, CacheEventListener listener) {
        
    }
    
    public static interface CacheEventListener {
        
        public void onReadCachedObjectsFinished(Object obj);
        public void onReadCachedObjectsFailed();
        
        public void onWriteObjectToCacheFinished();
        public void onWriteObjectToCacheFailed();
    }
    
    /**
     * A simple class that implements {@link CacheEventListener} with empty implementation.
     * Classes that do not want to implement all the interface methods can inherit from this
     * class and override any methods they want.
     * 
     * @author Ryan WANG
     *
     */
    public static class SimpleCacheEventListener implements CacheEventListener {

        @Override
        public void onReadCachedObjectsFinished(Object obj) {            
        }

        @Override
        public void onReadCachedObjectsFailed() {            
        }

        @Override
        public void onWriteObjectToCacheFinished() {            
        }

        @Override
        public void onWriteObjectToCacheFailed() {            
        }
    }
    
    /**
     * Customized LruCache.
     * @author Ryan WANG
     *
     */
    private static class MemCache extends LruCache<String, Object> {

        public MemCache(int maxSize) {
            super(maxSize);
        }
    }
    
    /**
     * Works as the file cache.
     * @author Ryan WANG
     *
     */
    private static class FileCache {
        
        private File mCacheDir;
        
        private int FILE_CACHE_SIZE = 20 * 1024 * 1024; // 20m
        
        public FileCache(Context context) {
            mCacheDir = context.getCacheDir();
        }
    }
    
}
