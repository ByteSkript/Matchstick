package org.byteskript.matchstick;

import org.junit.Test;

public class PatternTest {
    
    @Test
    public void simple() {
        final Pattern pattern = Pattern.of("hello there");
        final Matcher matcher = new Matcher(pattern);
        assert matcher.match("hello there");
    }
    
}
