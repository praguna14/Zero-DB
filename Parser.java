package org.zero.db.parser;

import org.zero.db.parser.Statement.StatementType;

public class Parser {
    public static Statement parse(String command) {
        Statement statement = new Statement();
        if (command.toLowerCase().contains("select")) {
            statement.type = StatementType.SELECT;
        } else if (command.substring(0, 7).toLowerCase().contains("insert")) {
            statement.type = StatementType.INSERT;
        } else if (command.substring(0, 7).toLowerCase().contains("update")) {
            statement.type = StatementType.UPDATE;
        } else if (command.substring(0, 7).toLowerCase().contains("delete")) {
            statement.type = StatementType.DELETE;
        } else {
            statement.type = StatementType.NOT_RECOGNIZED;
        }
        return statement;
    }
}
