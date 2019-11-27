/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.mysql.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters extends TableImpl<Record> {

    private static final long serialVersionUID = -998621099;

    /**
     * The reference instance of <code>information_schema.PARAMETERS</code>
     */
    public static final Parameters PARAMETERS = new Parameters();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public static final TableField<Record, String> SPECIFIC_CATALOG = createField(DSL.name("SPECIFIC_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public static final TableField<Record, String> SPECIFIC_SCHEMA = createField(DSL.name("SPECIFIC_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public static final TableField<Record, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public static final TableField<Record, ULong> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_MODE</code>.
     */
    public static final TableField<Record, String> PARAMETER_MODE = createField(DSL.name("PARAMETER_MODE"), org.jooq.impl.SQLDataType.VARCHAR(5), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.PARAMETER_NAME</code>.
     */
    public static final TableField<Record, String> PARAMETER_NAME = createField(DSL.name("PARAMETER_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.DATA_TYPE</code>.
     */
    public static final TableField<Record, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), org.jooq.impl.SQLDataType.CLOB, PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public static final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), org.jooq.impl.SQLDataType.BIGINT, PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public static final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), org.jooq.impl.SQLDataType.BIGINT, PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public static final TableField<Record, UInteger> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED, PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public static final TableField<Record, Long> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), org.jooq.impl.SQLDataType.BIGINT, PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public static final TableField<Record, UInteger> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED, PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public static final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.COLLATION_NAME</code>.
     */
    public static final TableField<Record, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), org.jooq.impl.SQLDataType.VARCHAR(64), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public static final TableField<Record, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), org.jooq.impl.SQLDataType.CLOB.nullable(false), PARAMETERS, "");

    /**
     * The column <code>information_schema.PARAMETERS.ROUTINE_TYPE</code>.
     */
    public static final TableField<Record, String> ROUTINE_TYPE = createField(DSL.name("ROUTINE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(9).nullable(false), PARAMETERS, "");

    /**
     * No further instances allowed
     */
    private Parameters() {
        this(DSL.name("PARAMETERS"), null);
    }

    private Parameters(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Parameters(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Parameters(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PARAMETERS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
