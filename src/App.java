public class App {
    public static void main(String[] args) throws Exception {
        RunningShoe rsNike1 = new RunningShoe("Nike", 43, 250);
        WalkingShoe wsHanwag1 = new WalkingShoe("Hanwag", 43.5, true );
        WalkingShoe wsMarrell1 = new WalkingShoe("Marrell", 42, false);

        Shoe[] availableShoes = {rsNike1, wsHanwag1, wsMarrell1};
        System.out.print("Brand" + "\t \t" + "size" + "\t \t" + "Weight" + "\t \t" + "Gore-Tex");
        System.out.println();
        System.out.print("-----" + "\t \t" + "----" + "\t \t" + "------" + "\t \t" + "---------");
        System.out.println();

        for(Shoe shoe: availableShoes){
            System.out.print(shoe.brand + "\t \t");
            System.out.print(shoe.size + "\t \t");

            if(shoe instanceof RunningShoe){
                // Typecast to use the properties of Shoe object
                RunningShoe rs = (RunningShoe)shoe;
                System.out.print(rs.weight +"Gr");
            }else{
                WalkingShoe ws = (WalkingShoe)shoe;
                System.out.print("\t \t \t " + ws.goretex + "\t \t");
            }
            System.out.println();
        }
    }
}

