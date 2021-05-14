package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryFlyweight {

    static Map<TipModel3D, InterfataFlyweightModel3D> modele3D =
            new HashMap<>();

    // eager instantiaiton
//    static {
//        getModel(TipModel3D.COPAC);
//        getModel(TipModel3D.SOLDAT);
//        getModel(TipModel3D.STANCA);
//    }

    public static InterfataFlyweightModel3D getModel(TipModel3D tip) {
        // lazy instantiation
        InterfataFlyweightModel3D model3D = modele3D.get(tip);
        if (model3D == null) {
            switch (tip) {
                case COPAC:
                    model3D = new FlyweightModel3D("fisier_copac", "copac");
                    break;
                case SOLDAT:
                    model3D = new FlyweightModel3D("fisier_soldat", "soldat");
                    break;
                case STANCA:
                    model3D = new FlyweightModel3D("fisier_stanca", "stanca");
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        // FT IMPORTANT !
        modele3D.put(tip, model3D);
        return model3D;
    }

}
