import subjects.Track;
import subjects.Wall;
import subjects.Cat;
import subjects.Human;
import subjects.Robot;
import subjects.Subject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class My_Program {
    public static void main(String[] args) {
        Subject man = new Human("Сергей", 80, 40);
        Subject cat = new Cat("Грейси", 15, 20);
        Subject robot = new Robot("Робот", 1000, 100);
        List<Subject> personsArray = new ArrayList(Arrays.asList(man, cat, robot));
        Wall wall = new Wall(80);
        Track track = new Track(500);
        List obstructions = new ArrayList<>(Arrays.asList(wall, track));
        boolean isPassed;
        for (int i = 0; i < personsArray.size(); i++) {
            for (int j = 0; j < obstructions.size(); j++) {
                if (obstructions.get(j) instanceof Wall) {
                    isPassed = personsArray.get(i).jump((Wall) obstructions.get(j));
                    if (!isPassed) {
                        break;
                    }
                } else if (obstructions.get(j) instanceof Track) {
                    isPassed = personsArray.get(i).run((Track) obstructions.get(j));
                    if (!isPassed) {
                        break;
                    }

                }

            }
        }

    }
}
