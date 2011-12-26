/*
 * @author alex.tkachman
 */
package jet;

public abstract class ExtensionFunction10<E, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, R> extends DefaultJetObject {
    protected ExtensionFunction10(TypeInfo<?> typeInfo) {
        super(typeInfo);
    }

    public abstract R invoke(E receiver, D1 d1, D2 d2, D3 d3, D4 d4, D5 d5, D6 d6, D7 d7, D8 d8, D9 d9, D10 d10);

    @Override
    public String toString() {
      return "{E.(d1: D1, d2: D2, d3: D3, d4: D4, d5: D5, d6: D6, d7: D7, d8: D8, d9: D9, d10: D10) : R)}";
    }
}

