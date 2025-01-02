/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vault;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author russe
 */
public class VaultCoordinates {
    // Map to store fault lines
    private static final Map<String, List<GeoPosition>> faultLines = new HashMap<>();

    static {
        // Initialize fault lines with multiple coordinates
        faultLines.put("Tanbulan", getTanbulanFaultCoordinates());
        faultLines.put("South Barira", getSouthBariraFaultCoordinates());
        faultLines.put("West Compostela", getWestCompostelaFaultCoordinates());
        faultLines.put("Short West Compostela", getShortWestCompostelaFaultCoordinates());
        faultLines.put("Surigao", getSurigaoFaultCoordinates());
        faultLines.put("Surigao Lower Part",getSurigaoLowerFaultCoordinates());
        faultLines.put("Surigao P2 Lower Part",getSurigaop2LowerFaultCoordinates());
        faultLines.put("Central Mindanao",getCentralMindanaoFaultCoordinates());
        faultLines.put("Short Central Mindanao",getShortCentralMindanaoFaultCoordinates());
        faultLines.put("West Central Mindanao",getWestCentralMindanaoFaultCoordinates());    
        faultLines.put("Esperanza",getEsperanzaFaultCoordinates());
        faultLines.put("De Oro Esperanza",getDeOroEsperanzaFaultCoordinates());
        faultLines.put("Esperanza",getSmallLeftEsperanzaFaultCoordinates());
        faultLines.put("Esperanza", getRighttEsperanzaFaultCoordinates());
        faultLines.put("Daguma",getDagumaFaultCoordinates());
        faultLines.put("Koronodal", getKoronadalFaultCoordinates());
        faultLines.put("Agusan Marsh", getAgusanMarshFaultCoordinates());
        faultLines.put("Lianga", getLiangaFaultCoordinates());
        faultLines.put("Lianga Left", getLefttLiangaFaultCoordinates());
        faultLines.put("Lianga", getRighttLiangaFaultCoordinates());
        faultLines.put("Mati",getMatiFaultCoordinates());
        faultLines.put("Caraga River",getCaragaRiverFaultCoordinates());
        faultLines.put("Zamboanga", getZamboangaFaultCoordinates());
        faultLines.put("Kabasalan", getKabasalanFaultCoordinates());
        faultLines.put("Western", getWesternFaultCoordinates());
        faultLines.put("Tangbulan", getTangbulanFaultCoordinates());
        faultLines.put("Talakag", getTalakagFaultCoordinates());
        faultLines.put("Lanao", getLanaoFaultCoordinates());
        faultLines.put("Kalilangan", getKalilanganFaultCoordinates());
        faultLines.put("Bunbaran", getBunbaranFaultCoordinates());
        faultLines.put("Central Davao", getCentralDavaoFaultCoordinates());
        faultLines.put("South Bukidnon", getSouthBukidnonFaultCoordinates());
        faultLines.put("Tagoloan River", getTagoloanRiverFaultCoordinates());
        faultLines.put("West Ilocos", getWestIlocosFaultCoordinates());
        faultLines.put("Infanta",getInfantaFaultCoordinates());
        faultLines.put("Ambuklao",getAmbuklaoFaultCoordinates());
        faultLines.put("San Manuel",getSanManuelFaultCoordinates());
        faultLines.put("Casiguran",getCasiguranFaultCoordinates());
        faultLines.put("West Valley",getWestValleyFaultCoordinates());
        faultLines.put("Divilican", getDivilacanFaultCoordinates());
        faultLines.put("West Zambales", getEastZambalesFaultCoordinates());
        faultLines.put("Iba", getIbaFaultCoordinates());
        faultLines.put("Central Mindoro", getCentralMindoroFaultCoordinates());
        faultLines.put("Offshore", getOffshoreFaultCoordinates());
        faultLines.put("West Panay", getWestPanayFaultCoordinates());
        faultLines.put("East Negros", getEastNegrosFaultCoordinates());
        faultLines.put("Cardoni", getCardoniFaultCoordinates());
        faultLines.put("East Bohol", getEastBoholFaultCoordinates());
        faultLines.put("Liros", getLirosFaultCoordinates());
    }



    public static List<GeoPosition> getLirosFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(14.34414283, 120.97936392));
        track.add(new GeoPosition(14.34661668, 120.98129511));
        return track;
    }
    
    public static List<GeoPosition> getEastBoholFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(9.63866139, 123.98620605));
        track.add(new GeoPosition(9.69822792, 124.17846680));  
        track.add(new GeoPosition(9.73612840, 124.21142578));  
        track.add(new GeoPosition(9.76861109, 124.21142578));  
        track.add(new GeoPosition(9.82274187, 124.28283691));  
        track.add(new GeoPosition(9.87145200, 124.32128906));
        track.add(null);
        track.add(new GeoPosition(10.01212956, 124.18395996));
        track.add(new GeoPosition(9.94720898, 124.06311035));  
        track.add(new GeoPosition(9.89309863, 123.96423340));  
        track.add(new GeoPosition(9.87686379, 123.85986328));  
        track.add(new GeoPosition(9.80650356, 123.72802734));  
        track.add(new GeoPosition(9.75237014, 123.64562988));  
        track.add(new GeoPosition(9.67115353, 123.50280762));
        track.add(null);
        track.add(new GeoPosition(9.70905707, 123.41491699));  
        track.add(new GeoPosition(9.84980394, 123.48083496));  
        track.add(new GeoPosition(9.93638762, 123.47534180));
        track.add(new GeoPosition(10.02835768, 123.50280762));  
        track.add(new GeoPosition(10.04999391, 123.57421875));  
        track.add(new GeoPosition(10.14733897, 123.60717773));  
        track.add(new GeoPosition(10.26087079, 123.68408203));
        track.add(new GeoPosition(10.39057158, 123.78845215));
        track.add(new GeoPosition(10.43919553, 123.87634277));
        track.add(new GeoPosition(10.53642060, 123.94775391));
        track.add(new GeoPosition(10.65520955, 123.90380859));
        track.add(new GeoPosition(10.68759852, 123.94775391));
        return track;
    }
    
    public static List<GeoPosition> getCardoniFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(9.79026446, 122.59643555));  
        track.add(new GeoPosition(9.86062815, 122.61291504));
        track.add(new GeoPosition(9.87145200, 122.67333984));
        track.add(new GeoPosition(9.85521609, 122.76672363));
        track.add(new GeoPosition(9.83897938, 122.84912109));
        return track;
    }
    
    
    public static List<GeoPosition> getTanbulanFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.449815, 124.280350));  
        track.add(new GeoPosition(7.476670, 124.31174));  
        return track;
    }
    
    public static List<GeoPosition> getSouthBariraFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.4128251,124.2543617));  
        track.add(new GeoPosition(7.4172518,124.2699221));  
        track.add(new GeoPosition(7.4174699,124.2736661));
        track.add(new GeoPosition(7.425703,124.2855127));

        return track;
    }
    
    public static List<GeoPosition> getWestCompostelaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.4992120, 125.9169460));
        track.add(new GeoPosition(7.67169, 125.90139));
        track.add(new GeoPosition( 7.8334700, 125.9141100));  
        track.add(new GeoPosition(8.0242200, 125.9216900));
        track.add(new GeoPosition(8.1650200, 125.8666300));
        return track;
    }
    
    public static List<GeoPosition> getShortWestCompostelaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.2258500, 125.8408400));
        track.add(new GeoPosition( 8.2544700, 125.8358600));
        return track;
    }
    
    public static List<GeoPosition> getSurigaoFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(10.1290000, 125.2145300));
        track.add(new GeoPosition( 9.9114500, 125.3063700));
        track.add(new GeoPosition(9.8592800, 125.3555500));
        track.add(new GeoPosition(9.7856550, 125.4261660));
        track.add(new GeoPosition(9.7518780, 125.4331290)); 
        return track;
    }
    
    public static List<GeoPosition> getSurigaoLowerFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(9.3311700, 125.5306200));
        track.add(new GeoPosition(9.2574700, 125.5518400)); 
        return track;
    }
    
    public static List<GeoPosition> getSurigaop2LowerFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(9.2547300, 125.5610810));
        track.add(new GeoPosition(8.9006300, 125.6632900)); 
        return track;
    }
    
    
    
    public static List<GeoPosition> getEsperanzaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.9169470, 125.6423410));
        track.add(new GeoPosition(8.9109100, 125.6450300)); 
        track.add(new GeoPosition(8.8492400, 125.6589200)); 
        track.add(new GeoPosition(8.6061800, 125.7246200)); 
        return track;
    }
    
    public static List<GeoPosition> getDeOroEsperanzaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.9131400, 125.6416700));
        track.add(new GeoPosition(8.6061800, 125.7246200)); 
        return track;
    }
    
    public static List<GeoPosition> getSmallLeftEsperanzaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.7521200, 125.7473700));
        track.add(new GeoPosition(8.7681100, 125.7402400)); 
        return track;
    }
    
    public static List<GeoPosition> getRighttEsperanzaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.7591200, 125.7529000));
        track.add(new GeoPosition(8.7811300, 125.7252200));
        track.add(new GeoPosition(8.8203600, 125.7196400)); 

        return track;
    }

    
    public static List<GeoPosition> getDagumaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(6.6513900, 124.4854800));
        track.add(new GeoPosition( 6.6126400, 124.5144100));
        track.add(new GeoPosition(6.6078900, 124.5134900));

        track.add(null);
        track.add(new GeoPosition(6.1457600, 125.0063000));
        track.add(new GeoPosition(6.1559300, 124.9102500)); 
        track.add(new GeoPosition(6.1559300, 124.9102500)); 
        track.add(new GeoPosition(6.2235100, 124.8276000));
        return track;
    }
    
    public static List<GeoPosition> getKoronadalFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(6.3739500, 124.8898300));
        track.add(new GeoPosition(6.4219200, 124.8706900)); 
        track.add(new GeoPosition(6.4686000, 124.8308900)); 
        return track;
    }
    
    public static List<GeoPosition> getAgusanMarshFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.5152400, 125.7554300));
        track.add(new GeoPosition(8.3003000, 125.8308800)); 
        return track;
    }
    
    public static List<GeoPosition> getLiangaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.7684100, 125.7652200));
        track.add(new GeoPosition(8.5322400, 126.1446500));
        return track;
    }
    
    public static List<GeoPosition> getLefttLiangaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.5322400, 126.1446500));
        track.add(new GeoPosition(8.7684100, 125.7652200));
        return track;
    }
    
    public static List<GeoPosition> getRighttLiangaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.4726500, 126.3518500));
        track.add(new GeoPosition(8.5245400, 126.2377600));
        return track;
    }
    
    public static List<GeoPosition> getMatiFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(6.9683500, 126.1992600));
        track.add(new GeoPosition( 7.0024400, 126.2082100));
        track.add(new GeoPosition(7.4193300, 126.1707700));
        track.add(new GeoPosition( 7.4607700, 126.1803400));

        return track;
    }
    
    public static List<GeoPosition> getCaragaRiverFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.5383000, 126.1253400));
        track.add(new GeoPosition(7.4295200, 126.1968200));
        track.add(new GeoPosition(7.3052800, 126.2459800));

        return track;
    }
    
    public static List<GeoPosition> getCentralMindanaoFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.7145800, 125.1267200));
        track.add(new GeoPosition(8.6926100, 125.1450100));
        track.add(new GeoPosition(8.6080000, 125.1627200));
        track.add(new GeoPosition(8.5899200, 125.1769200));
        track.add(new GeoPosition(8.5312700, 125.1856400));
        track.add(new GeoPosition(8.5204800, 125.2043800));
        
        track.add(null);
        track.add(new GeoPosition(8.12958941, 125.41923523));
        track.add(new GeoPosition(7.67152450, 125.69252014));
        
        track.add(null);
        track.add(new GeoPosition(8.04019299, 125.33065796));
        track.add(new GeoPosition(7.98681766, 125.32619476));
        track.add(new GeoPosition(7.94601652, 125.34954071));
        track.add(new GeoPosition(7.93683570, 125.34954071));
        track.add(new GeoPosition(7.90963208, 125.38181305));
        track.add(new GeoPosition(7.89364911, 125.39039612));
        track.add(new GeoPosition(7.85351895, 125.40035248));
        track.add(new GeoPosition(7.82664997, 125.39314270));
        return track;
    }
    
    public static List<GeoPosition> getShortCentralMindanaoFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.5205500, 125.1832400));
        track.add(new GeoPosition(8.5106200, 125.1909300));
        return track;
    }
    
    public static List<GeoPosition> getWestCentralMindanaoFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.5156200, 125.1848100));
        track.add(new GeoPosition(8.4929600, 125.1935900));
        track.add(new GeoPosition(8.4223700, 125.2024300));
        track.add(new GeoPosition( 8.3570700, 125.2328500));
        track.add(new GeoPosition( 8.3433100, 125.2333300));
        track.add(new GeoPosition(8.3070500, 125.2506600));
        track.add(null);
        track.add(new GeoPosition(8.2963000, 125.2517800));
        track.add(new GeoPosition(8.2789800, 125.2622100));
        track.add(new GeoPosition(8.2749400, 125.2660900));
        track.add(new GeoPosition( 8.2691300, 125.2682200));
        track.add(new GeoPosition( 8.2678700, 125.2674000));
        track.add(new GeoPosition(8.2651440, 125.2684630));
        track.add(new GeoPosition(8.2642940, 125.2690420));
        track.add(new GeoPosition(8.2615440, 125.2694070));

        return track;
    }
    
    public static List<GeoPosition> getZamboangaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition( 7.8296900, 122.4959100));
        track.add(new GeoPosition(7.8891400, 122.5723200));
        track.add(new GeoPosition( 7.9047000, 122.5861400));        
        track.add(new GeoPosition( 7.9077600, 122.5926600));
        track.add(new GeoPosition(7.9274800, 122.6111100));
        track.add(null);
        track.add(new GeoPosition(7.9216200, 122.6012400));
        track.add(new GeoPosition(8.0040300, 122.6542000));
        track.add(new GeoPosition( 8.0748700, 122.7538500));
        return track;
    }
    
    public static List<GeoPosition> getKabasalanFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.8158500, 122.7776200));
        track.add(new GeoPosition(7.9961700, 122.8714400));
        return track;
    }
    
    public static List<GeoPosition> getWesternFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition( 8.3140600, 122.9617700));
        track.add(new GeoPosition( 8.1373200, 123.3627700));
        return track;
    }
    
    public static List<GeoPosition> getTangbulanFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(6.8709600, 125.2263700));  
        track.add(new GeoPosition(6.8101100, 125.2416500));  
        track.add(new GeoPosition(6.7943000, 125.2507100));  
        track.add(new GeoPosition( 6.7838600, 125.2535000));  
        track.add(null);
        track.add(new GeoPosition(6.7819800, 125.2424700));  
        track.add(new GeoPosition(6.6828100, 125.2908800));  
        track.add(null);
        track.add(new GeoPosition(6.3721100, 125.5638600));  
        track.add(new GeoPosition(6.4054600, 125.5393100)); 
        track.add(new GeoPosition(6.4054600, 125.5393100)); 
        track.add(new GeoPosition(6.5122400, 125.4211200)); 
        track.add(new GeoPosition(6.6479800, 125.2800200)); 
        track.add(new GeoPosition(6.8339700, 125.2233700)); 
        return track;
    }
    
    public static List<GeoPosition> getTalakagFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.12865476, 124.49930191));  
        track.add(new GeoPosition(8.10214376, 124.51835632));  
        track.add(new GeoPosition(8.08072975, 124.53217506));  
        track.add(null);
        track.add(new GeoPosition(8.10906908, 124.51479435));  
        track.add(new GeoPosition(8.10228184, 124.51879621));  
        track.add(new GeoPosition(8.08574345, 124.54899788));  
        track.add(null);
        track.add(new GeoPosition(8.08098469, 124.53689575));
        track.add(new GeoPosition(8.04121283, 124.58255768)); 
        track.add(new GeoPosition(7.99769727, 124.61277008)); 
        track.add(new GeoPosition(7.95995736, 124.67834473));  

        return track;
    }
    
     public static List<GeoPosition> getLanaoFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.94261624, 123.97350311));  
        track.add(new GeoPosition(8.03407388, 124.26601410));
        
        // sa baba ire
        track.add(null);
        track.add(new GeoPosition(7.79399674, 124.02259827));
        track.add(new GeoPosition(7.76712393, 124.07787323));
        track.add(new GeoPosition(7.76610341, 124.18842316)); 
        track.add(null);
        track.add(new GeoPosition(7.78345192, 124.20284271));
        track.add(new GeoPosition(7.79025506, 124.33261871));
        track.add(new GeoPosition(7.82596972, 124.36592102));
        track.add(new GeoPosition(7.85351895, 124.43733215));    
        return track;
    }
     
    public static List<GeoPosition> getKalilanganFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.73778299, 124.77928162));  
        track.add(new GeoPosition(7.70878023, 124.73276138));
        track.add(new GeoPosition(7.70052981, 124.71224785));
        return track;
    }
     
    public static List<GeoPosition> getBunbaranFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.86882328, 124.47784424));  
        track.add(new GeoPosition(7.71643511, 124.71508026));
        return track;
    }
    
    public static List<GeoPosition> getCentralDavaoFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.10021129, 125.55381775));
        track.add(new GeoPosition(7.10310714, 125.55089951));
        track.add(new GeoPosition(7.10923948, 125.54952621));
        track.add(new GeoPosition(7.11605310, 125.54815292));
        track.add(new GeoPosition(7.12559199, 125.54780960));
        track.add(new GeoPosition(7.14211424, 125.54712296));
        track.add(new GeoPosition(7.15471845, 125.53871155));
        track.add(new GeoPosition(7.17192092, 125.52858353));
        track.add(new GeoPosition(7.19780857, 125.52875519));
        return track;
    }
    
    public static List<GeoPosition> getSouthBukidnonFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(7.55242045, 124.73396301));
        track.add(new GeoPosition(7.62116454, 124.87335205));
        track.add(new GeoPosition(7.62797029, 124.89257813));
        track.add(new GeoPosition(7.67424649, 124.91523743));
        track.add(new GeoPosition(7.68581476, 124.95025635));
        track.add(new GeoPosition(7.68649523, 124.97428894));
        track.add(new GeoPosition(7.67969042, 124.99420166));
        track.add(new GeoPosition(7.69261947, 125.01480103));
        track.add(new GeoPosition(7.71575468, 125.02510071));
        track.add(new GeoPosition(7.75385698, 125.04089355));
        track.add(new GeoPosition(7.78039047, 125.05256653));
        track.add(new GeoPosition(7.77494784, 125.09651184));

        return track;
    }
    
    public static List<GeoPosition> getTagoloanRiverFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(8.61598600, 124.76168633));
        track.add(new GeoPosition(8.60792402, 124.76709366));
        track.add(new GeoPosition(8.60792402, 124.76709366));
        track.add(new GeoPosition(8.57499541, 124.7887229));
        track.add(new GeoPosition(8.57092156, 124.79138374));
        track.add(new GeoPosition(8.54537419, 124.80322838));
        track.add(new GeoPosition(8.53875366, 124.80872154));
        track.add(new GeoPosition(8.51006338, 124.84185219));
      
        return track;
    }
    
    public static List<GeoPosition> getWestIlocosFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(17.53667764, 120.40191650));
        track.add(new GeoPosition(17.56286508, 120.43212891));
        track.add(new GeoPosition(17.80622614, 120.51177979));
        track.add(new GeoPosition(17.88204530, 120.52276611));
        track.add(new GeoPosition(18.03619806, 120.58044434));
        track.add(new GeoPosition(18.08058996, 120.60241699));
        track.add(new GeoPosition(18.11452914, 120.64910889));
        track.add(new GeoPosition(18.22674258, 120.76721191));
        track.add(new GeoPosition(18.50565666, 120.76171875));
        return track;
    }
    
    public static List<GeoPosition> getInfantaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(14.06198810, 121.65161133));
        track.add(new GeoPosition(14.78550531, 121.62963867));
        track.add(new GeoPosition(15.28418511, 121.27807617));
        track.add(new GeoPosition(15.51720526, 121.34399414));
        track.add(new GeoPosition(15.86624156, 120.93750000));

        return track;
    }
    
    public static List<GeoPosition> getAmbuklaoFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(15.83453574, 120.94848633));
        track.add(new GeoPosition(16.33068282, 120.88256836));
        track.add(new GeoPosition(16.79402361, 121.13525391));
        track.add(new GeoPosition(16.37285060, 120.90454102));
        track.add(new GeoPosition(16.82557426, 120.83862305));
        track.add(new GeoPosition(17.49738940, 120.86059570));
        track.add(new GeoPosition(17.25623631, 120.90454102));
        return track;
    }
    
    public static List<GeoPosition> getSanManuelFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(15.85567351, 120.92651367));
        track.add(new GeoPosition(16.17247281, 120.57495117));
        track.add(new GeoPosition(16.53089842, 120.69580078));
        track.add(new GeoPosition(16.70986293, 120.61889648));
        track.add(null);
        track.add(new GeoPosition(16.20412499, 120.58593750));
        track.add(new GeoPosition(16.26741410, 120.45410156));        
        track.add(new GeoPosition(16.26741410, 120.45410156));        
        track.add(new GeoPosition(16.52036591, 120.39916992));
        track.add(new GeoPosition(16.90968362, 120.52001953));
        return track;
    }
    
    public static List<GeoPosition> getCasiguranFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(15.88737601, 121.58569336));
        track.add(new GeoPosition(16.09859801, 121.90429688));
        track.add(new GeoPosition(16.37285060, 122.05810547));
        track.add(new GeoPosition(16.50983283, 122.20092773));
        track.add(new GeoPosition(16.92019465, 122.22290039));
        track.add(new GeoPosition(17.28770905, 122.21191406));
        return track;
    }
    
    public static List<GeoPosition> getWestValleyFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(14.21247002, 121.02676392));
        track.add(new GeoPosition(14.22977570, 121.01852417));
        track.add(new GeoPosition(14.24841111, 121.01989746));
        track.add(new GeoPosition(14.26837591, 121.02401733));
        track.add(new GeoPosition(14.30696950, 121.02951050));
        track.add(new GeoPosition(14.38546702, 121.04324341));
        track.add(new GeoPosition(14.41207009, 121.04461670));
        track.add(new GeoPosition(14.48920105, 121.05834961));
        track.add(new GeoPosition(14.51313280, 121.06658936));
        track.add(new GeoPosition(14.53041523, 121.07208252));
        track.add(new GeoPosition(14.58491250, 121.07894897));
        track.add(new GeoPosition(14.63009513, 121.07070923));
        track.add(new GeoPosition(14.64869704, 121.08169556));
        track.add(new GeoPosition(14.69120976, 121.11328125));
        track.add(new GeoPosition(14.76957091, 121.12426758));
        track.add(new GeoPosition(14.79347208, 121.12976074));
        track.add(new GeoPosition(14.82002585, 121.14761353));
        track.add(new GeoPosition(14.83728406, 121.15997314));
        track.add(new GeoPosition(14.87975992, 121.18469238));
        track.add(new GeoPosition(14.98591295, 121.20254517));    
        return track;
    }
    
    public static List<GeoPosition> getDivilacanFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(16.02469571, 121.62963867));
        track.add(new GeoPosition(16.22522362, 121.87133789));
        track.add(new GeoPosition(16.47823013, 122.10205078));
        track.add(new GeoPosition(16.61513780, 122.13500977));
        track.add(new GeoPosition(17.29819877, 122.25585938));
        return track;
    }
    
    public static List<GeoPosition> getEastZambalesFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(15.47485740, 120.50903320));
        track.add(new GeoPosition(15.64419660, 120.39916992));
        track.add(new GeoPosition(15.74996257, 120.25634766));
        track.add(new GeoPosition(15.74996257, 120.25634766));
        return track;
    }
    
    public static List<GeoPosition> getIbaFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(15.07212355, 120.30029297));
        track.add(new GeoPosition(15.15697371, 120.06958008));
        track.add(new GeoPosition(15.45368022, 120.02563477));
        track.add(new GeoPosition(15.60187488, 119.92675781));
        track.add(null);
        track.add(new GeoPosition(16.01413600, 119.82788086));
        track.add(new GeoPosition(16.18302410, 119.84985352));
        return track;
    }
    
    public static List<GeoPosition> getCentralMindoroFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(13.46442182, 120.98419189));
        track.add(new GeoPosition(13.34686501, 121.03088379));
        track.add(new GeoPosition(13.21053438, 121.08581543));
        track.add(new GeoPosition(13.01526207, 121.12976074));
        track.add(new GeoPosition(12.98314772, 121.20117188));
        track.add(null);
        track.add(new GeoPosition(12.51702806, 121.44012451));
        track.add(new GeoPosition(12.69929178, 121.38244629));
        track.add(new GeoPosition(12.76358907, 121.28356934));
        track.add(new GeoPosition(12.87606996, 121.23962402));
        track.add(new GeoPosition(12.97779492, 121.19842529));
        track.add(new GeoPosition(13.21320827, 121.20117188));
        track.add(new GeoPosition(13.28004584, 121.17095947));
        track.add(new GeoPosition(13.37358751, 121.15447998));
        track.add(null);
        track.add(new GeoPosition(12.25949569, 121.19567871));
        track.add(new GeoPosition(12.42316553, 121.19567871));
        track.add(new GeoPosition(12.47412369, 121.35223389));
        track.add(new GeoPosition(12.57332921, 121.40167236));
        return track;
    }
    
    public static List<GeoPosition> getOffshoreFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(14.71113476, 121.65161133));
        track.add(new GeoPosition(12.35073412, 123.58520508));
        track.add(new GeoPosition(11.88885308, 124.22241211));
        track.add(new GeoPosition(10.72538129, 124.91455078));
        track.add(new GeoPosition(10.26087079, 125.10131836));
        track.add(new GeoPosition(10.14193169, 125.21118164));
        return track;
    }
    
    public static List<GeoPosition> getWestPanayFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(10.62821611, 122.18994141));
        track.add(new GeoPosition(10.67140447, 122.22290039));
        track.add(new GeoPosition(10.72538129, 122.25585938));
        track.add(new GeoPosition(10.77395219, 122.28881836));
        track.add(new GeoPosition(10.82251526, 122.30529785));
        track.add(new GeoPosition(10.87646499, 122.32177734));
        track.add(new GeoPosition(10.90883016, 122.33825684));
        track.add(new GeoPosition(10.97354990, 122.36572266));
        track.add(new GeoPosition(11.03825547, 122.38220215));
        track.add(new GeoPosition(11.09755639, 122.37670898));
        track.add(new GeoPosition(11.14067678, 122.38769531));
        track.add(new GeoPosition(11.18917957, 122.38769531));
        track.add(new GeoPosition(11.22689836, 122.39318848));
        track.add(null);
        track.add(new GeoPosition(11.16762377, 122.28881836));
        track.add(new GeoPosition(11.66299611, 122.23388672));
        track.add(null);
        track.add(new GeoPosition(11.74368060, 122.20642090));
        track.add(new GeoPosition(11.79745716, 122.17346191));
        track.add(null);
        track.add(new GeoPosition(10.98972762, 122.15698242));
        track.add(new GeoPosition(11.10294679, 122.27233887));
        track.add(null);
        track.add(new GeoPosition(11.00051228, 122.09106445));
        track.add(new GeoPosition(11.07599381, 122.18994141));
        return track;
    }
    
    public static List<GeoPosition> getEastNegrosFaultCoordinates() {
        List<GeoPosition> track = new ArrayList<>();
        track.add(new GeoPosition(9.48157209, 123.01940918));
        track.add(new GeoPosition(9.54658335, 123.05786133));
        track.add(new GeoPosition(9.64407696, 123.05236816));
        track.add(new GeoPosition(9.67115353, 123.14025879));
        track.add(new GeoPosition(9.77402457, 123.11279297));
        track.add(new GeoPosition(9.86062815, 123.11279297));
        track.add(new GeoPosition(9.94720898, 123.14575195));
        track.add(new GeoPosition(10.04458498, 123.21716309));
        track.add(new GeoPosition(10.19600042, 123.25012207));
        track.add(new GeoPosition(10.28249130, 123.24462891));
        track.add(null);
        track.add(new GeoPosition(10.31491929, 123.27758789));
        track.add(new GeoPosition(10.39597461, 123.32702637));
        track.add(null);
        track.add(new GeoPosition(10.57962191, 123.38745117));
        track.add(new GeoPosition(10.66060795, 123.42041016));
        return track;
    }
    
    
    
    // Method to retrieve fault line coordinates by name
    public static List<GeoPosition> getFaultLineCoordinates(String name) {
        return faultLines.get(name);
    }
}
