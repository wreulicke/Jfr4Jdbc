package dev.jfr4jdbc;

import java.sql.Statement;

public class JfrStatement extends JfrStatement43 implements Statement {

    public JfrStatement(Statement s) {
        super(s);
    }

    public JfrStatement(Statement s, EventFactory factory) {
        super(s, factory);
    }
}
