package org.zero.db.parser;

public class Statement {
    public enum StatementType {
        SELECT, INSERT, UPDATE, DELETE, NOT_RECOGNIZED;
    }
    public StatementType type;
}
