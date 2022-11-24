package org.byteskript.matchstick;

public class Matcher {
    
    protected final Pattern pattern;
    
    public Matcher(Pattern pattern) {
        this.pattern = pattern;
    }
    
    public Pattern getPattern() {
        return pattern;
    }
}
