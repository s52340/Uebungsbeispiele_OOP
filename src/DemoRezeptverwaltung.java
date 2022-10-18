public class DemoRezeptverwaltung {

    public static void main(String[] args) {
        System.out.println("Rezept");

        //String mehlFürBlechkuchen_name = "FinisFeinstes";
        //int mehlFürBlechkuchen_menge = 1000;
        //System.out.println(mehlFürBlechkuchen_name + " " + mehlFürBlechkuchen_menge);
        //Wert geben für Variable
        Zutat mehlFürBlechkuchen = new Zutat("FinisFeinstes", 1000);
        //    mehlFürBlechkuchen.name = "FinisFeinstes"
        //    mehlFürBlechkuchen.menge = 1000
        System.out.println("mehlFürBlechkuchen  " + mehlFürBlechkuchen);




        Zutat mehlFürPartyBlechkuchen = new Zutat(mehlFürBlechkuchen.getName(), mehlFürBlechkuchen.getMenge()*10);
        // Zutat mehlFürPartyBlechkuchen = new Zutat(mehlFürBlechkuchen.getName(), mehlFürBlechkuchen.getMenge()*10);
        //                                           mehlFürBlechkuchen.getName()
        //                           <<<<<           this.name
        //                                           "FinisFeistes"

        //    mehlFürPartyBlechkuchen.name = "FinisFeinstes"
        //    mehlFürPartyBlechkuchen.menge = 10000
        System.out.println("mehlFürPartyBlechkuchen  " + mehlFürPartyBlechkuchen);




        System.out.println("Menge in Cups: " + mehlFürPartyBlechkuchen.getMengeinCups());

    }
}
