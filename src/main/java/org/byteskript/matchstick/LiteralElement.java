package org.byteskript.matchstick;

public record LiteralElement(String value) implements Element {
    
    @Override
    public boolean single() {
        return value.indexOf(' ') > -1;
    }
    
    @Override
    public boolean matches(String input) {
        return value.equals(input);
    }
    
    @Override
    public boolean couldMatch(String input) {
        return value.startsWith(input);
    }
    
}
