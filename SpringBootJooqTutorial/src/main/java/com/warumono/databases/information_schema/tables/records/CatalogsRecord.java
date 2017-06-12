/*
 * This file is generated by jOOQ.
*/
package com.warumono.databases.information_schema.tables.records;


import com.warumono.databases.information_schema.tables.Catalogs;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CatalogsRecord extends TableRecordImpl<CatalogsRecord> implements Record1<String> {

    private static final long serialVersionUID = 2042937458;

    /**
     * Setter for <code>INFORMATION_SCHEMA.CATALOGS.CATALOG_NAME</code>.
     */
    public void setCatalogName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CATALOGS.CATALOG_NAME</code>.
     */
    public String getCatalogName() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Catalogs.CATALOGS.CATALOG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCatalogName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CatalogsRecord value1(String value) {
        setCatalogName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CatalogsRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CatalogsRecord
     */
    public CatalogsRecord() {
        super(Catalogs.CATALOGS);
    }

    /**
     * Create a detached, initialised CatalogsRecord
     */
    public CatalogsRecord(String catalogName) {
        super(Catalogs.CATALOGS);

        set(0, catalogName);
    }
}
