import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        LinkedList alist = new LinkedList();
        RankList objA= new RankList();
        //objA.insert(int 1,Point ,double 4);
        System.out.println("The number of Nodes of the list are " + objA.insert((int 1, Point location(1,3), double 4,7));

}}


class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double dist(Point p) {  //υπολογίζει	την (ευκλείδια) απόσταση του σημείου αυτού από δεδομένο σημείο p
        return Math.sqrt(//dost x,y
                (this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y)
        );
    }
    public Point copy() { //δημιουργεί και επιστρέφει αντίγραφο του αντικειμένου για το σημείο
        return new Point(this.x, this.y);
    }
}


class Record {
    //μοντελοποιεί ένα σημείο ενδιαφέροντος
    public int id;
    public Point location;
    public double score;

    public Record(int id, Point location, double score) {
        this.id = id;
        this.location = location;
        this.score = score;
    }

    public Record copy() { // δημιουργεί και επιστρέφει αντίγραφο του αντικειμένου για το σημείο ενδιαφέροντος
        return new Record(
                this.id,
                this.location.copy(),
                this.score
        );
    }

}


class Node {
    public Record poi;
    public Node next;

    public Node(Record poi) {
        this.poi = poi;
    }
}


class RankList {
    //Ορίζει συνδεδεμένη λίστα, κάθε κόμβος της οποίας αποθηκεύει εγγραφή τύπου Record για ένα σημείο ενδιαφέροντος (PoI)

    private Node first; // κλασεις Node. Μας δειχνει την πρωτη εγγραφη της λιστασ
    private int nodeCount; //που βρισκομαστε στην λίστα

    public RankList() { } //Κατασκευάζει κενή λίστα κλάσης RankList.

    public int size() { return nodeCount; } //Επιστρέφει το πλήθος κόμβων της λίστας.

    public int insert(Record poi) { 	// Δημιουργεί κόμβο κλάσης Node, στον οποίο εγγράφει αντίγραφο της εγγραφής poi και εισάγει τον κόμβο στη λίστα στην οποία καλείται η μέθοδος. Επιστρέφει το (ενημερωμένο) πλήθος κόμβων της λίστας.

        Node tmp = new Node(poi); // ftiaxnw neo komvo kai ton onomazw tmp
        //tmp.next = null;//kanw to epomeno node apo auto pou eisagw to poi null gt 8a einai kai to teleutaio stoixeio tou LL

        if(first == null){
            first = tmp; // an h prwth 8esh einai null vale to tmp ston 1o komvo
            nodeCount = 1;
        }else{
            Node newNode = tmp.next; //dimiourgia kainourio komvou pou 8a pairnei
            while (newNode.next != null){
                newNode = newNode.next;
            }
            newNode.next = tmp;
            nodeCount++;

        }

        //tmp.element = x; //stin 8esi mnimis pou exw desmeusei vazw tin timi pou 8elw na eisagw




        return nodeCount;
    }

    //an exei eisagei 15 kojvous den mporei na zitisei 15+1 pio kontinous komvous
    public RankList nearest(Point p, int k) { //περιέχει τις εγγραφές των k εγγύτερων σημείων ενδιαφέροντος από τη λίστα στην οποία καλείται η μέθοδος, στο σημείο p.
        return null;
    }

    public RankList nearest(Point p, double maxDist) { //Κατασκευάζει και επιστρέφει λίστα κλάσης RankList, που περιέχει τις εγγραφές σημείων ενδιαφέροντος από τη λίστα στην οποία καλείται η μέθοδος, που βρίσκονται σε απόσταση το πολύ maxDist από το σημείο p.
        return null;
    }

    public RankList highScore(int k) {
        return null;
    }

    public RankList highScore(double minScore) { // Δημιουργεί και επιστρέφει λίστα κλάσης RankList, που περιέχει τις εγγραφές των σημείων ενδιαφέροντος από τη λίστα στην οποία καλείται η μέθοδος,με τις βαθμολογίες τουλάχιστον minScore.
        return null;
    }

    public RankList inCommonWith(RankList rankList) { //Κατασκευάζει και επιστρέφει λίστα κλάσης RankList, που περιέχει τις εγγραφές των σημείων ενδιαφέροντος που περιέχονται τόσο στη λίστα στην οποία καλείται η μέθοδος, όσο και στη λίστα rankList (δύο εγγραφές αφορούν στο ίδιο σημείο ενδιαφέροντος, αν έχουν το ίδιο id)
        return null;
    }

}

