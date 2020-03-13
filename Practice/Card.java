package Practice_list;

public class Card {
    public String huaSe;
    public   int num;

    public Card(String huaSe, int num) {
        this.huaSe = huaSe;
        this.num = num;
    }

    @Override
    public String toString() {
        /*return "Card{" +
                "huaSe='" + huaSe + '\'' +
                ", num=" + num +
                '}';*/
        return String.format("[%s %d]", huaSe, num);
    }
}
