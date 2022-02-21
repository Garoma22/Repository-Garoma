package FinalBoss_AllTest;

// класс Cell нужен для того, чтобы в него завернуть полученные значения x и y и далее оперировать ими как единой сущностью - обхектом класса.
// создали объект с аргументами класса Сell в классе Player. У класса есть методы nextTo и touchCorner их задача принмиаать в параметры обхект класс Cell и сравнивать
// его с другими объектами класса Cell. НО! применяем мы его только на объекте ship! в методе collide класса Ship. Это же касается методов touchCorner и Hascode
// последний переопределяем, т.к. переопределяем и equals.


public class Cell {
    private final int x; //Для переменных примитивного типа final означает, что однажды присвоенное значение не может быть изменено.
    private final int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    // метод выдаст true, если вы закинутый объект соответствует условию: или первому или второму.
    public boolean nextTo(Cell other) {
        return (this.x == other.x && Math.abs(this.y - other.y) == 1) || (this.y == other.y && Math.abs(this.x - other.x) == 1);
    }

    // метод выдаст true, если оба условия верны.
    public boolean touchCorner(Cell other) {
        return (Math.abs(this.x - other.x) == 1 && Math.abs(this.y - other.y) == 1);
    }

    @Override
    public int hashCode() { // метод для генерации целочисленного кода обхекта
        int hash = 7;
        hash = 31 * hash + this.x;
        hash = 31 * hash + this.y;
        return hash;
    }

    @Override //ЭТОТ МЕТОД НЕОБХОДИМ,если мы хотим сравнивать обекты между собой не по указателям(именам?), а по полям.
    //такое переопределение позволяет сравнивать обхекты структурно. То есть, через equals можно сравнивать объекты как сущности.
    // метод позволяет не допускать сравниваняи обхектов разных типов.

    //чтобы переопределить метод, надо полностью повторить сигнатуру метода. Поэтому в аргументах класс - родитель.
    public boolean equals(Object obj) {  // если в метод передали не Cell, объхект точно не равен Cell.
        if (!(obj instanceof Cell)) {    // проверяем соответствие типов.
            return false;
        }
        Cell other = (Cell)obj;         // приведение типа, применяем downcasting. НО уже в теле метода мы кастим object к типу Cell
        return this.x == other.getX() && this.y == other.getY();  // если все ок, все проверки прошли, то говорим что иксы и игреки равны равны
        //этим параметрам другого cell, то есть это два обхекта, ссылающиеся на один участок памаяти. (что в методе collide класса Ship станет условием столкновения).

    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}



