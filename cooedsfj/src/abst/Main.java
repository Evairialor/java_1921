package abst;

interface IPlayable {
    void play();

    void pause();

    void stop();
}

interface IRecodable {
    void record();

    void pause();

    void stop();
}

class Player implements IPlayable, IRecodable {

    @Override
    public void play() {

        System.out.println("play");

    }

    @Override
    public void record() {

        System.out.println("record text");

    }

    @Override
    public void pause() {

        System.out.println("pause");

    }

    @Override
    public void stop() {

        System.out.println("stop");

    }
}

class Main extends Player {
    public static void main(String[] args) {

        Player player = new Player();

        IPlayable iPlayable = (IPlayable) player;

        Player player1 = (Player) iPlayable;
        player1.stop();

    }
}

