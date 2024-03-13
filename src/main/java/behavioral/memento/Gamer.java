package behavioral.memento;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

    public class Gamer {

        private int money;
        private List<String> fruits = new ArrayList<>();
        private Random random = new Random();
        private static String[] fruitsname = {
                "사과", "포도", "바나나", "귤",
        };
        public Gamer(int money) {
            this.money = money;
        }


        public void bet() {
            int dice = random.nextInt(6) + 1;
            if (dice == 1) {
                money += 100;
                System.out.println("돈 증가");
            } else if (dice == 2) {
                money /= 2;
                System.out.println("돈/2");
            } else if (dice == 6) {
                String f = getFruit();
                System.out.println("과일(" + f + ")을 받았다.");
                fruits.add(f);
            } else {
                System.out.println("아무일도 없음");
            }
        }

        private String getFruit() {
            String prefix = "";
            if (random.nextBoolean()) {
                prefix = "good! ";
            }
            return prefix + fruitsname[random.nextInt(fruitsname.length)%6];
        }

        public int getMoney() {
            return money;
        }

        public List<String> getFruits() {
            return fruits;
        }

        public Random getRandom() {
            return random;
        }

        public static String[] getFruitsname() {
            return fruitsname;
        }

        public Memento createMemento() {
            Memento memento = new Memento(money);
            for (String f : fruits) {
                if (f.startsWith("good~ ")) {         // 과일은 맛있는 것만 보존
                    memento.addFruit(f);
                }
            }
            return memento;

        }

        public void restoreMemento(Memento memento) {       // undo를 실행한다.
            this.money = memento.money;
            this.fruits = memento.fruits;
        }
        public String toString() {                      // 문자열 표현
            return "[money = " + money + ", fruits = " + fruits + "]";
        }
    }
