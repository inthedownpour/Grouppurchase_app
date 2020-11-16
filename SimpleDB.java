package com.example.myapplication;

public class SimpleDB {
    private static Map<String, ArticleVO> db;

    public static void addArticle(String index, ArticleVO articleVO) {
        db.put(index, articleVO);
    }

    public static ArticleVO getArticle(String index) {
        return db.get(index);
    }

    public static List<String> getIndexes() {
        Iterator<String> keys = db.keySet().iterator();

        List<String> keyList = new ArrayList<String>();
        String key = "";
        while ( keys.hasNext() ) {
            key = keys.next();
            keyList.add(key);
        }

        return keyList;
    }
}
