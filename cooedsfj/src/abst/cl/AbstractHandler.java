package abst.cl;

abstract class AbstractHandler {
    abstract void open();
    abstract void create();
    abstract void change();
    abstract void save();
}

class XMLHandler extends AbstractHandler {
    void open() {
        System.out.println("open");
    }

    void create() {
        System.out.println("create");
    }

    void change() {
        System.out.println("change");
    }

    void save() {
        System.out.println("save");
    }
}

class TXTHandler extends XMLHandler{
    void open() {
        System.out.println("open1");
    }

    void create() {
        System.out.println("create1");
    }

    void change() {
        System.out.println("change1");
    }

    void save() {
        System.out.println("save1");
    }
}

class DOCHandler extends TXTHandler {
    void open() {
        System.out.println("open2");
    }

    void create() {
        System.out.println("create2");
    }

    void change() {
        System.out.println("change2");
    }

    void save() {
        System.out.println("save2");
    }
}

class main {
    public static void main(String[] args) {

        AbstractHandler docHandler = new DOCHandler();

        AbstractHandler abstractHandler = new TXTHandler();

        docHandler.change();
        docHandler.save();
        docHandler.create();
        docHandler.open();


        abstractHandler.open();
        abstractHandler.create();
        abstractHandler.save();
        abstractHandler.change();
    }
}


