package com.monke.monkeybook.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.monke.monkeybook.bean.BookSourceBean;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK_SOURCE_BEAN".
*/
public class BookSourceBeanDao extends AbstractDao<BookSourceBean, String> {

    public static final String TABLENAME = "BOOK_SOURCE_BEAN";

    /**
     * Properties of entity BookSourceBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property BookSourceUrl = new Property(0, String.class, "bookSourceUrl", true, "BOOK_SOURCE_URL");
        public final static Property BookSourceName = new Property(1, String.class, "bookSourceName", false, "BOOK_SOURCE_NAME");
        public final static Property SerialNumber = new Property(2, int.class, "serialNumber", false, "SERIAL_NUMBER");
        public final static Property Enable = new Property(3, boolean.class, "enable", false, "ENABLE");
        public final static Property RuleBookName = new Property(4, String.class, "ruleBookName", false, "RULE_BOOK_NAME");
        public final static Property RuleBookAuthor = new Property(5, String.class, "ruleBookAuthor", false, "RULE_BOOK_AUTHOR");
        public final static Property RuleChapterUrl = new Property(6, String.class, "ruleChapterUrl", false, "RULE_CHAPTER_URL");
        public final static Property RuleCoverUrl = new Property(7, String.class, "ruleCoverUrl", false, "RULE_COVER_URL");
        public final static Property RuleIntroduce = new Property(8, String.class, "ruleIntroduce", false, "RULE_INTRODUCE");
        public final static Property RuleChapterList = new Property(9, String.class, "ruleChapterList", false, "RULE_CHAPTER_LIST");
        public final static Property RuleChapterName = new Property(10, String.class, "ruleChapterName", false, "RULE_CHAPTER_NAME");
        public final static Property RuleContentUrl = new Property(11, String.class, "ruleContentUrl", false, "RULE_CONTENT_URL");
        public final static Property RuleBookContent = new Property(12, String.class, "ruleBookContent", false, "RULE_BOOK_CONTENT");
        public final static Property RuleSearchUrl = new Property(13, String.class, "ruleSearchUrl", false, "RULE_SEARCH_URL");
        public final static Property RuleSearchList = new Property(14, String.class, "ruleSearchList", false, "RULE_SEARCH_LIST");
        public final static Property RuleSearchName = new Property(15, String.class, "ruleSearchName", false, "RULE_SEARCH_NAME");
        public final static Property RuleSearchAuthor = new Property(16, String.class, "ruleSearchAuthor", false, "RULE_SEARCH_AUTHOR");
        public final static Property RuleSearchKind = new Property(17, String.class, "ruleSearchKind", false, "RULE_SEARCH_KIND");
        public final static Property RuleSearchLastChapter = new Property(18, String.class, "ruleSearchLastChapter", false, "RULE_SEARCH_LAST_CHAPTER");
        public final static Property RuleSearchCoverUrl = new Property(19, String.class, "ruleSearchCoverUrl", false, "RULE_SEARCH_COVER_URL");
        public final static Property RuleSearchNoteUrl = new Property(20, String.class, "ruleSearchNoteUrl", false, "RULE_SEARCH_NOTE_URL");
    }


    public BookSourceBeanDao(DaoConfig config) {
        super(config);
    }
    
    public BookSourceBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK_SOURCE_BEAN\" (" + //
                "\"BOOK_SOURCE_URL\" TEXT PRIMARY KEY NOT NULL ," + // 0: bookSourceUrl
                "\"BOOK_SOURCE_NAME\" TEXT," + // 1: bookSourceName
                "\"SERIAL_NUMBER\" INTEGER NOT NULL ," + // 2: serialNumber
                "\"ENABLE\" INTEGER NOT NULL ," + // 3: enable
                "\"RULE_BOOK_NAME\" TEXT," + // 4: ruleBookName
                "\"RULE_BOOK_AUTHOR\" TEXT," + // 5: ruleBookAuthor
                "\"RULE_CHAPTER_URL\" TEXT," + // 6: ruleChapterUrl
                "\"RULE_COVER_URL\" TEXT," + // 7: ruleCoverUrl
                "\"RULE_INTRODUCE\" TEXT," + // 8: ruleIntroduce
                "\"RULE_CHAPTER_LIST\" TEXT," + // 9: ruleChapterList
                "\"RULE_CHAPTER_NAME\" TEXT," + // 10: ruleChapterName
                "\"RULE_CONTENT_URL\" TEXT," + // 11: ruleContentUrl
                "\"RULE_BOOK_CONTENT\" TEXT," + // 12: ruleBookContent
                "\"RULE_SEARCH_URL\" TEXT," + // 13: ruleSearchUrl
                "\"RULE_SEARCH_LIST\" TEXT," + // 14: ruleSearchList
                "\"RULE_SEARCH_NAME\" TEXT," + // 15: ruleSearchName
                "\"RULE_SEARCH_AUTHOR\" TEXT," + // 16: ruleSearchAuthor
                "\"RULE_SEARCH_KIND\" TEXT," + // 17: ruleSearchKind
                "\"RULE_SEARCH_LAST_CHAPTER\" TEXT," + // 18: ruleSearchLastChapter
                "\"RULE_SEARCH_COVER_URL\" TEXT," + // 19: ruleSearchCoverUrl
                "\"RULE_SEARCH_NOTE_URL\" TEXT);"); // 20: ruleSearchNoteUrl
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK_SOURCE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookSourceBean entity) {
        stmt.clearBindings();
 
        String bookSourceUrl = entity.getBookSourceUrl();
        if (bookSourceUrl != null) {
            stmt.bindString(1, bookSourceUrl);
        }
 
        String bookSourceName = entity.getBookSourceName();
        if (bookSourceName != null) {
            stmt.bindString(2, bookSourceName);
        }
        stmt.bindLong(3, entity.getSerialNumber());
        stmt.bindLong(4, entity.getEnable() ? 1L: 0L);
 
        String ruleBookName = entity.getRuleBookName();
        if (ruleBookName != null) {
            stmt.bindString(5, ruleBookName);
        }
 
        String ruleBookAuthor = entity.getRuleBookAuthor();
        if (ruleBookAuthor != null) {
            stmt.bindString(6, ruleBookAuthor);
        }
 
        String ruleChapterUrl = entity.getRuleChapterUrl();
        if (ruleChapterUrl != null) {
            stmt.bindString(7, ruleChapterUrl);
        }
 
        String ruleCoverUrl = entity.getRuleCoverUrl();
        if (ruleCoverUrl != null) {
            stmt.bindString(8, ruleCoverUrl);
        }
 
        String ruleIntroduce = entity.getRuleIntroduce();
        if (ruleIntroduce != null) {
            stmt.bindString(9, ruleIntroduce);
        }
 
        String ruleChapterList = entity.getRuleChapterList();
        if (ruleChapterList != null) {
            stmt.bindString(10, ruleChapterList);
        }
 
        String ruleChapterName = entity.getRuleChapterName();
        if (ruleChapterName != null) {
            stmt.bindString(11, ruleChapterName);
        }
 
        String ruleContentUrl = entity.getRuleContentUrl();
        if (ruleContentUrl != null) {
            stmt.bindString(12, ruleContentUrl);
        }
 
        String ruleBookContent = entity.getRuleBookContent();
        if (ruleBookContent != null) {
            stmt.bindString(13, ruleBookContent);
        }
 
        String ruleSearchUrl = entity.getRuleSearchUrl();
        if (ruleSearchUrl != null) {
            stmt.bindString(14, ruleSearchUrl);
        }
 
        String ruleSearchList = entity.getRuleSearchList();
        if (ruleSearchList != null) {
            stmt.bindString(15, ruleSearchList);
        }
 
        String ruleSearchName = entity.getRuleSearchName();
        if (ruleSearchName != null) {
            stmt.bindString(16, ruleSearchName);
        }
 
        String ruleSearchAuthor = entity.getRuleSearchAuthor();
        if (ruleSearchAuthor != null) {
            stmt.bindString(17, ruleSearchAuthor);
        }
 
        String ruleSearchKind = entity.getRuleSearchKind();
        if (ruleSearchKind != null) {
            stmt.bindString(18, ruleSearchKind);
        }
 
        String ruleSearchLastChapter = entity.getRuleSearchLastChapter();
        if (ruleSearchLastChapter != null) {
            stmt.bindString(19, ruleSearchLastChapter);
        }
 
        String ruleSearchCoverUrl = entity.getRuleSearchCoverUrl();
        if (ruleSearchCoverUrl != null) {
            stmt.bindString(20, ruleSearchCoverUrl);
        }
 
        String ruleSearchNoteUrl = entity.getRuleSearchNoteUrl();
        if (ruleSearchNoteUrl != null) {
            stmt.bindString(21, ruleSearchNoteUrl);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookSourceBean entity) {
        stmt.clearBindings();
 
        String bookSourceUrl = entity.getBookSourceUrl();
        if (bookSourceUrl != null) {
            stmt.bindString(1, bookSourceUrl);
        }
 
        String bookSourceName = entity.getBookSourceName();
        if (bookSourceName != null) {
            stmt.bindString(2, bookSourceName);
        }
        stmt.bindLong(3, entity.getSerialNumber());
        stmt.bindLong(4, entity.getEnable() ? 1L: 0L);
 
        String ruleBookName = entity.getRuleBookName();
        if (ruleBookName != null) {
            stmt.bindString(5, ruleBookName);
        }
 
        String ruleBookAuthor = entity.getRuleBookAuthor();
        if (ruleBookAuthor != null) {
            stmt.bindString(6, ruleBookAuthor);
        }
 
        String ruleChapterUrl = entity.getRuleChapterUrl();
        if (ruleChapterUrl != null) {
            stmt.bindString(7, ruleChapterUrl);
        }
 
        String ruleCoverUrl = entity.getRuleCoverUrl();
        if (ruleCoverUrl != null) {
            stmt.bindString(8, ruleCoverUrl);
        }
 
        String ruleIntroduce = entity.getRuleIntroduce();
        if (ruleIntroduce != null) {
            stmt.bindString(9, ruleIntroduce);
        }
 
        String ruleChapterList = entity.getRuleChapterList();
        if (ruleChapterList != null) {
            stmt.bindString(10, ruleChapterList);
        }
 
        String ruleChapterName = entity.getRuleChapterName();
        if (ruleChapterName != null) {
            stmt.bindString(11, ruleChapterName);
        }
 
        String ruleContentUrl = entity.getRuleContentUrl();
        if (ruleContentUrl != null) {
            stmt.bindString(12, ruleContentUrl);
        }
 
        String ruleBookContent = entity.getRuleBookContent();
        if (ruleBookContent != null) {
            stmt.bindString(13, ruleBookContent);
        }
 
        String ruleSearchUrl = entity.getRuleSearchUrl();
        if (ruleSearchUrl != null) {
            stmt.bindString(14, ruleSearchUrl);
        }
 
        String ruleSearchList = entity.getRuleSearchList();
        if (ruleSearchList != null) {
            stmt.bindString(15, ruleSearchList);
        }
 
        String ruleSearchName = entity.getRuleSearchName();
        if (ruleSearchName != null) {
            stmt.bindString(16, ruleSearchName);
        }
 
        String ruleSearchAuthor = entity.getRuleSearchAuthor();
        if (ruleSearchAuthor != null) {
            stmt.bindString(17, ruleSearchAuthor);
        }
 
        String ruleSearchKind = entity.getRuleSearchKind();
        if (ruleSearchKind != null) {
            stmt.bindString(18, ruleSearchKind);
        }
 
        String ruleSearchLastChapter = entity.getRuleSearchLastChapter();
        if (ruleSearchLastChapter != null) {
            stmt.bindString(19, ruleSearchLastChapter);
        }
 
        String ruleSearchCoverUrl = entity.getRuleSearchCoverUrl();
        if (ruleSearchCoverUrl != null) {
            stmt.bindString(20, ruleSearchCoverUrl);
        }
 
        String ruleSearchNoteUrl = entity.getRuleSearchNoteUrl();
        if (ruleSearchNoteUrl != null) {
            stmt.bindString(21, ruleSearchNoteUrl);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public BookSourceBean readEntity(Cursor cursor, int offset) {
        BookSourceBean entity = new BookSourceBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // bookSourceUrl
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bookSourceName
            cursor.getInt(offset + 2), // serialNumber
            cursor.getShort(offset + 3) != 0, // enable
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ruleBookName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ruleBookAuthor
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // ruleChapterUrl
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // ruleCoverUrl
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // ruleIntroduce
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // ruleChapterList
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ruleChapterName
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // ruleContentUrl
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // ruleBookContent
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // ruleSearchUrl
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // ruleSearchList
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // ruleSearchName
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // ruleSearchAuthor
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // ruleSearchKind
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // ruleSearchLastChapter
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // ruleSearchCoverUrl
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20) // ruleSearchNoteUrl
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookSourceBean entity, int offset) {
        entity.setBookSourceUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBookSourceName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSerialNumber(cursor.getInt(offset + 2));
        entity.setEnable(cursor.getShort(offset + 3) != 0);
        entity.setRuleBookName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setRuleBookAuthor(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setRuleChapterUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRuleCoverUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRuleIntroduce(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setRuleChapterList(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setRuleChapterName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRuleContentUrl(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setRuleBookContent(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setRuleSearchUrl(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setRuleSearchList(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setRuleSearchName(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setRuleSearchAuthor(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setRuleSearchKind(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setRuleSearchLastChapter(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setRuleSearchCoverUrl(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setRuleSearchNoteUrl(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
     }
    
    @Override
    protected final String updateKeyAfterInsert(BookSourceBean entity, long rowId) {
        return entity.getBookSourceUrl();
    }
    
    @Override
    public String getKey(BookSourceBean entity) {
        if(entity != null) {
            return entity.getBookSourceUrl();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookSourceBean entity) {
        return entity.getBookSourceUrl() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
