package OOPS;

interface Playable {
    void play();
}

interface PlayableWithVolume extends Playable {
    void setVolume(int v);
}


class Speaker implements PlayableWithVolume {
    int v;

    public void play() {
        System.out.println("plays sound.");
    }

    public void setVolume(int v) {
        this.v = v;
        System.out.println("Volume = " + v);
    }
}

class Guitar implements Playable {
    public void play() {
        System.out.println("by pic.");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("by keys.");
    }
}

public class AbstractionInterfaces {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();
        Piano p = new Piano();
        p.play();
        Speaker s = new Speaker();
        s.play();
        s.setVolume(20);
    }
}
