package org.sufficientlysecure.keychain.securitytoken;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import android.util.Pair;


public class NfcSweetspotData {
    public static final Map<String, Pair<Double,Double>> SWEETSPOT_DATA;
    static {
        Map<String, Pair<Double,Double>> data = new HashMap<>();

        // Values scraped from NFC-Ring Sweetspot API, taking the median of these points for all models
        data.put("7DTB37", new Pair<>(0.5, 0.410094637224));
        data.put("306SH", new Pair<>(0.502777777778, 0.541446208113));
        data.put("402ZT", new Pair<>(0.375, 0.496323529412));
        data.put("710C", new Pair<>(0.438888888889, 0.363315696649));
        data.put("5027B", new Pair<>(0.475, 0.468864468864));
        data.put("5042T", new Pair<>(0.508333333333, 0.544715447154));
        data.put("5051X", new Pair<>(0.497222222222, 0.517857142857));
        data.put("5054S", new Pair<>(0.708333333333, 0.658536585366));
        data.put("5054W", new Pair<>(0.469444444444, 0.505691056911));
        data.put("5056N", new Pair<>(0.480555555556, 0.477272727273));
        data.put("5056W", new Pair<>(0.613888888889, 0.652597402597));
        data.put("5065D", new Pair<>(0.468144044321, 0.531604538088));
        data.put("5065N", new Pair<>(0.559556786704, 0.544570502431));
        data.put("6039A", new Pair<>(0.547222222222, 0.57848324515));
        data.put("6039J", new Pair<>(0.227777777778, 0.742504409171));
        data.put("6039Y", new Pair<>(0.336111111111, 0.679012345679));
        data.put("6044D", new Pair<>(0.6, 0.550264550265));
        data.put("6055B", new Pair<>(0.266666666667, 0.220070422535));
        data.put("6055K", new Pair<>(0.519444444444, 0.375));
        data.put("6055P", new Pair<>(0.525, 0.707746478873));
        data.put("7040N", new Pair<>(0.419444444444, 0.461788617886));
        data.put("7040T", new Pair<>(0.413888888889, 0.440650406504));
        data.put("7045Y", new Pair<>(0.808333333333, 0.49756097561));
        data.put("8030Y", new Pair<>(0.713888888889, 0.645528455285));
        data.put("8050D", new Pair<>(0.525, 0.282926829268));
        data.put("9001D", new Pair<>(0.452777777778, 0.512987012987));
        data.put("9001X", new Pair<>(0.522222222222, 0.516233766234));
        data.put("9020A", new Pair<>(0.903494176373, 0.688413948256));
        data.put("A1", new Pair<>(0.416666666667, 0.39837398374));
        data.put("A1-713", new Pair<>(0.813333333333, 0.106203995794));
        data.put("A1-734", new Pair<>(0.724584103512, 0.594382022472));
        data.put("A1P", new Pair<>(0.638888888889, 0.241883116883));
        data.put("A2", new Pair<>(0.384375, 0.592519685039));
        data.put("A3-A20", new Pair<>(0.45375, 0.12676056338));
        data.put("A3-A30", new Pair<>(0.17625, 0.135874067937));
        data.put("A5", new Pair<>(0.208333333333, 0.24025974026));
        data.put("A6", new Pair<>(0.702777777778, 0.460162601626));
        data.put("A7", new Pair<>(0.705555555556, 0.632520325203));
        data.put("A11w", new Pair<>(0.49375, 0.126838235294));
        data.put("A33f", new Pair<>(0.716666666667, 0.525203252033));
        data.put("A37f", new Pair<>(0.469444444444, 0.594855305466));
        data.put("a4", new Pair<>(0.45, 0.297244094488));
        data.put("A464BG", new Pair<>(0.365625, 0.452747252747));
        data.put("A466BG", new Pair<>(0.46875, 0.492156862745));
        data.put("A521L", new Pair<>(0.515625, 0.523622047244));
        data.put("A621BL", new Pair<>(0.45, 0.549593495935));
        data.put("A1601", new Pair<>(0.494444444444, 0.516077170418));
        data.put("Alcatel_4060A", new Pair<>(0.65625, 0.522058823529));
        data.put("Alcatel_5054O", new Pair<>(0.511111111111, 0.422764227642));
        data.put("Alcatel_5056O", new Pair<>(0.447222222222, 0.452032520325));
        data.put("Alcatel_5098O", new Pair<>(0.466666666667, 0.608766233766));
        data.put("Alcatel_6055U", new Pair<>(0.480555555556, 0.505281690141));
        data.put("Alcatel_7049D", new Pair<>(0.463888888889, 0.564227642276));
        data.put("ALCATEL ONE TOUCH 5036A", new Pair<>(0.285416666667, 0.810049019608));
        data.put("ALCATEL ONE TOUCH 7041D", new Pair<>(0.414583333333, 0.47181372549));
        data.put("ALCATEL ONE TOUCH 7047D", new Pair<>(0.333333333333, 0.416485900217));
        data.put("ALCATEL ONETOUCH P310A", new Pair<>(0.555, 0.574132492114));
        data.put("AP54", new Pair<>(0.571875, 0.560661764706));
        data.put("Aquaris E4", new Pair<>(0.45625, 0.505905511811));
        data.put("Aquaris E6", new Pair<>(0.297222222222, 0.617886178862));
        data.put("Aquaris M5", new Pair<>(0.469444444444, 0.49512987013));
        data.put("Aquaris M5.5", new Pair<>(0.452777777778, 0.491883116883));
        data.put("Aquaris U", new Pair<>(0.216666666667, 0.503246753247));
        data.put("Aquaris X", new Pair<>(0.3625, 0.603669724771));
        data.put("Aquaris X5 Plus", new Pair<>(0.561111111111, 0.258802816901));
        data.put("Archos 50c Platinum", new Pair<>(0.660194174757, 0.4243281471));
        data.put("Bay", new Pair<>(0.647222222222, 0.894308943089));
        data.put("Blade L2 Plus", new Pair<>(0.6875, 0.443014705882));
        data.put("Blade S6", new Pair<>(0.441666666667, 0.242276422764));
        data.put("Blade V6", new Pair<>(0.463888888889, 0.482926829268));
        data.put("BV6000", new Pair<>(0.447222222222, 0.568181818182));
        data.put("BV7000", new Pair<>(0.8, 0.714285714286));
        data.put("C1", new Pair<>(0.658333333333, 0.522727272727));
        data.put("C1+", new Pair<>(0.658333333333, 0.522727272727));
        data.put("C103", new Pair<>(0.543689320388, 0.58615819209));
        data.put("CHC-U23", new Pair<>(0.488888888889, 0.452032520325));
        data.put("Che1-CL10", new Pair<>(0.438888888889, 0.473170731707));
        data.put("Che1-L04", new Pair<>(0.419444444444, 0.536585365854));
        data.put("Che2-L11", new Pair<>(0.194444444444, 0.112195121951));
        data.put("CHM-U01", new Pair<>(0.65, 0.126829268293));
        data.put("Classic", new Pair<>(0.48375, 0.46057571965));
        data.put("CPH1609", new Pair<>(0.536111111111, 0.487138263666));
        data.put("CPH1701", new Pair<>(0.472222222222, 0.435691318328));
        data.put("Cynus T6", new Pair<>(0.552777777778, 0.0682926829268));
        data.put("DARKSIDE", new Pair<>(0.552777777778, 0.442276422764));
        data.put("Discovery II Mini", new Pair<>(0.55, 0.431985294118));
        data.put("DROID RAZR M", new Pair<>(0.608333333333, 0.42328042328));
        data.put("E500", new Pair<>(0.641666666667, 0.549868766404));
        data.put("e6_plus", new Pair<>(0.530555555556, 0.671544715447));
        data.put("Easy", new Pair<>(0.484375, 0.103296703297));
        data.put("ELUGA Turbo", new Pair<>(0.480555555556, 0.554471544715));
        data.put("Energy X 2", new Pair<>(0.266666666667, 0.115447154472));
        data.put("F1f", new Pair<>(0.544444444444, 0.520325203252));
        data.put("F5", new Pair<>(0.419444444444, 0.59512195122));
        data.put("F5_15", new Pair<>(0.108333333333, 0.139837398374));
        data.put("FEVER", new Pair<>(0.488888888889, 0.551056338028));
        data.put("Fire", new Pair<>(0.341666666667, 0.0926829268293));
        data.put("FRD-L02", new Pair<>(0.638888888889, 0.567944250871));
        data.put("FS451", new Pair<>(0.546875, 0.573529411765));
        data.put("G7-L01", new Pair<>(0.458333333333, 0.440917107584));
        data.put("G620S-L01", new Pair<>(0.458333333333, 0.432520325203));
        data.put("G620S-L03", new Pair<>(0.316666666667, 0.40162601626));
        data.put("G630-U10", new Pair<>(0.522222222222, 0.307317073171));
        data.put("G630-U20", new Pair<>(0.477777777778, 0.160975609756));
        data.put("G735-L03", new Pair<>(0.413888888889, 0.606504065041));
        data.put("G735-L12", new Pair<>(0.605555555556, 0.0829268292683));
        data.put("Galaxy Nexus", new Pair<>(0.230555555556, 0.485915492958));
        data.put("GETAWAY", new Pair<>(0.558333333333, 0.157723577236));
        data.put("H30-L02", new Pair<>(0.288888888889, 0.50406504065));
        data.put("H60-L04", new Pair<>(0.455555555556, 0.726631393298));
        data.put("H60-L12", new Pair<>(0.825, 0.580487804878));
        data.put("HIGHWAY PURE", new Pair<>(0.433333333333, 0.52733686067));
        data.put("HM-N501-FL", new Pair<>(0.458333333333, 0.565853658537));
        data.put("HM NOTE 1W", new Pair<>(0.497222222222, 0.231707317073));
        data.put("HTC Desire 610", new Pair<>(0.490625, 0.534274193548));
        data.put("HTC Desire 628 dual sim", new Pair<>(0.772222222222, 0.559082892416));
        data.put("HTC One", new Pair<>(0.458333333333, 0.232520325203));
        data.put("HTC One mini", new Pair<>(0.802777777778, 0.182113821138));
        data.put("HTC U11", new Pair<>(0.663888888889, 0.126623376623));
        data.put("HTV31", new Pair<>(0.391666666667, 0.543209876543));
        data.put("Hudl 2", new Pair<>(0.888333333333, 0.942502818489));
        data.put("I216X", new Pair<>(0.481481481481, 0.54114994363));
        data.put("Ilium X510", new Pair<>(0.765625, 0.492673992674));
        data.put("IM-100K", new Pair<>(0.430555555556, 0.595238095238));
        data.put("IM-100S", new Pair<>(0.688888888889, 0.836734693878));
        data.put("IM-A870K", new Pair<>(0.577777777778, 0.550264550265));
        data.put("IM-A880S", new Pair<>(0.547222222222, 0.572357723577));
        data.put("IM-A910L", new Pair<>(0.563888888889, 0.565853658537));
        data.put("IM-A910S", new Pair<>(0.430555555556, 0.681300813008));
        data.put("IQ4514 Quad", new Pair<>(0.394444444444, 0.123577235772));
        data.put("JAZZ", new Pair<>(0.455555555556, 0.670689655172));
        data.put("JERRY", new Pair<>(0.5, 0.485347985348));
        data.put("K88", new Pair<>(0.858569051581, 0.208988764045));
        data.put("Kurio7S", new Pair<>(0.758333333333, 0.542586750789));
        data.put("L-EMENT 505", new Pair<>(0.5125, 0.624542124542));
        data.put("L-EMENT551", new Pair<>(0.558333333333, 0.0113821138211));
        data.put("LENNY", new Pair<>(0.55625, 0.801470588235));
        data.put("LENNY2", new Pair<>(0.4375, 0.522058823529));
        data.put("LENNY3", new Pair<>(0.513888888889, 0.574675324675));
        data.put("Le X507", new Pair<>(0.427480916031, 0.0941558441558));
        data.put("Le X509", new Pair<>(0.582697201018, 0.0207407407407));
        data.put("L-ITE 506 HD", new Pair<>(0.483333333333, 0.592532467532));
        data.put("LS-5002", new Pair<>(0.469444444444, 0.52557319224));
        data.put("LS-5018", new Pair<>(0.686111111111, 0.634146341463));
        data.put("M3s", new Pair<>(0.425, 0.417886178862));
        data.put("M4 SS4453", new Pair<>(0.725, 0.237676056338));
        data.put("M5", new Pair<>(0.694444444444, 0.482142857143));
        data.put("M5 Plus", new Pair<>(0.475, 0.489430894309));
        data.put("M8", new Pair<>(0.45, 0.39674796748));
        data.put("M9", new Pair<>(0.5, 0.947967479675));
        data.put("M370i", new Pair<>(0.672222222222, 0.579225352113));
        data.put("Maya", new Pair<>(0.588888888889, 0.551948051948));
        data.put("M bot 60", new Pair<>(0.583333333333, 0.600649350649));
        data.put("MI 3W", new Pair<>(0.488888888889, 0.595161290323));
        data.put("Mi 4i", new Pair<>(0.366666666667, 0.411290322581));
        data.put("MI 4LTE", new Pair<>(0.205555555556, 0.353225806452));
        data.put("MI 5s Plus", new Pair<>(0.496183206107, 0.456553755523));
        data.put("MI MAX", new Pair<>(0.519083969466, 0.353460972018));
        data.put("MI MAX 2", new Pair<>(0.549618320611, 0.0913107511046));
        data.put("MI NOTE LTE", new Pair<>(0.58524173028, 0.546391752577));
        data.put("MI PAD", new Pair<>(0.47265625, 0.449449449449));
        data.put("MIX", new Pair<>(0.435114503817, 0.338733431517));
        data.put("Moto C", new Pair<>(0.590625, 0.457875457875));
        data.put("MS60", new Pair<>(0.738888888889, 0.39512195122));
        data.put("MW6617", new Pair<>(0.283251231527, 0.895265423242));
        data.put("N1", new Pair<>(0.465740740741, 0.372357723577));
        data.put("N2", new Pair<>(0.575, 0.71568627451));
        data.put("N817", new Pair<>(0.38125, 0.620078740157));
        data.put("N9100", new Pair<>(0.488888888889, 0.580487804878));
        data.put("N9132", new Pair<>(0.609375, 0.306985294118));
        data.put("N9510", new Pair<>(0.469444444444, 0.492682926829));
        data.put("N9515", new Pair<>(0.725, 0.0910569105691));
        data.put("N9518", new Pair<>(0.641666666667, 0.458536585366));
        data.put("N9520", new Pair<>(0.0194444444444, 0.463414634146));
        data.put("N9521", new Pair<>(0.441666666667, 0.217886178862));
        data.put("Nexus 4", new Pair<>(0.502604166667, 0.52733686067));
        data.put("Nexus 5", new Pair<>(0.444444444444, 0.506172839506));
        data.put("Nexus 5X", new Pair<>(0.211165048544, 0.159090909091));
        data.put("Nexus 6", new Pair<>(0.495145631068, 0.585735963581));
        data.put("Nexus 6P", new Pair<>(0.179611650485, 0.0409090909091));
        data.put("Nexus 7 (2013)", new Pair<>(0.35269121813, 0.384688090737));
        data.put("Nexus 9", new Pair<>(0.463541666667, 0.11974789916));
        data.put("Nexus 10", new Pair<>(0.95875, 0.544324772162));
        data.put("NX404H", new Pair<>(0.819444444444, 0.383739837398));
        data.put("NX505J", new Pair<>(0.541666666667, 0.234185733513));
        data.put("NX511J", new Pair<>(0.755555555556, 0.819512195122));
        data.put("NX512J", new Pair<>(0.602777777778, 0.419512195122));
        data.put("NX513J", new Pair<>(0.608333333333, 0.639024390244));
        data.put("NXA8QC116", new Pair<>(0.77375, 0.488372093023));
        data.put("One", new Pair<>(0.477777777778, 0.0861788617886));
        data.put("One (M8)", new Pair<>(0.444444444444, 0.0864197530864));
        data.put("OWN_S4025", new Pair<>(0.47962962963, 0.522776572668));
        data.put("P2M", new Pair<>(0.696875, 0.314960629921));
        data.put("P5 mini", new Pair<>(0.478125, 0.441176470588));
        data.put("P5W", new Pair<>(0.547222222222, 0.554471544715));
        data.put("P6_Energy", new Pair<>(0.533333333333, 0.523577235772));
        data.put("P6 PRO", new Pair<>(0.527777777778, 0.0652557319224));
        data.put("P7", new Pair<>(0.155555555556, 0.627642276423));
        data.put("P7 Max", new Pair<>(0.536111111111, 0.402597402597));
        data.put("PE-TL10", new Pair<>(0.619444444444, 0.68430335097));
        data.put("PGN517", new Pair<>(0.394444444444, 0.530081300813));
        data.put("PGN605", new Pair<>(0.497222222222, 0.278048780488));
        data.put("Picasso", new Pair<>(0.480555555556, 0.469135802469));
        data.put("Pixel", new Pair<>(0.723300970874, 0.225757575758));
        data.put("Pixel XL", new Pair<>(0.46359223301, 0.159090909091));
        data.put("Power", new Pair<>(0.461111111111, 0.532467532468));
        data.put("PRO5043", new Pair<>(0.553125, 0.137867647059));
        data.put("PSP3527DUO", new Pair<>(0.476454293629, 0.46925566343));
        data.put("PSP3531DUO", new Pair<>(0.452777777778, 0.479020979021));
        data.put("PSP5506DUO", new Pair<>(0.566666666667, 0.49756097561));
        data.put("PSP5509DUO", new Pair<>(0.488888888889, 0.453658536585));
        data.put("PULP 4G", new Pair<>(0.794444444444, 0.63139329806));
        data.put("PULP FAB 4G", new Pair<>(0.433333333333, 0.553791887125));
        data.put("PURE XL", new Pair<>(0.477777777778, 0.447154471545));
        data.put("R1 HD", new Pair<>(0.344444444444, 0.383802816901));
        data.put("R7kf", new Pair<>(0.619444444444, 0.372357723577));
        data.put("R8006", new Pair<>(0.429166666667, 0.0626016260163));
        data.put("RAINBOW", new Pair<>(0.502777777778, 0.276422764228));
        data.put("RAINBOW JAM", new Pair<>(0.877777777778, 0.252204585538));
        data.put("RAINBOW LITE 4G", new Pair<>(0.453125, 0.472426470588));
        data.put("RAZR HD", new Pair<>(0.455555555556, 0.537918871252));
        data.put("RealPad MA7BX2", new Pair<>(0.432291666667, 0.46898002103));
        data.put("Redmi 3", new Pair<>(0.525, 0.551219512195));
        data.put("Redmi 3S", new Pair<>(0.427777777778, 0.480519480519));
        data.put("Redmi 4", new Pair<>(0.480555555556, 0.503225806452));
        data.put("Redmi 4A", new Pair<>(0.527777777778, 0.605519480519));
        data.put("Redmi Note 3", new Pair<>(0.491666666667, 0.451612903226));
        data.put("Redmi Note 4", new Pair<>(0.416666666667, 0.446774193548));
        data.put("Redmi Pro", new Pair<>(0.955555555556, 0.641935483871));
        data.put("RIDGE 4G", new Pair<>(0.488888888889, 0.529100529101));
        data.put("RIDGE FAB 4G", new Pair<>(0.433333333333, 0.537918871252));
        data.put("ROBBY", new Pair<>(0.455555555556, 0.489436619718));
        data.put("Robin", new Pair<>(0.302777777778, 0.575704225352));
        data.put("s4", new Pair<>(0.452777777778, 0.0780487804878));
        data.put("S6", new Pair<>(0.384375, 0.265625));
        data.put("S6s", new Pair<>(0.658333333333, 0.465909090909));
        data.put("S7", new Pair<>(0.541666666667, 0.510569105691));
        data.put("S30", new Pair<>(0.677777777778, 0.488636363636));
        data.put("S40", new Pair<>(0.486111111111, 0.258536585366));
        data.put("S50", new Pair<>(0.786111111111, 0.783068783069));
        data.put("S60", new Pair<>(0.405555555556, 0.522727272727));
        data.put("S550", new Pair<>(0.566666666667, 0.291056910569));
        data.put("Shaker-Slim", new Pair<>(0.5, 0.523897058824));
        data.put("Signature Touch", new Pair<>(0.563888888889, 0.514991181658));
        data.put("SMART 4G 5.5 Enterprise", new Pair<>(0.366666666667, 0.476422764228));
        data.put("STARADDICT 4", new Pair<>(0.713888888889, 0.112195121951));
        data.put("STUDIO M HD", new Pair<>(0.755555555556, 0.378861788618));
        data.put("SUNNY", new Pair<>(0.44375, 0.543137254902));
        data.put("SUNSET2", new Pair<>(0.621875, 0.51968503937));
        data.put("T1", new Pair<>(0.461111111111, 0.540492957746));
        data.put("T5", new Pair<>(0.9, 0.459415584416));
        data.put("T9", new Pair<>(0.407552083333, 0.565720294427));
        data.put("T11", new Pair<>(0.647222222222, 0.429268292683));
        data.put("T12", new Pair<>(0.563888888889, 0.0357723577236));
        data.put("TOMMY", new Pair<>(0.402777777778, 0.549295774648));
        data.put("Tornado 348", new Pair<>(0.441666666667, 0.834146341463));
        data.put("TREKKER-M1 CORE", new Pair<>(0.34375, 0.81684981685));
        data.put("U673C", new Pair<>(0.44375, 0.535294117647));
        data.put("U FEEL", new Pair<>(0.472222222222, 0.447183098592));
        data.put("U FEEL LITE", new Pair<>(0.605555555556, 0.338028169014));
        data.put("V3", new Pair<>(0.588888888889, 0.117886178862));
        data.put("V3+", new Pair<>(0.588888888889, 0.117886178862));
        data.put("V5", new Pair<>(0.45, 0.261788617886));
        data.put("V6", new Pair<>(0.479201331115, 0.759871931697));
        data.put("V9", new Pair<>(0.515625, 0.0625));
        data.put("V355", new Pair<>(0.588888888889, 0.730519480519));
        data.put("VF695", new Pair<>(0.3625, 0.23031496063));
        data.put("Vodafone 785", new Pair<>(0.545833333333, 0.45406824147));
        data.put("Vodafone Smart ultra 6", new Pair<>(0.447222222222, 0.460162601626));
        data.put("VSP355s", new Pair<>(0.352777777778, 0.567901234568));
        data.put("X1", new Pair<>(0.533333333333, 0.460162601626));
        data.put("X3", new Pair<>(0.59375, 0.511029411765));
        data.put("X5", new Pair<>(0.447222222222, 0.586991869919));
        data.put("X7", new Pair<>(0.425058548009, 0.643734643735));
        data.put("X9S", new Pair<>(0.397222222222, 0.0959349593496));
        data.put("X11", new Pair<>(0.444444444444, 0.530081300813));
        data.put("X12", new Pair<>(0.605555555556, 0.482926829268));
        data.put("X17", new Pair<>(0.506361323155, 0.440652818991));
        data.put("X600", new Pair<>(0.616666666667, 0.53064516129));
        data.put("X9006", new Pair<>(0.464814814815, 0.283468834688));
        data.put("X9009", new Pair<>(0.5, 0.488745980707));
        data.put("X9076", new Pair<>(0.486111111111, 0.572357723577));
        data.put("Xperia SP", new Pair<>(0.5, 0.786971830986));
        data.put("Xperia T", new Pair<>(0.680555555556, 0.613756613757));
        data.put("Xperia Z", new Pair<>(0.594444444444, 0.375));
        data.put("Xperia Z1", new Pair<>(0.583333333333, 0.155202821869));
        data.put("Xperia Z1 Compact", new Pair<>(0.486111111111, 0.195767195767));
        data.put("Xperia Z2", new Pair<>(0.425, 0.20811287478));
        data.put("Xperia Z3", new Pair<>(0.647222222222, 0.336860670194));
        data.put("Xperia Z3+", new Pair<>(0.647222222222, 0.336860670194));
        data.put("Xperia ZL", new Pair<>(0.469444444444, 0.573943661972));
        data.put("Y541-U02", new Pair<>(0.39375, 0.454044117647));
        data.put("Y635-L01", new Pair<>(0.490625, 0.505514705882));
        data.put("Y635-L03", new Pair<>(0.4375, 0.602941176471));
        data.put("Y635-L21", new Pair<>(0.41875, 0.354779411765));
        data.put("Z1", new Pair<>(0.6, 0.673170731707));
        data.put("Z3", new Pair<>(0.702777777778, 0.608465608466));
        data.put("Z9 Plus", new Pair<>(0.380555555556, 0.245528455285));
        data.put("Z10", new Pair<>(0.544270833333, 0.556218057922));
        data.put("Z667T", new Pair<>(0.4375, 0.479120879121));
        data.put("Z716BL", new Pair<>(0.50625, 0.594488188976));
        data.put("Z717VL", new Pair<>(0.671875, 0.405511811024));
        data.put("Z755", new Pair<>(0.603125, 0.564960629921));
        data.put("Z792", new Pair<>(0.353125, 0.516544117647));
        data.put("Z793C", new Pair<>(0.496875, 0.448529411765));
        data.put("Z812", new Pair<>(0.471875, 0.431985294118));
        data.put("Z813", new Pair<>(0.596875, 0.522058823529));
        data.put("Z818L", new Pair<>(0.528125, 0.485294117647));
        data.put("Z820", new Pair<>(0.425, 0.538602941176));
        data.put("Z828", new Pair<>(0.375, 0.261029411765));
        data.put("Z832", new Pair<>(0.4375, 0.604395604396));
        data.put("Z833", new Pair<>(0.51875, 0.64652014652));
        data.put("Z850", new Pair<>(0.494444444444, 0.608130081301));
        data.put("Z936L", new Pair<>(0.630555555556, 0.367479674797));
        data.put("Z956", new Pair<>(0.472222222222, 0.469155844156));
        data.put("Z958", new Pair<>(0.486111111111, 0.569105691057));
        data.put("Z959", new Pair<>(0.522222222222, 0.546341463415));
        data.put("Z963VL", new Pair<>(0.761111111111, 0.391869918699));
        data.put("Z970", new Pair<>(0.5, 0.531707317073));
        data.put("Z981", new Pair<>(0.497222222222, 0.469155844156));
        data.put("Z987", new Pair<>(0.472222222222, 0.453262786596));
        data.put("ZTE Blade L5", new Pair<>(0.590625, 0.369485294118));
        data.put("ZTE BLADE V0720", new Pair<>(0.458333333333, 0.487012987013));

        SWEETSPOT_DATA = Collections.unmodifiableMap(data);
    }
}