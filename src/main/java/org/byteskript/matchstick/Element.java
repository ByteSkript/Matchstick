package org.byteskript.matchstick;

public interface Element {
    
    boolean single();
    
    boolean matches(String input);
    
    boolean couldMatch(String input);
    
    enum Type {
        LITERAL, INPUT, OPTIONAL
    }
    
}
