package org.byteskript.matchstick;

import java.util.ArrayList;
import java.util.List;

public record Pattern(Element... elements) {
    
    public static Pattern of(Object... objects) {
        final List<Element> elements = new ArrayList<>(objects.length);
        for (Object object : objects) {
            if (object instanceof String string) elements.add(new LiteralElement(string));
            // todo class
            // todo optional
        }
        return new Pattern(elements.toArray(new Element[0]));
    }
    
}
