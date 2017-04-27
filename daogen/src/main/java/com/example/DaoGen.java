package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class DaoGen
{
    public static void main(String[] args) throws Exception
    {
        Schema schema = new Schema(1, "com.example.greendao");
        addNote(schema);
        new DaoGenerator().generateAll(schema, "./app/src/main/java");
    }

    private static void addNote(Schema schema)
    {
        Entity note = schema.addEntity("DAO_Note");

        note.addIdProperty();
        note.addStringProperty("text").notNull();
        note.addStringProperty("comment");
        note.addDateProperty("date");
    }
}
