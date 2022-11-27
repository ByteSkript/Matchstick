package org.byteskript.matchstick;

public interface Element {
    
    boolean single();
    
    boolean matches(String input);
    
    boolean couldMatch(String input);
    
    default int match(String input, int start, int length) {;
        String test = input.substring(start);
        while (this.couldMatch(test)) {
            if (this.matches(test)) return length;
            length++;
        }
        return -1;
    }
    
    enum Type {
        LITERAL, INPUT, OPTIONAL
    }
    
}
