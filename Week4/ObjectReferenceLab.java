class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public boolean setScore(int score) {
        if (score < 0 || score > 100) {
            return false;
        }

        this.score = score;
        return true;
    }

    public String toString() {
        return "Score: " + score;
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(0);
        System.out.println("Inside method: " + box);
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {
        ScoreBox box1 = new ScoreBox(50);

        ScoreBox box2 = box1;

        ScoreBox box3 = new ScoreBox(80);

        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
        System.out.println("box3: " + box3);

        System.out.println("box1 == box2: " + (box1 == box2));
        System.out.println("box1 == box3: " + (box1 == box3));

        box2.setScore(70);

        System.out.println("\nAfter changing box2:");
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);

        addBonus(box1, 10);

        System.out.println("\nAfter bonus:");
        System.out.println(box1);

        replaceLocally(box1);

        System.out.println("\nAfter replaceLocally:");
        System.out.println("box1: " + box1);

        ScoreBox box4 = createScoreBox(90);

        System.out.println("\nNew object:");
        System.out.println(box4);
        System.out.println("box1 == box4: " + (box1 == box4));
    }
}