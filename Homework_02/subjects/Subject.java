package subjects;

public abstract class Subject implements Jump, Run {
    String name;
    /**
     * @param maxRunDistatnce Максимальная дистанция в беге измеряется в метрах
     */
    int maxRunDistatnce;

    /**
     * @param maxJumpDistance Максимальная дистанция в прыжках измеряется в
     *                        сантиметрах
     */
    int maxJumpDistance;

    public int getMaxRunDistatnce() {
        return maxRunDistatnce;
    }

    public int getMaxJumpDistance() {
        return maxJumpDistance;
    }

    @Override
    public boolean jump(Wall wall) {
        if (maxJumpDistance >= wall.getHeightWall()) {
            System.out.println(name + " смог перепрыгнуть " + wall.getHeightWall() + " см");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть " + wall.getHeightWall() + " см");
            return false;
        }
    }

    @Override
    public boolean run(Track track) {
        if (maxRunDistatnce >= track.getLengthTrack()) {
            System.out.println(name + " смог пробежать " + track.getLengthTrack() + " м");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + track.getLengthTrack() + " м");
            return false;
        }
    }

    public Subject(String name, int maxRunDistatnce, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistatnce = maxRunDistatnce;
        this.maxJumpDistance = maxJumpDistance;
    }
}
