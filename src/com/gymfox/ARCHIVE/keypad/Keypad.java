package com.gymfox.ARCHIVE.keypad;

//Var.1
public class Keypad {
    static String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};

    public static int presses(String phrase) {
        int nPresses = 0;

        for (char c : phrase.toUpperCase().toCharArray())
            for (String s : keys)
                nPresses += s.indexOf(c) + 1;
        return nPresses;
    }
}
//var.2
/*
public class Keypad {
    private Map<String, Key> keyMap;

    public Keypad() {
        this.keyMap = new HashMap<>();
        initKeys();
    }

    private void initKeys() {
        addKey(new Key("1"));
        addKey(new Key("ABC2"));
        addKey(new Key("DEF3"));
        addKey(new Key("GHI4"));
        addKey(new Key("JKL5"));
        addKey(new Key("MNO6"));
        addKey(new Key("PQRS7"));
        addKey(new Key("TUV8"));
        addKey(new Key("WXYZ9"));
        addKey(new Key("*"));
        addKey(new Key(" 0"));
        addKey(new Key("#"));
    }

    public static int presses(String phrase) {
        Keypad keypad = new Keypad();
        int tapCount = 0;

        for ( int i = 0; i < phrase.length(); i++ ) {
            String currentChar = phrase.substring(i, i + 1).toUpperCase();
            Key key = keypad.getKey(currentChar);

            if ( key != null ) {
                do {
                    tapCount += 1;
                } while ( !key.tap().equals(currentChar));
                    key.lockIn();
            }
        }

        return tapCount;
    }

    private void addKey(Key key) {
        for ( String s : key.getCharacters() ) {
            this.keyMap.put(s, key);
        }
    }

    private Key getKey(String character) {
        return keyMap.get(character);
    }
}

class Key {
    private final List<String> characters;
    private Iterator<String> charactersIt;

    public Key(String button) {
        characters = new ArrayList<>(button.length());
        for ( int i = 0; i < button.length(); i++ ) {
            characters.add(button.substring(i, i + 1));
        }
    }

    public String tap() {
        if ( charactersIt == null ) {
            charactersIt = characters.iterator();
        }
        return charactersIt.next();
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void lockIn() {
        charactersIt = null;
    }
}
*/