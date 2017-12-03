
package ohtu;

public enum Points {
    LOVE,
    FIFTEEN,
    THIRTY,
    FORTY,
    ADVANTAGE {
        @Override
        public Points next() {
            return null;
        };
    };
    
    public Points next() {
        return values()[ordinal() + 1];
    }
}
