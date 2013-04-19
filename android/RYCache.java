package com.example.remotedownloadandcache;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.util.LruCache;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RYCache {
    private MemCache mMemCache;
    private FileCache mFileCache;
    
    private int MEM_CACHE_SIZE = 10 *1024 * 1024;   //10mb
    
    public RYCache(Context context) {
        mMemCache = new MemCache(MEM_CACHE_SIZE);
    }
    
    public void readTextCacheAsync(String key, CacheEventListener listener) {
        if (listener != null) {
            Object value = mMemCache.get(key);
            if (value != null) {
//                listener.onReadCachedObjectsFinished(value);
            } else {
                
            }
        }
    }
    
    public void readParcelableCacheAsync(String key, CacheEventListener listener) {
        if (listener != null) {
            
        }
    }
    
    public void writeTextToCacheAsync(String key, CharSequence text, CacheEventListener listener) {
        
    }
    
    public void writeParcelableToCacheAsync(String key, Parcelable parcelable, CacheEventListener listener) {
        
    }
    
    private void moveDataFromMemToFile(String key, Object data) {
        
    }
    
    private void moveDataFromFiletoMem(String key, Object data) {
        
    }
    
    public static interface CacheEventListener {
        
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
        
        private static int BUF_SIZE = 1024;
        
        private Context mContext;
        private File mCacheDir;
                
        public FileCache(Context context) {
            mContext = context;
            mCacheDir = context.getCacheDir();
        }
        
        public CharSequence getText(String key) {
            File file = new File(mCacheDir, key);
            CharSequence text = null;
//            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//                
//            }
            
            return text;
        }
        
        public void putText(String key, CharSequence text, int ttl) {
//            BufferedOutputStream bos = new BufferedOutputStream(mContext.openFileOutput(key, Context.MODE_PRIVATE), BUF_SIZE);
            
        }
    }
    
}
