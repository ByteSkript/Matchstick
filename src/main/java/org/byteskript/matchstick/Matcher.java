package org.byteskript.matchstick;

public class Matcher {
    
    protected final Pattern pattern;
    
    public Matcher(Pattern pattern) {
        this.pattern = pattern;
    }
    
    public Pattern getPattern() {
        return pattern;
    }
    
    public boolean match(String input) {
        int start = 0, index = this.indexOf(input, 0);
        for (Element element : pattern.elements()) {
            for (;;) {
                final String part = input.substring(start, index);
                if (element.matches(part)) break;
                else if (!element.couldMatch(part)) return false;
                if (index == input.length()) return false;
                index = this.indexOf(input, index);
            }
        }
        return true;
    }
    
    private int indexOf(String string, int start) {
        final int index = string.indexOf(' ', start);
        if (index == -1) return string.length();
        return index;
    }
    
}
