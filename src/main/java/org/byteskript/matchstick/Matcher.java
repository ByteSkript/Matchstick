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
        int start = 0, length = 1;
        for (Element element : pattern.elements()) {
            int check = element.match(input, start, length);
            if (check < 1) return false;
            length = (start = check) + 1;
        }
        return true;
    }
    
    private int indexOf(String string, int start) {
        final int index = string.indexOf(' ', start);
        if (index == -1) return string.length();
        return index;
    }
    
}
